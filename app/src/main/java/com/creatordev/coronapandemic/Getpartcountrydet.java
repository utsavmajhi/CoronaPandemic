
package com.creatordev.coronapandemic;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Getpartcountrydet {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("countryInfo")
    @Expose
    private CountryInfo countryInfo;
    @SerializedName("cases")
    @Expose
    private Long cases;
    @SerializedName("todayCases")
    @Expose
    private Long todayCases;
    @SerializedName("deaths")
    @Expose
    private Long deaths;
    @SerializedName("todayDeaths")
    @Expose
    private Long todayDeaths;
    @SerializedName("recovered")
    @Expose
    private Long recovered;
    @SerializedName("active")
    @Expose
    private Long active;
    @SerializedName("critical")
    @Expose
    private Long critical;
    @SerializedName("casesPerOneMillion")
    @Expose
    private Double casesPerOneMillion;
    @SerializedName("deathsPerOneMillion")
    @Expose
    private Double deathsPerOneMillion;
    @SerializedName("updated")
    @Expose
    private Long updated;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Getpartcountrydet() {
    }

    /**
     * 
     * @param country
     * @param recovered
     * @param cases
     * @param critical
     * @param deathsPerOneMillion
     * @param active
     * @param casesPerOneMillion
     * @param countryInfo
     * @param updated
     * @param deaths
     * @param todayCases
     * @param todayDeaths
     */
    public Getpartcountrydet(String country, CountryInfo countryInfo, Long cases, Long todayCases, Long deaths, Long todayDeaths, Long recovered, Long active, Long critical, Double casesPerOneMillion, Double deathsPerOneMillion, Long updated) {
        super();
        this.country = country;
        this.countryInfo = countryInfo;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todayDeaths = todayDeaths;
        this.recovered = recovered;
        this.active = active;
        this.critical = critical;
        this.casesPerOneMillion = casesPerOneMillion;
        this.deathsPerOneMillion = deathsPerOneMillion;
        this.updated = updated;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    public Long getCases() {
        return cases;
    }

    public void setCases(Long cases) {
        this.cases = cases;
    }

    public Long getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(Long todayCases) {
        this.todayCases = todayCases;
    }

    public Long getDeaths() {
        return deaths;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public Long getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(Long todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public Long getRecovered() {
        return recovered;
    }

    public void setRecovered(Long recovered) {
        this.recovered = recovered;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }

    public Long getCritical() {
        return critical;
    }

    public void setCritical(Long critical) {
        this.critical = critical;
    }

    public Double getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(Double casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public Double getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(Double deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

}
