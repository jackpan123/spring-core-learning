package com.jackpan.thinking.in.spring.ioc.overview.domain;

import com.jackpan.thinking.in.spring.ioc.overview.annotation.Super;

/**
 * @author jackpan
 * @version v1.0 2021/2/2 14:16
 */
@Super
public class SuperUser extends User {

    private String address;

    /**
     * Gets address.
     *
     * @return Value of address.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Sets address.
     *
     * @param address Simple param.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
