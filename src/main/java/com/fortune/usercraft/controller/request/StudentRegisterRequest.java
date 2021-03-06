package com.fortune.usercraft.controller.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class StudentRegisterRequest {
    @Pattern(regexp = "^1[0-9]{10}$", message = "不合法的手机号")
    @NotBlank(message = "手机号不能为空")
    private String phone;
    @Pattern(regexp = "^[A-Za-z0-9]{6,20}$", message = "密码应当由6-20位字母数字组成")
    @NotBlank(message = "密码不能为空")
    private String password;

    public StudentRegisterRequest(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
