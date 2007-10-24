package org.openmrs;

import org.openmrs.synchronization.SynchronizableInstance;

public class GlobalProperty implements SynchronizableInstance {
	private String property = "";
	private String propertyValue = "";
	private String description = "";
	private String guid;
    private boolean isSynchronizable = true;
    private transient String lastRecordGuid;
    
    public String getLastRecordGuid() {
        return lastRecordGuid;
    }

    public void setLastRecordGuid(String lastRecordGuid) {
        this.lastRecordGuid = lastRecordGuid;
    }

	/**
	 * Default empty constructor
	 *
	 */
	public GlobalProperty() {	}
	
	/**
	 * 
	 * @param property
	 * @param value
	 */
	public GlobalProperty(String property, String value) {
		this.property = property;
		this.propertyValue = value;
	}
	
	public GlobalProperty(String property, String value, String description) {
		this.property = property;
		this.propertyValue = value;
		this.description = description;
	}

    public boolean getIsSynchronizable() {
        return this.isSynchronizable;
    }

    public void setIsSynchronizable(boolean value) {
        this.isSynchronizable = value;
    }
    
	public String getGuid() {
    	return guid;
    }

	public void setGuid(String guid) {
    	this.guid = guid;
    }

	/**
	 * @return Returns the property.
	 */
	public String getProperty() {
		return property;
	}
	/**
	 * @param property The property to set.
	 */
	public void setProperty(String property) {
		this.property = property;
	}
	/**
	 * @return Returns the propertyValue.
	 */
	public String getPropertyValue() {
		return propertyValue;
	}
	/**
	 * @param propertyValue The propertyValue to set.
	 */
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object o) {
		if (o instanceof GlobalProperty) {
			GlobalProperty gp = (GlobalProperty)o;
			return (property != null && property.equals(gp.getProperty()));
		}
		
		return false;
	}
	
	public int hashCode() {
		if (this.property == null) return super.hashCode();
		
		int hash = 5 * this.property.hashCode();
		
		return hash; 
	}
}
