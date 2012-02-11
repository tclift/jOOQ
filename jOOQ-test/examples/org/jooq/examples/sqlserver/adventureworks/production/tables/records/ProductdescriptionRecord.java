/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductDescription", schema = "Production")
public class ProductdescriptionRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdescriptionRecord> {

	private static final long serialVersionUID = 1079886292;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setProductdescriptionid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.PRODUCTDESCRIPTIONID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductDescriptionID", unique = true)
	public java.lang.Integer getProductdescriptionid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.PRODUCTDESCRIPTIONID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelproductdescriptioncultureRecord> fetchProductmodelproductdescriptioncultureList() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTDESCRIPTIONID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.PRODUCTDESCRIPTIONID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.DESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Description")
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.DESCRIPTION);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.MODIFIEDDATE);
	}

	/**
	 * Create a detached ProductdescriptionRecord
	 */
	public ProductdescriptionRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION);
	}
}
