package Sanduiches;

import Ingredientes.*;

public class SanduicheSimples extends Sanduiche{
    @Override
    public Pao paoFactory() {
        return new Pao(PaoEnum.Frances);
    }

    @Override
    public Queijo queijoFactory() {
        return new Queijo(QueijoEnum.Mussarela);
    }

    @Override
    public Presunto presuntoFactory() {
        return new Presunto(PresuntoEnum.Frango);
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
