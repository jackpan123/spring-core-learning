package com.jackpan.thinking.in.spring.io.overview.domain;

/**
 * @author jackpan
 * @version v1.0 2021/2/2 10:01
 */
public class User {

    private Long id;

    private String name;



    /**
     * Gets id.
     *
     * @return Value of id.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Sets id.
     *
     * @param id Simple param.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets name.
     *
     * @param name Simple param.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
