import javax.swing.JOptionPane;
public class Notas{
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, calculoMedia;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3: "));
        nota4 = Float.parseFloat(JOptionPane.showInputDialog("Nota 4: "));
        calculoMedia = (nota1 + nota2 + nota3 + nota4)/4;

        if(calculoMedia > 7){
            JOptionPane.showMessageDialog(null, "Média Final: Aprovado! "+ calculoMedia, "Média", JOptionPane.INFORMATION_MESSAGE);
        } else{
        JOptionPane.showMessageDialog(null, "Média Final: Reprovado! "+ calculoMedia, "Média", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
