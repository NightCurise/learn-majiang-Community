package life.community.controller;

import life.community.dto.PaginationDTO;
import life.community.mapper.UserMapper;
import life.community.model.User;
import life.community.service.QuestionService;
import life.community.util.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page", defaultValue = "1") Object page,
                        @RequestParam(name = "size", defaultValue = "2") Object size) {
        Cookie[] cookies = request.getCookies();
        if (Objects.nonNull(cookies)){
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")){
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null){
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        }

        // 展示问题界面
        PaginationDTO pagination = questionService.list(ObjectUtils.roundObjectToInteger(page), ObjectUtils.roundObjectToInteger(size));
        model.addAttribute("pagination", pagination);
        return "index";
    }

}
