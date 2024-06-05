package Sanduiches;

import Ingredientes.*;

public class SanduicheIntegral extends Sanduiche{
    @Override
    public Pao paoFactory() {
        return new Pao(PaoEnum.Integral);
    }

    @Override
    public Queijo queijoFactory() {
        return new Queijo(QueijoEnum.Prato);
    }

    @Override
    public Presunto presuntoFactory() {
        return new Presunto(PresuntoEnum.Peru);
    }

    @Override
    public Ovo ovoFactory() {
        return new Ovo(OvoEnum.Capoeira);
    }

    @Override
    public Tomate tomateFactory() {
        return new Tomate(TomateEnum.Tomate);
    }
}
