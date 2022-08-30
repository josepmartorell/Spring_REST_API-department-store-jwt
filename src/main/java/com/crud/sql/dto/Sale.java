// Generated with g9.

package com.crud.sql.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="sale")
public class Sale implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    private LocalDateTime registeredAt;
    @ManyToOne
    @JoinColumn(name="cash_code")
    private Cash cash;
    @ManyToOne
    @JoinColumn(name="cashier_code")
    private Cashier cashier;
    @ManyToOne
    @JoinColumn(name="product_code")
    private Product product;

    /** Default constructor. */
    public Sale() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for registeredAt.
     *
     * @return the current value of registeredAt
     */
    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    /**
     * Setter method for registeredAt.
     *
     * @param aRegisteredAt the new value for registeredAt
     */
    public void setRegisteredAt(LocalDateTime aRegisteredAt) {
        registeredAt = aRegisteredAt;
    }

    /**
     * Access method for cash.
     *
     * @return the current value of cash
     */
    public Cash getCash() {
        return cash;
    }

    /**
     * Setter method for cash.
     *
     * @param aCash the new value for cash
     */
    public void setCash(Cash aCash) {
        cash = aCash;
    }

    /**
     * Access method for cashier.
     *
     * @return the current value of cashier
     */
    public Cashier getCashier() {
        return cashier;
    }

    /**
     * Setter method for cashier.
     *
     * @param aCashier the new value for cashier
     */
    public void setCashier(Cashier aCashier) {
        cashier = aCashier;
    }

    /**
     * Access method for product.
     *
     * @return the current value of product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Setter method for product.
     *
     * @param aProduct the new value for product
     */
    public void setProduct(Product aProduct) {
        product = aProduct;
    }

    /**
     * Compares the key for this instance with another Sale.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Sale and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Sale)) {
            return false;
        }
        Sale that = (Sale) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Sale.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sale)) return false;
        return this.equalKeys(other) && ((Sale)other).equalKeys(this);
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
        i = getId();
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
        StringBuffer sb = new StringBuffer("[Sale |");
        sb.append(" id=").append(getId());
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
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
