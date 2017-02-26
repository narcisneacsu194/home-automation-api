package com.company.room;

import com.company.core.BaseEntity;
import com.company.device.Device;
//import com.company.user.User;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Room extends BaseEntity{
    private String name;

//    @Max(value = 1000, message = "The room area must be less than 1000 sq ft/sq meters")
    private Integer area;

//    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
//    private List<Device> devices;

//    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
//    private List<User> users;

    protected Room(){
        super();
//        devices = new ArrayList<>();
//        users = new ArrayList<>();
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

//    public List<Device> getDevices() {
//        return devices;
//    }

//    public void setDevices(List<Device> devices) {
//        this.devices = devices;
//    }

//    public void addDevice(Device device){
//        devices.add(device);
//    }

//    public List<User> getUsers() {
//        return users;
//    }

//    public void setUsers(List<User> users) {
//        this.users = users;
//    }

//    public void addUser(User user){
//        users.add(user);
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Room room = (Room) o;
//
//        if (!name.equals(room.name)) return false;
//        if (!area.equals(room.area)) return false;
//        if (!devices.equals(room.devices)) return false;
//        return users.equals(room.users);
//
//    }

//    @Override
//    public int hashCode() {
//        int result = name.hashCode();
//        result = 31 * result + area.hashCode();
//        result = 31 * result + devices.hashCode();
//        result = 31 * result + users.hashCode();
//        return result;
//    }
}
