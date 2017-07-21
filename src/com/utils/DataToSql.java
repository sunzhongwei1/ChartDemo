package com.utils;

import com.entity.ExcelDataDto;

public class DataToSql {

	public static ExcelDataDto switchDataToSql(String[] strs) {
		//strs=new String[120];
		ExcelDataDto dto = new ExcelDataDto();
		dto.setTaskSource(strs[0]);
		dto.setSubmittedFirst(strs[1]);
		dto.setSubmittedSecond(strs[2]);
		dto.setBySampUnitName(strs[3]);
		dto.setUnitlocation(strs[4]);
		dto.setSamplocations(strs[5]);
		dto.setAnnualSales(strs[6]);
		dto.setBusinesslicense(strs[7]);
		dto.setFax(strs[8]);
		dto.setProvincial(strs[9]);
		dto.setSampArea(strs[10]);
		dto.setCounty(strs[11]);
		dto.setRegionalTypes(strs[12]);
		dto.setUnitAddress(strs[13]);
		dto.setZipCode(strs[14]);

		dto.setUnitlegalperson(strs[15]);
		dto.setUnitlegalpersonphone(strs[16]);
		dto.setUnitResponsiblePerson(strs[17]);
		dto.setUnitResponsiblePersonPhone(strs[18]);
		dto.setSampleName(strs[19]);
		dto.setSampleProperties(strs[20]);

		//dto.setSampleProperties(strs[21]);
		dto.setSampNumber(strs[21]);
		dto.setSampNumberUnit(strs[22]);
		dto.setSampCode(strs[23]);
		dto.setFoodCate(strs[24]);
		dto.setFoodFirstCate(strs[25]);
		dto.setFoodSecodCate(strs[26]);
		dto.setFineFoodClass(strs[27]);
		dto.setSampleForm(strs[28]);
		dto.setSampleType(strs[29]);
		dto.setPackageClass(strs[30]);
		dto.setSampleSource(strs[31]);
		dto.setProceDate(strs[32]);
		dto.setSampMethod(strs[33]);
		dto.setSampTool(strs[34]);
		dto.setSampSize(strs[35]);
		dto.setSampBatchNumber(strs[36]);
		dto.setProductionDate(strs[37]);
		dto.setShelflife(strs[38]);
		dto.setShelflifeUnit(strs[39]);

		dto.setLicenseNum(strs[40]);
		dto.setTandardTechnicalDoc(strs[41]);
		dto.setQualityGrade(strs[42]);
		dto.setTrademark(strs[43]);

		dto.setUnitPrice(strs[44]);
		dto.setIsExport(strs[45]);
		dto.setSamplingBase(strs[46]);
		dto.setSamp(strs[47]);
		dto.setPreSampNum(strs[48]);
		dto.setProEnterpriseName(strs[49]);

		dto.setProEnterpriseAddress(strs[50]);
		dto.setProEnterpriseProvinces(strs[51]);
		dto.setProEnterprisePerson(strs[52]);
		dto.setProEnterprisePhone(strs[53]);
		dto.setSampleStorageCondition(strs[54]);
		dto.setTemperature(strs[55]);
		dto.setSampPacking(strs[56]);
		dto.setHumidity(strs[57]);
		dto.setSendSampleDate(strs[58]);
		dto.setSendSampleAddress(strs[59]);
		dto.setSampUnitNote(strs[60]);
		dto.setSampUnitName(strs[61]);
		dto.setUnitLevel(strs[62]);
		dto.setSamPersonnel(strs[63]);
		dto.setSampTime(strs[64]);
		dto.setSampPhone(strs[65]);
		dto.setRespSampUnitPerson(strs[66]);
		dto.setRespSampUnitPersonPhone(strs[67]);
		dto.setRespSampUnitPersonEmail(strs[68]);
		dto.setSampUnitAddress(strs[69]);

		dto.setSampUnitZipCode(strs[70]);
		dto.setSampUnitFax(strs[71]);
		dto.setInspectionAgencyName(strs[72]);
		dto.setTestPurpose(strs[73]);

		dto.setReportNumber(strs[74]);
		dto.setAcceptCheckDate(strs[75]);

		dto.setReportDate(strs[76]);
		dto.setReportIssuedPerson(strs[77]);
		dto.setConPerson(strs[78]);
		dto.setConPersonPhone(strs[79]);

		dto.setConPersonEmail(strs[80]);
		dto.setInspectItems(strs[81]);
		dto.setInspectResults(strs[82]);
		dto.setResultsUnit(strs[83]);
		dto.setResultsDetermine(strs[84]);
		dto.setInspectionBasis(strs[85]);
		dto.setDecideBasis(strs[86]);
		dto.setStandardMethodLimit(strs[87]);

		dto.setStandardMethodLimitUnit(strs[88]);
		dto.setMethodDetectionLimit(strs[89]);
		dto.setDetectionLimitUnit(strs[90]);
		dto.setStandardMinAllowableLimit(strs[91]);
		dto.setStandardMinAllowableLimitUnit(strs[92]);
		dto.setMinAllowableLimit(strs[93]);
		dto.setMinAllowableLimitUnit(strs[94]);
		dto.setStandardMaxAllowableLimit(strs[95]);
		dto.setStandardMaxAllowableLimitUnit(strs[96]);
		dto.setMaxAllowableLimit(strs[97]);
		dto.setMaxAllowableLimitUnit(strs[98]);
		dto.setInstructions(strs[99]);

		dto.setConclusion(strs[100]);
		dto.setConfirmSituation(strs[101]);
		dto.setNote(strs[102]);
		dto.setFillPerson(strs[103]);
		dto.setFillDate(strs[104]);
		dto.setFillPhone(strs[105]);
		dto.setFillEmail(strs[106]);
		dto.setStorageCondition(strs[107]);
		dto.setUpdateTime(strs[108]);
		dto.setCreateTime(strs[109]);
		dto.setDepartment(strs[110]);

		return dto;
	}

}
