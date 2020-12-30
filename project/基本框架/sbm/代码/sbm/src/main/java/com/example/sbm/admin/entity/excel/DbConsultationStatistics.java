package com.example.sbm.admin.entity.excel;

import com.example.sbm.admin.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**咨询收入统计表
 * db_consultation_statistics
 */
@Table(name = "db_consultation_statistics")
public class DbConsultationStatistics  extends BaseEntity {
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
     * 财年
     */
    @Column(name = "remarks_year")
    private String remarksYear;

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
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * OA流水号
     */
    @Column(name = "serial_number")
    private String serialNumber;

    /**
     * 业务类型
     */
    @Column(name = "business_type")
    private String businessType;

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
     * 前期顾问
     */
    @Column(name = "before_adviser")
    private String beforeAdviser;

    /**
     * 中期顾问
     */
    @Column(name = "centre_adviser")
    private String centreAdviser;

    /**
     * 后期顾问
     */
    @Column(name = "after_adviser")
    private String afterAdviser;

    /**
     * 后期顾问
     */
    @Column(name = "document_adviser")
    private String documentAdviser;

    /**
     * 确认院校名称
     */
    @Column(name = "confirm_school_name")
    private String confirmSchoolName;

    /**
     * 服务转态
     */
    @Column(name = "service_state")
    private Integer serviceState;

    /**
     * 是否终止合同 1 是 0否
     */
    @Column(name = "stop_contract")
    private Integer stopContract;

    /**
     * 产品类型
     */
    @Column(name = "product_type")
    private String productType;

    /**
     * 包含申请 1 是 0 否
     */
    @Column(name = "include_apply")
    private Integer includeApply;

    /**
     * 留学服务费
     */
    @Column(name = "overseas_service_money")
    private String overseasServiceMoney;

    /**
     * 语言 培训 1是 0否
     */
    @Column(name = "language_train")
    private Integer languageTrain;

    /**
     * 培训费
     */
    @Column(name = "train_money")
    private String trainMoney;

    /**
     * 账簿来源
     */
    @Column(name = "bill_basis")
    private String billBasis;

    /**
     * R 归于
     */
    @Column(name = "r_belong_to")
    private String rBelongTo;

    /**
     * 合同总金额
     */
    @Column(name = "contract_money")
    private String contractMoney;

    /**
     * 完成客户数量
     */
    @Column(name = "over_custmoner_num")
    private String overCustmonerNum;

    /**
     * 完成合同数量
     */
    @Column(name = "over_contract_num")
    private String overContractNum;

    /**
     * 确认收入含税
     */
    @Column(name = "confirm_income_tax")
    private String confirmIncomeTax;

    /**
     * 确认收入不含税
     */
    @Column(name = "confirm_income_tax_no")
    private String confirmIncomeTaxNo;

    /**
     * 税费
     */
    @Column(name = "tax")
    private String tax;

    /**
     * 确认收入
     */
    @Column(name = "confirm_income")
    private String confirmIncome;

    /**
     * 翻译成本
     */
    @Column(name = "translate_cost")
    private String translateCost;

    /**
     * 培训成本
     */
    @Column(name = "train_cost")
    private String trainCost;

    /**
     * 落地服务成本
     */
    @Column(name = "to_ground_service_cost")
    private String toGroundServiceCost;

    /**
     * 邮寄成本
     */
    @Column(name = "mail_cost")
    private String mailCost;

    /**
     * 申请成本
     */
    @Column(name = "apply_cost")
    private String applyCost;

    /**
     * 总报完成金额
     */
    @Column(name = "total_over_money")
    private String totalOverMoney;

    /**
     * 联系电话
     */
    @Column(name = "connect_tel")
    private String connectTel;

    /**
     * 联系电话
     */
    @Column(name = "e_mail")
    private String eMail;

    /**
     * 代理电话
     */
    @Column(name = "agent_tel")
    private String agentTel;

    /**
     * 代理电话
     */
    @Column(name = "agent_e_mail")
    private String agentEMail;

    /**
     * 备注
     */
    @Column(name = "remarks_content")
    private String remarksContent;

    /**
     * 定版签约合同
     */
    @Column(name = "over_contract_money")
    private String overContractMoney;

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
     * @return contract_name 合同名称
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 
     * @param contractName 合同名称
     */
    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
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
     * @return before_adviser 前期顾问
     */
    public String getBeforeAdviser() {
        return beforeAdviser;
    }

    /**
     * 
     * @param beforeAdviser 前期顾问
     */
    public void setBeforeAdviser(String beforeAdviser) {
        this.beforeAdviser = beforeAdviser == null ? null : beforeAdviser.trim();
    }

    /**
     * 
     * @return centre_adviser 中期顾问
     */
    public String getCentreAdviser() {
        return centreAdviser;
    }

    /**
     * 
     * @param centreAdviser 中期顾问
     */
    public void setCentreAdviser(String centreAdviser) {
        this.centreAdviser = centreAdviser == null ? null : centreAdviser.trim();
    }

    /**
     * 
     * @return after_adviser 后期顾问
     */
    public String getAfterAdviser() {
        return afterAdviser;
    }

    /**
     * 
     * @param afterAdviser 后期顾问
     */
    public void setAfterAdviser(String afterAdviser) {
        this.afterAdviser = afterAdviser == null ? null : afterAdviser.trim();
    }

    /**
     * 
     * @return document_adviser 后期顾问
     */
    public String getDocumentAdviser() {
        return documentAdviser;
    }

    /**
     * 
     * @param documentAdviser 后期顾问
     */
    public void setDocumentAdviser(String documentAdviser) {
        this.documentAdviser = documentAdviser == null ? null : documentAdviser.trim();
    }

    /**
     * 
     * @return confirm_school_name 确认院校名称
     */
    public String getConfirmSchoolName() {
        return confirmSchoolName;
    }

    /**
     * 
     * @param confirmSchoolName 确认院校名称
     */
    public void setConfirmSchoolName(String confirmSchoolName) {
        this.confirmSchoolName = confirmSchoolName == null ? null : confirmSchoolName.trim();
    }

    /**
     * 
     * @return service_state 服务转态
     */
    public Integer getServiceState() {
        return serviceState;
    }

    /**
     * 
     * @param serviceState 服务转态
     */
    public void setServiceState(Integer serviceState) {
        this.serviceState = serviceState;
    }

    /**
     * 
     * @return stop_contract 是否终止合同 1 是 0否
     */
    public Integer getStopContract() {
        return stopContract;
    }

    /**
     * 
     * @param stopContract 是否终止合同 1 是 0否
     */
    public void setStopContract(Integer stopContract) {
        this.stopContract = stopContract;
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
     * @return include_apply 包含申请 1 是 0 否
     */
    public Integer getIncludeApply() {
        return includeApply;
    }

    /**
     * 
     * @param includeApply 包含申请 1 是 0 否
     */
    public void setIncludeApply(Integer includeApply) {
        this.includeApply = includeApply;
    }

    /**
     * 
     * @return overseas_service_money 留学服务费
     */
    public String getOverseasServiceMoney() {
        return overseasServiceMoney;
    }

    /**
     * 
     * @param overseasServiceMoney 留学服务费
     */
    public void setOverseasServiceMoney(String overseasServiceMoney) {
        this.overseasServiceMoney = overseasServiceMoney == null ? null : overseasServiceMoney.trim();
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
     * @return train_money 培训费
     */
    public String getTrainMoney() {
        return trainMoney;
    }

    /**
     * 
     * @param trainMoney 培训费
     */
    public void setTrainMoney(String trainMoney) {
        this.trainMoney = trainMoney == null ? null : trainMoney.trim();
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
     * @return r_belong_to R 归于
     */
    public String getrBelongTo() {
        return rBelongTo;
    }

    /**
     * 
     * @param rBelongTo R 归于
     */
    public void setrBelongTo(String rBelongTo) {
        this.rBelongTo = rBelongTo == null ? null : rBelongTo.trim();
    }

    /**
     * 
     * @return contract_money 合同总金额
     */
    public String getContractMoney() {
        return contractMoney;
    }

    /**
     * 
     * @param contractMoney 合同总金额
     */
    public void setContractMoney(String contractMoney) {
        this.contractMoney = contractMoney == null ? null : contractMoney.trim();
    }

    /**
     * 
     * @return over_custmoner_num 完成客户数量
     */
    public String getOverCustmonerNum() {
        return overCustmonerNum;
    }

    /**
     * 
     * @param overCustmonerNum 完成客户数量
     */
    public void setOverCustmonerNum(String overCustmonerNum) {
        this.overCustmonerNum = overCustmonerNum == null ? null : overCustmonerNum.trim();
    }

    /**
     * 
     * @return over_contract_num 完成合同数量
     */
    public String getOverContractNum() {
        return overContractNum;
    }

    /**
     * 
     * @param overContractNum 完成合同数量
     */
    public void setOverContractNum(String overContractNum) {
        this.overContractNum = overContractNum == null ? null : overContractNum.trim();
    }

    /**
     * 
     * @return confirm_income_tax 确认收入含税
     */
    public String getConfirmIncomeTax() {
        return confirmIncomeTax;
    }

    /**
     * 
     * @param confirmIncomeTax 确认收入含税
     */
    public void setConfirmIncomeTax(String confirmIncomeTax) {
        this.confirmIncomeTax = confirmIncomeTax == null ? null : confirmIncomeTax.trim();
    }

    /**
     * 
     * @return confirm_income_tax_no 确认收入不含税
     */
    public String getConfirmIncomeTaxNo() {
        return confirmIncomeTaxNo;
    }

    /**
     * 
     * @param confirmIncomeTaxNo 确认收入不含税
     */
    public void setConfirmIncomeTaxNo(String confirmIncomeTaxNo) {
        this.confirmIncomeTaxNo = confirmIncomeTaxNo == null ? null : confirmIncomeTaxNo.trim();
    }

    /**
     * 
     * @return tax 税费
     */
    public String getTax() {
        return tax;
    }

    /**
     * 
     * @param tax 税费
     */
    public void setTax(String tax) {
        this.tax = tax == null ? null : tax.trim();
    }

    /**
     * 
     * @return confirm_income 确认收入
     */
    public String getConfirmIncome() {
        return confirmIncome;
    }

    /**
     * 
     * @param confirmIncome 确认收入
     */
    public void setConfirmIncome(String confirmIncome) {
        this.confirmIncome = confirmIncome == null ? null : confirmIncome.trim();
    }

    /**
     * 
     * @return translate_cost 翻译成本
     */
    public String getTranslateCost() {
        return translateCost;
    }

    /**
     * 
     * @param translateCost 翻译成本
     */
    public void setTranslateCost(String translateCost) {
        this.translateCost = translateCost == null ? null : translateCost.trim();
    }

    /**
     * 
     * @return train_cost 培训成本
     */
    public String getTrainCost() {
        return trainCost;
    }

    /**
     * 
     * @param trainCost 培训成本
     */
    public void setTrainCost(String trainCost) {
        this.trainCost = trainCost == null ? null : trainCost.trim();
    }

    /**
     * 
     * @return to_ground_service_cost 落地服务成本
     */
    public String getToGroundServiceCost() {
        return toGroundServiceCost;
    }

    /**
     * 
     * @param toGroundServiceCost 落地服务成本
     */
    public void setToGroundServiceCost(String toGroundServiceCost) {
        this.toGroundServiceCost = toGroundServiceCost == null ? null : toGroundServiceCost.trim();
    }

    /**
     * 
     * @return mail_cost 邮寄成本
     */
    public String getMailCost() {
        return mailCost;
    }

    /**
     * 
     * @param mailCost 邮寄成本
     */
    public void setMailCost(String mailCost) {
        this.mailCost = mailCost == null ? null : mailCost.trim();
    }

    /**
     * 
     * @return apply_cost 申请成本
     */
    public String getApplyCost() {
        return applyCost;
    }

    /**
     * 
     * @param applyCost 申请成本
     */
    public void setApplyCost(String applyCost) {
        this.applyCost = applyCost == null ? null : applyCost.trim();
    }

    /**
     * 
     * @return total_over_money 总报完成金额
     */
    public String getTotalOverMoney() {
        return totalOverMoney;
    }

    /**
     * 
     * @param totalOverMoney 总报完成金额
     */
    public void setTotalOverMoney(String totalOverMoney) {
        this.totalOverMoney = totalOverMoney == null ? null : totalOverMoney.trim();
    }

    /**
     * 
     * @return connect_tel 联系电话
     */
    public String getConnectTel() {
        return connectTel;
    }

    /**
     * 
     * @param connectTel 联系电话
     */
    public void setConnectTel(String connectTel) {
        this.connectTel = connectTel == null ? null : connectTel.trim();
    }

    /**
     * 
     * @return e_mail 联系电话
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * 
     * @param eMail 联系电话
     */
    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    /**
     * 
     * @return agent_tel 代理电话
     */
    public String getAgentTel() {
        return agentTel;
    }

    /**
     * 
     * @param agentTel 代理电话
     */
    public void setAgentTel(String agentTel) {
        this.agentTel = agentTel == null ? null : agentTel.trim();
    }

    /**
     * 
     * @return agent_e_mail 代理电话
     */
    public String getAgentEMail() {
        return agentEMail;
    }

    /**
     * 
     * @param agentEMail 代理电话
     */
    public void setAgentEMail(String agentEMail) {
        this.agentEMail = agentEMail == null ? null : agentEMail.trim();
    }

    /**
     * 
     * @return remarks_content 备注
     */
    public String getRemarksContent() {
        return remarksContent;
    }

    /**
     * 
     * @param remarksContent 备注
     */
    public void setRemarksContent(String remarksContent) {
        this.remarksContent = remarksContent == null ? null : remarksContent.trim();
    }

    /**
     * 
     * @return over_contract_money 定版签约合同
     */
    public String getOverContractMoney() {
        return overContractMoney;
    }

    /**
     * 
     * @param overContractMoney 定版签约合同
     */
    public void setOverContractMoney(String overContractMoney) {
        this.overContractMoney = overContractMoney == null ? null : overContractMoney.trim();
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
}