import java.util.Scanner;
public class Principal {
static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args) {
     Sala s = new Sala(); 
     String help = "--------------------------------------------------------------\n"  +
                    "==Lista de comandos==\n"+
                    "Os parametros dos comandos devem ser separados por espaço\n"+
                    "init(Ao digitar o camando, informe o tamanho da sala)\n"+
                    "reservar(Digite seu nome, telefone e o numero da cadeira)\n"+
                    "cancelar(Digite seu nome para cancelar a reserva)\n"+
                    "show(Para mostrar a sala)\n"+
                    "-------------------------------------------------------------";
     
     
     while (true){
         
         System.out.print("digite help, para lista de comandos!\n"+"Digite um comando: ");
         String comando = input.nextLine();
         if (comando.equals("help")){
             System.out.println(help);
         }else{
             
             String c[] = comando.split(" ");
             switch(c[0]){
                 case "init":
                      s = new Sala(Integer.parseInt(c[1])-1);
                     break;
                 case "reservar":
                     s.reservar(c[1], c[2], Integer.parseInt(c[3])-1);
                     break;
                 case "cancelar":
                     s.cancelar(c[1]);
                     break;
                 case "show":
                     System.out.println(s);
                     break;
                 default:
                     System.out.println("Comando inválido!");
                     break;
                 
             }
             
         }
     }
      
        
    }
    
}
