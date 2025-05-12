package ec.edu.ups.calculadora.vista;


import ec.edu.ups.calculadora.modelo.Calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CalculadoraView extends Frame {

        private Calculadora calculadora;

        private Panel panelGeneral;
        private Panel panelSuperior;
        private Panel panelIntermedio;
        private Panel panelInferior;

        private Label labelNumero1;
        private Label labelNumero2;
        private Label labelResultado;

        private TextField textFieldNumero1;
        private TextField textFieldNumero2;
        private TextField textFieldResultado;

        private Checkbox checkBoxSuma;
        private Checkbox checkBoxResta;
        private Checkbox checkBoxMultiplicacion;
        private Checkbox checkBoxDivision;

        private   Button botonCalcular ;
        private Button botonLimpiar ;


    public Panel getPanelGeneral() {
        return panelGeneral;
    }

    public void setPanelGeneral(Panel panelGeneral) {
        this.panelGeneral = panelGeneral;
    }

    public Panel getPanelSuperior() {
        return panelSuperior;
    }

    public void setPanelSuperior(Panel panelSuperior) {
        this.panelSuperior = panelSuperior;
    }

    public Panel getPanelIntermedio() {
        return panelIntermedio;
    }

    public void setPanelIntermedio(Panel panelIntermedio) {
        this.panelIntermedio = panelIntermedio;
    }

    public Panel getPanelInferior() {
        return panelInferior;
    }

    public void setPanelInferior(Panel panelInferior) {
        this.panelInferior = panelInferior;
    }

    public Label getLabelNumero1() {
        return labelNumero1;
    }

    public void setLabelNumero1(Label labelNumero1) {
        this.labelNumero1 = labelNumero1;
    }

    public Label getLabelNumero2() {
        return labelNumero2;
    }

    public void setLabelNumero2(Label labelNumero2) {
        this.labelNumero2 = labelNumero2;
    }

    public Label getLabelResultado() {
        return labelResultado;
    }

    public void setLabelResultado(Label labelResultado) {
        this.labelResultado = labelResultado;
    }

    public TextField getTextFieldNumero1() {
        return textFieldNumero1;
    }

    public void setTextFieldNumero1(TextField textFieldNumero1) {
        this.textFieldNumero1 = textFieldNumero1;
    }

    public TextField getTextFieldNumero2() {
        return textFieldNumero2;
    }

    public void setTextFieldNumero2(TextField textFieldNumero2) {
        this.textFieldNumero2 = textFieldNumero2;
    }

    public TextField getTextFieldResultado() {
        return textFieldResultado;
    }

    public void setTextFieldResultado(TextField textFieldResultado) {
        this.textFieldResultado = textFieldResultado;
    }

    public Checkbox getCheckBoxSuma() {
        return checkBoxSuma;
    }

    public void setCheckBoxSuma(Checkbox checkBoxSuma) {
        this.checkBoxSuma = checkBoxSuma;
    }

    public Checkbox getCheckBoxResta() {
        return checkBoxResta;
    }

    public void setCheckBoxResta(Checkbox checkBoxResta) {
        this.checkBoxResta = checkBoxResta;
    }

    public Checkbox getCheckBoxMultiplicacion() {
        return checkBoxMultiplicacion;
    }

    public void setCheckBoxMultiplicacion(Checkbox checkBoxMultiplicacion) {
        this.checkBoxMultiplicacion = checkBoxMultiplicacion;
    }

    public Checkbox getCheckBoxDivision() {
        return checkBoxDivision;
    }

    public void setCheckBoxDivision(Checkbox checkBoxDivision) {
        this.checkBoxDivision = checkBoxDivision;
    }

    public Button getBotonCalcular() {
        return botonCalcular;
    }

    public void setBotonCalcular(Button botonCalcular) {
        this.botonCalcular = botonCalcular;
    }

    public Button getBotonLimpiar() {
        return botonLimpiar;
    }

    public void setBotonLimpiar(Button botonLimpiar) {
        this.botonLimpiar = botonLimpiar;
    }

    public CalculadoraView() {
        setTitle("Calculadora del Sábado");
        setSize(500, 500);
        setBackground(Color.WHITE);
        setLocationRelativeTo(null);

        // Creamos un panel general con Border Layout
        Panel panelGeneral = new Panel(new BorderLayout());

        // Creamos los demas paneles
        panelSuperior = new Panel(new GridLayout(3,2));
        panelIntermedio = new Panel(new GridLayout(2,2));
        panelInferior = new Panel(new GridLayout(1,2));


        // Agregamos los panele especificos al panel

        panelGeneral.add(panelSuperior, BorderLayout.NORTH);
        panelGeneral.add(panelIntermedio, BorderLayout.CENTER);
        panelGeneral.add(panelInferior, BorderLayout.SOUTH);


        // Panel Superior
        // Creamos las etiquetas
        labelNumero1 = new Label("Numero 1: ");
        labelNumero2 = new Label("Numero 2: ");
        labelResultado = new Label("Resultado: ");

        // Creamos las cajas de texto
        textFieldNumero1 = new TextField("0.00",10);
        textFieldNumero2 = new TextField("0.00" ,10);
        textFieldResultado = new TextField("0.00",10);

        // Agregamos para que el resultado no pueda editarse
        textFieldResultado.setEnabled(false);

        // Agregar al panel
            panelSuperior.add(labelNumero1);
            panelSuperior.add(textFieldNumero1);

            panelSuperior.add(labelNumero2);
            panelSuperior.add(textFieldNumero2);

            panelSuperior.add(labelResultado);
            panelSuperior.add(textFieldResultado);

            // Panel Intermedio
            // Creamos los checkbox para realizar las operaciones correspondientes

            checkBoxSuma = new Checkbox("Sumar",false);
            checkBoxResta = new Checkbox("Restar",false);
            checkBoxMultiplicacion = new Checkbox("Multiplicar",false);
            checkBoxDivision = new Checkbox("Dividir",false);

            // Agregar al panel intermedio

            panelIntermedio.add(checkBoxSuma);
            panelIntermedio.add(checkBoxResta);
            panelIntermedio.add(checkBoxMultiplicacion);
            panelIntermedio.add(checkBoxDivision);

            // Panel Inferior
            // Creamos los botones para el panel Inferior
            botonCalcular = new Button("Calcular");
            botonLimpiar = new Button("Limpiar");

            // Agregamos al panel Inferior

            panelInferior.add(botonCalcular);
            panelInferior.add(botonLimpiar);


            add(panelSuperior, BorderLayout.NORTH);
            add(panelIntermedio, BorderLayout.CENTER);
            add(panelInferior, BorderLayout.SOUTH);
            setVisible(true);

        //Agregar listener
        checkBoxSuma.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                validarCheckBox((Checkbox) e.getSource());
            }
        });

        checkBoxResta.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                validarCheckBox((Checkbox) e.getSource());
            }
        });

        checkBoxMultiplicacion.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                validarCheckBox((Checkbox) e.getSource());
            }
        });


        checkBoxDivision.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                validarCheckBox((Checkbox) e.getSource());
            }
        });


        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxSuma.getState()) {
                    sumar();
                }
                if (checkBoxResta.getState()) {
                    restar();
                }
                if (checkBoxMultiplicacion.getState()) {
                    multiplicar();
                }
                if (checkBoxDivision.getState()) {
                    dividir();
                }
            }
        });
    }

    public void validarCheckBox(Checkbox checkbox) {
        if(checkbox.getState() == true && checkbox.getLabel().equals("Sumar")) {
            checkBoxResta.setState(false);
            checkBoxMultiplicacion.setState(false);
            checkBoxDivision.setState(false);
        }

        if(checkbox.getState() == true && checkbox.getLabel().equals("Restar")) {
            checkBoxSuma.setState(false);
            checkBoxMultiplicacion.setState(false);
            checkBoxDivision.setState(false);
        }

        if(checkbox.getState() == true && checkbox.getLabel().equals("Multiplicar")) {
            checkBoxResta.setState(false);
            checkBoxSuma.setState(false);
            checkBoxDivision.setState(false);
        }

        if(checkbox.getState() == true && checkbox.getLabel().equals("Dividir")) {
            checkBoxResta.setState(false);
            checkBoxMultiplicacion.setState(false);
            checkBoxSuma.setState(false);
        }
    }

    public void sumar() {
        double numero1 = Double.parseDouble(textFieldNumero1.getText());
        double numero2 = Double.parseDouble(textFieldNumero2.getText());
        double resultado = numero1 + numero2;

        textFieldResultado.setText(String.valueOf(resultado));
    }

    public void restar() {
        double numero1 = Double.parseDouble(textFieldNumero1.getText());
        double numero2 = Double.parseDouble(textFieldNumero2.getText());
        double resultado = numero1 - numero2;

        textFieldResultado.setText(String.valueOf(resultado));
    }

    public void multiplicar() {
        double numero1 = Double.parseDouble(textFieldNumero1.getText());
        double numero2 = Double.parseDouble(textFieldNumero2.getText());
        double resultado = numero1 * numero2;

        textFieldResultado.setText(String.valueOf(resultado));
    }

    public void dividir() {
        double numero1 = Double.parseDouble(textFieldNumero1.getText());
        double numero2 = Double.parseDouble(textFieldNumero2.getText());
        double resultado = numero1 / numero2;

        textFieldResultado.setText(String.valueOf(resultado));
    }
}
