package com.seriousweasle.JavaExperiments;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiSpaceship {
    public static void main(String[] args) {
        new GuiSpaceship();
    }

    public GuiSpaceship() {
        JFrame guiFrame = new JFrame();

        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Spaceship GUI");
        guiFrame.setSize(300, 250);

        guiFrame.setLocationRelativeTo(null);

        final JPanel namesPanel= new JPanel();
        JLabel namesLbl = new JLabel("Spaceship Name:");
        JTextArea names = new JTextArea("I.E. Artemis, Theseus");
        namesPanel.add(namesLbl);
        namesPanel.add(names);

        final JPanel weaponsPanel = new JPanel();
        weaponsPanel.setVisible(false);
        JLabel weaponsLbl = new JLabel("Weapons:");
        JCheckBox IonCannons = new JCheckBox("Ion Cannons");
        JCheckBox Vulcan = new JCheckBox("Vulcan");
        JCheckBox OrbitalCannon = new JCheckBox("Orbital Cannon");

        weaponsPanel.add(weaponsLbl);
        weaponsPanel.add(IonCannons);
        weaponsPanel.add(Vulcan);
        weaponsPanel.add(OrbitalCannon);

        JButton menuSwitcher = new JButton("Choose name/weapons");
        menuSwitcher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                namesPanel.setVisible(!namesPanel.isVisible());
                weaponsPanel.setVisible(!weaponsPanel.isVisible());
            }
        });

        boolean hasVulcan = Vulcan.isSelected();
        boolean hasIonCannon = IonCannons.isSelected();
        boolean hasOrbitalCannon = OrbitalCannon.isSelected();
        String shipName = names.getName();

        guiFrame.add(namesPanel, BorderLayout.NORTH);
        guiFrame.add(weaponsPanel, BorderLayout.CENTER);
        guiFrame.add(menuSwitcher, BorderLayout.SOUTH);

        guiFrame.setVisible(true);
    }
}
