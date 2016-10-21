package br.com.dextra;

import java.util.ArrayList;
import java.util.List;

public class Lanche {

    private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    
    private  double s = 0.0; 
    private int nroCarne = 0, nroBacon = 0;

    public Lanche() {
    }

    public Lanche(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double preco() {
        for (Ingrediente ingrediente : this.ingredientes) {
            s += ingrediente.preco();
            if (ingrediente == Ingrediente.HamburguerCarne) {
                nroCarne++;
            } else if (ingrediente == Ingrediente.Bacon) {
                nroBacon++;
            }
        }
        
		while (nroCarne >= 2 && nroBacon > 0) {
			s = s - Ingrediente.Bacon.preco();
			nroCarne -= 2;
			nroBacon--;
		}

        return s;
    }

	public void add(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
    }
	
}
