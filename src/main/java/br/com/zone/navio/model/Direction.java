package br.com.zone.navio.model;

/**
 *
 * @author luisfelippefloriani
 */
public enum Direction {
    
    NORTE(0), LESTE(1), SUL(2), OESTE(3);
    
    int index;

    private Direction(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
    
    public Direction getNext(int atual){
        
        Direction[] direcoes = Direction.values();
        
        int proxima = atual + 1;
        
        if(proxima >= direcoes.length){
            return direcoes[0];
        }
 
        return direcoes[proxima];
        
    }
    
    public Direction getPrevious(int atual){
        
        Direction[] direcoes = Direction.values();
        
        int anterior = atual - 1;
        
        if(anterior < 0){
            return direcoes[direcoes.length - 1];
        }
 
        return direcoes[anterior];
        
    }
    

}
