package com.example.sbm.admin.entity.excel;

import com.example.sbm.admin.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**退费统计表
 * db_refund_statistics
 */
@Table(name = "db_refund_statistics")
public class DbRefundStatistics extends BaseEntity {
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
     * 退费顾问
     */
    @Column(name = "refund_adviser")
    private String refundAdviser;

    /**
     * 退费前已收服务费总额
     */
    @Column(name = "refund_before_income_service_money_total")
    private String refundBeforeIncomeServiceMoneyTotal;

    /**
     * 退费前预收账款余额
     */
    @Column(name = "refund_beforehand_balance")
    private String refundBeforehandBalance;

    /**
     * 退费金额
     */
    @Column(name = "refund_money")
    private String refundMoney;

    /**
     * 内部转合同金额
     */
    @Column(name = "inside_to_contract_money")
    private String insideToContractMoney;

    /**
     * 退多收服务费
     */
    @Column(name = "refund_overcharge_service_money")
    private String refundOverchargeServiceMoney;

    /**
     * 退代收服务费
     */
    @Column(name = "refund_replace_service_money")
    private String refundReplaceServiceMoney;

    /**
     * 退定金
     */
    @Column(name = "refund_deposit")
    private String refundDeposit;

    /**
     * 退费原因
     */
    @Column(name = "refund_reason")
    private String refundReason;

    /**
     * 退费阶段
     */
    @Column(name = "refund_stage")
    private String refundStage;

    /**
     * 流水号
     */
    @Column(name = "contract_ mould_serial_number")
    private String contractMouldSerialNumber;

    /**
     * 退费依据，来源单据
     */
    @Column(name = "contract_basis")
    private String contractBasis;

    /**
     * 包含申请 1 是 0 否
     */
    @Column(name = "include_apply")
    private Integer includeApply;

    /**
     * 语言 培训 1是 0否
     */
    @Column(name = "language_train")
    private Integer languageTrain;

    /**
     * 产品类型
     */
    @Column(name = "product_category")
    private String productCategory;

    /**
     * 退费类型
     */
    @Column(name = "refund_type")
    private String refundType;

    /**
     * 合同归档日期
     */
    @Column(name = "contract_to_file")
    private Date contractToFile;

    /**
     * 签约顾问
     */
    @Column(name = "signing_adviser")
    private String signingAdviser;

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
     * 签约班级编码
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
     * @return refund_adviser 退费顾问
     */
    public String getRefundAdviser() {
        return refundAdviser;
    }

    /**
     * 
     * @param refundAdviser 退费顾问
     */
    public void setRefundAdviser(String refundAdviser) {
        this.refundAdviser = refundAdviser == null ? null : refundAdviser.trim();
    }

    /**
     * 
     * @return refund_before_income_service_money_total 退费前已收服务费总额
     */
    public String getRefundBeforeIncomeServiceMoneyTotal() {
        return refundBeforeIncomeServiceMoneyTotal;
    }

    /**
     * 
     * @param refundBeforeIncomeServiceMoneyTotal 退费前已收服务费总额
     */
    public void setRefundBeforeIncomeServiceMoneyTotal(String refundBeforeIncomeServiceMoneyTotal) {
        this.refundBeforeIncomeServiceMoneyTotal = refundBeforeIncomeServiceMoneyTotal == null ? null : refundBeforeIncomeServiceMoneyTotal.trim();
    }

    /**
     * 
     * @return refund_beforehand_balance 退费前预收账款余额
     */
    public String getRefundBeforehandBalance() {
        return refundBeforehandBalance;
    }

    /**
     * 
     * @param refundBeforehandBalance 退费前预收账款余额
     */
    public void setRefundBeforehandBalance(String refundBeforehandBalance) {
        this.refundBeforehandBalance = refundBeforehandBalance == null ? null : refundBeforehandBalance.trim();
    }

    /**
     * 
     * @return refund_money 退费金额
     */
    public String getRefundMoney() {
        return refundMoney;
    }

    /**
     * 
     * @param refundMoney 退费金额
     */
    public void setRefundMoney(String refundMoney) {
        this.refundMoney = refundMoney == null ? null : refundMoney.trim();
    }

    /**
     * 
     * @return inside_to_contract_money 内部转合同金额
     */
    public String getInsideToContractMoney() {
        return insideToContractMoney;
    }

    /**
     * 
     * @param insideToContractMoney 内部转合同金额
     */
    public void setInsideToContractMoney(String insideToContractMoney) {
        this.insideToContractMoney = insideToContractMoney == null ? null : insideToContractMoney.trim();
    }

    /**
     * 
     * @return refund_overcharge_service_money 退多收服务费
     */
    public String getRefundOverchargeServiceMoney() {
        return refundOverchargeServiceMoney;
    }

    /**
     * 
     * @param refundOverchargeServiceMoney 退多收服务费
     */
    public void setRefundOverchargeServiceMoney(String refundOverchargeServiceMoney) {
        this.refundOverchargeServiceMoney = refundOverchargeServiceMoney == null ? null : refundOverchargeServiceMoney.trim();
    }

    /**
     * 
     * @return refund_replace_service_money 退代收服务费
     */
    public String getRefundReplaceServiceMoney() {
        return refundReplaceServiceMoney;
    }

    /**
     * 
     * @param refundReplaceServiceMoney 退代收服务费
     */
    public void setRefundReplaceServiceMoney(String refundReplaceServiceMoney) {
        this.refundReplaceServiceMoney = refundReplaceServiceMoney == null ? null : refundReplaceServiceMoney.trim();
    }

    /**
     * 
     * @return refund_deposit 退定金
     */
    public String getRefundDeposit() {
        return refundDeposit;
    }

    /**
     * 
     * @param refundDeposit 退定金
     */
    public void setRefundDeposit(String refundDeposit) {
        this.refundDeposit = refundDeposit == null ? null : refundDeposit.trim();
    }

    /**
     * 
     * @return refund_reason 退费原因
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * 
     * @param refundReason 退费原因
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    /**
     * 
     * @return refund_stage 退费阶段
     */
    public String getRefundStage() {
        return refundStage;
    }

    /**
     * 
     * @param refundStage 退费阶段
     */
    public void setRefundStage(String refundStage) {
        this.refundStage = refundStage == null ? null : refundStage.trim();
    }

    /**
     * 
     * @return contract_ mould_serial_number 流水号
     */
    public String getContractMouldSerialNumber() {
        return contractMouldSerialNumber;
    }

    /**
     * 
     * @param contractMouldSerialNumber 流水号
     */
    public void setContractMouldSerialNumber(String contractMouldSerialNumber) {
        this.contractMouldSerialNumber = contractMouldSerialNumber == null ? null : contractMouldSerialNumber.trim();
    }

    /**
     * 
     * @return contract_basis 退费依据，来源单据
     */
    public String getContractBasis() {
        return contractBasis;
    }

    /**
     * 
     * @param contractBasis 退费依据，来源单据
     */
    public void setContractBasis(String contractBasis) {
        this.contractBasis = contractBasis == null ? null : contractBasis.trim();
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
     * @return product_category 产品类型
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * 
     * @param productCategory 产品类型
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.trim();
    }

    /**
     * 
     * @return refund_type 退费类型
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * 
     * @param refundType 退费类型
     */
    public void setRefundType(String refundType) {
        this.refundType = refundType == null ? null : refundType.trim();
    }

    /**
     * 
     * @return contract_to_file 合同归档日期
     */
    public Date getContractToFile() {
        return contractToFile;
    }

    /**
     * 
     * @param contractToFile 合同归档日期
     */
    public void setContractToFile(Date contractToFile) {
        this.contractToFile = contractToFile;
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
     * @return signing_class_type 签约班级编码
     */
    public String getSigningClassType() {
        return signingClassType;
    }

    /**
     * 
     * @param signingClassType 签约班级编码
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

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}