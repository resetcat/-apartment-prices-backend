package io.codelex.datasaver.services;

import io.codelex.datasaver.models.ApartmentPrices;
import io.codelex.datasaver.repositories.ApartmentPricesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ApartmentPricesService {
    private final ApartmentPricesRepository dataRepository;

    public ApartmentPricesService(ApartmentPricesRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public ApartmentPrices addRow(ApartmentPrices apartmentPrices){
        validateRow(apartmentPrices);
        return dataRepository.save(apartmentPrices);
    }

    public void validateRow(ApartmentPrices apartmentPrices) {
        if(checkIfExists(apartmentPrices)){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    private boolean checkIfExists(ApartmentPrices apartmentPrices) {
        return dataRepository.existsById(apartmentPrices.getId());
    }

    public List<ApartmentPrices> getTable() {
        return dataRepository.findAll();
    }

    public void deleteRow(Long id) {
        if(dataRepository.existsById(id)){
        dataRepository.deleteById(id);
        }
    }
}
