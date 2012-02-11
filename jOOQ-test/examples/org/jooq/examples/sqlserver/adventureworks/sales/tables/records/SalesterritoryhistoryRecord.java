/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesTerritoryHistory", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"SalesPersonID", "StartDate", "TerritoryID"})
})
public class SalesterritoryhistoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord> {

	private static final long serialVersionUID = 1529520533;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTerritoryHistory.SalesPersonID]
	 * REFERENCES SalesPerson [Sales.SalesPerson.SalesPersonID]
	 * </pre></code>
	 */
	public void setSalespersonid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.SALESPERSONID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTerritoryHistory.SalesPersonID]
	 * REFERENCES SalesPerson [Sales.SalesPerson.SalesPersonID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SalesPersonID")
	public java.lang.Integer getSalespersonid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.SALESPERSONID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTerritoryHistory.SalesPersonID]
	 * REFERENCES SalesPerson [Sales.SalesPerson.SalesPersonID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord fetchSalesperson() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON)
			.where(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON.SALESPERSONID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.SALESPERSONID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTerritoryHistory.TerritoryID]
	 * REFERENCES SalesTerritory [Sales.SalesTerritory.TerritoryID]
	 * </pre></code>
	 */
	public void setTerritoryid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.TERRITORYID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTerritoryHistory.TerritoryID]
	 * REFERENCES SalesTerritory [Sales.SalesTerritory.TerritoryID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "TerritoryID")
	public java.lang.Integer getTerritoryid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.TERRITORYID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTerritoryHistory.TerritoryID]
	 * REFERENCES SalesTerritory [Sales.SalesTerritory.TerritoryID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryRecord fetchSalesterritory() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY)
			.where(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.TERRITORYID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.TERRITORYID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setStartdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.STARTDATE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "StartDate")
	public java.sql.Timestamp getStartdate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.STARTDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setEnddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.ENDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEnddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.ENDDATE);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY.MODIFIEDDATE);
	}

	/**
	 * Create a detached SalesterritoryhistoryRecord
	 */
	public SalesterritoryhistoryRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY);
	}
}
