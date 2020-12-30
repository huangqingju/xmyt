package com.example.sbm.admin.controller.system;

import com.alibaba.druid.util.StringUtils;
import com.example.sbm.admin.base.BaseController;
import com.example.sbm.admin.base.ResultInfo;
import com.example.sbm.admin.entity.SysUser;
import com.example.sbm.admin.service.sysManager.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Date;

@RequestMapping("/sys/system")
@Controller
public class SystemLoginController extends BaseController {

    public Logger logger = LoggerFactory.getLogger(SystemLoginController.class);
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/login")
    public String login(String username,String password){
        if(StringUtils.isEmpty(username)){
            return "admin/sys/login";
        }
        SysUser sysUser = new SysUser();
        sysUser.setUsername(username);
        sysUser.setPassword(password);
        sysUser = sysUserService.querySysUserBySysUser(sysUser);
        if(ObjectUtils.isEmpty(sysUser)){
            if(StringUtils.isEmpty(username)){
                return "admin/sys/login";
            }
        }
        return "admin/sys/index";
    }


    @RequestMapping("/login.json")
    @ResponseBody
    public ResultInfo loginJson(String username, String password){
        SysUser sysUser = new SysUser();

     //   sysUser = sysUserService.querySysUserBySysUser(sysUser);
        try {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
            SecurityUtils.getSubject().login(usernamePasswordToken);
            sysUser.setLoginTime(new Date());
            sysUserService.updateLoginInfoById(sysUser);
        } catch (Exception e) {
            ResultInfo res=  createResultInfo(false);

            res.setMessage(e.getMessage());
            return  res;
        }


        return createResultInfo(true);
    }

}
