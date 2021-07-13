package jdi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class MetalsAndColors {
    @JsonProperty("summary")
    private List<String> summary;

    @JsonProperty("elements")
    private List<String> elements;

    @JsonProperty("color")
    private String color;

    @JsonProperty("metals")
    private String metals;

    @JsonProperty("vegetables")
    private List<String> vegetables;

    private Integer summaryElementOdd;
    private Integer summaryElementEven;

    public MetalsAndColors(List<String> summary, List<String> elements, String color, String metals, List<String> vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.color = color;
        this.metals = metals;
        this.vegetables = vegetables;
    }

    public List<String> getSummary() {
        return summary;
    }

    public List<String> getElements() {
        return elements;
    }

    public String getColor() {
        return color;
    }

    public String getMetals() {
        return metals;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public void setSummary(List<String> summary) {
        this.summary = summary;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetals(String metals) {
        this.metals = metals;
    }

    public void setVegetables(List<String> vegetables) {
        this.vegetables = vegetables;
    }

    public Integer getSummaryElementOdd() {
        return summaryElementOdd;
    }

    public Integer getSummaryElementEven() {
        return summaryElementEven;
    }

    public void setSummaryElementOdd(Integer summaryElementOdd) {
        this.summaryElementOdd = summaryElementOdd;
    }

    public void setSummaryElementEven(Integer summaryElementEven) {
        this.summaryElementEven = summaryElementEven;
    }
}
