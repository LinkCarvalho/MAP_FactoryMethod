import Sanduiches.*;

public class Main {
    public static void main(String[] args) {
        /*SanduicheIntegral sanduicheIntegral = new SanduicheIntegral();
        sanduicheIntegral.setTipoPao(sanduicheIntegral.paoFactory());
        sanduicheIntegral.setTipoQueijo(sanduicheIntegral.queijoFactory());
        sanduicheIntegral.setTipoPresunto(sanduicheIntegral.presuntoFactory());
        sanduicheIntegral.setTipoOvo(sanduicheIntegral.ovoFactory());
        sanduicheIntegral.setTipoTomate(sanduicheIntegral.tomateFactory());
        System.out.println(sanduicheIntegral);*/
        Sanduiche sanduicheIntegral = Fachada.criaSanduicheIntegral();
        System.out.println(sanduicheIntegral);

        /*SanduicheSimples sanduicheSimples = new SanduicheSimples();
        sanduicheSimples.setTipoPao(sanduicheSimples.paoFactory());
        sanduicheSimples.setTipoQueijo(sanduicheSimples.queijoFactory());
        sanduicheSimples.setTipoPresunto(sanduicheSimples.presuntoFactory());
        sanduicheSimples.setTipoOvo(sanduicheSimples.ovoFactory());
        sanduicheSimples.setTipoTomate(sanduicheSimples.tomateFactory());*/
        Sanduiche sanduicheSimples = Fachada.criaSanduicheSimples();
        System.out.println(sanduicheSimples);

        /*SanduicheXFrango sanduicheXFrango = new SanduicheXFrango();
        sanduicheXFrango.setTipoPao(sanduicheXFrango.paoFactory());
        sanduicheXFrango.setTipoQueijo(sanduicheXFrango.queijoFactory());
        sanduicheXFrango.setTipoPresunto(sanduicheXFrango.presuntoFactory());
        sanduicheXFrango.setTipoOvo(sanduicheXFrango.ovoFactory());
        sanduicheXFrango.setTipoTomate(sanduicheXFrango.tomateFactory());*/
        Sanduiche sanduicheXFrango = Fachada.criaSanduicheXFrango();
        System.out.println(sanduicheXFrango);

    }
}