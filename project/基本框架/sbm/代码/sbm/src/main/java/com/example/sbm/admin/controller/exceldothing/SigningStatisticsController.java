package com.example.sbm.admin.controller.exceldothing;

import com.example.sbm.admin.base.BaseController;
import com.example.sbm.admin.base.PageResultInfo;
import com.example.sbm.admin.base.ResultInfo;
import com.example.sbm.admin.entity.Category;
import com.example.sbm.admin.entity.excel.DbSigningStatistics;
import com.example.sbm.admin.service.CategoryService;
import com.example.sbm.admin.service.excel.DbSigningStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 签约
 */
@Controller
@RequestMapping("sys/signing")
public class SigningStatisticsController extends BaseController {
    @Autowired
    private DbSigningStatisticsService signingStatisticsService;

    @Autowired
    private CategoryService categoryService;
    private String prefix =  "admin/excel/signing";


    @RequestMapping("/init")
    public String init(){
        return prefix+"/SigningStatistics";
    }

    @RequestMapping("/SigningList")
    @ResponseBody
    public PageResultInfo SigningList(Integer page,Integer limit){
        PageResultInfo pageResultInfo = new PageResultInfo();
        pageResultInfo =  signingStatisticsService.querySigningPageList(page,limit);
        return pageResultInfo;

    }


    @RequestMapping("/addInit")
    public String addInit(Model model,Integer id){
        //条线
        List<Category> linesList = categoryService.queryChildCategoryList(31);
        model.addAttribute("linesList",linesList);

        //国家
        List<Category> countryList = categoryService.queryChildCategoryList(32);
        model.addAttribute("countryList",countryList);

        //合同
        List<Category> contractStateList = categoryService.queryChildCategoryList(37);
        model.addAttribute("contractStateList",contractStateList);

        //产品分类
        List<Category> productCategoryList = categoryService.queryChildCategoryList(40);
        model.addAttribute("productCategoryList",productCategoryList);

        //留学申请
        List<Category> overseasStudyApplyList = categoryService.queryChildCategoryList(43);
        model.addAttribute("overseasStudyApplyList",overseasStudyApplyList);

        //语言培训
        List<Category> languageTrainList = categoryService.queryChildCategoryList(44);
        model.addAttribute("languageTrainList",languageTrainList);

        //留学或者 培训
        List<Category> overseasOrTrainList = categoryService.queryChildCategoryList(45);
        model.addAttribute("overseasOrTrainList",overseasOrTrainList);

        DbSigningStatistics signing = new DbSigningStatistics();
        if(id!=null){
            signing = signingStatisticsService.querySigningById(id);

        }
        model.addAttribute("signing",signing);


        return prefix + "/addOrEdit";
    }

    @RequestMapping("/addOrEdit")
    @ResponseBody
    public ResultInfo addSigning(DbSigningStatistics signingStatistics){
        try {
            if(signingStatistics.getId()==null){
                signingStatisticsService.addSigning(signingStatistics);
            }else{
                signingStatisticsService.updateSigning(signingStatistics);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return createResultInfo(false);
        }
        return createResultInfo(true);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public ResultInfo deleteSigning(DbSigningStatistics signingStatistics){
        signingStatisticsService.updateSigningEnable(signingStatistics);
        return createResultInfo(true);
    }

    @RequestMapping("/export")
    @ResponseBody
    public ResultInfo export(DbSigningStatistics signingStatistics){
        List<Map<String,Object>> list= signingStatisticsService.queryExportList(signingStatistics);
        ResultInfo resultInfo = createResultInfo(true);
        resultInfo.setData(list);

        return resultInfo;
    }

}
