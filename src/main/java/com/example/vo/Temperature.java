package com.example.vo;

import java.util.Objects;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;

@Measurement(name = "temperature")
public class Temperature {
    
    @Column(name = "machine", tag = true)
    private String machine;

    @Column(name = "type", tag = true)
    private String type;

    @Column(name = "external")
    private Double external;

    @Column(name = "internal")
    private Double internal;


    public Temperature() {
    }

    public Temperature(String machine, String type, Double external, Double internal) {
        this.machine = machine;
        this.type = type;
        this.external = external;
        this.internal = internal;
    }

    public String getMachine() {
        return this.machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getExternal() {
        return this.external;
    }

    public void setExternal(Double external) {
        this.external = external;
    }

    public Double getInternal() {
        return this.internal;
    }

    public void setInternal(Double internal) {
        this.internal = internal;
    }

    public Temperature machine(String machine) {
        this.machine = machine;
        return this;
    }

    public Temperature type(String type) {
        this.type = type;
        return this;
    }

    public Temperature external(Double external) {
        this.external = external;
        return this;
    }

    public Temperature internal(Double internal) {
        this.internal = internal;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Temperature)) {
            return false;
        }
        Temperature temperature = (Temperature) o;
        return Objects.equals(machine, temperature.machine) && Objects.equals(type, temperature.type) && Objects.equals(external, temperature.external) && Objects.equals(internal, temperature.internal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(machine, type, external, internal);
    }

    @Override
    public String toString() {
        return "{" +
            " machine='" + getMachine() + "'" +
            ", type='" + getType() + "'" +
            ", external='" + getExternal() + "'" +
            ", internal='" + getInternal() + "'" +
            "}";
    }
    
}