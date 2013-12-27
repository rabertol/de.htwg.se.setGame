package setgame.modell;

import org.junit.Before;
import org.junit.Test;
import setgame.modell.Pack;

public class PackTest {
	Pack pack;
	@Before
	public void setUp(){
		this.pack =  new Pack();
	}
	@Test
	public void testCard() {
		assert(this.pack != null);
	}

	@Test
	public void testGetCards() {
		this.pack = new Pack();
		boolean b = false;
		for (Card cartas : pack.getPack()) {
			if (cartas.getColor().equals(pack.getcolors()[0])
					|| cartas.getColor().equals(pack.getcolors()[1])
					|| cartas.getColor().equals(pack.getcolors()[2])
					&& cartas.getFomr().equals(pack.getFormes()[0])
					|| cartas.getFomr().equals(pack.getFormes()[1])
					|| cartas.getFomr().equals(pack.getFormes()[2])
					&& cartas.getPanelFilling().equals(pack.getFill()[0])
					|| cartas.getPanelFilling().equals(pack.getFill()[1])
					|| cartas.getPanelFilling().equals(pack.getFill()[2])
					&& cartas.getNumberOfComponents() == 1
					|| cartas.getNumberOfComponents() == 2
					|| cartas.getNumberOfComponents() == 3) {
				b = true;
			} else {
				b = false;
			}

		}
		assert(b != false);
		
	}
} 