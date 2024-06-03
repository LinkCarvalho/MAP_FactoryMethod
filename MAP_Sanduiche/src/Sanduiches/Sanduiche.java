package Sanduiches;

import Ingredientes.*;

public class Sanduiche {
    private Pao tipoPao;
    private Queijo tipoQueijo;
    private Presunto tipoPresunto;
    private Ovo tipoOvo;
    private Tomate tipoTomate;

    public Pao paoFactory(){
        return new Pao(null);
    }

    public Queijo queijoFactory(){
        return new Queijo(null);
    }

    public Presunto presuntoFactory() {
        return new Presunto(null);
    }

    public Ovo ovoFactory(){
        return new Ovo(null);
    }

    public Tomate tomateFactory(){
        return new Tomate(TomateEnum.Tomate);
    }

    @Override
    public String toString() {
        return "Sanduiche pronto! ingredientes: " +
                "Pao: " + tipoPao.getPao() +
                ", Queijo: " + tipoQueijo.getQueijo() +
                ", Presunto de: " + tipoPresunto.getPresunto() +
                ", Ovo: " + tipoOvo.getOvo() +
                ", Tomate: " + tipoTomate.getTomate();
    }

    public Pao getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(Pao tipoPao) {
        this.tipoPao = tipoPao;
    }

    public Queijo getTipoQueijo() {
        return tipoQueijo;
    }

    public void setTipoQueijo(Queijo tipoQueijo) {
        this.tipoQueijo = tipoQueijo;
    }

    public Presunto getTipoPresunto() {
        return tipoPresunto;
    }

    public void setTipoPresunto(Presunto tipoPresunto) {
        this.tipoPresunto = tipoPresunto;
    }

    public Ovo getTipoOvo() {
        return tipoOvo;
    }

    public void setTipoOvo(Ovo tipoOvo) {
        this.tipoOvo = tipoOvo;
    }

    public Tomate getTipoTomate() {
        return tipoTomate;
    }

    public void setTipoTomate(Tomate tipoTomate) {
        this.tipoTomate = tipoTomate;
    }
}