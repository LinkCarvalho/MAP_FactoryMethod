package SanduichesTeste;

import Ingredientes.*;
import Sanduiches.SanduicheXFrango;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SanduicheXFrangoTest {
    private SanduicheXFrango sanduiche;

    @BeforeEach
    public void setup() {
        sanduiche = new SanduicheXFrango();
    }

    @Test
    public void testPaoFactory() {
        sanduiche.setTipoPao(sanduiche.paoFactory());
        assertEquals(PaoEnum.Bola, sanduiche.getTipoPao().getPao());
    }

    @Test
    public void testQueijoFactory() {
        sanduiche.setTipoQueijo(sanduiche.queijoFactory());
        assertEquals(QueijoEnum.Cheddar, sanduiche.getTipoQueijo().getQueijo());
    }

    @Test
    public void testPresuntoFactory() {
        sanduiche.setTipoPresunto(sanduiche.presuntoFactory());
        assertEquals(PresuntoEnum.Frango, sanduiche.getTipoPresunto().getPresunto());
    }

    @Test
    public void testOvoFactory() {
        sanduiche.setTipoOvo(sanduiche.ovoFactory());
        assertEquals(OvoEnum.Granja, sanduiche.getTipoOvo().getOvo());
    }

    @Test
    public void testeTomateFactory(){
        sanduiche.setTipoTomate(sanduiche.tomateFactory());
        assertEquals(TomateEnum.Tomate, sanduiche.getTipoTomate().getTomate());
    }
}
