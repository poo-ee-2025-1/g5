
public class Usuario
{   private String email;
    private String aSenha;
    private String confirmaSenha;
    public Usuario(String email, String aSenha, String confirmaSenha) {
        this.email = email;
        
        this.aSenha=aSenha;
        this.confirmaSenha =confirmaSenha;
    }
    public String conf(){
     return "AUTENTICADO";
    }
               
    public boolean verificaLogin(String email, String aSenha){
        if(this.aSenha ==aSenha && this.email == email){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
}

