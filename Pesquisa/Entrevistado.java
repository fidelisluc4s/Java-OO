


public class Entrevistado
{
    private int idade;
    private double altura;
    private char sexo;
    private String corOlhos;
    private ETipoCorCabelo corCabelos;
    
    public Entrevistado(){}
    
    public Entrevistado(int idade, double altura, char sexo, 
    String corOlhos,ETipoCorCabelo corCabelos){
        
        this.idade =idade;
        this.altura = altura;
        setSexo(sexo);
        setCorOlhos(corOlhos);
        this.corCabelos = corCabelos;
    }
    
    public boolean temPerfil(){
        return  (getSexo() == 'F' || getSexo() == 'f') &&
        (getIdade() >= 18 && getIdade() <= 35) && 
                (getCorOlhos().equals("VERDE") ) && 
                (getcorCabelos() == ETipoCorCabelo.LOIRO ) ;
    }
    
    
    public void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }
    }    
    public int getIdade(){
        return idade;
    } 
    
    
    public void setAltura(double altura){
        if(altura > 0){
            this.altura = altura;
        }
    }          
    public double getAltura(){
        return idade;
    }
    
    
    public void setSexo(char sexo){
        if(sexo == 'M' || sexo == 'F' ||
        sexo == 'm' || sexo =='f'){
            this.sexo = 'M';
        }
        
        
        
        /*if("M".charAt(0) == sexo){
            this.sexo = 'M';
        }
        if("F".charAt(0) == sexo){
            this.sexo = 'F';
        }*/
    }
    public char getSexo(){
        return sexo;
    } 
    
    public void setCorOlhos(String corOlhos){
        if(corOlhos.toUpperCase().equals("VERDE")||
        corOlhos.toUpperCase().equals("CSTANHO") ||
        corOlhos.toUpperCase().equals("AZUL")){
            this.corOlhos = corOlhos;
        }
    }
    public String getCorOlhos(){
        return corOlhos;
    }
     
    
    public void setcorCabelos(ETipoCorCabelo corCabelos){
        if(altura > 0){
            this.corCabelos = corCabelos;
        }
    }          
    public ETipoCorCabelo getcorCabelos(){
        return corCabelos;
    }
}          
       
    

