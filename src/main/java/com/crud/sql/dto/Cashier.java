// Generated with g9.

package com.crud.sql.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="cashier")
public class Cashier implements Serializable {

    /** Primary key. */
    protected static final String PK = "code";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(unique=true, nullable=false)
    private int code;
    @Column(name="surname_name", length=255)
    private String surnameName;
    @OneToMany(mappedBy="cashier")
    private Set<Sale> sale;

    /** Default constructor. */
    public Cashier() {
        super();
    }

    /**
     * Access method for code.
     *
     * @return the current value of code
     */
    public int getCode() {
        return code;
    }

    /**
     * Setter method for code.
     *
     * @param aCode the new value for code
     */
    public void setCode(int aCode) {
        code = aCode;
    }

    /**
     * Access method for surnameName.
     *
     * @return the current value of surnameName
     */
    public String getSurnameName() {
        return surnameName;
    }

    /**
     * Setter method for surnameName.
     *
     * @param aSurnameName the new value for surnameName
     */
    public void setSurnameName(String aSurnameName) {
        surnameName = aSurnameName;
    }

    /**
     * Access method for sale.
     *
     * @return the current value of sale
     */
    public Set<Sale> getSale() {
        return sale;
    }

    /**
     * Setter method for sale.
     *
     * @param aSale the new value for sale
     */
    public void setSale(Set<Sale> aSale) {
        sale = aSale;
    }

    /**
     * Compares the key for this instance with another Cashier.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Cashier and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Cashier)) {
            return false;
        }
        Cashier that = (Cashier) other;
        if (this.getCode() != that.getCode()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Cashier.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Cashier)) return false;
        return this.equalKeys(other) && ((Cashier)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getCode();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Cashier |");
        sb.append(" code=").append(getCode());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("code", Integer.valueOf(getCode()));
        return ret;
    }

}
