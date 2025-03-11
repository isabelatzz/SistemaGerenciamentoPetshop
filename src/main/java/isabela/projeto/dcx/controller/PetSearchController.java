package isabela.projeto.dcx.controller;

import isabela.projeto.dcx.GerenciaPetshop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetSearchController implements ActionListener {
    private GerenciaPetshop gerenciaPetshop;
    private JFrame framePet;

    public PetSearchController(GerenciaPetshop gerenciaPetshop, JFrame framePet) {
        this.gerenciaPetshop = gerenciaPetshop;
        this.framePet = framePet;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
