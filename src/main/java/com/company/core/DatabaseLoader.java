//package com.company.core;
//
//import com.company.control.Control;
//import com.company.control.ControlRepository;
//import com.company.device.Device;
//import com.company.device.DeviceRepository;
//import com.company.room.Room;
//import com.company.room.RoomRepository;
//import com.company.user.User;
//import com.company.user.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DatabaseLoader implements ApplicationRunner{
//
//    private UserRepository userRepository;
//    private RoomRepository roomRepository;
//    private DeviceRepository deviceRepository;
//    private ControlRepository controlRepository;
//
//    @Autowired
//    public DatabaseLoader(UserRepository userRepository, RoomRepository roomRepository,
//                          DeviceRepository deviceRepository, ControlRepository controlRepository){
//        this.userRepository = userRepository;
//        this.roomRepository = roomRepository;
//        this.deviceRepository = deviceRepository;
//        this.controlRepository = controlRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Room room1 = new Room("Room 1", 150);
//        Room room2 = new Room("Room 2", 300);
//
//        Device device1 = new Device("Device 1");
//        Device device2 = new Device("Device 2");
//
//        User user1 = new User("User 1", new String[] {"ROLE_USER"}, "password");
//        User user2 = new User("User 2", new String[] {"ROLE_ADMIN"}, "password");
//
//        room1.addDevice(device1);
//        room1.addDevice(device2);
//        room1.addUser(user1);
//        room1.addUser(user2);
//
//        room2.addDevice(device1);
//        room2.addDevice(device2);
//        room2.addUser(user1);
//        room2.addUser(user2);
//
//        Control control1 = new Control("Control 1", 123);
//        control1.setLastModifiedBy(user1);
//
//        Control control2 = new Control("Control 2", 321);
//        control2.setLastModifiedBy(user2);
//
//        device1.addControl(control1);
//        device1.addControl(control2);
//
//        device2.addControl(control1);
//        device2.addControl(control2);
//
//    }
//}
