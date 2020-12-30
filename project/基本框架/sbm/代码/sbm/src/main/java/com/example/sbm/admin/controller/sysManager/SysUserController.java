package com.example.sbm.admin.controller.sysManager;

import com.example.sbm.admin.base.BaseController;
import com.example.sbm.admin.base.PageResultInfo;
import com.example.sbm.admin.base.ResultInfo;
import com.example.sbm.admin.entity.SysUser;
import com.example.sbm.admin.service.sysManager.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sys/userManage")
public class SysUserController extends BaseController {
    private String prefix ="admin/sys/sysUser/";



    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/init")
    public String init(){
        return prefix+"init";
    }


    @RequestMapping("/userList")
    @ResponseBody
    public PageResultInfo userList(Integer page,Integer limit){
        PageResultInfo res = createPageResultInfo(sysUserService.queryPageList(page,limit),true);
        return  res;
    }

    @RequestMapping("/addOrEditInit")
    public String  addOrEditInit(Integer id, Model model){
        SysUser sysUser = new SysUser();
        if(id !=null){
            sysUser = sysUserService.querySysUserById(id);

        }
        model.addAttribute("sysUser",sysUser);
        return  prefix+"addOrEdit";
    }

    @RequestMapping("/addOrEdit")
    @ResponseBody
    public ResultInfo  addOrEdit(SysUser sysUser){
        ResultInfo res = new ResultInfo();
        if(sysUser.getId()!=null){

        }
        return  res;
    }


}
