import javax.swing.JOptionPane;
public class Calculadora{
    public static void main(String[] args) {
        String operador = (JOptionPane.showInputDialog("Digite o operador: "));

        switch(operador){

        case ("+"):
        Float valorA1 = Float.parseFloat(JOptionPane.showInputDialog("valor 1:"));
        Float valorB1 = Float.parseFloat(JOptionPane.showInputDialog("valor 2:"));
        float resultado1 = valorA1 + valorB1;
        JOptionPane.showMessageDialog(null, "Resultado final: "+ resultado1, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        break;

        case ("-"):
        Float valorA2 = Float.parseFloat(JOptionPane.showInputDialog("valor 1:"));
        Float valorB2 = Float.parseFloat(JOptionPane.showInputDialog("valor 2:"));
        float resultado2 = valorA2 - valorB2;
        JOptionPane.showMessageDialog(null, "Resultado final: "+ resultado2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        break;
    
        case ("*"):
        Float valorA3 = Float.parseFloat(JOptionPane.showInputDialog("valor 1:"));
        Float valorB3 = Float.parseFloat(JOptionPane.showInputDialog("valor 2:"));
        float resultado3 = valorA3 * valorB3;
        JOptionPane.showMessageDialog(null, "Resultado final: "+ resultado3, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        break;

        case ("/"):
        Float valorA4 = Float.parseFloat(JOptionPane.showInputDialog("valor 1:"));
        Float valorB4 = Float.parseFloat(JOptionPane.showInputDialog("valor 2:"));
        float resultado4 = valorA4 / valorB4;
        JOptionPane.showMessageDialog(null, "Resultado final: "+ resultado4, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        break;
        }
        }
    }