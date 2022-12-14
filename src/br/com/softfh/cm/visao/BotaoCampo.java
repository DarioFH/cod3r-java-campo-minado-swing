package br.com.softfh.cm.visao;

import br.com.softfh.cm.modelo.Campo;
import br.com.softfh.cm.modelo.CampoEvento;
import br.com.softfh.cm.modelo.CampoObservador;

import javax.swing.*;
import java.awt.*;

public class BotaoCampo extends JButton implements CampoObservador {

    private final Color BG_PADRAO = new Color(222, 222, 222);
    private final Color BG_MARCAR = new Color(8, 179, 247);
    private final Color BG_EXPLODIR = new Color(189, 66, 68);
    private final Color TEXTO_VERDE = new Color(0, 100, 0);
    private Campo campo;

    public BotaoCampo(Campo campo) {
        this.campo = campo;
        setBackground(BG_PADRAO);
        setBorder(BorderFactory.createBevelBorder(0));

        campo.registrarObservador(this);
    }


    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        switch (evento){
            case ABRIR:
                aplicarEstiloAbrir();
                break;
            case MARCAR:
                aplicarEstiloMarcar();
                break;
            case EXPLODIR:
                aplicarEstiloExplodir();
                break;
            default:
                aplicarEstiloPadrao();
        }
    }

    private void aplicarEstiloAbrir() {
    }

    private void aplicarEstiloMarcar() {
        
    }

    private void aplicarEstiloExplodir() {
        
    }

    private void aplicarEstiloPadrao() {
        
    }
}
