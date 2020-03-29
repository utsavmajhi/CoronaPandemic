
package com.creatordev.coronapandemic;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountryInfo {

    @SerializedName("_id")
    @Expose
    private Long id;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("iso2")
    @Expose
    private String iso2;
    @SerializedName("iso3")
    @Expose
    private String iso3;
    @SerializedName("lat")
    @Expose
    private Long lat;
    @SerializedName("long")
    @Expose
    private Long _long;
    @SerializedName("flag")
    @Expose
    private String flag;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CountryInfo() {
    }

    /**
     * 
     * @param country
     * @param flag
     * @param _long
     * @param id
     * @param iso2
     * @param lat
     * @param iso3
     */
    public CountryInfo(Long id, String country, String iso2, String iso3, Long lat, Long _long, String flag) {
        super();
        this.id = id;
        this.country = country;
        this.iso2 = iso2;
        this.iso3 = iso3;
        this.lat = lat;
        this._long = _long;
        this.flag = flag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public Long getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Long getLong() {
        return _long;
    }

    public void setLong(Long _long) {
        this._long = _long;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

}
