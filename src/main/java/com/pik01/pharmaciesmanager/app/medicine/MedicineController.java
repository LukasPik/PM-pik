package com.pik01.pharmaciesmanager.app.medicine;

import com.pik01.pharmaciesmanager.app.medicine.model.Medicine;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicine")
public class MedicineController {
    private MedicineService medicineService;

    public MedicineController(MedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @GetMapping
    public List<Medicine> getAll() {
        System.out.println("getAll component");
        return medicineService.getAll();
    }

    @PostMapping("/add")
   /* public Medicine addMed(@ModelAttribute("SpringWeb")Medicine medicine,
                             ModelMap model) { */
    public Medicine addMed(@RequestBody Medicine medicine) {
        System.out.println(medicine.getName());
        return medicineService.addMedicine(medicine);
    }

    @GetMapping("api/medicine/{id}")
    public Medicine get(@PathVariable Long id) {
        return medicineService.getById(id);
    }
}
