package com.example.sbm;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class encodeExcel {

    public static void main(String[] args) {
        Workbook wb =null;
        Sheet sheet = null;
        Row row = null;
        List<Map<String,String>> list = null;
        String cellData = null;
        String fileTitle = "16-2020年泉州台商投资区事业单位公开招聘编制内工作人员岗位信息表.xls";
        String filePath = "C:\\Users\\win7\\Desktop\\2020\\"+fileTitle;
        String filePath2 = "C:\\Users\\win7\\Desktop\\2020-1\\"+fileTitle;
        String columns[] = {"主管代码","主管部门","单位代码","单位名称","经费形式","岗位代码","岗位类别及名称","岗位最高级别","招聘人数","报考人员来源类别","最高年龄","性别","户籍","学历类别","学历","学位","专业要求","其他条件","笔试科目","笔试","面试","专业测试","备注","联系人"};
        //String columns[] = {"主管代码","主管部门","单位代码","单位名称","经费形式","岗位代码","岗位类别及名称","岗位最高级别","招聘人数","报考人员来源类别","最高年龄","性别","户籍","学历类别","学历","学位","专业要求","其他条件","笔试科目","笔试","面试","专业测试","备注","联系人"};
        wb = readExcel(filePath);
        if(wb != null){
            //用来存放表中数据
            list = new ArrayList<Map<String,String>>();
            //获取第一个sheet
            sheet = wb.getSheetAt(0);
            //获取最大行数
            int rownum = sheet.getPhysicalNumberOfRows();
            //获取第一行
            row = sheet.getRow(0);
            //获取最大列数
            int colnum = row.getPhysicalNumberOfCells();
            Map<String,String> columsMap = new LinkedHashMap<String,String>();
            for(int i=0;i<columns.length ; i++){
                columsMap.put(String.valueOf(i),columns[i]);

            }
            list.add(columsMap);


            for (int i = 4; i<rownum; i++) {
                Map<String,String> map = new LinkedHashMap<String,String>();
                row = sheet.getRow(i);
                if(row !=null){
                    for (int j=0;j<colnum;j++){
                        cellData = (String) getCellFormatValue(row.getCell(j));
                        map.put(columns[j], cellData);
                    }
                }else{
                    break;
                }
                list.add(map);
            }
        }
        createExcel(list,filePath2);

    }

    //建excel
    public static void createExcel(List<Map<String,String>> list,String filePath){
        //遍历解析出来的list
        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet();
        String cellData = null;
        String columns[] = {"主管代码","主管部门","单位代码","单位名称","经费形式","岗位代码","岗位类别及名称","岗位最高级别","招聘人数","报考人员来源类别","最高年龄","性别","户籍","学历类别","学历","学位","专业要求","其他条件","笔试科目","笔试","面试","专业测试","备注","联系人"};
        for (int i=0;i< list.size();i++) {
            Map<String,String> map = list.get(i);
               Row row = sheet.createRow(i);
            if (i==0) {
                for(int j=0;j<columns.length ;j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(columns[j]);
                }
            }else{
                for(int j=0;j<columns.length ;j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(map.get(columns[j]));
                }
            }


        }

        File file = new File(filePath);
        if(!file.exists()){
            try {
                file.createNewFile();
                FileOutputStream fos = new FileOutputStream(file);
                wb.write(fos);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("结束");
    }


    //读取excel
    public static Workbook readExcel(String filePath){
        Workbook wb = null;
        if(filePath==null){
            return null;
        }
        String extString = filePath.substring(filePath.lastIndexOf("."));
        InputStream is = null;
        File file = new File(filePath);
        try {
            is = new FileInputStream(file);
            if(".xls".equals(extString)){
                return wb = new HSSFWorkbook(is);
            }else if(".xlsx".equals(extString)){
                return wb = new XSSFWorkbook(is);
            }else{
                return wb = null;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }
    public static Object getCellFormatValue(Cell cell){
        Object cellValue = null;
        if(cell!=null){
            //判断cell类型
            switch(cell.getCellType()){
                case Cell.CELL_TYPE_NUMERIC:{
                    cellValue = String.valueOf(cell.getNumericCellValue());
                    break;
                }
                case Cell.CELL_TYPE_FORMULA:{
                    //判断cell是否为日期格式
                    if(DateUtil.isCellDateFormatted(cell)){
                        //转换为日期格式YYYY-mm-dd
                        cellValue = cell.getDateCellValue();
                    }else{
                        //数字
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case Cell.CELL_TYPE_STRING:{
                    cellValue = cell.getRichStringCellValue().getString();
                    break;
                }
                default:
                    cellValue = cell.getStringCellValue();;
            }
        }else{
            cellValue = "";
        }
        return cellValue;
    }
}
