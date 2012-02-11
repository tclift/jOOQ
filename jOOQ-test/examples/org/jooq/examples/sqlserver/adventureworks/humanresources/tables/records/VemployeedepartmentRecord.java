/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vEmployeeDepartment", schema = "HumanResources")
public class VemployeedepartmentRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord> {

	private static final long serialVersionUID = -1942605535;

	/**
	 * An uncommented item
	 */
	public void setEmployeeid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.EMPLOYEEID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EmployeeID")
	public java.lang.Integer getEmployeeid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.EMPLOYEEID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Title")
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstname(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.FIRSTNAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "FirstName")
	public java.lang.String getFirstname() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.FIRSTNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setMiddlename(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.MIDDLENAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "MiddleName")
	public java.lang.String getMiddlename() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.MIDDLENAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastname(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.LASTNAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LastName")
	public java.lang.String getLastname() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.LASTNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.SUFFIX, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Suffix")
	public java.lang.String getSuffix() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.SUFFIX);
	}

	/**
	 * An uncommented item
	 */
	public void setJobtitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.JOBTITLE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "JobTitle")
	public java.lang.String getJobtitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.JOBTITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setDepartment(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.DEPARTMENT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Department")
	public java.lang.String getDepartment() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.DEPARTMENT);
	}

	/**
	 * An uncommented item
	 */
	public void setGroupname(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.GROUPNAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "GroupName")
	public java.lang.String getGroupname() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.GROUPNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setStartdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.STARTDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StartDate")
	public java.sql.Timestamp getStartdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT.STARTDATE);
	}

	/**
	 * Create a detached VemployeedepartmentRecord
	 */
	public VemployeedepartmentRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT);
	}
}
