package io.codelex.datasaver.controllers;

import io.codelex.datasaver.models.ApartmentPrices;
import io.codelex.datasaver.services.DataService;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public synchronized ApartmentPrices addRow(@RequestBody @NonNull ApartmentPrices apartmentPrices){
        return dataService.addRow(apartmentPrices);
    }

    @GetMapping("/get-all")
    public synchronized List<ApartmentPrices> getTable(){
        return dataService.getTable();
    }

    @DeleteMapping("/delete/{id}")
    public synchronized void  deleteRow(@PathVariable("id") Long id){
        dataService.deleteRow(id);
    }

}
