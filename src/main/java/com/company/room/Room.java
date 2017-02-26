package com.company.room;

import com.company.core.BaseEntity;
import com.company.device.Device;
import com.company.user.User;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Room extends BaseEntity{
    private String name;

    @Max(value = 1000, message = "The room area must be less than 1000 sq ft/sq meters")
    private Integer area;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Device> devices;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> users;

    protected Room(){
        super();
        devices = new ArrayList<>();
        users = new ArrayList<>();
    }

    public Room(String name, Integer area){
        this();
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public void addDevice(Device device){
        device.setRoom(this);
        devices.add(device);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }

}
