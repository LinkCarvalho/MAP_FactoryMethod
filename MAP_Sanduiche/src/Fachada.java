import Sanduiches.*;

public class Fachada {

    public static Sanduiche criaSanduicheIntegral(){
        SanduicheIntegral sanduicheIntegral = new SanduicheIntegral();
        sanduicheIntegral.setTipoPao(sanduicheIntegral.paoFactory());
        sanduicheIntegral.setTipoQueijo(sanduicheIntegral.queijoFactory());
        sanduicheIntegral.setTipoPresunto(sanduicheIntegral.presuntoFactory());
        sanduicheIntegral.setTipoOvo(sanduicheIntegral.ovoFactory());
        sanduicheIntegral.setTipoTomate(sanduicheIntegral.tomateFactory());

        return sanduicheIntegral;
    }

    public static Sanduiche criaSanduicheSimples(){
        SanduicheSimples sanduicheSimples = new SanduicheSimples();
        sanduicheSimples.setTipoPao(sanduicheSimples.paoFactory());
        sanduicheSimples.setTipoQueijo(sanduicheSimples.queijoFactory());
        sanduicheSimples.setTipoPresunto(sanduicheSimples.presuntoFactory());
        sanduicheSimples.setTipoOvo(sanduicheSimples.ovoFactory());
        sanduicheSimples.setTipoTomate(sanduicheSimples.tomateFactory());

        return  sanduicheSimples;
    }

    public static Sanduiche criaSanduicheXFrango(){
        SanduicheXFrango sanduicheXFrango = new SanduicheXFrango();
        sanduicheXFrango.setTipoPao(sanduicheXFrango.paoFactory());
        sanduicheXFrango.setTipoQueijo(sanduicheXFrango.queijoFactory());
        sanduicheXFrango.setTipoPresunto(sanduicheXFrango.presuntoFactory());
        sanduicheXFrango.setTipoOvo(sanduicheXFrango.ovoFactory());
        sanduicheXFrango.setTipoTomate(sanduicheXFrango.tomateFactory());

        return sanduicheXFrango;
    }
}
