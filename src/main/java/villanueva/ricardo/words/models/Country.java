package villanueva.ricardo.words.models;

import java.util.List;

public class Country {
    private String name;
    private List<Language> languajes;
    private String code;

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
