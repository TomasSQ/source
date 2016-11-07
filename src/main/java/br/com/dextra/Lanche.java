package br.com.dextra;

import java.util.ArrayList;
import java.util.List;

public class Lanche {

    private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    
    private double preco = 0.0; 
    private int nroCarne = 0, nroBacon = 0;

    public Lanche() {
    }

    public Lanche(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double preco() {
        for (Ingrediente ingrediente : this.ingredientes) {
            preco += ingrediente.preco();
            if (ingrediente.equals(Ingrediente.HamburguerCarne)) {
                nroCarne++;
            } else if (ingrediente.equals(Ingrediente.Bacon)) {
                nroBacon++;
            }
        }
        
		while (nroCarne >= 2 && nroBacon > 0) {
			preco = preco - Ingrediente.Bacon.preco();
			nroCarne -= 2;
			nroBacon--;
		}

        return preco;
    }

	public void add(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
    }
	
}