package SanduichesTeste;

import Sanduiches.*;
import Ingredientes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SanduicheSimplesTest {
    private SanduicheSimples sanduiche;

    @BeforeEach
    public void setup() {
        sanduiche = new SanduicheSimples();
    }

    @Test
    public void testPaoFactory() {
        sanduiche.setTipoPao(sanduiche.paoFactory());
        assertEquals(PaoEnum.Frances, sanduiche.getTipoPao().getPao());
    }

    @Test
    public void testQueijoFactory() {
        sanduiche.setTipoQueijo(sanduiche.queijoFactory());
        assertEquals(QueijoEnum.Mussarela, sanduiche.getTipoQueijo().getQueijo());
    }

    @Test
    public void testPresuntoFactory() {
        sanduiche.setTipoPresunto(sanduiche.presuntoFactory());
        assertEquals(PresuntoEnum.Frango, sanduiche.getTipoPresunto().getPresunto());
    }

    @Test
    public void testOvoFactory() {
        sanduiche.setTipoOvo(sanduiche.ovoFactory());
        assertEquals(OvoEnum.Capoeira, sanduiche.getTipoOvo().getOvo());
    }

    @Test
    public void testeTomateFactory(){
        sanduiche.setTipoTomate(sanduiche.tomateFactory());
        assertEquals(TomateEnum.Tomate, sanduiche.getTipoTomate().getTomate());
    }
}
