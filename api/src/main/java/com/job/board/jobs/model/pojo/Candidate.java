package com.job.board.jobs.model.pojo;

public class Candidate {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column candidate.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column candidate.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column candidate.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column candidate.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column candidate.id
     *
     * @return the value of candidate.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column candidate.id
     *
     * @param id the value for candidate.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column candidate.email
     *
     * @return the value of candidate.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column candidate.email
     *
     * @param email the value for candidate.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column candidate.first_name
     *
     * @return the value of candidate.first_name
     *
     * @mbg.generated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column candidate.first_name
     *
     * @param firstName the value for candidate.first_name
     *
     * @mbg.generated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column candidate.last_name
     *
     * @return the value of candidate.last_name
     *
     * @mbg.generated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column candidate.last_name
     *
     * @param lastName the value for candidate.last_name
     *
     * @mbg.generated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }
}