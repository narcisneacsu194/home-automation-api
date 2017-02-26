package com.company.control;

import com.company.core.BaseEntity;
import com.company.device.Device;
import com.company.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Control extends BaseEntity{
    private String name;

    @ManyToOne
    private Device device;

    private Integer value;

    private User lastModifiedBy;

    protected Control(){
        super();
    }

    public Control(String name, Integer value, User lastModifiedBy){
        this();
        this.name = name;
        this.value = value;
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public User getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Control control = (Control) o;

        if (!name.equals(control.name)) return false;
        if (!device.equals(control.device)) return false;
        if (!value.equals(control.value)) return false;
        return lastModifiedBy.equals(control.lastModifiedBy);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + device.hashCode();
        result = 31 * result + value.hashCode();
        result = 31 * result + lastModifiedBy.hashCode();
        return result;
    }
}
