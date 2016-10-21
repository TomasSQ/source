package br.com.dextra;

import org.junit.Assert;
import org.junit.Test;

public class CardapioTest {
	
    @Test
    public void testPrecosCardapioInflacionado() {
        Assert.assertEquals(3.2, new XBacon().preco(), 0.01);
        Assert.assertEquals(2.7, new XEgg().preco(), 0.01);
        Assert.assertEquals(2.1, new XFrango().preco(), 0.01);
        Assert.assertEquals(4.9, new XTudo().preco(), 0.01);
        
    }

    @Test
    public void testPromocaoDoubleCarneGanhaBacon() {
        Lanche lancheNovo = new Lanche();
        lancheNovo.add(Ingrediente.Ovo);
        lancheNovo.add(Ingrediente.Alface);
        lancheNovo.add(Ingrediente.HamburguerCarne);
        lancheNovo.add(Ingrediente.HamburguerCarne);
        lancheNovo.add(Ingrediente.Bacon);
        Assert.assertEquals(3.2, lancheNovo.preco(), 0.01);
    }
    
}