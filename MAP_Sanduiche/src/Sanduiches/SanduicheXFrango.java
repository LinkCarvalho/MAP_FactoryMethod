package Sanduiches;

import Ingredientes.*;

public class SanduicheXFrango extends Sanduiche{
    @Override
    public Pao paoFactory() {
        return new Pao(PaoEnum.Bola);
    }

    @Override
    public Queijo queijoFactory() {
        return new Queijo(QueijoEnum.Cheddar);
    }

    @Override
    public Presunto presuntoFactory() {
        return new Presunto(PresuntoEnum.Frango);
    }

    @Override
    public Ovo ovoFactory() {
        return new Ovo(OvoEnum.Granja);
    }

    @Override
    public Tomate tomateFactory() {
        return new Tomate(TomateEnum.Tomate);
    }
}
