package com.example.sbm.admin.controller.system;

import com.alibaba.druid.util.StringUtils;
import com.example.sbm.admin.base.BaseController;
import com.example.sbm.admin.base.ResultInfo;
import com.example.sbm.admin.entity.Category;
import com.example.sbm.admin.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("sys/category")
public class SystemCategoryController extends BaseController {
    @Autowired
    private CategoryService categoryService;

    private  String prefix = "admin/sys/category";

    @RequestMapping("/init")
    public String init(Model  model){
        List<Map<String,Object>> categoryList = categoryService.createCategoryTree(categoryService.queryCategoryList());
        model.addAttribute("categoryTree",categoryList);
        return prefix+"/categoryInit";
    }

    @RequestMapping("/addOrEditInit")
    public String addOrEditInit(Integer parId, Integer id,String parTitle,Model model){
        Category category = new Category();
        if(id!=null){
            category = categoryService.queryCategoryById(id);

            category.setParTitle(categoryService.queryCategoryById(category.getParentId()).getTitle());

        }else{
            category.setDisplay(1);
            category.setParTitle(parTitle);
            category.setParentId(parId);

        }
        model.addAttribute("category",category);
        return prefix+"/addOrEdit";
    }

    @RequestMapping("/addOrEdit")
    @ResponseBody
    public ResultInfo addOrEdit(Category category){
        try {

                if(category.getId()==null){
                categoryService.addCategory(category);
            }else{
                categoryService.updateCategory(category);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return createResultInfo(false);
        }
        return createResultInfo(true);

    }

    /**
     * 逻辑删除  ，不物理删除
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ResultInfo updateEnable(Integer id){
        try {
            categoryService.updateEnable(id);
        } catch (Exception e) {
            e.printStackTrace();
            return createResultInfo(false);
        }
        return createResultInfo(true);
    }

}
