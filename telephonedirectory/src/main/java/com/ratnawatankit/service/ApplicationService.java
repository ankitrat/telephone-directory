package com.ratnawatankit.service;

import java.io.IOException;

public interface ApplicationService {
    void saveDetails(String fullName, String companyName, String phone, String email) throws IOException;
}
