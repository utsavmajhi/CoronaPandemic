
package com.creatordev.coronapandemic.RetrofitAllWorldModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Getworlddetails {

    @SerializedName("cases")
    @Expose
    private Long cases;
    @SerializedName("deaths")
    @Expose
    private Long deaths;
    @SerializedName("recovered")
    @Expose
    private Long recovered;
    @SerializedName("updated")
    @Expose
    private Long updated;
    @SerializedName("active")
    @Expose
    private Long active;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Getworlddetails() {
    }

    /**
     * 
     * @param recovered
     * @param cases
     * @param active
     * @param updated
     * @param deaths
     */
    public Getworlddetails(Long cases, Long deaths, Long recovered, Long updated, Long active) {
        super();
        this.cases = cases;
        this.deaths = deaths;
        this.recovered = recovered;
        this.updated = updated;
        this.active = active;
    }

    public Long getCases() {
        return cases;
    }

    public void setCases(Long cases) {
        this.cases = cases;
    }

    public Long getDeaths() {
        return deaths;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public Long getRecovered() {
        return recovered;
    }

    public void setRecovered(Long recovered) {
        this.recovered = recovered;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Long getActive() {
        return active;
    }

    public void setActive(Long active) {
        this.active = active;
    }

}
