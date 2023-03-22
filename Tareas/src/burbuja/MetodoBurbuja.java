package burbuja;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;

public class MetodoBurbuja extends JFrame implements ActionListener {

private static final long serialVersionUID = 1L;
private JLabel etiqueta;
private JButton btnOrdenar;
private JPanel panel;
private JTextField valX;
private JTextField valY;

public void Ventana() {

panel=new JPanel();

panel.setBounds(10, 10, 380, 38);

panel.setBackground(new Color(255,13,10));
panel.setLayout(null);
add(panel);

etiqueta = new JLabel("Mètodo Selecciòn");
etiqueta.setBounds(120, 20, 200, 30);
panel.add(etiqueta);

etiqueta = new JLabel("Ingresa la cantidad de numeros a ordenar: ");
etiqueta.setBounds(20, 50, 400, 20);
panel.add(etiqueta);

valX = new JTextField();
valX.setBounds(325,50,50,20);
panel.add(valX);

etiqueta = new JLabel("Numeros a leer: ");
etiqueta.setBounds(20, 75, 200, 20);
panel.add(etiqueta);

valY = new JTextField();
valY.setBounds(150,75,200,20);
panel.add(valY);
panel.add(etiqueta);
btnOrdenar=new JButton("Ordenar");
btnOrdenar.setBounds(50,300, 300, 40);
btnOrdenar.addActionListener(this);
panel.add(btnOrdenar);

setSize(400, 400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
int centerX = (int) screenSize.getWidth() / 2;
int centerY = (int) screenSize.getHeight() / 2;
int windowX = centerX - getWidth() / 2;
int windowY = centerY - getHeight() / 2;

setLocation(windowX, windowY);

}

private int[] ordenarArreglo(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
int Valormin = i;
for (int j = i + 1; j < n; j++) {
if (arr[j] < arr[Valormin]) {
Valormin = j;
}
}
int aux = arr[i];
arr[i] = arr[Valormin];
arr[Valormin] = aux;

}

return arr;
}

public static void main(String[] args) {
new Ventana();
}

@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == btnOrdenar) {
int n = Integer.parseInt(valX.getText());
int[] arr = new int[n];
String[] numeros = valY.getText().split(" ");
for (int i = 0; i < n; i++) {
arr[i] = Integer.parseInt(numeros[i]);
}
arr = ordenarArreglo(arr);
String mensaje = "El arreglo ordenado es:\n";
for (int i = 0; i < n; i++) {
mensaje += arr[i] + " ";
}
JOptionPane.showMessageDialog(null, mensaje, "Arreglo ordenado", JOptionPane.INFORMATION_MESSAGE);
}

}
