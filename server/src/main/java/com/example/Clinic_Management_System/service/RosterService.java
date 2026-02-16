package com.example.Clinic_Management_System.service;

import com.example.Clinic_Management_System.model.Roster;
import java.util.List;

public interface RosterService {
    Roster saveRoster(Roster roster);
    List<Roster> getRosterByDoctor(Long doctorId);
    
    // ✅ මේ කොටස අනිවාර්යයෙන්ම තියෙන්න ඕනේ
    List<Roster> getAllRosters(); 
}