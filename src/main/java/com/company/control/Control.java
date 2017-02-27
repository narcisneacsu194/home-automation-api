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

    @ManyToOne
    private User lastModifiedBy;

    protected Control(){
        super();
    }

    public Control(String name, Integer value){
        this();
        this.name = name;
        this.value = value;
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

}
