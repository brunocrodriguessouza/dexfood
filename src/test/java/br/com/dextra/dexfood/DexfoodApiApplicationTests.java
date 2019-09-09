package br.com.dextra.dexfood;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.dextra.dexfood.model.Ingrediente;
import br.com.dextra.dexfood.model.Lanche;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DexfoodApiApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void xbaconTestandoPreco() {
		Lanche lanche = new Lanche("X-Bacon", Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO);
		double valor = Ingrediente.BACON.getPreco() + Ingrediente.HAMBURGER_CARNE.getPreco()
				+ Ingrediente.QUEIJO.getPreco();
		assertEquals(lanche.getPreco(), valor);
	}

	@Test
	public void xbaconTestandoMuitaCarne() {
		Lanche lanche = new Lanche("X-Bacon", Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO);
		lanche.adicionaIngrediente(Ingrediente.HAMBURGER_CARNE);
		lanche.adicionaIngrediente(Ingrediente.HAMBURGER_CARNE);
		double valor = Ingrediente.BACON.getPreco() + Ingrediente.HAMBURGER_CARNE.getPreco()
				+ Ingrediente.QUEIJO.getPreco() + Ingrediente.HAMBURGER_CARNE.getPreco();
		assertEquals(lanche.getPreco(), valor);
	}

	@Test
	public void xBaconTestandoMuitoQueijo() {
		Lanche lanche = new Lanche("X-Bacon", Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO);
		lanche.adicionaIngrediente(Ingrediente.QUEIJO);
		lanche.adicionaIngrediente(Ingrediente.QUEIJO);
		double valor = Ingrediente.BACON.getPreco() + Ingrediente.HAMBURGER_CARNE.getPreco()
				+ Ingrediente.QUEIJO.getPreco() + Ingrediente.QUEIJO.getPreco();
		assertEquals(lanche.getPreco(), valor);
	}

	@Test
	public void xburguerTestandoDescontoLight() {
		Lanche lanche = new Lanche("X-Burger", Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO);
		lanche.adicionaIngrediente(Ingrediente.ALFACE);
		double valor = (Ingrediente.HAMBURGER_CARNE.getPreco() + Ingrediente.QUEIJO.getPreco()
				+ Ingrediente.ALFACE.getPreco()) * 0.90;
		assertEquals(lanche.getPreco(), valor);
	}
}
