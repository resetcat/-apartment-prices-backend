package io.codelex.datasaver.controllers;

import io.codelex.datasaver.models.ApartmentPrices;
import io.codelex.datasaver.services.ApartmentPricesService;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ApartmentPricesController {

    private final ApartmentPricesService apartmentPricesService;

    public ApartmentPricesController(ApartmentPricesService apartmentPricesService) {
        this.apartmentPricesService = apartmentPricesService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public synchronized ApartmentPrices addRow(@RequestBody @NonNull ApartmentPrices apartmentPrices){
        return apartmentPricesService.addRow(apartmentPrices);
    }

    @GetMapping("/get-all")
    public synchronized List<ApartmentPrices> getTable(){
        return apartmentPricesService.getTable();
    }

    @DeleteMapping("/delete/{id}")
    public synchronized void  deleteRow(@PathVariable("id") Long id){
        apartmentPricesService.deleteRow(id);
    }

}
