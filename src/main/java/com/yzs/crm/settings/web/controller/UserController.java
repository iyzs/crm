package com.yzs.crm.settings.web.controller;

import com.yzs.crm.settings.exception.LoginException;
import com.yzs.crm.settings.pojo.User;
import com.yzs.crm.settings.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/settings/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request,
                                    HttpSession session,
                                    @RequestParam("loginAct") String loginAct,
                                    @RequestParam("loginPwd") String loginPwd){
        Map<String,Object> map = new HashMap();
        String loginIp = request.getRemoteHost();
        try {
            User user = userService.login(loginAct,loginPwd,loginIp);
            session.setAttribute("user",user);
            map.put("success",true);
        } catch (LoginException e) {
            map.put("success",false);
            map.put("msg",e.getMessage());
        }
        return map;
    }

    @RequestMapping(value = "/logout.do")
    public String logout(HttpSession session){
        Map<String,Object> map = new HashMap();
        session.setAttribute("user",null);
        map.put("success",true);
        return "redirect:/login.jsp";
    }

}
