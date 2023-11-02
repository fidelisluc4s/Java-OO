import java.util.ArrayList;

public class Pesquisa
{
    private ArrayList<Entrevistado> entrevistados;
    private String dataPesquisa;

    public Pesquisa(String data){
        this.dataPesquisa = data;
        entrevistados = new ArrayList<>();
    }

    //a) maior e menor altura
    public Entrevistado getEntrevistadoMaiorAltura(){
        if(entrevistados.size() > 0){
            Entrevistado maior = entrevistados.get(0);
            for(Entrevistado e : entrevistados){
                if(e.getAltura() > maior.getAltura()){
                    maior = e;
                }
            }

            return maior;
        }
        return null;
    }
    //b)homen mais velho
    public Entrevistado getHomenMaisVelho(){
        if(entrevistados.size() > 0){
            Entrevistado velho = new Entrevistado();
            velho.setIdade(0);
            for(Entrevistado e : entrevistados){
                if(e.getIdade() > velho.getIdade() && (e.getSexo() == 'M') || e.getSexo() == 'm'  ){
                    velho = e;
                }
            }
            return velho;
        }
        return null;
    }
    //b) mulher mais velha
    public Entrevistado getMulherMaisVelha(){
        if(entrevistados.size() > 0){
            Entrevistado velho = new Entrevistado();
            velho.setIdade(0);
            for(Entrevistado e : entrevistados){
                if (e.getIdade() > velho.getIdade() && (e.getSexo() == 'F' || e.getSexo() == 'f' ) ){
                    velho = e;
                }
            }
            return velho;
        }
        return null;
    }
    //cmedia de altura das mulheres 
    public double getMediaAlturaMulheres(){
        if(entrevistados.size() > 0){
            double soma = 0;
            for(Entrevistado e : entrevistados){
                if(e.getSexo() == 'F' || e.getSexo() == 'f'  ){
                    soma+= e.getAltura();
                }
            }
            return soma/getQuantidadeMulheres();
        }
        return 0;

    }
    //d) numero de homens
    public int getQuantidadeHomens(){
        if(entrevistados.size() > 0){
            int total = 0;
            for(Entrevistado e : entrevistados){
                if(e.getSexo() == 'M' || e.getSexo() == 'm'){
                    total++;
                }
            }
            return total;
        }
        return 0;
    }

    public int getQuantidadeMulheres(){
        return entrevistados.size() - getQuantidadeHomens();        
    }

    public double getPercentualHomens(){
        return getQuantidadeHomens()*100/entrevistados.size();
    }

    public double getPercentualMulheres(){
        return getPercentualMulheres()*100/entrevistados.size();
    }
    public double getPercentualPerfil(){
        if(entrevistados.size() > 0 ){
            int totalPerfil = 0;
            for(Entrevistado e : entrevistados){
                if((e.getSexo() == 'F' || e.getSexo() == 'f') && 
                (e.getIdade() >= 18 && e.getIdade() <= 35) && 
                (e.getCorOlhos().equals("VERDE") ) && 
                (e.getcorCabelos() == ETipoCorCabelo.LOIRO ) ){
                    totalPerfil++;
                }
                if(entrevistados.size() > 0){
                    
                }
            }
            return totalPerfil*10/entrevistados.size();
        }
        return 0;
    }

    public Entrevistado getEntrevistadoMenorAltura(){
        return null;
    }

    public ArrayList<Entrevistado> getEntrevistados(){
        return entrevistados;
    }

    public void AdicionaEntrevistado( Entrevistado ent){
        this.dataPesquisa = dataPesquisa;
    }

    public void getDataPesquisa(Entrevistado ent){
        if(ent != null){
            entrevistados.add(ent);
        }
    }

    public void setDataPesquisa(String dataPesquisa){
        this.dataPesquisa = dataPesquisa;
    }

    public String getDataPesquisa(){
        return this.dataPesquisa = dataPesquisa;
    }

}