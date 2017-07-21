package com.entity;

public class ExcelDataDto {
	private double id;

	//任务来源
	private String taskSource;
	//报送分类-1
	private String submittedFirst;
	//报送分类-2
	private String submittedSecond;
	//被抽样单位名称
	private String bySampUnitName;
    //单位地点
	private String unitlocation;
	//抽样地点
	private String samplocations;
	//年销售额
	private String annualSales;
    //营业执照号
	private String businesslicense;
	//传真
	private String fax;
	//省   
	private String provincial;
    // 地区   
	private String sampArea;
	//县
	private String county;
	//区域类型
	private String regionalTypes;
    //单位地址
	private String unitAddress;
	//邮编
	private String zipCode;
	//被抽样单位法人  
	private String unitlegalperson;
    //电话
	private String unitlegalpersonphone;
	
	//被抽样单位负责（联系）人
	private String unitResponsiblePerson;
	// 电话
	private String unitResponsiblePersonPhone;
    //样品名称
	private String sampleName;
	//样品属性
	private String sampleProperties;
	//抽样数量
	private String sampNumber;
	//抽样数量单位
	private String sampNumberUnit;
    //抽样编号
	private String sampCode;
	//食品大类
	private String foodCate;
	//食品亚类
	private String foodFirstCate;
    //食品次亚类
	private String foodSecodCate;
	//食品细类
	private String fineFoodClass;
	//样品形态
	private String sampleForm;
    //样品类型
	private String  sampleType;
	//包装分类
	private String packageClass;
	//样品来源
	private String sampleSource;
    //加工/购进日期
	private String proceDate;
	//抽样方式
	private String sampMethod;
	//抽样工具
	private String sampTool;
    //样品规格
	private String sampSize;
	//样品批号
	private String sampBatchNumber;
	//生产日期
	private String  productionDate;
    //保质期
	private String shelflife;
	 //保质期单位
	private String shelflifeUnit;
	//许可证号
	private String licenseNum;
	//执行标准/技术文件
	private String tandardTechnicalDoc;
    //质量等级
	private String qualityGrade;
	//商标
	private String trademark;
	//单价
	private String unitPrice;
	
    //是否出口
	private String isExport;
	//抽样基数/批量
	private String samplingBase;
	//抽样
	private String samp;
    //备样数量
	private String preSampNum;
	//标识生产企业名称
	private String proEnterpriseName;
	//标识生产企业地址
	private String proEnterpriseAddress;
    //标识生产企业省份
	private String proEnterpriseProvinces;
	//生产企业联系人
	private String proEnterprisePerson;
	//生产企业电话
	private String proEnterprisePhone;
    //抽样时样品存储状态
	private String sampleStorageCondition;
	//温度
	private String temperature;
	//抽样样品包装
	private String sampPacking;
    //湿度
	private String humidity;
	//寄、送样品截止日期
	private String sendSampleDate;
	//寄送样品地址
	private String sendSampleAddress;
	
    //备注
	private String sampUnitNote;
	//抽样单位名称
	private String sampUnitName;
	//单位级别
	private String unitLevel;
    //抽样人员
	private String samPersonnel;
	//抽样时间
	private String sampTime;
	//电话
	private String sampPhone;
    //抽样单位负责（联系）人
	private String respSampUnitPerson;
	//电话
	private String respSampUnitPersonPhone;
	//电子邮箱
	private String respSampUnitPersonEmail;
    //单位地址
	private String sampUnitAddress;
	//邮编
	private String sampUnitZipCode;
	//传真
	private String sampUnitFax;
    //检验机构名称
	private String inspectionAgencyName;
	//检验目的
	private String testPurpose;
	//报告书编号
	private String reportNumber;
    //收检日期
	private String acceptCheckDate;
	
	//报告日期
	private String reportDate;
	//报告签发人
	private String reportIssuedPerson;
	
    //联系人
	private String conPerson;
	//电话
	private String conPersonPhone;
	//电子邮箱
	private String conPersonEmail;
    //检验项目
	private String inspectItems ;
	//检验结果
	private String inspectResults;
	//检验单位
	private String resultsUnit;
	//结果判定
	private String resultsDetermine;
    //检验依据
	private String inspectionBasis;
	//判定依据
	private String decideBasis;
	//标准方法检出限
	private String  standardMethodLimit;
    //标准方法检出限单位

	private String standardMethodLimitUnit;
	//方法检出限
	private String methodDetectionLimit;
	//检出限单位

	private String detectionLimitUnit;
    //标准最小允许限
	private String standardMinAllowableLimit;
	//标准最小允许限单位
	private String standardMinAllowableLimitUnit;
	//最小允许限
	private String minAllowableLimit;
	
    //最小允许限单位
	private String minAllowableLimitUnit;
	//标准最大允许限
	private String standardMaxAllowableLimit;
	//标准最大允许限单位
	private String standardMaxAllowableLimitUnit;
    //最大允许限
	private String maxAllowableLimit;
	//最大允许限单位
	private String maxAllowableLimitUnit;
	//说明
	private String instructions;    
	//结论
	private String conclusion;
	//确认情况
	private String confirmSituation;
	//备注
	private String note;
	
    //填报人
	private String fillPerson ;
	//填报日期
	private String fillDate;
	//电话
	private String fillPhone;    
	//电子邮箱
	private String fillEmail;
	//样品入库状态
	private String storageCondition;
	//更新时间
	private String updateTime;
	
    //创建时间
	private String createTime;
	//一司/三司
    private  String department;
    
    public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getTaskSource() {
		return taskSource;
	}
	public void setTaskSource(String taskSource) {
		this.taskSource = taskSource;
	}

	public String getBusinesslicense() {
		return businesslicense;
	}
	public void setBusinesslicense(String businesslicense) {
		this.businesslicense = businesslicense;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getProvincial() {
		return provincial;
	}
	public void setProvincial(String provincial) {
		this.provincial = provincial;
	}


	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	
	public String getUnitAddress() {
		return unitAddress;
	}
	public void setUnitAddress(String unitAddress) {
		this.unitAddress = unitAddress;
	}

	public String getUnitlegalperson() {
		return unitlegalperson;
	}
	public void setUnitlegalperson(String unitlegalperson) {
		this.unitlegalperson = unitlegalperson;
	}
	public String getUnitlegalpersonphone() {
		return unitlegalpersonphone;
	}
	public void setUnitlegalpersonphone(String unitlegalpersonphone) {
		this.unitlegalpersonphone = unitlegalpersonphone;
	}
	public String getUnitResponsiblePerson() {
		return unitResponsiblePerson;
	}
	public void setUnitResponsiblePerson(String unitResponsiblePerson) {
		this.unitResponsiblePerson = unitResponsiblePerson;
	}
	public String getUnitResponsiblePersonPhone() {
		return unitResponsiblePersonPhone;
	}
	public void setUnitResponsiblePersonPhone(String unitResponsiblePersonPhone) {
		this.unitResponsiblePersonPhone = unitResponsiblePersonPhone;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	public String getSampleProperties() {
		return sampleProperties;
	}
	public void setSampleProperties(String sampleProperties) {
		this.sampleProperties = sampleProperties;
	}
	public String getSampNumber() {
		return sampNumber;
	}
	public void setSampNumber(String sampNumber) {
		this.sampNumber = sampNumber;
	}
	public String getSampNumberUnit() {
		return sampNumberUnit;
	}
	public void setSampNumberUnit(String sampNumberUnit) {
		this.sampNumberUnit = sampNumberUnit;
	}
	public String getSampCode() {
		return sampCode;
	}
	public void setSampCode(String sampCode) {
		this.sampCode = sampCode;
	}
	public String getFoodCate() {
		return foodCate;
	}
	public void setFoodCate(String foodCate) {
		this.foodCate = foodCate;
	}
	public String getFoodFirstCate() {
		return foodFirstCate;
	}
	public void setFoodFirstCate(String foodFirstCate) {
		this.foodFirstCate = foodFirstCate;
	}
	public String getFoodSecodCate() {
		return foodSecodCate;
	}
	public void setFoodSecodCate(String foodSecodCate) {
		this.foodSecodCate = foodSecodCate;
	}
	public String getFineFoodClass() {
		return fineFoodClass;
	}
	public void setFineFoodClass(String fineFoodClass) {
		this.fineFoodClass = fineFoodClass;
	}
	public String getSampleForm() {
		return sampleForm;
	}
	public void setSampleForm(String sampleForm) {
		this.sampleForm = sampleForm;
	}
	public String getSampleType() {
		return sampleType;
	}
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	public String getPackageClass() {
		return packageClass;
	}
	public void setPackageClass(String packageClass) {
		this.packageClass = packageClass;
	}
	public String getSampleSource() {
		return sampleSource;
	}
	public void setSampleSource(String sampleSource) {
		this.sampleSource = sampleSource;
	}
	public String getProceDate() {
		return proceDate;
	}
	public void setProceDate(String proceDate) {
		this.proceDate = proceDate;
	}
	public String getSampMethod() {
		return sampMethod;
	}
	public void setSampMethod(String sampMethod) {
		this.sampMethod = sampMethod;
	}
	public String getSampTool() {
		return sampTool;
	}
	public void setSampTool(String sampTool) {
		this.sampTool = sampTool;
	}
	public String getSampSize() {
		return sampSize;
	}
	public void setSampSize(String sampSize) {
		this.sampSize = sampSize;
	}
	public String getSampBatchNumber() {
		return sampBatchNumber;
	}
	public void setSampBatchNumber(String sampBatchNumber) {
		this.sampBatchNumber = sampBatchNumber;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	public String getShelflife() {
		return shelflife;
	}
	public void setShelflife(String shelflife) {
		this.shelflife = shelflife;
	}
	public String getShelflifeUnit() {
		return shelflifeUnit;
	}
	public void setShelflifeUnit(String shelflifeUnit) {
		this.shelflifeUnit = shelflifeUnit;
	}
	public String getLicenseNum() {
		return licenseNum;
	}
	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}
	public String getTandardTechnicalDoc() {
		return tandardTechnicalDoc;
	}
	public void setTandardTechnicalDoc(String tandardTechnicalDoc) {
		this.tandardTechnicalDoc = tandardTechnicalDoc;
	}
	public String getQualityGrade() {
		return qualityGrade;
	}
	public void setQualityGrade(String qualityGrade) {
		this.qualityGrade = qualityGrade;
	}
	public String getTrademark() {
		return trademark;
	}
	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getIsExport() {
		return isExport;
	}
	public void setIsExport(String isExport) {
		this.isExport = isExport;
	}
	public String getSamplingBase() {
		return samplingBase;
	}
	public void setSamplingBase(String samplingBase) {
		this.samplingBase = samplingBase;
	}
	public String getSamp() {
		return samp;
	}
	public void setSamp(String samp) {
		this.samp = samp;
	}
	public String getPreSampNum() {
		return preSampNum;
	}
	public void setPreSampNum(String preSampNum) {
		this.preSampNum = preSampNum;
	}
	public String getProEnterpriseName() {
		return proEnterpriseName;
	}
	public void setProEnterpriseName(String proEnterpriseName) {
		this.proEnterpriseName = proEnterpriseName;
	}
	public String getProEnterpriseAddress() {
		return proEnterpriseAddress;
	}
	public void setProEnterpriseAddress(String proEnterpriseAddress) {
		this.proEnterpriseAddress = proEnterpriseAddress;
	}
	public String getProEnterpriseProvinces() {
		return proEnterpriseProvinces;
	}
	public void setProEnterpriseProvinces(String proEnterpriseProvinces) {
		this.proEnterpriseProvinces = proEnterpriseProvinces;
	}
	public String getProEnterprisePerson() {
		return proEnterprisePerson;
	}
	public void setProEnterprisePerson(String proEnterprisePerson) {
		this.proEnterprisePerson = proEnterprisePerson;
	}
	public String getProEnterprisePhone() {
		return proEnterprisePhone;
	}
	public void setProEnterprisePhone(String proEnterprisePhone) {
		this.proEnterprisePhone = proEnterprisePhone;
	}
	public String getSampleStorageCondition() {
		return sampleStorageCondition;
	}
	public void setSampleStorageCondition(String sampleStorageCondition) {
		this.sampleStorageCondition = sampleStorageCondition;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getSendSampleDate() {
		return sendSampleDate;
	}
	public void setSendSampleDate(String sendSampleDate) {
		this.sendSampleDate = sendSampleDate;
	}
	public String getSendSampleAddress() {
		return sendSampleAddress;
	}
	public void setSendSampleAddress(String sendSampleAddress) {
		this.sendSampleAddress = sendSampleAddress;
	}

	public String getSamPersonnel() {
		return samPersonnel;
	}
	public void setSamPersonnel(String samPersonnel) {
		this.samPersonnel = samPersonnel;
	}
	public String getSampTime() {
		return sampTime;
	}
	public void setSampTime(String sampTime) {
		this.sampTime = sampTime;
	}
	public String getSampPhone() {
		return sampPhone;
	}
	public void setSampPhone(String sampPhone) {
		this.sampPhone = sampPhone;
	}
	public String getRespSampUnitPerson() {
		return respSampUnitPerson;
	}
	public void setRespSampUnitPerson(String respSampUnitPerson) {
		this.respSampUnitPerson = respSampUnitPerson;
	}
	public String getRespSampUnitPersonPhone() {
		return respSampUnitPersonPhone;
	}
	public void setRespSampUnitPersonPhone(String respSampUnitPersonPhone) {
		this.respSampUnitPersonPhone = respSampUnitPersonPhone;
	}
	public String getRespSampUnitPersonEmail() {
		return respSampUnitPersonEmail;
	}
	public void setRespSampUnitPersonEmail(String respSampUnitPersonEmail) {
		this.respSampUnitPersonEmail = respSampUnitPersonEmail;
	}
	public String getSampUnitAddress() {
		return sampUnitAddress;
	}
	public void setSampUnitAddress(String sampUnitAddress) {
		this.sampUnitAddress = sampUnitAddress;
	}

	public String getInspectionAgencyName() {
		return inspectionAgencyName;
	}
	public void setInspectionAgencyName(String inspectionAgencyName) {
		this.inspectionAgencyName = inspectionAgencyName;
	}
	public String getTestPurpose() {
		return testPurpose;
	}
	public void setTestPurpose(String testPurpose) {
		this.testPurpose = testPurpose;
	}
	public String getReportNumber() {
		return reportNumber;
	}
	public void setReportNumber(String reportNumber) {
		this.reportNumber = reportNumber;
	}

	public String getReportDate() {
		return reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public void setConPerson(String conPerson) {
		this.conPerson = conPerson;
	}
	public String getConPersonPhone() {
		return conPersonPhone;
	}
	public void setConPersonPhone(String conPersonPhone) {
		this.conPersonPhone = conPersonPhone;
	}
	public String getConPersonEmail() {
		return conPersonEmail;
	}
	public void setConPersonEmail(String conPersonEmail) {
		this.conPersonEmail = conPersonEmail;
	}

	public String getInspectResults() {
		return inspectResults;
	}
	public void setInspectResults(String inspectResults) {
		this.inspectResults = inspectResults;
	}
	public String getResultsUnit() {
		return resultsUnit;
	}
	public void setResultsUnit(String resultsUnit) {
		this.resultsUnit = resultsUnit;
	}
	public String getResultsDetermine() {
		return resultsDetermine;
	}
	public void setResultsDetermine(String resultsDetermine) {
		this.resultsDetermine = resultsDetermine;
	}
	public String getInspectionBasis() {
		return inspectionBasis;
	}
	public void setInspectionBasis(String inspectionBasis) {
		this.inspectionBasis = inspectionBasis;
	}
	public String getDecideBasis() {
		return decideBasis;
	}
	public void setDecideBasis(String decideBasis) {
		this.decideBasis = decideBasis;
	}
	public String getStandardMethodLimit() {
		return standardMethodLimit;
	}
	public void setStandardMethodLimit(String standardMethodLimit) {
		this.standardMethodLimit = standardMethodLimit;
	}
	public String getStandardMethodLimitUnit() {
		return standardMethodLimitUnit;
	}
	public void setStandardMethodLimitUnit(String standardMethodLimitUnit) {
		this.standardMethodLimitUnit = standardMethodLimitUnit;
	}
	public String getMethodDetectionLimit() {
		return methodDetectionLimit;
	}
	public void setMethodDetectionLimit(String methodDetectionLimit) {
		this.methodDetectionLimit = methodDetectionLimit;
	}

	public String getStandardMinAllowableLimit() {
		return standardMinAllowableLimit;
	}
	public void setStandardMinAllowableLimit(String standardMinAllowableLimit) {
		this.standardMinAllowableLimit = standardMinAllowableLimit;
	}
	public String getStandardMinAllowableLimitUnit() {
		return standardMinAllowableLimitUnit;
	}
	public void setStandardMinAllowableLimitUnit(
			String standardMinAllowableLimitUnit) {
		this.standardMinAllowableLimitUnit = standardMinAllowableLimitUnit;
	}
	public String getMinAllowableLimit() {
		return minAllowableLimit;
	}
	public void setMinAllowableLimit(String minAllowableLimit) {
		this.minAllowableLimit = minAllowableLimit;
	}
	public String getMinAllowableLimitUnit() {
		return minAllowableLimitUnit;
	}
	public void setMinAllowableLimitUnit(String minAllowableLimitUnit) {
		this.minAllowableLimitUnit = minAllowableLimitUnit;
	}
	public String getStandardMaxAllowableLimit() {
		return standardMaxAllowableLimit;
	}
	public void setStandardMaxAllowableLimit(String standardMaxAllowableLimit) {
		this.standardMaxAllowableLimit = standardMaxAllowableLimit;
	}
	public String getStandardMaxAllowableLimitUnit() {
		return standardMaxAllowableLimitUnit;
	}
	public void setStandardMaxAllowableLimitUnit(
			String standardMaxAllowableLimitUnit) {
		this.standardMaxAllowableLimitUnit = standardMaxAllowableLimitUnit;
	}
	public String getMaxAllowableLimit() {
		return maxAllowableLimit;
	}
	public void setMaxAllowableLimit(String maxAllowableLimit) {
		this.maxAllowableLimit = maxAllowableLimit;
	}
	public String getMaxAllowableLimitUnit() {
		return maxAllowableLimitUnit;
	}
	public void setMaxAllowableLimitUnit(String maxAllowableLimitUnit) {
		this.maxAllowableLimitUnit = maxAllowableLimitUnit;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getFillPerson() {
		return fillPerson;
	}
	public void setFillPerson(String fillPerson) {
		this.fillPerson = fillPerson;
	}
	public String getFillDate() {
		return fillDate;
	}
	public void setFillDate(String fillDate) {
		this.fillDate = fillDate;
	}
	public String getFillPhone() {
		return fillPhone;
	}
	public void setFillPhone(String fillPhone) {
		this.fillPhone = fillPhone;
	}
	public String getFillEmail() {
		return fillEmail;
	}
	public void setFillEmail(String fillEmail) {
		this.fillEmail = fillEmail;
	}
	public String getStorageCondition() {
		return storageCondition;
	}
	public void setStorageCondition(String storageCondition) {
		this.storageCondition = storageCondition;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSubmittedFirst() {
		return submittedFirst;
	}
	public void setSubmittedFirst(String submittedFirst) {
		this.submittedFirst = submittedFirst;
	}
	public String getSubmittedSecond() {
		return submittedSecond;
	}
	public void setSubmittedSecond(String submittedSecond) {
		this.submittedSecond = submittedSecond;
	}
	public String getBySampUnitName() {
		return bySampUnitName;
	}
	public void setBySampUnitName(String bySampUnitName) {
		this.bySampUnitName = bySampUnitName;
	}
	public String getUnitlocation() {
		return unitlocation;
	}
	public void setUnitlocation(String unitlocation) {
		this.unitlocation = unitlocation;
	}
	public String getSamplocations() {
		return samplocations;
	}
	public void setSamplocations(String samplocations) {
		this.samplocations = samplocations;
	}
	public String getAnnualSales() {
		return annualSales;
	}
	public void setAnnualSales(String annualSales) {
		this.annualSales = annualSales;
	}
	public String getSampArea() {
		return sampArea;
	}
	public void setSampArea(String sampArea) {
		this.sampArea = sampArea;
	}
	public String getRegionalTypes() {
		return regionalTypes;
	}
	public void setRegionalTypes(String regionalTypes) {
		this.regionalTypes = regionalTypes;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSampPacking() {
		return sampPacking;
	}
	public void setSampPacking(String sampPacking) {
		this.sampPacking = sampPacking;
	}
	public String getSampUnitNote() {
		return sampUnitNote;
	}
	public void setSampUnitNote(String sampUnitNote) {
		this.sampUnitNote = sampUnitNote;
	}
	public String getSampUnitName() {
		return sampUnitName;
	}
	public void setSampUnitName(String sampUnitName) {
		this.sampUnitName = sampUnitName;
	}

	public String getUnitLevel() {
		return unitLevel;
	}
	public void setUnitLevel(String unitLevel) {
		this.unitLevel = unitLevel;
	}
	public String getSampUnitZipCode() {
		return sampUnitZipCode;
	}
	public void setSampUnitZipCode(String sampUnitZipCode) {
		this.sampUnitZipCode = sampUnitZipCode;
	}
	public String getSampUnitFax() {
		return sampUnitFax;
	}
	public void setSampUnitFax(String sampUnitFax) {
		this.sampUnitFax = sampUnitFax;
	}
	public String getAcceptCheckDate() {
		return acceptCheckDate;
	}
	public void setAcceptCheckDate(String acceptCheckDate) {
		this.acceptCheckDate = acceptCheckDate;
	}
	public String getReportIssuedPerson() {
		return reportIssuedPerson;
	}
	public void setReportIssuedPerson(String reportIssuedPerson) {
		this.reportIssuedPerson = reportIssuedPerson;
	}
	public String getInspectItems() {
		return inspectItems;
	}
	public void setInspectItems(String inspectItems) {
		this.inspectItems = inspectItems;
	}
	public String getDetectionLimitUnit() {
		return detectionLimitUnit;
	}
	public void setDetectionLimitUnit(String detectionLimitUnit) {
		this.detectionLimitUnit = detectionLimitUnit;
	}
	public String getConfirmSituation() {
		return confirmSituation;
	}
	public void setConfirmSituation(String confirmSituation) {
		this.confirmSituation = confirmSituation;
	}
	public String getConPerson() {
		return conPerson;
	}


    
    
	
}
