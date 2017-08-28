package br.com.zone.navio.main;

import br.com.zone.navio.model.Submarine;
import java.util.Scanner;

/**
 *
 * @author luisfelippefloriani
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("ENTRE COM O COMANDO: ");
        
        Scanner scanner = new Scanner(System.in);        
        String comando = scanner.nextLine();
        
        Submarine n = new Submarine();
        n.send(comando);
        
        System.out.println("POSIÇÃO: "+n.getPosition());
        
    }
    
}
