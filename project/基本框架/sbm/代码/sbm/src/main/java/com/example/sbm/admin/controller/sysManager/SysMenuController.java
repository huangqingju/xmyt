package com.example.sbm.admin.controller.sysManager;

import com.example.sbm.admin.base.BaseController;
import com.example.sbm.admin.base.PageResultInfo;
import com.example.sbm.admin.base.ResultInfo;
import com.example.sbm.admin.entity.SysMenu;
import com.example.sbm.admin.service.sysManager.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("sys/sysMenu")
public class SysMenuController extends BaseController {

    private String prefix = "admin/sys/sysMenu/";

    @Autowired
    private SysMenuService sysMenuService;


    @RequestMapping("/init")
    public String init(Model model){

        List<Map<String,Object>> list =  sysMenuService.creatMenuMangerTree(1,sysMenuService.queryEnableList());
        model.addAttribute("sysMenuList",list);
        return prefix+"init";
    }

    @RequestMapping("/addOrEditInit")
    public String addOrEditInit(Integer id,Model model,Integer parentId){
        SysMenu sysMenu = null;
        if(id!=null){
            sysMenu = sysMenuService.querySysMenuById(id);
        }else {
            sysMenu = new SysMenu();
            sysMenu.setParentId(parentId);
        }
        model.addAttribute("sysMenu",sysMenu);
        return prefix+"addOrEdit";
    }

    @RequestMapping("/addOrEdit")
    @ResponseBody
    public ResultInfo addOrEdit(SysMenu sysMenu){
        ResultInfo res = null;
        try {
            if(sysMenu.getId()==null){
                sysMenu.setEnable(1);
                sysMenuService.addSysMenu(sysMenu);
            }else{
                sysMenuService.updateSysMenu(sysMenu);
            }
            res = createResultInfo(true);
        } catch (Exception e) {
            res =createResultInfoOfFail();
        }
        return res;
    }

    @RequestMapping("/pageList")
    @ResponseBody
    public PageResultInfo pageList(){
        return null;
    }
}
