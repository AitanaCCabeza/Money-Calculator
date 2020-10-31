package moneycalculator.model;

public class Currency {
    
    private final String code;
    private final String name;
    private final String symbol;

    public Currency(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public Currency(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return code;
    }
    
    
    
}
