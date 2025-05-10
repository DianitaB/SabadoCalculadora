package ec.edu.ups.calculadora.vista;


import java.awt.*;

public class VentanaCalculadora extends Frame {
    public VentanaCalculadora() {
        setTitle("Calculadora del Sábado");
        setSize(500, 500);
        setLocationRelativeTo(null);

        // Creamos un panel general con Border Layout
        Panel panelGeneral = new Panel(new BorderLayout());

        // Creamos los demas paneles
        Panel panelSuperior = new Panel(new GridLayout(3,2));
        Panel panelIntermedio = new Panel(new GridLayout(2,2));
        Panel panelInferior = new Panel(new GridLayout(2,2));


        // Agregamos los panele especificos al panel

        panelGeneral.add(panelSuperior, BorderLayout.NORTH);
        panelSuperior.add(panelIntermedio, BorderLayout.CENTER);
        panelIntermedio.add(panelInferior, BorderLayout.SOUTH);

        // Panel Superior
        // Creamos las etiquetas
            Label labelNumero1 = new Label("Numero 1");
            Label labelNumero2 = new Label("Numero 2");
            Label labelResultado = new Label("Resultado");

        // Creamos las cajas de texto
            TextField textFieldNumero1 = new TextField("0.00",10);
            TextField textFieldNumero2 = new TextField("0.00" ,10);
            TextField textFieldResultado = new TextField("0.00",10);

        // Agregar al panel


            panelSuperior.add(labelNumero1);
            panelSuperior.add(textFieldNumero1);

            panelSuperior.add(labelNumero2);
            panelSuperior.add(textFieldNumero2);

            panelSuperior.add(labelResultado);
            panelSuperior.add(textFieldResultado);

            // Panel Intermedio
            // Creamos los checkbox para realizar las operaciones correspondientes

            Checkbox checkBoxSuma = new Checkbox("Sumar",false);
            Checkbox checkBoxResta = new Checkbox("Restar",false);
            Checkbox checkBoxMultiplicacion = new Checkbox("Multiplicar",false);
            Checkbox checkBoxDivision = new Checkbox("Dividir",false);

            // Agregar al panel intermedio

            panelIntermedio.add(checkBoxSuma);
            panelIntermedio.add(checkBoxResta);
            panelIntermedio.add(checkBoxMultiplicacion);
            panelIntermedio.add(checkBoxDivision);

            // Panel Inferior
            // Creamos los botones para el panel Inferior
            Button botonCalcular = new Button("Calcular");
            Button botonLimpiar = new Button("Limpiar");

            // Agregamos al panel Inferior

            panelInferior.add(botonCalcular);
            panelInferior.add(botonLimpiar);


            add(panelSuperior);
            setVisible(true);

    }
}
