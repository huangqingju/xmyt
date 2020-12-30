package com.example.sbm.admin.entity.excel;

import com.example.sbm.admin.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**佣金收入统计表
 * db_commission_statistics
 */
@Table(name = "db_commission_statistics")
public class DbCommissionStatistics extends BaseEntity {
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 城市
     */
    @Column(name = "city")
    private String city;

    /**
     * 机构
     */
    @Column(name = "mechanism")
    private String mechanism;

    /**
     * 部门
     */
    @Column(name = "department")
    private String department;

    /**
     * 分点名称
     */
    @Column(name = "part_depart")
    private String partDepart;

    /**
     * 年度
     */
    @Column(name = "date_year")
    private String year;

    /**
     * 月份
     */
    @Column(name = "date_month")
    private String month;

    /**
     * 日
     */
    @Column(name = "date_day")
    private String day;

    /**
     * 日期 yyyy-mm-dd
     */
    @Column(name = "date")
    private Date date;

    /**
     * 业务条线
     */
    @Column(name = "lines")
    private String lines;

    /**
     * 国家
     */
    @Column(name = "country")
    private String country;

    /**
     * 客户K3码
     */
    @Column(name = "customer_k3_code")
    private String customerK3Code;

    /**
     * 客户姓名
     */
    @Column(name = "customer_name")
    private String customerName;

    /**
     * 合同号
     */
    @Column(name = "contract_num")
    private String contractNum;

    /**
     * 合同模板
     */
    @Column(name = "contract_ mould")
    private String contractMould;

    /**
     * OA流水号
     */
    @Column(name = "serial_number")
    private String serialNumber;

    /**
     * 产品类型
     */
    @Column(name = "product_type")
    private String productType;

    /**
     * 目标学位
     */
    @Column(name = "target_degree")
    private String targetDegree;

    /**
     * 业务员姓名
     */
    @Column(name = "salesman_name")
    private String salesmanName;

    /**
     * 佣金收入
     */
    @Column(name = "commission_income")
    private String commissionIncome;

    /**
     * 佣金收入含税
     */
    @Column(name = "commission_income_tax")
    private String commissionIncomeTax;

    /**
     * 增值税金
     */
    @Column(name = "increment_tax")
    private String incrementTax;

    /**
     * 原币金额
     */
    @Column(name = "original_money")
    private String originalMoney;

    /**
     * 原币货币符号
     */
    @Column(name = "original_currency_symbol")
    private String originalCurrencySymbol;

    /**
     * 原币货币符号
     */
    @Column(name = "original_currency_name")
    private String originalCurrencyName;

    /**
     * 账簿来源
     */
    @Column(name = "bill_basis")
    private String billBasis;

    /**
     * 签约班级名称
     */
    @Column(name = "signing_class_name")
    private String signingClassName;

    /**
     * 签约班级编码
     */
    @Column(name = "signing_class_code")
    private String signingClassCode;

    /**
     * 签约课程编码
     */
    @Column(name = "signing_class_type")
    private String signingClassType;

    /**
     * 备注
     */
    @Column(name = "remarks_one")
    private String remarksOne;

    /**
     * 
     */
    @Column(name = "remarks_two")
    private String remarksTwo;

    /**
     * l留学  /   培训
     */
    @Column(name = "overseas_or_train")
    private String overseasOrTrain;

    /**
     * 周数
     */
    @Column(name = "week_num")
    private Integer weekNum;

    /**
     * 财年
     */
    @Column(name = "remarks_year")
    private String remarksYear;


    @Column(name="enable")
    private Integer enable;

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    /**
     * 
     * @return department 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 
     * @return part_depart 分点名称
     */
    public String getPartDepart() {
        return partDepart;
    }

    /**
     * 
     * @param partDepart 分点名称
     */
    public void setPartDepart(String partDepart) {
        this.partDepart = partDepart == null ? null : partDepart.trim();
    }

    /**
     * 
     * @return year 年度
     */
    public String getYear() {
        return year;
    }

    /**
     * 
     * @param year 年度
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**
     * 
     * @return month 月份
     */
    public String getMonth() {
        return month;
    }

    /**
     * 
     * @param month 月份
     */
    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    /**
     * 
     * @return day 日
     */
    public String getDay() {
        return day;
    }

    /**
     * 
     * @param day 日
     */
    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    /**
     * 
     * @return date 日期 yyyy-mm-dd
     */
    public Date getDate() {
        return date;
    }

    /**
     * 
     * @param date 日期 yyyy-mm-dd
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 
     * @return lines 业务条线
     */
    public String getLines() {
        return lines;
    }

    /**
     * 
     * @param lines 业务条线
     */
    public void setLines(String lines) {
        this.lines = lines == null ? null : lines.trim();
    }

    /**
     * 
     * @return country 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 
     * @return customer_k3_code 客户K3码
     */
    public String getCustomerK3Code() {
        return customerK3Code;
    }

    /**
     * 
     * @param customerK3Code 客户K3码
     */
    public void setCustomerK3Code(String customerK3Code) {
        this.customerK3Code = customerK3Code == null ? null : customerK3Code.trim();
    }

    /**
     * 
     * @return customer_name 客户姓名
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 
     * @param customerName 客户姓名
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 
     * @return contract_num 合同号
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * 
     * @param contractNum 合同号
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum == null ? null : contractNum.trim();
    }

    /**
     * 
     * @return contract_ mould 合同模板
     */
    public String getContractMould() {
        return contractMould;
    }

    /**
     * 
     * @param contractMould 合同模板
     */
    public void setContractMould(String contractMould) {
        this.contractMould = contractMould == null ? null : contractMould.trim();
    }

    /**
     * 
     * @return serial_number OA流水号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 
     * @param serialNumber OA流水号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * 
     * @return product_type 产品类型
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 
     * @param productType 产品类型
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    /**
     * 
     * @return target_degree 目标学位
     */
    public String getTargetDegree() {
        return targetDegree;
    }

    /**
     * 
     * @param targetDegree 目标学位
     */
    public void setTargetDegree(String targetDegree) {
        this.targetDegree = targetDegree == null ? null : targetDegree.trim();
    }

    /**
     * 
     * @return salesman_name 业务员姓名
     */
    public String getSalesmanName() {
        return salesmanName;
    }

    /**
     * 
     * @param salesmanName 业务员姓名
     */
    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName == null ? null : salesmanName.trim();
    }

    /**
     * 
     * @return commission_income 佣金收入
     */
    public String getCommissionIncome() {
        return commissionIncome;
    }

    /**
     * 
     * @param commissionIncome 佣金收入
     */
    public void setCommissionIncome(String commissionIncome) {
        this.commissionIncome = commissionIncome == null ? null : commissionIncome.trim();
    }

    /**
     * 
     * @return commission_income_tax 佣金收入含税
     */
    public String getCommissionIncomeTax() {
        return commissionIncomeTax;
    }

    /**
     * 
     * @param commissionIncomeTax 佣金收入含税
     */
    public void setCommissionIncomeTax(String commissionIncomeTax) {
        this.commissionIncomeTax = commissionIncomeTax == null ? null : commissionIncomeTax.trim();
    }

    /**
     * 
     * @return increment_tax 增值税金
     */
    public String getIncrementTax() {
        return incrementTax;
    }

    /**
     * 
     * @param incrementTax 增值税金
     */
    public void setIncrementTax(String incrementTax) {
        this.incrementTax = incrementTax == null ? null : incrementTax.trim();
    }

    /**
     * 
     * @return original_money 原币金额
     */
    public String getOriginalMoney() {
        return originalMoney;
    }

    /**
     * 
     * @param originalMoney 原币金额
     */
    public void setOriginalMoney(String originalMoney) {
        this.originalMoney = originalMoney == null ? null : originalMoney.trim();
    }

    /**
     * 
     * @return original_currency_symbol 原币货币符号
     */
    public String getOriginalCurrencySymbol() {
        return originalCurrencySymbol;
    }

    /**
     * 
     * @param originalCurrencySymbol 原币货币符号
     */
    public void setOriginalCurrencySymbol(String originalCurrencySymbol) {
        this.originalCurrencySymbol = originalCurrencySymbol == null ? null : originalCurrencySymbol.trim();
    }

    /**
     * 
     * @return original_currency_name 原币货币符号
     */
    public String getOriginalCurrencyName() {
        return originalCurrencyName;
    }

    /**
     * 
     * @param originalCurrencyName 原币货币符号
     */
    public void setOriginalCurrencyName(String originalCurrencyName) {
        this.originalCurrencyName = originalCurrencyName == null ? null : originalCurrencyName.trim();
    }

    /**
     * 
     * @return bill_basis 账簿来源
     */
    public String getBillBasis() {
        return billBasis;
    }

    /**
     * 
     * @param billBasis 账簿来源
     */
    public void setBillBasis(String billBasis) {
        this.billBasis = billBasis == null ? null : billBasis.trim();
    }

    /**
     * 
     * @return signing_class_name 签约班级名称
     */
    public String getSigningClassName() {
        return signingClassName;
    }

    /**
     * 
     * @param signingClassName 签约班级名称
     */
    public void setSigningClassName(String signingClassName) {
        this.signingClassName = signingClassName == null ? null : signingClassName.trim();
    }

    /**
     * 
     * @return signing_class_code 签约班级编码
     */
    public String getSigningClassCode() {
        return signingClassCode;
    }

    /**
     * 
     * @param signingClassCode 签约班级编码
     */
    public void setSigningClassCode(String signingClassCode) {
        this.signingClassCode = signingClassCode == null ? null : signingClassCode.trim();
    }

    /**
     * 
     * @return signing_class_type 签约课程编码
     */
    public String getSigningClassType() {
        return signingClassType;
    }

    /**
     * 
     * @param signingClassType 签约课程编码
     */
    public void setSigningClassType(String signingClassType) {
        this.signingClassType = signingClassType == null ? null : signingClassType.trim();
    }

    /**
     * 
     * @return remarks_one 备注
     */
    public String getRemarksOne() {
        return remarksOne;
    }

    /**
     * 
     * @param remarksOne 备注
     */
    public void setRemarksOne(String remarksOne) {
        this.remarksOne = remarksOne == null ? null : remarksOne.trim();
    }

    /**
     * 
     * @return remarks_two 
     */
    public String getRemarksTwo() {
        return remarksTwo;
    }

    /**
     * 
     * @param remarksTwo 
     */
    public void setRemarksTwo(String remarksTwo) {
        this.remarksTwo = remarksTwo == null ? null : remarksTwo.trim();
    }

    /**
     * 
     * @return overseas_or_train l留学  /   培训
     */
    public String getOverseasOrTrain() {
        return overseasOrTrain;
    }

    /**
     * 
     * @param overseasOrTrain l留学  /   培训
     */
    public void setOverseasOrTrain(String overseasOrTrain) {
        this.overseasOrTrain = overseasOrTrain == null ? null : overseasOrTrain.trim();
    }

    /**
     * 
     * @return week_num 周数
     */
    public Integer getWeekNum() {
        return weekNum;
    }

    /**
     * 
     * @param weekNum 周数
     */
    public void setWeekNum(Integer weekNum) {
        this.weekNum = weekNum;
    }

    /**
     * 
     * @return remarks_year 财年
     */
    public String getRemarksYear() {
        return remarksYear;
    }

    /**
     * 
     * @param remarksYear 财年
     */
    public void setRemarksYear(String remarksYear) {
        this.remarksYear = remarksYear == null ? null : remarksYear.trim();
    }
}