package life.community.model;

public class Tag {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG.ID
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG.NAME
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG.COUNT
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG.GMT_CREATE
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG.GMT_MODIFIED
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    private Long gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG.ID
     *
     * @return the value of TAG.ID
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG.ID
     *
     * @param id the value for TAG.ID
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG.NAME
     *
     * @return the value of TAG.NAME
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG.NAME
     *
     * @param name the value for TAG.NAME
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG.COUNT
     *
     * @return the value of TAG.COUNT
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG.COUNT
     *
     * @param count the value for TAG.COUNT
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG.GMT_CREATE
     *
     * @return the value of TAG.GMT_CREATE
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG.GMT_CREATE
     *
     * @param gmtCreate the value for TAG.GMT_CREATE
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG.GMT_MODIFIED
     *
     * @return the value of TAG.GMT_MODIFIED
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG.GMT_MODIFIED
     *
     * @param gmtModified the value for TAG.GMT_MODIFIED
     *
     * @mbg.generated Sun Sep 15 13:36:21 GMT+08:00 2024
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }
}