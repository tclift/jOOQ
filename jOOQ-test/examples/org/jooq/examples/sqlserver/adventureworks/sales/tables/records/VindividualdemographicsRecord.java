/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vIndividualDemographics", schema = "Sales")
public class VindividualdemographicsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.VindividualdemographicsRecord> {

	private static final long serialVersionUID = -398550926;

	/**
	 * An uncommented item
	 */
	public void setCustomerid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.CUSTOMERID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CustomerID")
	public java.lang.Integer getCustomerid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.CUSTOMERID);
	}

	/**
	 * An uncommented item
	 */
	public void setTotalpurchaseytd(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.TOTALPURCHASEYTD, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TotalPurchaseYTD")
	public java.math.BigDecimal getTotalpurchaseytd() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.TOTALPURCHASEYTD);
	}

	/**
	 * An uncommented item
	 */
	public void setDatefirstpurchase(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.DATEFIRSTPURCHASE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DateFirstPurchase")
	public java.sql.Timestamp getDatefirstpurchase() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.DATEFIRSTPURCHASE);
	}

	/**
	 * An uncommented item
	 */
	public void setBirthdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.BIRTHDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "BirthDate")
	public java.sql.Timestamp getBirthdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.BIRTHDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setMaritalstatus(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.MARITALSTATUS, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "MaritalStatus")
	public java.lang.String getMaritalstatus() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.MARITALSTATUS);
	}

	/**
	 * An uncommented item
	 */
	public void setYearlyincome(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.YEARLYINCOME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "YearlyIncome")
	public java.lang.String getYearlyincome() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.YEARLYINCOME);
	}

	/**
	 * An uncommented item
	 */
	public void setGender(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.GENDER, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Gender")
	public java.lang.String getGender() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.GENDER);
	}

	/**
	 * An uncommented item
	 */
	public void setTotalchildren(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.TOTALCHILDREN, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TotalChildren")
	public java.lang.Integer getTotalchildren() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.TOTALCHILDREN);
	}

	/**
	 * An uncommented item
	 */
	public void setNumberchildrenathome(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.NUMBERCHILDRENATHOME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "NumberChildrenAtHome")
	public java.lang.Integer getNumberchildrenathome() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.NUMBERCHILDRENATHOME);
	}

	/**
	 * An uncommented item
	 */
	public void setEducation(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.EDUCATION, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Education")
	public java.lang.String getEducation() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.EDUCATION);
	}

	/**
	 * An uncommented item
	 */
	public void setOccupation(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.OCCUPATION, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Occupation")
	public java.lang.String getOccupation() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.OCCUPATION);
	}

	/**
	 * An uncommented item
	 */
	public void setHomeownerflag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.HOMEOWNERFLAG, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "HomeOwnerFlag")
	public java.lang.Boolean getHomeownerflag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.HOMEOWNERFLAG);
	}

	/**
	 * An uncommented item
	 */
	public void setNumbercarsowned(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.NUMBERCARSOWNED, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "NumberCarsOwned")
	public java.lang.Integer getNumbercarsowned() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS.NUMBERCARSOWNED);
	}

	/**
	 * Create a detached VindividualdemographicsRecord
	 */
	public VindividualdemographicsRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.Vindividualdemographics.VINDIVIDUALDEMOGRAPHICS);
	}
}
