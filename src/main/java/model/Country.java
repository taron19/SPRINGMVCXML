package model;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Country {

    @NotEmpty
    @Size(min = 3, max = 11, message = "incorrect")
    private String name;


    @Min(value = 1000, message = "incorrect")
    private Integer population;

    @NotEmpty(message = "incorrect")
    @Pattern(regexp = "\\D{3}", message = "incorrect regexp")
    private String currency;

    private List<String> deputees;

    private List<String> languagesInCountry;

    String[] allSeas;

    private Map<String, String> seas;


    public Country() {
        this.deputees = new ArrayList<>();
        this.languagesInCountry = new ArrayList<>();
        this.seas = new HashMap<>();
        this.deputees.add("alex");
        this.deputees.add("igor");
        this.languagesInCountry.add("francaise");
        this.languagesInCountry.add("german");
        this.seas.put("sea", "sea");
        this.seas.put("sea2", "sea2");
    }
}
