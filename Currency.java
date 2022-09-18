import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
    private String name;
    private String shortName;
    private HashMap<String, Double> exchangeValues= new HashMap<String, Double>();

    public Currency(String nameValue, String shortNameValue){
        this.name= nameValue;
        this.shortName= shortNameValue;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getShortName(){
        return this.shortName;
    }
    public void setShortName(String shortName){
        this.shortName=shortName;

    }

    public HashMap<String, Double> getExchangeValues(){
       return this.exchangeValues;
    }

    public void setExchangeValues(String key, Double value){
        this.exchangeValues.put(key,value);
    }

    public void defaultValues(){
        String currency= this.name;

        switch(currency){
            case "US Dollar":
                this.exchangeValues.put("USD", 1.00);
                this.exchangeValues.put("EUR", 0.93);
                this.exchangeValues.put("GBP", 0.44);
                this.exchangeValues.put("CHF", 1.01);
                this.exchangeValues.put("CNY", 9.00);
                this.exchangeValues.put("JPY", 123.564);
                this.exchangeValues.put("MYR", 2.0);
        }
    }

    public static ArrayList<Currency> init

}
