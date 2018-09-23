import java.util.ArrayList;

public class Sala {
    
    ArrayList<Cliente> cadeiras = new ArrayList();
    
    public Sala(int tamanho){
    for (int i=0; i <= tamanho; i++){
        this.cadeiras.add(null);
    }
    
      }
    public Sala(){
        
    } 

    
  public void reservar (String id, String fone, int indice){
    
    for(int i = 0; i < cadeiras.size(); i++){
        if(indice > cadeiras.size()){
           System.out.println("Essa cadeira não existe no cinema!");
           break;
        }else if(cadeiras.get(indice) != null){
           System.out.println("Cadeira já reservada!");
          break; 
       }else if(cadeiras.get(i) != null && cadeiras.get(i).id.equals(id)){
           System.out.println("Cliente já existe!");
           break;
       }else{
           Cliente cliente = new Cliente(id,fone);
           cadeiras.remove(indice);
           cadeiras.add(indice, cliente);
           System.out.println("cadeira reservada com sucesso!");
           break;
        }
    }
}
  
  public void cancelar(String id){
      for (int i = 0; i < cadeiras.size(); i++){
          if(cadeiras.get(i) != null && cadeiras.get(i).id.equals(id)){
              cadeiras.remove(i);
              cadeiras.add(i, null);
              System.out.println("Cancelamento efetuado com sucesso!");
              break;
            }else if(i+1 == cadeiras.size()){
                System.out.println("Pessoa não está no cinema! ");
            }
            
        }
    }
  
    @Override
      public String toString(){
        
        String saida = "";
        if(this.cadeiras.isEmpty()){
            saida += "[ ]";
        }
        for (Cliente c : cadeiras){
            if (c != null){
                
                saida += c.id+":"+c.telefone;
            }else {
                saida += "- ";
            }
            
        }
        return saida;
    }
    
}
