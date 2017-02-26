package com.company.core;

import com.company.control.Control;
import com.company.control.ControlRepository;
import com.company.device.Device;
import com.company.device.DeviceRepository;
import com.company.room.Room;
import com.company.room.RoomRepository;
//import com.company.user.User;
//import com.company.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.stream.IntStream;

@Component
public class DatabaseLoader implements ApplicationRunner{

    private final RoomRepository roomRepository;

    @Autowired
    public DatabaseLoader(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        IntStream.range(100, 1000).forEach(
                value -> {
                    Room room = new Room("Room " + value, value);
                    Device device = new Device("Device " + value);
                    Control control = new Control("Control " + value, value);
                    device.addControl(control);
                    room.addDevice(device);
                    roomRepository.save(room);
                }
        );
    }
}
