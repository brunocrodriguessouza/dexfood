package br.com.dextra.dexfood;

//import static org.junit.Assert.assertEquals;
import static junit.framework.TestCase.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.dextra.dexfood.model.Ingrediente;
import br.com.dextra.dexfood.model.Lanche;
import br.com.dextra.dexfood.model.Lanches;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DexfoodApiApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void xbaconTestandoPreco() {
		Lanche lanche = new Lanche("X-Bacon",Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO);
		double valor = Ingrediente.BACON.getPreco() + Ingrediente.HAMBURGER_CARNE.getPreco() + Ingrediente.QUEIJO.getPreco();
		assertEquals(lanche.getPreco(), valor);
	}

	@Test
	public void xbaconTestandoMuitaCarne() {
		Lanche lanche = new Lanche("X-Bacon",Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO);
		lanche.adicionaIngrediente(Ingrediente.HAMBURGER_CARNE);
		lanche.adicionaIngrediente(Ingrediente.HAMBURGER_CARNE);
		double valor = Ingrediente.BACON.getPreco() + Ingrediente.HAMBURGER_CARNE.getPreco() + Ingrediente.QUEIJO.getPreco()
				+ Ingrediente.HAMBURGER_CARNE.getPreco();
		assertEquals(lanche.getPreco(), valor);
	}
	
	@Test
	public void xburguerTestandoMuitoQueijo() {
		Lanche lanche = new Lanche("X-Bacon",Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO);
		lanche.adicionaIngrediente(Ingrediente.QUEIJO);
		lanche.adicionaIngrediente(Ingrediente.QUEIJO);
		double valor = Ingrediente.BACON.getPreco() +Ingrediente.HAMBURGER_CARNE.getPreco() + Ingrediente.QUEIJO.getPreco()
				+ Ingrediente.QUEIJO.getPreco();
		assertEquals(lanche.getPreco(), valor);
	}

}
