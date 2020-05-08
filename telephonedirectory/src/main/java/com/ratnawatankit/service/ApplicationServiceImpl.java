package com.ratnawatankit.service;

import com.ratnawatankit.dto.Directory;
import com.ratnawatankit.utility.Utility;

import java.io.IOException;

public class ApplicationServiceImpl implements ApplicationService {
    @Override
    public void saveDetails(String fullName, String companyName, String phone, String email) throws IOException {
        fullName = fullName.isEmpty() ? "No Name" : fullName.trim();
        companyName = companyName.isEmpty() ? null : companyName.trim();
        phone = phone.isEmpty() ? null : phone.trim();
        email = email.isEmpty() ? null : email.trim();
//        Integer id = TelPhoneDirectory.list.size() + 1;
        String record = "2" + "," + fullName + "," + companyName + "," + phone + "," + email;
        Utility.appendToFile(record);
        Directory dir = new Directory(fullName, companyName, phone, email);
    }
}
