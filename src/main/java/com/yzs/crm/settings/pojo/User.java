package com.yzs.crm.settings.pojo;

import java.util.Objects;

public class User {

    private String id; //主键
    private String loginAct; //登录账号
    private String name; //用户真实姓名
    private String loginPwd; //登录密码
    private String email; //用户邮箱
    private String expireTime; //失效时间 yyyy-MM-dd HH:mm:ss 19位
    private String lockState; //账号状态 ,0启用,1锁定
    private String deptno; //部门编号
    private String allowIps; //允许访问的IP地址,当值为null或者""时, 表示任意IP地址都可以登录;当有多个IP地址时,用逗号隔开.
    private String createTime; //创建时间
    private String createBy; //创建人
    private String editTime; //修改时间
    private String editBy; //修改人

    /*
        关于登录:
        验证账号密码后,继续验证 expireTime lockState allowIps
    */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(loginAct, user.loginAct) && Objects.equals(name, user.name) && Objects.equals(loginPwd, user.loginPwd) && Objects.equals(email, user.email) && Objects.equals(expireTime, user.expireTime) && Objects.equals(lockState, user.lockState) && Objects.equals(deptno, user.deptno) && Objects.equals(allowIps, user.allowIps) && Objects.equals(createTime, user.createTime) && Objects.equals(createBy, user.createBy) && Objects.equals(editTime, user.editTime) && Objects.equals(editBy, user.editBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loginAct, name, loginPwd, email, expireTime, lockState, deptno, allowIps, createTime, createBy, editTime, editBy);
    }
}
