/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import model.bean.Tempo_save;
import model.dao.Tempo_saveDAO;

/**
 *
 * @author Marcos Antonio
 */
public class Cronometro {
    
    private final Timer t; ;
    public Tempo_saveDAO Tempdao;
    public Tempo_save Temp;
    public int Position;
    
   /* private int h;
    private int m;
    private int s;*/
    
    private int minut;
    private int cnt;
    
    int auxiliarSegundos = 0;
    int auxiliarMinutos = 0;
    int auxiliarHoras = 0;
    int auxiliarTempo_limite = 0;
    
    String auxiliarNome = null;
    String auxiliarCpf = null;
    String auxiliarClient_time = null;
    
    public Cronometro(int position) {
        this.t = new Timer(1000,acao);
        
        this.Position = position;
        
        this.Temp = new Tempo_save();
        this.Tempdao = new Tempo_saveDAO();
       /* this.Temp.setIdTempo(0);
        this.Temp.setCliente_time("00:00:00");
            */
        iniciaCriandoOuAtualizando(position);
       
    }
    private void iniciaCriandoOuAtualizando(int position){
        for(Tempo_save T: Tempdao.lista_tempo(position)){      
            auxiliarSegundos = T.getSegundos();
            auxiliarClient_time = T.getCliente_time();
            auxiliarSegundos = T.getSegundos();
            auxiliarMinutos = T.getMinutos();
            auxiliarHoras = T.getHoras();
            auxiliarNome = T.getNome();
            auxiliarCpf = T.getCPF();
            auxiliarTempo_limite = T.getTempo_limite();
            
        }
        if(auxiliarNome != null){ 
            
            Temp.setCliente_time(auxiliarClient_time);
            
            Temp.setSegundos(auxiliarSegundos);
            Temp.setMinutos(auxiliarMinutos);
            Temp.setHoras(auxiliarHoras);
            
            Temp.setNome(auxiliarNome);
            Temp.setCPF(auxiliarCpf);
            Temp.setTempo_limite(auxiliarTempo_limite);
            
            Temp.setIdTempo(Position);
            Tempdao.update(Temp);
        }else{
            
            Temp.setCliente_time("00:00:00");
            Temp.setSegundos(0);
            Temp.setMinutos(0);
            Temp.setHoras(0);
            Temp.setNome(" ");
            Temp.setCPF(" ");
            Temp.setTempo_limite(0);
            Temp.setIdTempo(position);
            
            this.Tempdao.create(Temp);    
        }
    }
  
    private ActionListener acao = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //s++;
            Temp.setSegundos(Temp.getSegundos()+1);
            if(Temp.getSegundos() == 60){
                Temp.setSegundos(Position);
                //++m;
                Temp.setMinutos(1+Temp.getMinutos());
            }
            if(Temp.getMinutos() == 60){
                //m = 0;
                Temp.setMinutos(Position);
                //++h;
                Temp.setHoras(1+Temp.getHoras());
            }
            //atualizarLabel();
            
            Temp.setSegundos(Temp.getSegundos());
            Temp.setMinutos(Temp.getMinutos());
            Temp.setHoras(Temp.getHoras());
            
            
            Temp.setCliente_time(atualizaText());
            Temp.setIdTempo(Position);
            Tempdao.update(Temp);
        }
    };
    

   
    public String atualizaText(){
        String tempo = (Temp.getHoras()<=9?"0":"")+Temp.getHoras()+":"+(Temp.getMinutos()<=9?"0":"")+Temp.getMinutos()+":"+(Temp.getSegundos()<=9?"0":"")+Temp.getSegundos();
        //Display.setText(tempo);
        
        return tempo;
    }
    public void Start(){
        t.start();
    }
    public void Restart(){
        t.restart();
    }
    public void Stop(){
        t.stop();
    }
    public void IsRunning(){
        if(t.isRunning()){
            t.stop();
        }
        
        Temp.setHoras(0);Temp.setMinutos(0);Temp.setSegundos(0);
        Temp.setCliente_time("00:00:00");
        Temp.setIdTempo(Position);
        Tempdao.update(Temp);
    }

    @Override
    public String toString() {
        
        return Temp.getCliente_time(); //To change body of generated methods, choose Tools | Templates.
    }
    public String RetornaNome(){
        return Temp.getNome();
    }
    public String RetornaCPF(){
        return Temp.getCPF();
    }
    public String RetornaTempoLimite(){
        return ""+Temp.getTempo_limite();
    }
    public boolean verificaTempo(){
        if(Temp.getMinutos() >= Temp.getTempo_limite() && Temp.getMinutos() != 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void AtualizaDadosCadastrais(String Nome, String Cpf, int TempLimit, int position){
       /* Temp.setCliente_time("00:00:00");
        Temp.setIdTempo(Position);
        */
        Temp.setNome(Nome);
        Temp.setCPF(Cpf);
        Temp.setTempo_limite(TempLimit);
        Temp.setIdTempo(position);
        Tempdao.update(Temp);
    }
}
