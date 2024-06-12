import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showInputDialog(null,
                "Qual seu nome?",//a msg oi alterada aqui
                "Questionário",//o titulo da msg foi alterado aqui
                JOptionPane.INFORMATION_MESSAGE);// o icone da caisa de dialogo aqui 

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Qual sua idade?",//foi alterado a msg aqui
                "Questionário",//o titulo foi alterado aqui
                JOptionPane.INFORMATION_MESSAGE,
                null,
                null,
                "Digite algo novo novamente.");//foi alterado o texto de entada padrão
        int input = Integer.parseInt(input1);
        
        String[] acceptableValues = {"amarelo", "vermelho", "azul"};//os valores aceitaveis aqui
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Isto é uma nova pergunta?",//foi alterado a msg aqui
                "Pesquisa",//foi alterado o titulo aqui
                JOptionPane.INFORMATION_MESSAGE,
                null,
                acceptableValues,
                acceptableValues[1]);
        System.out.println("O resultado da pesquisa realizada é: "+input2 +", "+ input1+" anos.");
                
    }
}
