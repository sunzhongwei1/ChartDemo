package com.entity;

public class ExeclBaseDto {
	
	//任务来源
	private  String  taskSource;
	
	//报送分类-1
	private  String  submittedOne;
	//报送分类-2
	private  String  submittedTwo;

	
	//被抽样单位名称
	private  String  bySampleCompanyName;
	//单位地点
	private  String  CompanyLocation;
	//抽样地点
	private  String  SampleLocations;
	//年销售额
	private  String  annualSales;
	//营业执照号
	private  String  businessLicense;
	//传真
	private  String  fax;
	//省
	private  String  provincial;
	//地区
	private  String  CompanyArea;	
	//县
	private  String  county;
	//区域类型
	private  String  regionalTypes;
	//单位地址
	private  String  companyaddress;
	//邮编
	private  String  companyZipCode;
	//被抽样单位法人
	private  String  companyLegalPerson;
	//单位法人电话
	private  String  LegalPersonPhone;
	//被抽样单位负责（联系）人
	private  String  byCompanyResponsiblePerson;
	//被抽样单位负责人电话
	private  String  ByResponsiblePhone;
	
	//样品名称
	private  String  sampleName;
	//样品属性
	private  String  sampleProperties;
	//抽样数量
	private  String  sampleNum;
	//抽样数量
	private  String  sampleUnit;
		
	//抽样编号
	private  String  sampleCode;
	
	//食品大类
	private  String  FoodCate;
	//食品亚类
	private  String  FoodFirstCate;
	//食品次亚类
	private  String  FoodSecondCate;
	//食品细类
	private  String  foodFineClass;
	
	//样品形态
	private  String  sampleForm;
	//样品类型
	private  String  sampleType;
	//包装分类
	private  String  packageClassification;
	//样品来源
	private  String  sampleSource;
	
	//加工/购进日期
	private  String  processDate;
	//抽样方式
	private  String  sampleMethod;
	//抽样工具
	private  String  sampleTool;
	//样品规格
	private  String  sampleSize;
	//样品批号
	private  String  sampleBatch;
	
	//生产日期
	private  String  productDate;
	//保质期
	private  String  sheifLife;
	//保质期单位
	private  String  sheifLifeUnit;
	//许可证号
	private  String  license;
	//执行标准/技术文件
	private  String  standardDoc;
	
	//质量等级
	private  String  qualityGrade;
	//商标
	private  String  trademark;
	//单价
	private  String  unitprice;
	//是否出口
	private  String  isexport;
	//抽样基数/批量
	private  String  sampleBase;
	
	//抽样
	private  String  sample;
	//备样数量
	private  String  PrepareSampleNum;
	//标识生产企业名称
	private  String  productEnterpriseName;
	
	//标识生产企业地址
	private  String  productEnterpriseaddress;
	//标识生产企业省份
	private  String  productEnterpriseProvincial;
	//标识生产联系人
	private  String  productEnterprisePerson;
	//生产企业电话
	private  String  productEnterprisePhone;
	//抽样时样品存储状态
	private  String  samplingSampleStorageState;
	
	//温度
	private  String  temperature;
	//抽样样品包装
	private  String  samplePackage;
	
	//湿度
	private  String  humidity;
	//寄、送样品截止日期
	private  String  Sendate;
	//寄、送样品地址
	private  String  sendAdress;
	
	//备注
	private  String  note;
	//抽样单位名称
	private  String  SampleUnitName;
	//单位级别
	private  String  UnitGrade;
	
	//抽样人员
	private  String  SamplePerson;
	
	
	
	//抽样时间
	private  String  SampleDate;	
	//电话
	private  String  SamplePersonPhone;	
	//抽样单位负责人
	private  String  unitLegalPerson;	
	//单位负责人电话
	private  String  unitResponsiblePersonPhone;	
	//电子邮箱
	private  String  unitResponsiblePersonEmail;	
	//单位地址
	private  String  SampleUnitAddress;	
	//邮编
	private  String  SampleUnitZipCode;	
	//传真
	private  String  SamplePersonfax;
	
	
	//检验机构名称
	private  String  InspectionAgencyName;	
	//检验目的
	private  String  TestingPurpose;	
	//报告书编号
	private  String  ReportNumber;	
	//收检日期
	private  String  AcceptCheckDate;	
	//报告日期
	private  String  reportDate;	
	//报告签发人
	private  String  ReportIssuedByPeople;	
	//联系人
	private  String   contact;	
	//电话
	private  String  phone;	
	//电子邮箱
	private  String  email;	
	//检验项目
	private  String  InspectionItems;	
	//检验结果
	private  String  inspectionResults;	
	//检验结果单位
	private  String  inspectionResultsUnit;	
	//结果判定
	private  String  resultsDetermine;	
	//检验依据
	private  String  InspectionBasis;	
	//判定依据
	private  String  DecideOnTheBasis;	
	//标准方法检出限
	private  String  standarddetectionlimit;	
	//标准方法检出限单位
	private  String  standarddetectionlimitUnit;	
	//方法检出限
	private  String  detectionlimit;
	//检出限单位
	private  String  detectionlimitUnit;	

	//标准最小允许限
	private  String  standardMinimumAllowableLimit;	
	//标准最小允许限单位
	private  String  standardMinimumAllowableLimitUnit;	
	//最小允许限
	private  String  MinimumAllowableLimit;	
	//最小允许限单位
	private  String  MinimumAllowableLimitUnit;	
	//标准最大允许限
	private  String  standardMaximumAllowableLimit;	
	//标准最大允许限单位
	private  String  standardMaximumAllowableLimitUnit;	
	//最大允许限
	private  String  MaximumAllowableLimit;	
	//最大允许限单位
	private  String  MaximumAllowableLimitUnit;	
	//说明
	private  String  instructions;	
	//结论
	private  String  conclusion;	
	//确认情况
	private  String  ConfirmSituation;	
	//备注
	private  String  InspectionAgencyNote;	
	
	//填报人
	private  String  fillName;
	//填报日期
	private  String  fillDate;
	//电话
	private  String  fillPhone;
	//电子邮箱
	private  String  fillEmail;
	//样品入库状态
	private  String  sampleStorgeState;
	//创建时间
	private  String  createTime;
	//更新时间
	private  String  updateTime;
	//一司/三司
	private  String  department;
	public String getTaskSource() {
		return taskSource;
	}
	public void setTaskSource(String taskSource) {
		this.taskSource = taskSource;
	}
	public String getSubmittedOne() {
		return submittedOne;
	}
	public void setSubmittedOne(String submittedOne) {
		this.submittedOne = submittedOne;
	}
	public String getSubmittedTwo() {
		return submittedTwo;
	}
	public void setSubmittedTwo(String submittedTwo) {
		this.submittedTwo = submittedTwo;
	}
	public String getBySampleCompanyName() {
		return bySampleCompanyName;
	}
	public void setBySampleCompanyName(String bySampleCompanyName) {
		this.bySampleCompanyName = bySampleCompanyName;
	}
	public String getCompanyLocation() {
		return CompanyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		CompanyLocation = companyLocation;
	}
	public String getSampleLocations() {
		return SampleLocations;
	}
	public void setSampleLocations(String sampleLocations) {
		SampleLocations = sampleLocations;
	}
	public String getAnnualSales() {
		return annualSales;
	}
	public void setAnnualSales(String annualSales) {
		this.annualSales = annualSales;
	}
	public String getBusinessLicense() {
		return businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
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
	public String getCompanyArea() {
		return CompanyArea;
	}
	public void setCompanyArea(String CompanyArea) {
		this.CompanyArea = CompanyArea;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getRegionalTypes() {
		return regionalTypes;
	}
	public void setRegionalTypes(String regionalTypes) {
		this.regionalTypes = regionalTypes;
	}
	public String getCompanyaddress() {
		return companyaddress;
	}
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	public String getCompanyZipCode() {
		return companyZipCode;
	}
	public void setCompanyZipCode(String companyZipCode) {
		this.companyZipCode = companyZipCode;
	}
	public String getCompanyLegalPerson() {
		return companyLegalPerson;
	}
	public void setCompanyLegalPerson(String companyLegalPerson) {
		this.companyLegalPerson = companyLegalPerson;
	}
	public String getLegalPersonPhone() {
		return LegalPersonPhone;
	}
	public void setLegalPersonPhone(String legalPersonPhone) {
		LegalPersonPhone = legalPersonPhone;
	}
	public String getByCompanyResponsiblePerson() {
		return byCompanyResponsiblePerson;
	}
	public void setByCompanyResponsiblePerson(String byCompanyResponsiblePerson) {
		this.byCompanyResponsiblePerson = byCompanyResponsiblePerson;
	}
	public String getByResponsiblePhone() {
		return ByResponsiblePhone;
	}
	public void setByResponsiblePhone(String byResponsiblePhone) {
		ByResponsiblePhone = byResponsiblePhone;
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
	public String getSampleNum() {
		return sampleNum;
	}
	public void setSampleNum(String sampleNum) {
		this.sampleNum = sampleNum;
	}
	public String getSampleUnit() {
		return sampleUnit;
	}
	public void setSampleUnit(String sampleUnit) {
		this.sampleUnit = sampleUnit;
	}
	public String getSampleCode() {
		return sampleCode;
	}
	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}
	public String getFoodCate() {
		return FoodCate;
	}
	public void setFoodCate(String foodCate) {
		FoodCate = foodCate;
	}
	public String getFoodFirstCate() {
		return FoodFirstCate;
	}
	public void setFoodFirstCate(String foodFirstCate) {
		FoodFirstCate = foodFirstCate;
	}
	public String getFoodSecondCate() {
		return FoodSecondCate;
	}
	public void setFoodSecondCate(String foodSecondCate) {
		FoodSecondCate = foodSecondCate;
	}
	public String getFoodFineClass() {
		return foodFineClass;
	}
	public void setFoodFineClass(String foodFineClass) {
		this.foodFineClass = foodFineClass;
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
	public String getPackageClassification() {
		return packageClassification;
	}
	public void setPackageClassification(String packageClassification) {
		this.packageClassification = packageClassification;
	}
	public String getSampleSource() {
		return sampleSource;
	}
	public void setSampleSource(String sampleSource) {
		this.sampleSource = sampleSource;
	}
	public String getProcessDate() {
		return processDate;
	}
	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}
	public String getSampleMethod() {
		return sampleMethod;
	}
	public void setSampleMethod(String sampleMethod) {
		this.sampleMethod = sampleMethod;
	}
	public String getSampleTool() {
		return sampleTool;
	}
	public void setSampleTool(String sampleTool) {
		this.sampleTool = sampleTool;
	}
	public String getSampleSize() {
		return sampleSize;
	}
	public void setSampleSize(String sampleSize) {
		this.sampleSize = sampleSize;
	}
	public String getSampleBatch() {
		return sampleBatch;
	}
	public void setSampleBatch(String sampleBatch) {
		this.sampleBatch = sampleBatch;
	}
	public String getProductDate() {
		return productDate;
	}
	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}
	public String getSheifLife() {
		return sheifLife;
	}
	public void setSheifLife(String sheifLife) {
		this.sheifLife = sheifLife;
	}
	public String getSheifLifeUnit() {
		return sheifLifeUnit;
	}
	public void setSheifLifeUnit(String sheifLifeUnit) {
		this.sheifLifeUnit = sheifLifeUnit;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getStandardDoc() {
		return standardDoc;
	}
	public void setStandardDoc(String standardDoc) {
		this.standardDoc = standardDoc;
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
	public String getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}
	public String getIsexport() {
		return isexport;
	}
	public void setIsexport(String isexport) {
		this.isexport = isexport;
	}
	public String getSampleBase() {
		return sampleBase;
	}
	public void setSampleBase(String sampleBase) {
		this.sampleBase = sampleBase;
	}
	public String getSample() {
		return sample;
	}
	public void setSample(String sample) {
		this.sample = sample;
	}
	public String getPrepareSampleNum() {
		return PrepareSampleNum;
	}
	public void setPrepareSampleNum(String prepareSampleNum) {
		PrepareSampleNum = prepareSampleNum;
	}
	public String getProductEnterpriseName() {
		return productEnterpriseName;
	}
	public void setProductEnterpriseName(String productEnterpriseName) {
		this.productEnterpriseName = productEnterpriseName;
	}
	public String getProductEnterpriseaddress() {
		return productEnterpriseaddress;
	}
	public void setProductEnterpriseaddress(String productEnterpriseaddress) {
		this.productEnterpriseaddress = productEnterpriseaddress;
	}
	public String getProductEnterpriseProvincial() {
		return productEnterpriseProvincial;
	}
	public void setProductEnterpriseProvincial(String productEnterpriseProvincial) {
		this.productEnterpriseProvincial = productEnterpriseProvincial;
	}
	public String getProductEnterprisePerson() {
		return productEnterprisePerson;
	}
	public void setProductEnterprisePerson(String productEnterprisePerson) {
		this.productEnterprisePerson = productEnterprisePerson;
	}
	public String getProductEnterprisePhone() {
		return productEnterprisePhone;
	}
	public void setProductEnterprisePhone(String productEnterprisePhone) {
		this.productEnterprisePhone = productEnterprisePhone;
	}
	public String getSamplingSampleStorageState() {
		return samplingSampleStorageState;
	}
	public void setSamplingSampleStorageState(String samplingSampleStorageState) {
		this.samplingSampleStorageState = samplingSampleStorageState;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getSamplePackage() {
		return samplePackage;
	}
	public void setSamplePackage(String samplePackage) {
		this.samplePackage = samplePackage;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getSendate() {
		return Sendate;
	}
	public void setSendate(String sendate) {
		Sendate = sendate;
	}
	public String getSendAdress() {
		return sendAdress;
	}
	public void setSendAdress(String sendAdress) {
		this.sendAdress = sendAdress;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getSampleUnitName() {
		return SampleUnitName;
	}
	public void setSampleUnitName(String sampleUnitName) {
		SampleUnitName = sampleUnitName;
	}
	public String getUnitGrade() {
		return UnitGrade;
	}
	public void setUnitGrade(String unitGrade) {
		UnitGrade = unitGrade;
	}
	public String getSamplePerson() {
		return SamplePerson;
	}
	public void setSamplePerson(String samplePerson) {
		SamplePerson = samplePerson;
	}
	public String getSampleDate() {
		return SampleDate;
	}
	public void setSampleDate(String sampleDate) {
		SampleDate = sampleDate;
	}
	public String getSamplePersonPhone() {
		return SamplePersonPhone;
	}
	public void setSamplePersonPhone(String samplePersonPhone) {
		SamplePersonPhone = samplePersonPhone;
	}
	public String getUnitLegalPerson() {
		return unitLegalPerson;
	}
	public void setUnitLegalPerson(String unitLegalPerson) {
		this.unitLegalPerson = unitLegalPerson;
	}
	public String getUnitResponsiblePersonPhone() {
		return unitResponsiblePersonPhone;
	}
	public void setUnitResponsiblePersonPhone(String unitResponsiblePersonPhone) {
		this.unitResponsiblePersonPhone = unitResponsiblePersonPhone;
	}
	public String getUnitResponsiblePersonEmail() {
		return unitResponsiblePersonEmail;
	}
	public void setUnitResponsiblePersonEmail(String unitResponsiblePersonEmail) {
		this.unitResponsiblePersonEmail = unitResponsiblePersonEmail;
	}
	public String getSampleUnitAddress() {
		return SampleUnitAddress;
	}
	public void setSampleUnitAddress(String sampleUnitAddress) {
		SampleUnitAddress = sampleUnitAddress;
	}
	public String getSampleUnitZipCode() {
		return SampleUnitZipCode;
	}
	public void setSampleUnitZipCode(String sampleUnitZipCode) {
		SampleUnitZipCode = sampleUnitZipCode;
	}
	public String getSamplePersonfax() {
		return SamplePersonfax;
	}
	public void setSamplePersonfax(String samplePersonfax) {
		SamplePersonfax = samplePersonfax;
	}
	public String getInspectionAgencyName() {
		return InspectionAgencyName;
	}
	public void setInspectionAgencyName(String inspectionAgencyName) {
		InspectionAgencyName = inspectionAgencyName;
	}
	public String getTestingPurpose() {
		return TestingPurpose;
	}
	public void setTestingPurpose(String testingPurpose) {
		TestingPurpose = testingPurpose;
	}
	public String getReportNumber() {
		return ReportNumber;
	}
	public void setReportNumber(String reportNumber) {
		ReportNumber = reportNumber;
	}
	public String getAcceptCheckDate() {
		return AcceptCheckDate;
	}
	public void setAcceptCheckDate(String acceptCheckDate) {
		AcceptCheckDate = acceptCheckDate;
	}
	public String getReportDate() {
		return reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportIssuedByPeople() {
		return ReportIssuedByPeople;
	}
	public void setReportIssuedByPeople(String reportIssuedByPeople) {
		ReportIssuedByPeople = reportIssuedByPeople;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInspectionItems() {
		return InspectionItems;
	}
	public void setInspectionItems(String inspectionItems) {
		InspectionItems = inspectionItems;
	}
	public String getInspectionResults() {
		return inspectionResults;
	}
	public void setInspectionResults(String inspectionResults) {
		this.inspectionResults = inspectionResults;
	}
	public String getInspectionResultsUnit() {
		return inspectionResultsUnit;
	}
	public void setInspectionResultsUnit(String inspectionResultsUnit) {
		this.inspectionResultsUnit = inspectionResultsUnit;
	}
	public String getResultsDetermine() {
		return resultsDetermine;
	}
	public void setResultsDetermine(String resultsDetermine) {
		this.resultsDetermine = resultsDetermine;
	}
	public String getInspectionBasis() {
		return InspectionBasis;
	}
	public void setInspectionBasis(String inspectionBasis) {
		InspectionBasis = inspectionBasis;
	}
	public String getDecideOnTheBasis() {
		return DecideOnTheBasis;
	}
	public void setDecideOnTheBasis(String decideOnTheBasis) {
		DecideOnTheBasis = decideOnTheBasis;
	}
	public String getStandarddetectionlimit() {
		return standarddetectionlimit;
	}
	public void setStandarddetectionlimit(String standarddetectionlimit) {
		this.standarddetectionlimit = standarddetectionlimit;
	}
	public String getStandarddetectionlimitUnit() {
		return standarddetectionlimitUnit;
	}
	public void setStandarddetectionlimitUnit(String standarddetectionlimitUnit) {
		this.standarddetectionlimitUnit = standarddetectionlimitUnit;
	}
	public String getDetectionlimit() {
		return detectionlimit;
	}
	public void setDetectionlimit(String detectionlimit) {
		this.detectionlimit = detectionlimit;
	}
	public String getDetectionlimitUnit() {
		return detectionlimitUnit;
	}
	public void setDetectionlimitUnit(String detectionlimitUnit) {
		this.detectionlimitUnit = detectionlimitUnit;
	}
	public String getStandardMinimumAllowableLimit() {
		return standardMinimumAllowableLimit;
	}
	public void setStandardMinimumAllowableLimit(
			String standardMinimumAllowableLimit) {
		this.standardMinimumAllowableLimit = standardMinimumAllowableLimit;
	}
	public String getStandardMinimumAllowableLimitUnit() {
		return standardMinimumAllowableLimitUnit;
	}
	public void setStandardMinimumAllowableLimitUnit(
			String standardMinimumAllowableLimitUnit) {
		this.standardMinimumAllowableLimitUnit = standardMinimumAllowableLimitUnit;
	}
	public String getMinimumAllowableLimit() {
		return MinimumAllowableLimit;
	}
	public void setMinimumAllowableLimit(String minimumAllowableLimit) {
		MinimumAllowableLimit = minimumAllowableLimit;
	}
	public String getMinimumAllowableLimitUnit() {
		return MinimumAllowableLimitUnit;
	}
	public void setMinimumAllowableLimitUnit(String minimumAllowableLimitUnit) {
		MinimumAllowableLimitUnit = minimumAllowableLimitUnit;
	}
	public String getStandardMaximumAllowableLimit() {
		return standardMaximumAllowableLimit;
	}
	public void setStandardMaximumAllowableLimit(
			String standardMaximumAllowableLimit) {
		this.standardMaximumAllowableLimit = standardMaximumAllowableLimit;
	}
	public String getStandardMaximumAllowableLimitUnit() {
		return standardMaximumAllowableLimitUnit;
	}
	public void setStandardMaximumAllowableLimitUnit(
			String standardMaximumAllowableLimitUnit) {
		this.standardMaximumAllowableLimitUnit = standardMaximumAllowableLimitUnit;
	}
	public String getMaximumAllowableLimit() {
		return MaximumAllowableLimit;
	}
	public void setMaximumAllowableLimit(String maximumAllowableLimit) {
		MaximumAllowableLimit = maximumAllowableLimit;
	}
	public String getMaximumAllowableLimitUnit() {
		return MaximumAllowableLimitUnit;
	}
	public void setMaximumAllowableLimitUnit(String maximumAllowableLimitUnit) {
		MaximumAllowableLimitUnit = maximumAllowableLimitUnit;
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
	public String getConfirmSituation() {
		return ConfirmSituation;
	}
	public void setConfirmSituation(String confirmSituation) {
		ConfirmSituation = confirmSituation;
	}
	public String getInspectionAgencyNote() {
		return InspectionAgencyNote;
	}
	public void setInspectionAgencyNote(String inspectionAgencyNote) {
		InspectionAgencyNote = inspectionAgencyNote;
	}
	public String getFillName() {
		return fillName;
	}
	public void setFillName(String fillName) {
		this.fillName = fillName;
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
	public String getSampleStorgeState() {
		return sampleStorgeState;
	}
	public void setSampleStorgeState(String sampleStorgeState) {
		this.sampleStorgeState = sampleStorgeState;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
