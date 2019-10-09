package com.pranavkapoorr.mybatch.user.config.batch;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pranavkapoorr.mybatch.user.model.User;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private com.pranavkapoorr.mybatch.user.repository.UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

        System.out.println("Data Saved for Users: " + users);
        userRepository.saveAll(users);
    }
}