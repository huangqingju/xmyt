package com.example.sbm.admin.entity.excel;

import javax.persistence.*;
import java.util.Date;

/**签约统计表
 * db_signing_statistics
 */
@Table(name = "db_signing_statistics")
public class DbSigningStatistics {
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
     * 日期 yyyy-mm-dd
     */
    @Column(name = "date_day")
    private String date;

    /**
     * 条线
     */
    @Column(name = "lines_title")
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
    @Column(name = "contract_mould")
    private String contractMould;

    /**
     * OA流水号
     */
    @Column(name = "oa_serial_number")
    private String serialNumber;

    /**
     * 客户年级
     */
    @Column(name = "customer_grade")
    private String customerGrade;

    /**
     * 业务类型
     */
    @Column(name = "business_type")
    private String businessType;

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
     * 签约顾问
     */
    @Column(name = "signing_adviser")
    private String signingAdviser;

    /**
     * 申请入学年
     */
    @Column(name = "apply_year")
    private String applyYear;

    /**
     * 申请入学月
     */
    @Column(name = "apply_month")
    private String applyMonth;

    /**
     * 签约金额
     */
    @Column(name = "signing_money")
    private String signingMoney;

    /**
     * 主合同金额
     */
    @Column(name = "main_contract_money")
    private String mainContractMoney;

    /**
     * 服务费收款金额
     */
    @Column(name = "service_money")
    private String serviceMoney;

    /**
     * 优惠类型
     */
    @Column(name = "discount_type")
    private String discountType;

    /**
     * 优惠原因
     */
    @Column(name = "discount_reason")
    private String discountReason;

    /**
     * 优惠金额
     */
    @Column(name = "discount_money")
    private String discountMoney;

    /**
     * 合同状态
     */
    @Column(name = "contract_state")
    private String contractState;

    /**
     * 产品分类
     */
    @Column(name = "product_category")
    private String productCategory;

    /**
     * 留学申请 1 是 0 否
     */
    @Column(name = "overseas_study_apply")
    private Integer overseasStudyApply;

    /**
     * 语言 培训 1是 0否
     */
    @Column(name = "language_train")
    private Integer languageTrain;

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
     * 签约课程类型
     */
    @Column(name = "signing_curriculum_type")
    private String signingCurriculumType;

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

    /**
     * 
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 
     */
    @Column(name = "update_tme")
    private Date updateTme;

    /**
     * 
     */
    @Column(name = "createer")
    private String createer;

    /**
     * 
     */
    @Column(name = "updateer")
    private String updateer;


    @Column(name="enable")
    private Integer enable;

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

    /**
     * 
     * @return mechanism 机构
     */
    public String getMechanism() {
        return mechanism;
    }

    /**
     * 
     * @param mechanism 机构
     */
    public void setMechanism(String mechanism) {
        this.mechanism = mechanism == null ? null : mechanism.trim();
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


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return lines 条线
     */
    public String getLines() {
        return lines;
    }

    /**
     * 
     * @param lines 条线
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
     * @return customer_grade 客户年级
     */
    public String getCustomerGrade() {
        return customerGrade;
    }

    /**
     * 
     * @param customerGrade 客户年级
     */
    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade == null ? null : customerGrade.trim();
    }

    /**
     * 
     * @return business_type 业务类型
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 
     * @param businessType 业务类型
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
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
     * @return signing_adviser 签约顾问
     */
    public String getSigningAdviser() {
        return signingAdviser;
    }

    /**
     * 
     * @param signingAdviser 签约顾问
     */
    public void setSigningAdviser(String signingAdviser) {
        this.signingAdviser = signingAdviser == null ? null : signingAdviser.trim();
    }

    /**
     * 
     * @return apply_year 申请入学年
     */
    public String getApplyYear() {
        return applyYear;
    }

    /**
     * 
     * @param applyYear 申请入学年
     */
    public void setApplyYear(String applyYear) {
        this.applyYear = applyYear == null ? null : applyYear.trim();
    }

    /**
     * 
     * @return apply_month 申请入学月
     */
    public String getApplyMonth() {
        return applyMonth;
    }

    /**
     * 
     * @param applyMonth 申请入学月
     */
    public void setApplyMonth(String applyMonth) {
        this.applyMonth = applyMonth == null ? null : applyMonth.trim();
    }

    /**
     * 
     * @return signing_money 签约金额
     */
    public String getSigningMoney() {
        return signingMoney;
    }

    /**
     * 
     * @param signingMoney 签约金额
     */
    public void setSigningMoney(String signingMoney) {
        this.signingMoney = signingMoney == null ? null : signingMoney.trim();
    }

    /**
     * 
     * @return main_contract_money 主合同金额
     */
    public String getMainContractMoney() {
        return mainContractMoney;
    }

    /**
     * 
     * @param mainContractMoney 主合同金额
     */
    public void setMainContractMoney(String mainContractMoney) {
        this.mainContractMoney = mainContractMoney == null ? null : mainContractMoney.trim();
    }

    /**
     * 
     * @return service_money 服务费收款金额
     */
    public String getServiceMoney() {
        return serviceMoney;
    }

    /**
     * 
     * @param serviceMoney 服务费收款金额
     */
    public void setServiceMoney(String serviceMoney) {
        this.serviceMoney = serviceMoney == null ? null : serviceMoney.trim();
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }



    /**
     * 
     * @return contract_state 
     */
    public String getContractState() {
        return contractState;
    }

    /**
     * 
     * @param contractState 
     */
    public void setContractState(String contractState) {
        this.contractState = contractState == null ? null : contractState.trim();
    }

    /**
     * 
     * @return product_category 产品分类
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * 
     * @param productCategory 产品分类
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.trim();
    }

    /**
     * 
     * @return overseas_study_apply 留学申请 1 是 0 否
     */
    public Integer getOverseasStudyApply() {
        return overseasStudyApply;
    }

    /**
     * 
     * @param overseasStudyApply 留学申请 1 是 0 否
     */
    public void setOverseasStudyApply(Integer overseasStudyApply) {
        this.overseasStudyApply = overseasStudyApply;
    }

    /**
     * 
     * @return language_train 语言 培训 1是 0否
     */
    public Integer getLanguageTrain() {
        return languageTrain;
    }

    /**
     * 
     * @param languageTrain 语言 培训 1是 0否
     */
    public void setLanguageTrain(Integer languageTrain) {
        this.languageTrain = languageTrain;
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
     * @return signing_curriculum_type 签约课程类型
     */
    public String getSigningCurriculumType() {
        return signingCurriculumType;
    }

    /**
     * 
     * @param signingCurriculumType 签约课程类型
     */
    public void setSigningCurriculumType(String signingCurriculumType) {
        this.signingCurriculumType = signingCurriculumType == null ? null : signingCurriculumType.trim();
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

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return update_tme 
     */
    public Date getUpdateTme() {
        return updateTme;
    }

    /**
     * 
     * @param updateTme 
     */
    public void setUpdateTme(Date updateTme) {
        this.updateTme = updateTme;
    }

    /**
     * 
     * @return createer 
     */
    public String getCreateer() {
        return createer;
    }

    /**
     * 
     * @param createer 
     */
    public void setCreateer(String createer) {
        this.createer = createer == null ? null : createer.trim();
    }

    /**
     * 
     * @return updateer 
     */
    public String getUpdateer() {
        return updateer;
    }

    /**
     * 
     * @param updateer 
     */
    public void setUpdateer(String updateer) {
        this.updateer = updateer == null ? null : updateer.trim();
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getDiscountReason() {
        return discountReason;
    }

    public void setDiscountReason(String discountReason) {
        this.discountReason = discountReason;
    }

    public String getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(String discountMoney) {
        this.discountMoney = discountMoney;
    }
}