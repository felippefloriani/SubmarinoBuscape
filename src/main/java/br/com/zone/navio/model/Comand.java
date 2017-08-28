package br.com.zone.navio.model;

/**
 *
 * @author luisfelippefloriani
 */
public enum Comand {
    
    MOVE('M'), RIGHT('R'), LEFT('L'), UP('U'), DOWN('D');
    
    private final char value;
    
    Comand(char value){
        this.value = value;
    }

    public char getValue() {
        return value;
    }
    
    public static Comand getComand(char value) {
        for(Comand c : values())
            if(c.getValue() == (value)) return c;
        throw new IllegalArgumentException("Valor não reconhecido como um comando");
    }
    
}
