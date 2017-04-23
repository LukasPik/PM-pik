package com.pik01.pharmaciesmanager.app.medicine;

import com.pik01.pharmaciesmanager.app.medicine.model.Medicine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {
    private MedicineRepository medicineRepository;

    public MedicineServiceImpl(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @Override
    public List<Medicine> getAll() {
        return medicineRepository.findAll();
    }
}
