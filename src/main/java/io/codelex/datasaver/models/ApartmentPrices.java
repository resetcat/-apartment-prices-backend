package io.codelex.datasaver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ApartmentPrices {
    @Id
    private Long id;
    private String period;
    private int averagePriceRigaCenter;
    private int transactionCountRiga;
    private int averagePriceRigaSub;
    private int transactionCountRigaSub;
    private int averagePriceJurmala;
    private int transactionCountJurmala;

    public ApartmentPrices(Long id, String period, int averagePriceRigaCenter, int transactionCountRiga,
                           int averagePriceRigaSub, int transactionCountRigaSub, int averagePriceJurmala,
                           int transactionCountJurmala) {
        this.id = id;
        this.period = period;
        this.averagePriceRigaCenter = averagePriceRigaCenter;
        this.transactionCountRiga = transactionCountRiga;
        this.averagePriceRigaSub = averagePriceRigaSub;
        this.transactionCountRigaSub = transactionCountRigaSub;
        this.averagePriceJurmala = averagePriceJurmala;
        this.transactionCountJurmala = transactionCountJurmala;
    }

    public ApartmentPrices() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getAveragePriceRigaCenter() {
        return averagePriceRigaCenter;
    }

    public void setAveragePriceRigaCenter(int averagePriceRigaCenter) {
        this.averagePriceRigaCenter = averagePriceRigaCenter;
    }

    public int getTransactionCountRiga() {
        return transactionCountRiga;
    }

    public void setTransactionCountRiga(int transactionCountRiga) {
        this.transactionCountRiga = transactionCountRiga;
    }

    public int getAveragePriceRigaSub() {
        return averagePriceRigaSub;
    }

    public void setAveragePriceRigaSub(int averagePriceRigaSub) {
        this.averagePriceRigaSub = averagePriceRigaSub;
    }

    public int getTransactionCountRigaSub() {
        return transactionCountRigaSub;
    }

    public void setTransactionCountRigaSub(int transactionCountRigaSub) {
        this.transactionCountRigaSub = transactionCountRigaSub;
    }

    public int getAveragePriceJurmala() {
        return averagePriceJurmala;
    }

    public void setAveragePriceJurmala(int averagePriceJurmala) {
        this.averagePriceJurmala = averagePriceJurmala;
    }

    public int getTransactionCountJurmala() {
        return transactionCountJurmala;
    }

    public void setTransactionCountJurmala(int transactionCountJurmala) {
        this.transactionCountJurmala = transactionCountJurmala;
    }

    @Override
    public String toString() {
        return "Table{" + "id=" + id + ", period='" + period + '\'' + ", averagePriceRigaCenter=" +
                averagePriceRigaCenter + ", transactionCountRiga=" + transactionCountRiga +
                ", averagePriceRigaSub=" + averagePriceRigaSub + ", transactionCountRigaSub=" +
                transactionCountRigaSub + ", averagePriceJurmala=" + averagePriceJurmala +
                ", transactionCountJurmala=" + transactionCountJurmala + '}';
    }
}


