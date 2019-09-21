/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Code.Cronometro;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.bean.Tempo_save;
import model.dao.Tempo_saveDAO;

/**
 *
 * @author Marcos Antonio
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private Timer t;
    Cronometro cron;
    Cronometro cron1;
    Cronometro cron2;
    Cronometro cron3;
    Cronometro cron4;
    Cronometro cron5;
    Cronometro cron6;
    Cronometro cron7;
    Cronometro cron8;
    Cronometro cron9;
    Cronometro cron10;
    Cronometro cron11;
    Cronometro cron12;
    Cronometro cron13;
    Cronometro cron14;
    Cronometro cron15;
    Cronometro cron16;
    Cronometro cron17;
    Cronometro cron18;
    Cronometro cron19;
    
    
    Tempo_save obj2;
    Tempo_saveDAO obj;
    ArrayList listaString;
    
    
  
    Tempo_saveDAO tmp;
    
    private int minut;
    private int cnt;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        t = new Timer(100, acao); 
        listaString = new ArrayList();
        
        cron = new Cronometro(0);
        cron1 = new Cronometro(1);
        cron2 = new Cronometro(2);
        cron3 = new Cronometro(3);
        cron4 = new Cronometro(4);
        cron5 = new Cronometro(5);
        cron6 = new Cronometro(6);
        cron7 = new Cronometro(7);
        cron8 = new Cronometro(8);
        cron9 = new Cronometro(9);
        cron10 = new Cronometro(10);
        cron11 = new Cronometro(11);
        cron12 = new Cronometro(12);
        cron13= new Cronometro(13);
        cron14= new Cronometro(14);
        cron15 = new Cronometro(15);
        cron16 = new Cronometro(16);
        cron17 = new Cronometro(17);
        cron18 = new Cronometro(18);
        cron19 = new Cronometro(19);
        
        tmp = new Tempo_saveDAO();
     
        iniciaDisplay(0);
        iniciaDisplay(1);
        iniciaDisplay(2);
        iniciaDisplay(3);
        iniciaDisplay(4);
        iniciaDisplay(5);
        iniciaDisplay(6);
        iniciaDisplay(7);
        iniciaDisplay(8);
        iniciaDisplay(9);
        iniciaDisplay(10);
        iniciaDisplay(11);
        iniciaDisplay(12);
        iniciaDisplay(13);
        iniciaDisplay(14);
        iniciaDisplay(15);
        iniciaDisplay(16);
        iniciaDisplay(17);
        iniciaDisplay(18);
        iniciaDisplay(19);
 
        
        
    }
    private void iniciaDisplay(int position){
       //Lista pra inicializar 
       Tempo_saveDAO daoName = new Tempo_saveDAO();
       
       for(Tempo_save T: tmp.lista_tempo(position)){
           
           listaString.add(T);
           //listaString.add(T.getNome());
       }
       if(position == 0){
           Display.setText(listaString.get(position).toString());
           EspacoNome.setText(cron.RetornaNome());
           EspacoCpf.setText(cron.RetornaCPF());
           EspacoTempoLimt.setText(cron.RetornaTempoLimite());
       }else if(position == 1  ){
           Display1.setText(listaString.get(position).toString());
           EspacoNome1.setText(cron1.RetornaNome());
           EspacoCpf1.setText(cron1.RetornaCPF());
           EspacoTempoLimt1.setText(cron1.RetornaTempoLimite());
           
       }else if(position == 2  ){
           Display2.setText(listaString.get(position).toString());
           EspacoNome2.setText(cron2.RetornaNome());
           EspacoCpf2.setText(cron2.RetornaCPF());
           EspacoTempoLimt2.setText(cron2.RetornaTempoLimite());
           
       } else if(position == 3  ){
           Display3.setText(listaString.get(position).toString());
           EspacoNome3.setText(cron3.RetornaNome());
           EspacoCpf3.setText(cron3.RetornaCPF());
           EspacoTempoLimt3.setText(cron3.RetornaTempoLimite());
           
       } else if(position == 4  ){
           Display4.setText(listaString.get(position).toString());
           EspacoNome4.setText(cron4.RetornaNome());
           EspacoCpf4.setText(cron4.RetornaCPF());
           EspacoTempoLimt4.setText(cron4.RetornaTempoLimite());
           
       } else if(position == 5  ){
           Display5.setText(listaString.get(position).toString());
           EspacoNome5.setText(cron5.RetornaNome());
           EspacoCpf5.setText(cron5.RetornaCPF());
           EspacoTempoLimt5.setText(cron5.RetornaTempoLimite());
           
       } else if(position == 6  ){
           Display6.setText(listaString.get(position).toString());
           EspacoNome6.setText(cron6.RetornaNome());
           EspacoCpf6.setText(cron6.RetornaCPF());
           EspacoTempoLimt6.setText(cron6.RetornaTempoLimite());
           
       } else if(position == 7  ){
           Display7.setText(listaString.get(position).toString());
           EspacoNome7.setText(cron7.RetornaNome());
           EspacoCpf7.setText(cron7.RetornaCPF());
           EspacoTempoLimt7.setText(cron7.RetornaTempoLimite());
           
       } else if(position == 8  ){
           Display8.setText(listaString.get(position).toString());
           EspacoNome8.setText(cron8.RetornaNome());
           EspacoCpf8.setText(cron8.RetornaCPF());
           EspacoTempoLimt8.setText(cron8.RetornaTempoLimite());
           
       } else if(position == 9  ){
           Display9.setText(listaString.get(position).toString());
           EspacoNome9.setText(cron9.RetornaNome());
           EspacoCpf9.setText(cron9.RetornaCPF());
           EspacoTempoLimt9.setText(cron9.RetornaTempoLimite());
           
       } else if(position == 10  ){
           Display10.setText(listaString.get(position).toString());
           EspacoNome10.setText(cron10.RetornaNome());
           EspacoCpf10.setText(cron10.RetornaCPF());
           EspacoTempoLimt10.setText(cron10.RetornaTempoLimite());
           
       } else if(position == 11  ){
           Display11.setText(listaString.get(position).toString());
           EspacoNome11.setText(cron11.RetornaNome());
           EspacoCpf11.setText(cron11.RetornaCPF());
           EspacoTempoLimt11.setText(cron11.RetornaTempoLimite());
           
       } else if(position == 12  ){
           Display12.setText(listaString.get(position).toString());
           EspacoNome12.setText(cron12.RetornaNome());
           EspacoCpf12.setText(cron12.RetornaCPF());
           EspacoTempoLimt12.setText(cron12.RetornaTempoLimite());
           
       } else if(position == 13  ){
           Display13.setText(listaString.get(position).toString());
           EspacoNome13.setText(cron13.RetornaNome());
           EspacoCpf13.setText(cron13.RetornaCPF());
           EspacoTempoLimt13.setText(cron13.RetornaTempoLimite());
           
       } else if(position == 14  ){
           Display14.setText(listaString.get(position).toString());
           EspacoNome14.setText(cron14.RetornaNome());
           EspacoCpf14.setText(cron14.RetornaCPF());
           EspacoTempoLimt14.setText(cron14.RetornaTempoLimite());
           
       } else if(position == 15  ){
           Display15.setText(listaString.get(position).toString());
           EspacoNome15.setText(cron15.RetornaNome());
           EspacoCpf15.setText(cron15.RetornaCPF());
           EspacoTempoLimt15.setText(cron15.RetornaTempoLimite());
           
       } else if(position == 16  ){
           Display16.setText(listaString.get(position).toString());
           EspacoNome16.setText(cron16.RetornaNome());
           EspacoCpf16.setText(cron16.RetornaCPF());
           EspacoTempoLimt16.setText(cron16.RetornaTempoLimite());
           
       }  else if(position == 17  ){
           Display17.setText(listaString.get(position).toString());
           EspacoNome17.setText(cron18.RetornaNome());
           EspacoCpf17.setText(cron18.RetornaCPF());
           EspacoTempoLimt17.setText(cron18.RetornaTempoLimite());
           
       }else if(position == 18  ){
           Display18.setText(listaString.get(position).toString());
           EspacoNome18.setText(cron18.RetornaNome());
           EspacoCpf18.setText(cron18.RetornaCPF());
           EspacoTempoLimt18.setText(cron18.RetornaTempoLimite());
           
       }else if(position == 19  ){
           Display19.setText(listaString.get(position).toString());
           EspacoNome19.setText(cron19.RetornaNome());
           EspacoCpf19.setText(cron19.RetornaCPF());
           EspacoTempoLimt19.setText(cron19.RetornaTempoLimite());
           
       }
       t.start();
    }
    
    /// Metodo pra atualizar dados
    
    private ActionListener acao = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {    
            Display.setText(cron.toString());
            verificaMuda(0);
            Display1.setText(cron1.toString());
            verificaMuda(1);
            Display2.setText(cron2.toString());
            verificaMuda(2);
            Display3.setText(cron3.toString());
            verificaMuda(3);
            Display4.setText(cron4.toString());
            verificaMuda(4);
            Display5.setText(cron5.toString());
            verificaMuda(5);
            Display6.setText(cron6.toString());
            verificaMuda(6);
            Display7.setText(cron7.toString());
            verificaMuda(7);
            Display8.setText(cron8.toString());
            verificaMuda(8);
            Display9.setText(cron9.toString());
            verificaMuda(9);
            Display10.setText(cron10.toString());
            verificaMuda(10);
            Display11.setText(cron11.toString());
            verificaMuda(11);
            Display12.setText(cron12.toString());
            verificaMuda(12);
            Display13.setText(cron13.toString());
            verificaMuda(13);
            Display14.setText(cron14.toString());
            verificaMuda(14);
            Display15.setText(cron15.toString());
            verificaMuda(15);
            Display16.setText(cron16.toString());
            verificaMuda(16);
            Display17.setText(cron17.toString());
            verificaMuda(17);
            Display18.setText(cron18.toString());
            verificaMuda(18);
            Display19.setText(cron19.toString());
            verificaMuda(19);
        }
    }; 
    public void verificaMuda(int position){
        if(position == 0){
            if(cron.verificaTempo()){
                Painel.setBackground(Color.yellow);
            }else{
                Painel.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 1){
            if(cron1.verificaTempo()){
                Painel1.setBackground(Color.yellow);
            }else{
                Painel1.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 2){
            if(cron2.verificaTempo()){
                Painel2.setBackground(Color.yellow);
            }else{
                Painel2.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 3){
            if(cron3.verificaTempo()){
                Painel3.setBackground(Color.yellow);
            }else{
                Painel3.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 4){
            if(cron4.verificaTempo()){
                Painel4.setBackground(Color.yellow);
            }else{
                Painel4.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 5){
            if(cron5.verificaTempo()){
                Painel5.setBackground(Color.yellow);
            }else{
                Painel5.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 6){
            if(cron6.verificaTempo()){
                Painel6.setBackground(Color.yellow);
            }else{
                Painel6.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 7){
            if(cron7.verificaTempo()){
                Painel7.setBackground(Color.yellow);
            }else{
                Painel7.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 8){
            if(cron8.verificaTempo()){
                Painel8.setBackground(Color.yellow);
            }else{
                Painel8.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 9){
            if(cron9.verificaTempo()){
                Painel9.setBackground(Color.yellow);
            }else{
                Painel9.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 10){
            if(cron10.verificaTempo()){
                Painel10.setBackground(Color.yellow);
            }else{
                Painel10.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 11){
            if(cron11.verificaTempo()){
                Painel11.setBackground(Color.yellow);
            }else{
                Painel11.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 12){
            if(cron12.verificaTempo()){
                Painel12.setBackground(Color.yellow);
            }else{
                Painel12.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 13){
            if(cron13.verificaTempo()){
                Painel13.setBackground(Color.yellow);
            }else{
                Painel13.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 14){
            if(cron14.verificaTempo()){
                Painel14.setBackground(Color.yellow);
            }else{
                Painel14.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 15){
            if(cron15.verificaTempo()){
                Painel15.setBackground(Color.yellow);
            }else{
                Painel15.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 16){
            if(cron16.verificaTempo()){
                Painel16.setBackground(Color.yellow);
            }else{
                Painel16.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 11){
            if(cron17.verificaTempo()){
                Painel17.setBackground(Color.yellow);
            }else{
                Painel17.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 18){
            if(cron11.verificaTempo()){
                Painel18.setBackground(Color.yellow);
            }else{
                Painel18.setBackground(Color.LIGHT_GRAY);
            }
        }
        if(position == 19){
            if(cron19.verificaTempo()){
                Painel19.setBackground(Color.yellow);
            }else{
                Painel19.setBackground(Color.LIGHT_GRAY);
            }
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Painel = new javax.swing.JPanel();
        StartButton = new javax.swing.JButton();
        Display = new javax.swing.JLabel();
        RestartButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonNew = new javax.swing.JButton();
        EspacoCpf = new javax.swing.JLabel();
        EspacoNome = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EspacoTempoLimt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Painel1 = new javax.swing.JPanel();
        StartButton1 = new javax.swing.JButton();
        Display1 = new javax.swing.JLabel();
        RestartButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ButtonNew1 = new javax.swing.JButton();
        EspacoCpf1 = new javax.swing.JLabel();
        EspacoNome1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        EspacoTempoLimt1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Painel2 = new javax.swing.JPanel();
        StartButton2 = new javax.swing.JButton();
        Display2 = new javax.swing.JLabel();
        RestartButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ButtonNew2 = new javax.swing.JButton();
        EspacoCpf2 = new javax.swing.JLabel();
        EspacoNome2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        EspacoTempoLimt2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Painel3 = new javax.swing.JPanel();
        StartButton3 = new javax.swing.JButton();
        Display3 = new javax.swing.JLabel();
        RestartButton3 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ButtonNew3 = new javax.swing.JButton();
        EspacoCpf3 = new javax.swing.JLabel();
        EspacoNome3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        EspacoTempoLimt3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Painel4 = new javax.swing.JPanel();
        StartButton4 = new javax.swing.JButton();
        Display4 = new javax.swing.JLabel();
        RestartButton4 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ButtonNew4 = new javax.swing.JButton();
        EspacoCpf4 = new javax.swing.JLabel();
        EspacoNome4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        EspacoTempoLimt4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Painel5 = new javax.swing.JPanel();
        StartButton5 = new javax.swing.JButton();
        Display5 = new javax.swing.JLabel();
        RestartButton5 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ButtonNew5 = new javax.swing.JButton();
        EspacoCpf5 = new javax.swing.JLabel();
        EspacoNome5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        EspacoTempoLimt5 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Painel6 = new javax.swing.JPanel();
        StartButton6 = new javax.swing.JButton();
        Display6 = new javax.swing.JLabel();
        RestartButton6 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        ButtonNew6 = new javax.swing.JButton();
        EspacoCpf6 = new javax.swing.JLabel();
        EspacoNome6 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        EspacoTempoLimt6 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Painel7 = new javax.swing.JPanel();
        StartButton7 = new javax.swing.JButton();
        Display7 = new javax.swing.JLabel();
        RestartButton7 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        ButtonNew7 = new javax.swing.JButton();
        EspacoCpf7 = new javax.swing.JLabel();
        EspacoNome7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        EspacoTempoLimt7 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Painel8 = new javax.swing.JPanel();
        StartButton8 = new javax.swing.JButton();
        Display8 = new javax.swing.JLabel();
        RestartButton8 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        ButtonNew8 = new javax.swing.JButton();
        EspacoCpf8 = new javax.swing.JLabel();
        EspacoNome8 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        EspacoTempoLimt8 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Painel9 = new javax.swing.JPanel();
        StartButton9 = new javax.swing.JButton();
        Display9 = new javax.swing.JLabel();
        RestartButton9 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        ButtonNew9 = new javax.swing.JButton();
        EspacoCpf9 = new javax.swing.JLabel();
        EspacoNome9 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        EspacoTempoLimt9 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Painel10 = new javax.swing.JPanel();
        StartButton10 = new javax.swing.JButton();
        Display10 = new javax.swing.JLabel();
        RestartButton10 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        ButtonNew10 = new javax.swing.JButton();
        EspacoCpf10 = new javax.swing.JLabel();
        EspacoNome10 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        EspacoTempoLimt10 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        Painel11 = new javax.swing.JPanel();
        StartButton11 = new javax.swing.JButton();
        Display11 = new javax.swing.JLabel();
        RestartButton11 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        ButtonNew11 = new javax.swing.JButton();
        EspacoCpf11 = new javax.swing.JLabel();
        EspacoNome11 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        EspacoTempoLimt11 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Painel12 = new javax.swing.JPanel();
        StartButton12 = new javax.swing.JButton();
        Display12 = new javax.swing.JLabel();
        RestartButton12 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        ButtonNew12 = new javax.swing.JButton();
        EspacoCpf12 = new javax.swing.JLabel();
        EspacoNome12 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        EspacoTempoLimt12 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        Painel13 = new javax.swing.JPanel();
        StartButton13 = new javax.swing.JButton();
        Display13 = new javax.swing.JLabel();
        RestartButton13 = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        ButtonNew13 = new javax.swing.JButton();
        EspacoCpf13 = new javax.swing.JLabel();
        EspacoNome13 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        EspacoTempoLimt13 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        Painel14 = new javax.swing.JPanel();
        StartButton14 = new javax.swing.JButton();
        Display14 = new javax.swing.JLabel();
        RestartButton14 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        ButtonNew14 = new javax.swing.JButton();
        EspacoCpf14 = new javax.swing.JLabel();
        EspacoNome14 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        EspacoTempoLimt14 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        Painel15 = new javax.swing.JPanel();
        StartButton15 = new javax.swing.JButton();
        Display15 = new javax.swing.JLabel();
        RestartButton15 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        ButtonNew15 = new javax.swing.JButton();
        EspacoCpf15 = new javax.swing.JLabel();
        EspacoNome15 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        EspacoTempoLimt15 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        Painel16 = new javax.swing.JPanel();
        StartButton16 = new javax.swing.JButton();
        Display16 = new javax.swing.JLabel();
        RestartButton16 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        ButtonNew16 = new javax.swing.JButton();
        EspacoCpf16 = new javax.swing.JLabel();
        EspacoNome16 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        EspacoTempoLimt16 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        Painel17 = new javax.swing.JPanel();
        StartButton17 = new javax.swing.JButton();
        Display17 = new javax.swing.JLabel();
        RestartButton17 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        ButtonNew17 = new javax.swing.JButton();
        EspacoCpf17 = new javax.swing.JLabel();
        EspacoNome17 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        EspacoTempoLimt17 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        Painel18 = new javax.swing.JPanel();
        StartButton18 = new javax.swing.JButton();
        Display18 = new javax.swing.JLabel();
        RestartButton18 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        ButtonNew18 = new javax.swing.JButton();
        EspacoCpf18 = new javax.swing.JLabel();
        EspacoNome18 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        EspacoTempoLimt18 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        Painel19 = new javax.swing.JPanel();
        StartButton19 = new javax.swing.JButton();
        Display19 = new javax.swing.JLabel();
        RestartButton19 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        ButtonNew19 = new javax.swing.JButton();
        EspacoCpf19 = new javax.swing.JLabel();
        EspacoNome19 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        EspacoTempoLimt19 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        Painel20 = new javax.swing.JPanel();
        StartButton20 = new javax.swing.JButton();
        Display20 = new javax.swing.JLabel();
        RestartButton20 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        ButtonNew20 = new javax.swing.JButton();
        EspacoCpf20 = new javax.swing.JLabel();
        EspacoNome20 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        EspacoTempoLimt20 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel.setBackground(new java.awt.Color(204, 204, 204));

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        Display.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display.setText("00:00:00");

        RestartButton.setText("Restart");
        RestartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        ButtonNew.setText("+");
        ButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNewActionPerformed(evt);
            }
        });

        EspacoCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf.setText("           ");

        EspacoNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome.setText("           ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Tempo:");

        EspacoTempoLimt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt.setText("           ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("min");

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display)
                    .addComponent(RestartButton)
                    .addComponent(StartButton)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(EspacoCpf)
                    .addComponent(EspacoNome)
                    .addComponent(jLabel10)
                    .addComponent(EspacoTempoLimt)
                    .addComponent(ButtonNew)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("CRONOMETROS");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nome Completo Patinador");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("CPF Patinador");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tempo do Patinador");

        Painel1.setBackground(new java.awt.Color(204, 204, 204));

        StartButton1.setText("Start");
        StartButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton1ActionPerformed(evt);
            }
        });

        Display1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display1.setText("00:00:00");

        RestartButton1.setText("Restart");
        RestartButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nome:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("CPF:");

        ButtonNew1.setText("+");
        ButtonNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew1ActionPerformed(evt);
            }
        });

        EspacoCpf1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf1.setText("           ");

        EspacoNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome1.setText("           ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tempo:");

        EspacoTempoLimt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt1.setText("           ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("min");

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton1)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display1)
                    .addComponent(RestartButton1)
                    .addComponent(StartButton1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15)
                    .addComponent(EspacoCpf1)
                    .addComponent(EspacoNome1)
                    .addComponent(jLabel16)
                    .addComponent(EspacoTempoLimt1)
                    .addComponent(ButtonNew1)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        Painel2.setBackground(new java.awt.Color(204, 204, 204));

        StartButton2.setText("Start");
        StartButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton2ActionPerformed(evt);
            }
        });

        Display2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display2.setText("00:00:00");

        RestartButton2.setText("Restart");
        RestartButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Nome:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("CPF:");

        ButtonNew2.setText("+");
        ButtonNew2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew2ActionPerformed(evt);
            }
        });

        EspacoCpf2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf2.setText("           ");

        EspacoNome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome2.setText("           ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Tempo:");

        EspacoTempoLimt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt2.setText("           ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("min");

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton2)
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display2)
                    .addComponent(RestartButton2)
                    .addComponent(StartButton2)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(EspacoCpf2)
                    .addComponent(EspacoNome2)
                    .addComponent(jLabel20)
                    .addComponent(EspacoTempoLimt2)
                    .addComponent(ButtonNew2)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        Painel3.setBackground(new java.awt.Color(204, 204, 204));

        StartButton3.setText("Start");
        StartButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton3ActionPerformed(evt);
            }
        });

        Display3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display3.setText("00:00:00");

        RestartButton3.setText("Restart");
        RestartButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton3ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Nome:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("CPF:");

        ButtonNew3.setText("+");
        ButtonNew3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew3ActionPerformed(evt);
            }
        });

        EspacoCpf3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf3.setText("           ");

        EspacoNome3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome3.setText("           ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Tempo:");

        EspacoTempoLimt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt3.setText("           ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("min");

        javax.swing.GroupLayout Painel3Layout = new javax.swing.GroupLayout(Painel3);
        Painel3.setLayout(Painel3Layout);
        Painel3Layout.setHorizontalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton3)
                .addGap(30, 30, 30)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel3Layout.setVerticalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display3)
                    .addComponent(RestartButton3)
                    .addComponent(StartButton3)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(EspacoCpf3)
                    .addComponent(EspacoNome3)
                    .addComponent(jLabel24)
                    .addComponent(EspacoTempoLimt3)
                    .addComponent(ButtonNew3)
                    .addComponent(jLabel25))
                .addContainerGap())
        );

        Painel4.setBackground(new java.awt.Color(204, 204, 204));

        StartButton4.setText("Start");
        StartButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton4ActionPerformed(evt);
            }
        });

        Display4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display4.setText("00:00:00");

        RestartButton4.setText("Restart");
        RestartButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton4ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Nome:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("CPF:");

        ButtonNew4.setText("+");
        ButtonNew4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew4ActionPerformed(evt);
            }
        });

        EspacoCpf4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf4.setText("           ");

        EspacoNome4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome4.setText("           ");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Tempo:");

        EspacoTempoLimt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt4.setText("           ");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("min");

        javax.swing.GroupLayout Painel4Layout = new javax.swing.GroupLayout(Painel4);
        Painel4.setLayout(Painel4Layout);
        Painel4Layout.setHorizontalGroup(
            Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton4)
                .addGap(30, 30, 30)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel4Layout.setVerticalGroup(
            Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display4)
                    .addComponent(RestartButton4)
                    .addComponent(StartButton4)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(EspacoCpf4)
                    .addComponent(EspacoNome4)
                    .addComponent(jLabel28)
                    .addComponent(EspacoTempoLimt4)
                    .addComponent(ButtonNew4)
                    .addComponent(jLabel29))
                .addContainerGap())
        );

        Painel5.setBackground(new java.awt.Color(204, 204, 204));

        StartButton5.setText("Start");
        StartButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton5ActionPerformed(evt);
            }
        });

        Display5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display5.setText("00:00:00");

        RestartButton5.setText("Restart");
        RestartButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton5ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Nome:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("CPF:");

        ButtonNew5.setText("+");
        ButtonNew5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew5ActionPerformed(evt);
            }
        });

        EspacoCpf5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf5.setText("           ");

        EspacoNome5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome5.setText("           ");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Tempo:");

        EspacoTempoLimt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt5.setText("           ");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("min");

        javax.swing.GroupLayout Painel5Layout = new javax.swing.GroupLayout(Painel5);
        Painel5.setLayout(Painel5Layout);
        Painel5Layout.setHorizontalGroup(
            Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton5)
                .addGap(30, 30, 30)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel5Layout.setVerticalGroup(
            Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display5)
                    .addComponent(RestartButton5)
                    .addComponent(StartButton5)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(EspacoCpf5)
                    .addComponent(EspacoNome5)
                    .addComponent(jLabel32)
                    .addComponent(EspacoTempoLimt5)
                    .addComponent(ButtonNew5)
                    .addComponent(jLabel33))
                .addContainerGap())
        );

        Painel6.setBackground(new java.awt.Color(204, 204, 204));

        StartButton6.setText("Start");
        StartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton6ActionPerformed(evt);
            }
        });

        Display6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display6.setText("00:00:00");

        RestartButton6.setText("Restart");
        RestartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton6ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Nome:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("CPF:");

        ButtonNew6.setText("+");
        ButtonNew6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew6ActionPerformed(evt);
            }
        });

        EspacoCpf6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf6.setText("           ");

        EspacoNome6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome6.setText("           ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Tempo:");

        EspacoTempoLimt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt6.setText("           ");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("min");

        javax.swing.GroupLayout Painel6Layout = new javax.swing.GroupLayout(Painel6);
        Painel6.setLayout(Painel6Layout);
        Painel6Layout.setHorizontalGroup(
            Painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton6)
                .addGap(30, 30, 30)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel6Layout.setVerticalGroup(
            Painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display6)
                    .addComponent(RestartButton6)
                    .addComponent(StartButton6)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(EspacoCpf6)
                    .addComponent(EspacoNome6)
                    .addComponent(jLabel36)
                    .addComponent(EspacoTempoLimt6)
                    .addComponent(ButtonNew6)
                    .addComponent(jLabel37))
                .addContainerGap())
        );

        Painel7.setBackground(new java.awt.Color(204, 204, 204));

        StartButton7.setText("Start");
        StartButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton7ActionPerformed(evt);
            }
        });

        Display7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display7.setText("00:00:00");

        RestartButton7.setText("Restart");
        RestartButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton7ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Nome:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("CPF:");

        ButtonNew7.setText("+");
        ButtonNew7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew7ActionPerformed(evt);
            }
        });

        EspacoCpf7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf7.setText("           ");

        EspacoNome7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome7.setText("           ");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Tempo:");

        EspacoTempoLimt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt7.setText("           ");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("min");

        javax.swing.GroupLayout Painel7Layout = new javax.swing.GroupLayout(Painel7);
        Painel7.setLayout(Painel7Layout);
        Painel7Layout.setHorizontalGroup(
            Painel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton7)
                .addGap(30, 30, 30)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel7Layout.setVerticalGroup(
            Painel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display7)
                    .addComponent(RestartButton7)
                    .addComponent(StartButton7)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(EspacoCpf7)
                    .addComponent(EspacoNome7)
                    .addComponent(jLabel40)
                    .addComponent(EspacoTempoLimt7)
                    .addComponent(ButtonNew7)
                    .addComponent(jLabel41))
                .addContainerGap())
        );

        Painel8.setBackground(new java.awt.Color(204, 204, 204));

        StartButton8.setText("Start");
        StartButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton8ActionPerformed(evt);
            }
        });

        Display8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display8.setText("00:00:00");

        RestartButton8.setText("Restart");
        RestartButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton8ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Nome:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("CPF:");

        ButtonNew8.setText("+");
        ButtonNew8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew8ActionPerformed(evt);
            }
        });

        EspacoCpf8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf8.setText("           ");

        EspacoNome8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome8.setText("           ");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Tempo:");

        EspacoTempoLimt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt8.setText("           ");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("min");

        javax.swing.GroupLayout Painel8Layout = new javax.swing.GroupLayout(Painel8);
        Painel8.setLayout(Painel8Layout);
        Painel8Layout.setHorizontalGroup(
            Painel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton8)
                .addGap(30, 30, 30)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel8Layout.setVerticalGroup(
            Painel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display8)
                    .addComponent(RestartButton8)
                    .addComponent(StartButton8)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(EspacoCpf8)
                    .addComponent(EspacoNome8)
                    .addComponent(jLabel44)
                    .addComponent(EspacoTempoLimt8)
                    .addComponent(ButtonNew8)
                    .addComponent(jLabel45))
                .addContainerGap())
        );

        Painel9.setBackground(new java.awt.Color(204, 204, 204));

        StartButton9.setText("Start");
        StartButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton9ActionPerformed(evt);
            }
        });

        Display9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display9.setText("00:00:00");

        RestartButton9.setText("Restart");
        RestartButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton9ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Nome:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("CPF:");

        ButtonNew9.setText("+");
        ButtonNew9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew9ActionPerformed(evt);
            }
        });

        EspacoCpf9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf9.setText("           ");

        EspacoNome9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome9.setText("           ");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Tempo:");

        EspacoTempoLimt9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt9.setText("           ");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("min");

        javax.swing.GroupLayout Painel9Layout = new javax.swing.GroupLayout(Painel9);
        Painel9.setLayout(Painel9Layout);
        Painel9Layout.setHorizontalGroup(
            Painel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton9)
                .addGap(30, 30, 30)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome9, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel9Layout.setVerticalGroup(
            Painel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display9)
                    .addComponent(RestartButton9)
                    .addComponent(StartButton9)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(EspacoCpf9)
                    .addComponent(EspacoNome9)
                    .addComponent(jLabel48)
                    .addComponent(EspacoTempoLimt9)
                    .addComponent(ButtonNew9)
                    .addComponent(jLabel49))
                .addContainerGap())
        );

        Painel10.setBackground(new java.awt.Color(204, 204, 204));

        StartButton10.setText("Start");
        StartButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton10ActionPerformed(evt);
            }
        });

        Display10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display10.setText("00:00:00");

        RestartButton10.setText("Restart");
        RestartButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton10ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Nome:");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("CPF:");

        ButtonNew10.setText("+");
        ButtonNew10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew10ActionPerformed(evt);
            }
        });

        EspacoCpf10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf10.setText("           ");

        EspacoNome10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome10.setText("           ");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Tempo:");

        EspacoTempoLimt10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt10.setText("           ");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("min");

        javax.swing.GroupLayout Painel10Layout = new javax.swing.GroupLayout(Painel10);
        Painel10.setLayout(Painel10Layout);
        Painel10Layout.setHorizontalGroup(
            Painel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton10)
                .addGap(30, 30, 30)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome10, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf10, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel10Layout.setVerticalGroup(
            Painel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display10)
                    .addComponent(RestartButton10)
                    .addComponent(StartButton10)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(EspacoCpf10)
                    .addComponent(EspacoNome10)
                    .addComponent(jLabel52)
                    .addComponent(EspacoTempoLimt10)
                    .addComponent(ButtonNew10)
                    .addComponent(jLabel53))
                .addContainerGap())
        );

        Painel11.setBackground(new java.awt.Color(204, 204, 204));

        StartButton11.setText("Start");
        StartButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton11ActionPerformed(evt);
            }
        });

        Display11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display11.setText("00:00:00");

        RestartButton11.setText("Restart");
        RestartButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton11ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Nome:");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("CPF:");

        ButtonNew11.setText("+");
        ButtonNew11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew11ActionPerformed(evt);
            }
        });

        EspacoCpf11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf11.setText("           ");

        EspacoNome11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome11.setText("           ");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Tempo:");

        EspacoTempoLimt11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt11.setText("           ");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("min");

        javax.swing.GroupLayout Painel11Layout = new javax.swing.GroupLayout(Painel11);
        Painel11.setLayout(Painel11Layout);
        Painel11Layout.setHorizontalGroup(
            Painel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton11)
                .addGap(30, 30, 30)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome11, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf11, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel11Layout.setVerticalGroup(
            Painel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display11)
                    .addComponent(RestartButton11)
                    .addComponent(StartButton11)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)
                    .addComponent(EspacoCpf11)
                    .addComponent(EspacoNome11)
                    .addComponent(jLabel56)
                    .addComponent(EspacoTempoLimt11)
                    .addComponent(ButtonNew11)
                    .addComponent(jLabel57))
                .addContainerGap())
        );

        Painel12.setBackground(new java.awt.Color(204, 204, 204));

        StartButton12.setText("Start");
        StartButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton12ActionPerformed(evt);
            }
        });

        Display12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display12.setText("00:00:00");

        RestartButton12.setText("Restart");
        RestartButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton12ActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("Nome:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("CPF:");

        ButtonNew12.setText("+");
        ButtonNew12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew12ActionPerformed(evt);
            }
        });

        EspacoCpf12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf12.setText("           ");

        EspacoNome12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome12.setText("           ");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("Tempo:");

        EspacoTempoLimt12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt12.setText("           ");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("min");

        javax.swing.GroupLayout Painel12Layout = new javax.swing.GroupLayout(Painel12);
        Painel12.setLayout(Painel12Layout);
        Painel12Layout.setHorizontalGroup(
            Painel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton12)
                .addGap(30, 30, 30)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome12, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf12, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel12Layout.setVerticalGroup(
            Painel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display12)
                    .addComponent(RestartButton12)
                    .addComponent(StartButton12)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(EspacoCpf12)
                    .addComponent(EspacoNome12)
                    .addComponent(jLabel60)
                    .addComponent(EspacoTempoLimt12)
                    .addComponent(ButtonNew12)
                    .addComponent(jLabel61))
                .addContainerGap())
        );

        Painel13.setBackground(new java.awt.Color(204, 204, 204));

        StartButton13.setText("Start");
        StartButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton13ActionPerformed(evt);
            }
        });

        Display13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display13.setText("00:00:00");

        RestartButton13.setText("Restart");
        RestartButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton13ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("Nome:");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("CPF:");

        ButtonNew13.setText("+");
        ButtonNew13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew13ActionPerformed(evt);
            }
        });

        EspacoCpf13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf13.setText("           ");

        EspacoNome13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome13.setText("           ");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Tempo:");

        EspacoTempoLimt13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt13.setText("           ");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("min");

        javax.swing.GroupLayout Painel13Layout = new javax.swing.GroupLayout(Painel13);
        Painel13.setLayout(Painel13Layout);
        Painel13Layout.setHorizontalGroup(
            Painel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton13)
                .addGap(30, 30, 30)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome13, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf13, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel13Layout.setVerticalGroup(
            Painel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display13)
                    .addComponent(RestartButton13)
                    .addComponent(StartButton13)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(EspacoCpf13)
                    .addComponent(EspacoNome13)
                    .addComponent(jLabel64)
                    .addComponent(EspacoTempoLimt13)
                    .addComponent(ButtonNew13)
                    .addComponent(jLabel65))
                .addContainerGap())
        );

        Painel14.setBackground(new java.awt.Color(204, 204, 204));

        StartButton14.setText("Start");
        StartButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton14ActionPerformed(evt);
            }
        });

        Display14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display14.setText("00:00:00");

        RestartButton14.setText("Restart");
        RestartButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton14ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("Nome:");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("CPF:");

        ButtonNew14.setText("+");
        ButtonNew14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew14ActionPerformed(evt);
            }
        });

        EspacoCpf14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf14.setText("           ");

        EspacoNome14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome14.setText("           ");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("Tempo:");

        EspacoTempoLimt14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt14.setText("           ");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("min");

        javax.swing.GroupLayout Painel14Layout = new javax.swing.GroupLayout(Painel14);
        Painel14.setLayout(Painel14Layout);
        Painel14Layout.setHorizontalGroup(
            Painel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton14)
                .addGap(30, 30, 30)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome14, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf14, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel14Layout.setVerticalGroup(
            Painel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display14)
                    .addComponent(RestartButton14)
                    .addComponent(StartButton14)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67)
                    .addComponent(EspacoCpf14)
                    .addComponent(EspacoNome14)
                    .addComponent(jLabel68)
                    .addComponent(EspacoTempoLimt14)
                    .addComponent(ButtonNew14)
                    .addComponent(jLabel69))
                .addContainerGap())
        );

        Painel15.setBackground(new java.awt.Color(204, 204, 204));

        StartButton15.setText("Start");
        StartButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton15ActionPerformed(evt);
            }
        });

        Display15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display15.setText("00:00:00");

        RestartButton15.setText("Restart");
        RestartButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton15ActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setText("Nome:");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setText("CPF:");

        ButtonNew15.setText("+");
        ButtonNew15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew15ActionPerformed(evt);
            }
        });

        EspacoCpf15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf15.setText("           ");

        EspacoNome15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome15.setText("           ");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setText("Tempo:");

        EspacoTempoLimt15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt15.setText("           ");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("min");

        javax.swing.GroupLayout Painel15Layout = new javax.swing.GroupLayout(Painel15);
        Painel15.setLayout(Painel15Layout);
        Painel15Layout.setHorizontalGroup(
            Painel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton15)
                .addGap(30, 30, 30)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome15, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf15, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel15Layout.setVerticalGroup(
            Painel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display15)
                    .addComponent(RestartButton15)
                    .addComponent(StartButton15)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(EspacoCpf15)
                    .addComponent(EspacoNome15)
                    .addComponent(jLabel72)
                    .addComponent(EspacoTempoLimt15)
                    .addComponent(ButtonNew15)
                    .addComponent(jLabel73))
                .addContainerGap())
        );

        Painel16.setBackground(new java.awt.Color(204, 204, 204));

        StartButton16.setText("Start");
        StartButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton16ActionPerformed(evt);
            }
        });

        Display16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display16.setText("00:00:00");

        RestartButton16.setText("Restart");
        RestartButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton16ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setText("Nome:");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("CPF:");

        ButtonNew16.setText("+");
        ButtonNew16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew16ActionPerformed(evt);
            }
        });

        EspacoCpf16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf16.setText("           ");

        EspacoNome16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome16.setText("           ");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Tempo:");

        EspacoTempoLimt16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt16.setText("           ");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel77.setText("min");

        javax.swing.GroupLayout Painel16Layout = new javax.swing.GroupLayout(Painel16);
        Painel16.setLayout(Painel16Layout);
        Painel16Layout.setHorizontalGroup(
            Painel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton16)
                .addGap(30, 30, 30)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome16, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf16, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel16Layout.setVerticalGroup(
            Painel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display16)
                    .addComponent(RestartButton16)
                    .addComponent(StartButton16)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75)
                    .addComponent(EspacoCpf16)
                    .addComponent(EspacoNome16)
                    .addComponent(jLabel76)
                    .addComponent(EspacoTempoLimt16)
                    .addComponent(ButtonNew16)
                    .addComponent(jLabel77))
                .addContainerGap())
        );

        Painel17.setBackground(new java.awt.Color(204, 204, 204));

        StartButton17.setText("Start");
        StartButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton17ActionPerformed(evt);
            }
        });

        Display17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display17.setText("00:00:00");

        RestartButton17.setText("Restart");
        RestartButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton17ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("Nome:");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("CPF:");

        ButtonNew17.setText("+");
        ButtonNew17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew17ActionPerformed(evt);
            }
        });

        EspacoCpf17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf17.setText("           ");

        EspacoNome17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome17.setText("           ");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Tempo:");

        EspacoTempoLimt17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt17.setText("           ");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel81.setText("min");

        javax.swing.GroupLayout Painel17Layout = new javax.swing.GroupLayout(Painel17);
        Painel17.setLayout(Painel17Layout);
        Painel17Layout.setHorizontalGroup(
            Painel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton17)
                .addGap(30, 30, 30)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome17, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf17, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel17Layout.setVerticalGroup(
            Painel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display17)
                    .addComponent(RestartButton17)
                    .addComponent(StartButton17)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79)
                    .addComponent(EspacoCpf17)
                    .addComponent(EspacoNome17)
                    .addComponent(jLabel80)
                    .addComponent(EspacoTempoLimt17)
                    .addComponent(ButtonNew17)
                    .addComponent(jLabel81))
                .addContainerGap())
        );

        Painel18.setBackground(new java.awt.Color(204, 204, 204));

        StartButton18.setText("Start");
        StartButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton18ActionPerformed(evt);
            }
        });

        Display18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display18.setText("00:00:00");

        RestartButton18.setText("Restart");
        RestartButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton18ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setText("Nome:");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel83.setText("CPF:");

        ButtonNew18.setText("+");
        ButtonNew18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew18ActionPerformed(evt);
            }
        });

        EspacoCpf18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf18.setText("           ");

        EspacoNome18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome18.setText("           ");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("Tempo:");

        EspacoTempoLimt18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt18.setText("           ");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel85.setText("min");

        javax.swing.GroupLayout Painel18Layout = new javax.swing.GroupLayout(Painel18);
        Painel18.setLayout(Painel18Layout);
        Painel18Layout.setHorizontalGroup(
            Painel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton18)
                .addGap(30, 30, 30)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome18, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf18, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel85)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel18Layout.setVerticalGroup(
            Painel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display18)
                    .addComponent(RestartButton18)
                    .addComponent(StartButton18)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83)
                    .addComponent(EspacoCpf18)
                    .addComponent(EspacoNome18)
                    .addComponent(jLabel84)
                    .addComponent(EspacoTempoLimt18)
                    .addComponent(ButtonNew18)
                    .addComponent(jLabel85))
                .addContainerGap())
        );

        Painel19.setBackground(new java.awt.Color(204, 204, 204));

        StartButton19.setText("Start");
        StartButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton19ActionPerformed(evt);
            }
        });

        Display19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display19.setText("00:00:00");

        RestartButton19.setText("Restart");
        RestartButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton19ActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("Nome:");

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel87.setText("CPF:");

        ButtonNew19.setText("+");
        ButtonNew19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew19ActionPerformed(evt);
            }
        });

        EspacoCpf19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf19.setText("           ");

        EspacoNome19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome19.setText("           ");

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel88.setText("Tempo:");

        EspacoTempoLimt19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt19.setText("           ");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel89.setText("min");

        javax.swing.GroupLayout Painel19Layout = new javax.swing.GroupLayout(Painel19);
        Painel19.setLayout(Painel19Layout);
        Painel19Layout.setHorizontalGroup(
            Painel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton19)
                .addGap(30, 30, 30)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome19, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf19, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel19Layout.setVerticalGroup(
            Painel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display19)
                    .addComponent(RestartButton19)
                    .addComponent(StartButton19)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addComponent(EspacoCpf19)
                    .addComponent(EspacoNome19)
                    .addComponent(jLabel88)
                    .addComponent(EspacoTempoLimt19)
                    .addComponent(ButtonNew19)
                    .addComponent(jLabel89))
                .addContainerGap())
        );

        Painel20.setBackground(new java.awt.Color(204, 204, 204));

        StartButton20.setText("Start");
        StartButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton20ActionPerformed(evt);
            }
        });

        Display20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Display20.setText("00:00:00");

        RestartButton20.setText("Restart");
        RestartButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButton20ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setText("Nome:");

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setText("CPF:");

        ButtonNew20.setText("+");
        ButtonNew20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNew20ActionPerformed(evt);
            }
        });

        EspacoCpf20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoCpf20.setText("           ");

        EspacoNome20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoNome20.setText("           ");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setText("Tempo:");

        EspacoTempoLimt20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EspacoTempoLimt20.setText("           ");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel93.setText("min");

        javax.swing.GroupLayout Painel20Layout = new javax.swing.GroupLayout(Painel20);
        Painel20.setLayout(Painel20Layout);
        Painel20Layout.setHorizontalGroup(
            Painel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StartButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton20)
                .addGap(30, 30, 30)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoNome20, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EspacoCpf20, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EspacoTempoLimt20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addGap(47, 47, 47)
                .addComponent(ButtonNew20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel20Layout.setVerticalGroup(
            Painel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Display20)
                    .addComponent(RestartButton20)
                    .addComponent(StartButton20)
                    .addComponent(jLabel90)
                    .addComponent(jLabel91)
                    .addComponent(EspacoCpf20)
                    .addComponent(EspacoNome20)
                    .addComponent(jLabel92)
                    .addComponent(EspacoTempoLimt20)
                    .addComponent(ButtonNew20)
                    .addComponent(jLabel93))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(Painel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane5.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 476, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cronometros", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Descriçao do Patins:");

        jButton1.setText("Cadastrar Novo Patins");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Patins", jPanel3);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tabelamin.JPG"))); // NOI18N

        jLabel12.setText("* Observação: ");

        jLabel13.setText("Quando adicionar um novo patinador utilize os valores da coluna minutos da tabela acima para definir ");

        jLabel14.setText("o tempo que o patinador irá ficar com o patin ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))))
                .addContainerGap(647, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabela de Minutos", jPanel5);

        jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Botão cadastra patins
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
//Botão painel 01
    private void ButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNewActionPerformed
            
        String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 0);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome.setText(cron.RetornaNome());
        EspacoCpf.setText(cron.RetornaCPF());
        EspacoTempoLimt.setText(aux);
        
        cron.IsRunning();
        if(StartButton.getText().equals("Stop")){
            StartButton.setText("Start");
        }
    
        Display.setText(cron.toString());
        Painel.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNewActionPerformed

    private void RestartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButtonActionPerformed
        // TODO add your handling code here:
        cron.IsRunning();
        
        if(StartButton.getText().equals("Stop")){
            StartButton.setText("Start");
        }
        
        
        Display.setText(cron.toString());

    }//GEN-LAST:event_RestartButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:

        if(StartButton.getText().equals("Start")){
            StartButton.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron.Start();
            }else{
                cron.Restart();
            }

        }else{
            StartButton.setText("Start");
            cron.Stop();
        }

        //System.out.println(listaString.get(0).toString());

    }//GEN-LAST:event_StartButtonActionPerformed

    private void StartButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton1ActionPerformed
        // TODO add your handling code here:
        if(StartButton1.getText().equals("Start")){
            StartButton1.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron1.Start();
            }else{
                cron1.Restart();
            }

        }else{
            StartButton1.setText("Start");
            cron1.Stop();
        }
    }//GEN-LAST:event_StartButton1ActionPerformed

    private void RestartButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton1ActionPerformed
        // TODO add your handling code here:
        cron1.IsRunning();
        
        if(StartButton1.getText().equals("Stop")){
            StartButton1.setText("Start");
        }
        
        
        Display1.setText(cron1.toString());
    }//GEN-LAST:event_RestartButton1ActionPerformed

    private void ButtonNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew1ActionPerformed
        // TODO add your handling code here:
        String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron1.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 1);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome1.setText(cron1.RetornaNome());
        EspacoCpf1.setText(cron1.RetornaCPF());
        EspacoTempoLimt1.setText(aux);
        
        cron1.IsRunning();
        if(StartButton1.getText().equals("Stop")){
            StartButton1.setText("Start");
        }
    
        Display1.setText(cron1.toString());
        Painel1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew1ActionPerformed

    private void StartButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton2ActionPerformed
        // TODO add your handling code here:
        if(StartButton2.getText().equals("Start")){
            StartButton2.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron2.Start();
            }else{
                cron2.Restart();
            }

        }else{
            StartButton2.setText("Start");
            cron2.Stop();
        }
    }//GEN-LAST:event_StartButton2ActionPerformed

    private void RestartButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton2ActionPerformed
        // TODO add your handling code here:
        cron2.IsRunning();
        
        if(StartButton2.getText().equals("Stop")){
            StartButton2.setText("Start");
        }
        
        
        Display2.setText(cron2.toString());
    }//GEN-LAST:event_RestartButton2ActionPerformed

    private void ButtonNew2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew2ActionPerformed
        // TODO add your handling code here:
        String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron2.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 2);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome2.setText(cron2.RetornaNome());
        EspacoCpf2.setText(cron2.RetornaCPF());
        EspacoTempoLimt2.setText(aux);
        
        cron2.IsRunning();
        if(StartButton2.getText().equals("Stop")){
            StartButton2.setText("Start");
        }
    
        Display2.setText(cron2.toString());
        Painel2.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew2ActionPerformed

    private void StartButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton3ActionPerformed
        // TODO add your handling code here:
        if(StartButton3.getText().equals("Start")){
            StartButton3.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron3.Start();
            }else{
                cron3.Restart();
            }

        }else{
            StartButton3.setText("Start");
            cron3.Stop();
        }
    }//GEN-LAST:event_StartButton3ActionPerformed

    private void RestartButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton3ActionPerformed
        // TODO add your handling code here:
        cron3.IsRunning();
        
        if(StartButton3.getText().equals("Stop")){
            StartButton3.setText("Start");
        }
        
        
        Display3.setText(cron3.toString());
    }//GEN-LAST:event_RestartButton3ActionPerformed

    private void ButtonNew3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew3ActionPerformed
        // TODO add your handling code here:
        String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron3.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 3);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome3.setText(cron3.RetornaNome());
        EspacoCpf3.setText(cron3.RetornaCPF());
        EspacoTempoLimt3.setText(aux);
        
        cron3.IsRunning();
        if(StartButton3.getText().equals("Stop")){
            StartButton3.setText("Start");
        }
    
        Display3.setText(cron3.toString());
        Painel3.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew3ActionPerformed

    private void StartButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton4ActionPerformed
        // TODO add your handling code here:
        if(StartButton4.getText().equals("Start")){
            StartButton4.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron4.Start();
            }else{
                cron4.Restart();
            }

        }else{
            StartButton4.setText("Start");
            cron4.Stop();
        }
    }//GEN-LAST:event_StartButton4ActionPerformed

    private void RestartButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton4ActionPerformed
        // TODO add your handling code here:
        cron4.IsRunning();
        
        if(StartButton4.getText().equals("Stop")){
            StartButton4.setText("Start");
        }
        
        
        Display4.setText(cron4.toString());
    }//GEN-LAST:event_RestartButton4ActionPerformed

    private void ButtonNew4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew4ActionPerformed
        // TODO add your handling code here:
        String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron4.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 4);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome4.setText(cron4.RetornaNome());
        EspacoCpf4.setText(cron4.RetornaCPF());
        EspacoTempoLimt4.setText(aux);
        
        cron4.IsRunning();
        if(StartButton4.getText().equals("Stop")){
            StartButton4.setText("Start");
        }
    
        Display4.setText(cron4.toString());
        Painel4.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew4ActionPerformed

    private void StartButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton5ActionPerformed
        // TODO add your handling code here:
        
        if(StartButton5.getText().equals("Start")){
            StartButton5.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron5.Start();
            }else{
                cron5.Restart();
            }

        }else{
            StartButton5.setText("Start");
            cron5.Stop();
        }
        
    }//GEN-LAST:event_StartButton5ActionPerformed

    private void RestartButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton5ActionPerformed
        // TODO add your handling code here:
        cron5.IsRunning();
        
        if(StartButton5.getText().equals("Stop")){
            StartButton5.setText("Start");
        }
        
        
        Display5.setText(cron5.toString());
    }//GEN-LAST:event_RestartButton5ActionPerformed

    private void ButtonNew5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew5ActionPerformed
        // TODO add your handling code here:String aux = null;
        String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron5.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 5);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome5.setText(cron5.RetornaNome());
        EspacoCpf5.setText(cron5.RetornaCPF());
        EspacoTempoLimt5.setText(aux);
        
        cron5.IsRunning();
        if(StartButton5.getText().equals("Stop")){
            StartButton5.setText("Start");
        }
    
        Display5.setText(cron5.toString());
        Painel5.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_ButtonNew5ActionPerformed

    private void StartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton6ActionPerformed
        // TODO add your handling code here:
        if(StartButton6.getText().equals("Start")){
            StartButton6.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron6.Start();
            }else{
                cron6.Restart();
            }

        }else{
            StartButton6.setText("Start");
            cron6.Stop();
        }
    }//GEN-LAST:event_StartButton6ActionPerformed

    private void RestartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton6ActionPerformed
        // TODO add your handling code here:
        cron6.IsRunning();
        
        if(StartButton6.getText().equals("Stop")){
            StartButton6.setText("Start");
        }
        
        
        Display6.setText(cron6.toString());
    }//GEN-LAST:event_RestartButton6ActionPerformed

    private void ButtonNew6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew6ActionPerformed
        // TODO add your handling code here:
        String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron6.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 6);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome6.setText(cron6.RetornaNome());
        EspacoCpf6.setText(cron6.RetornaCPF());
        EspacoTempoLimt6.setText(aux);
        
        cron.IsRunning();
        if(StartButton6.getText().equals("Stop")){
            StartButton6.setText("Start");
        }
    
        Display6.setText(cron6.toString());
        Painel6.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew6ActionPerformed

    private void StartButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton7ActionPerformed
        // TODO add your handling code here:
        if(StartButton7.getText().equals("Start")){
            StartButton7.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron7.Start();
            }else{
                cron7.Restart();
            }

        }else{
            StartButton7.setText("Start");
            cron7.Stop();
        }
    }//GEN-LAST:event_StartButton7ActionPerformed

    private void RestartButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton7ActionPerformed
        // TODO add your handling code here:
        cron7.IsRunning();
        
        if(StartButton7.getText().equals("Stop")){
            StartButton7.setText("Start");
        }
        
        
        Display7.setText(cron7.toString());
    }//GEN-LAST:event_RestartButton7ActionPerformed

    private void ButtonNew7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew7ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron7.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 7);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome7.setText(cron7.RetornaNome());
        EspacoCpf7.setText(cron7.RetornaCPF());
        EspacoTempoLimt7.setText(aux);
        
        cron7.IsRunning();
        if(StartButton7.getText().equals("Stop")){
            StartButton7.setText("Start");
        }
    
        Display7.setText(cron7.toString());
        Painel7.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew7ActionPerformed

    private void StartButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton8ActionPerformed
        // TODO add your handling code here:
        if(StartButton8.getText().equals("Start")){
            StartButton8.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron8.Start();
            }else{
                cron8.Restart();
            }

        }else{
            StartButton8.setText("Start");
            cron8.Stop();
        }
    }//GEN-LAST:event_StartButton8ActionPerformed

    private void RestartButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton8ActionPerformed
        // TODO add your handling code here:
        cron8.IsRunning();
        
        if(StartButton8.getText().equals("Stop")){
            StartButton8.setText("Start");
        }
        
        
        Display8.setText(cron8.toString());
    }//GEN-LAST:event_RestartButton8ActionPerformed

    private void ButtonNew8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew8ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron8.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 8);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome8.setText(cron8.RetornaNome());
        EspacoCpf8.setText(cron8.RetornaCPF());
        EspacoTempoLimt8.setText(aux);
        
        cron8.IsRunning();
        if(StartButton8.getText().equals("Stop")){
            StartButton8.setText("Start");
        }
    
        Display8.setText(cron8.toString());
        Painel8.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew8ActionPerformed

    private void StartButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton9ActionPerformed
        // TODO add your handling code here:
        if(StartButton9.getText().equals("Start")){
            StartButton9.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron9.Start();
            }else{
                cron9.Restart();
            }

        }else{
            StartButton9.setText("Start");
            cron9.Stop();
        }
    }//GEN-LAST:event_StartButton9ActionPerformed

    private void RestartButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton9ActionPerformed
        // TODO add your handling code here:
        cron9.IsRunning();
        
        if(StartButton9.getText().equals("Stop")){
            StartButton9.setText("Start");
        }
        
        
        Display9.setText(cron9.toString());
    }//GEN-LAST:event_RestartButton9ActionPerformed

    private void ButtonNew9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew9ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron9.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 9);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome9.setText(cron9.RetornaNome());
        EspacoCpf9.setText(cron9.RetornaCPF());
        EspacoTempoLimt9.setText(aux);
        
        cron9.IsRunning();
        if(StartButton9.getText().equals("Stop")){
            StartButton9.setText("Start");
        }
    
        Display9.setText(cron9.toString());
        Painel9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew9ActionPerformed

    private void StartButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton10ActionPerformed
        // TODO add your handling code here:
        if(StartButton10.getText().equals("Start")){
            StartButton10.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron10.Start();
            }else{
                cron10.Restart();
            }

        }else{
            StartButton10.setText("Start");
            cron10.Stop();
        }
    }//GEN-LAST:event_StartButton10ActionPerformed

    private void RestartButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton10ActionPerformed
        // TODO add your handling code here:
         cron10.IsRunning();
        
        if(StartButton10.getText().equals("Stop")){
            StartButton10.setText("Start");
        }
        
        
        Display10.setText(cron10.toString());
    }//GEN-LAST:event_RestartButton10ActionPerformed

    private void ButtonNew10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew10ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron10.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 10);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome10.setText(cron10.RetornaNome());
        EspacoCpf10.setText(cron10.RetornaCPF());
        EspacoTempoLimt10.setText(aux);
        
        cron10.IsRunning();
        if(StartButton10.getText().equals("Stop")){
            StartButton10.setText("Start");
        }
    
        Display10.setText(cron10.toString());
        Painel10.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew10ActionPerformed

    private void StartButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton11ActionPerformed
        // TODO add your handling code here:
        if(StartButton11.getText().equals("Start")){
            StartButton11.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron11.Start();
            }else{
                cron11.Restart();
            }

        }else{
            StartButton11.setText("Start");
            cron11.Stop();
        }
    }//GEN-LAST:event_StartButton11ActionPerformed

    private void RestartButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton11ActionPerformed
        // TODO add your handling code here:
         cron11.IsRunning();
        
        if(StartButton11.getText().equals("Stop")){
            StartButton11.setText("Start");
        }
        
        
        Display11.setText(cron11.toString());
    }//GEN-LAST:event_RestartButton11ActionPerformed

    private void ButtonNew11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew11ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron11.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 11);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome11.setText(cron11.RetornaNome());
        EspacoCpf11.setText(cron11.RetornaCPF());
        EspacoTempoLimt11.setText(aux);
        
        cron11.IsRunning();
        if(StartButton11.getText().equals("Stop")){
            StartButton11.setText("Start");
        }
    
        Display11.setText(cron11.toString());
        Painel11.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew11ActionPerformed

    private void StartButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton12ActionPerformed
        // TODO add your handling code here:
        if(StartButton12.getText().equals("Start")){
            StartButton12.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron12.Start();
            }else{
                cron12.Restart();
            }

        }else{
            StartButton12.setText("Start");
            cron12.Stop();
        }
    }//GEN-LAST:event_StartButton12ActionPerformed

    private void RestartButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton12ActionPerformed
        // TODO add your handling code here:
         cron12.IsRunning();
        
        if(StartButton12.getText().equals("Stop")){
            StartButton12.setText("Start");
        }
        
        
        Display12.setText(cron12.toString());
    }//GEN-LAST:event_RestartButton12ActionPerformed

    private void ButtonNew12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew12ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron12.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 12);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome12.setText(cron12.RetornaNome());
        EspacoCpf12.setText(cron12.RetornaCPF());
        EspacoTempoLimt12.setText(aux);
        
        cron12.IsRunning();
        if(StartButton12.getText().equals("Stop")){
            StartButton12.setText("Start");
        }
    
        Display12.setText(cron12.toString());
        Painel12.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew12ActionPerformed

    private void StartButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton13ActionPerformed
        // TODO add your handling code here:
        if(StartButton13.getText().equals("Start")){
            StartButton13.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron13.Start();
            }else{
                cron13.Restart();
            }

        }else{
            StartButton13.setText("Start");
            cron13.Stop();
        }
    }//GEN-LAST:event_StartButton13ActionPerformed

    private void RestartButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton13ActionPerformed
        // TODO add your handling code here:
         cron13.IsRunning();
        
        if(StartButton13.getText().equals("Stop")){
            StartButton13.setText("Start");
        }
        
        
        Display13.setText(cron13.toString());
    }//GEN-LAST:event_RestartButton13ActionPerformed

    private void ButtonNew13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew13ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron13.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 13);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome13.setText(cron13.RetornaNome());
        EspacoCpf13.setText(cron13.RetornaCPF());
        EspacoTempoLimt13.setText(aux);
        
        cron13.IsRunning();
        if(StartButton13.getText().equals("Stop")){
            StartButton13.setText("Start");
        }
    
        Display13.setText(cron13.toString());
        Painel13.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew13ActionPerformed

    private void StartButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton14ActionPerformed
        // TODO add your handling code here:
        if(StartButton14.getText().equals("Start")){
            StartButton14.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron14.Start();
            }else{
                cron14.Restart();
            }

        }else{
            StartButton14.setText("Start");
            cron14.Stop();
        }
    }//GEN-LAST:event_StartButton14ActionPerformed

    private void RestartButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton14ActionPerformed
        // TODO add your handling code here:
         cron14.IsRunning();
        
        if(StartButton14.getText().equals("Stop")){
            StartButton14.setText("Start");
        }
        
        
        Display14.setText(cron14.toString());
    }//GEN-LAST:event_RestartButton14ActionPerformed

    private void ButtonNew14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew14ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron14.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 14);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome14.setText(cron14.RetornaNome());
        EspacoCpf14.setText(cron14.RetornaCPF());
        EspacoTempoLimt14.setText(aux);
        
        cron14.IsRunning();
        if(StartButton14.getText().equals("Stop")){
            StartButton14.setText("Start");
        }
    
        Display14.setText(cron14.toString());
        Painel14.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew14ActionPerformed

    private void StartButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton15ActionPerformed
        // TODO add your handling code here:
        if(StartButton15.getText().equals("Start")){
            StartButton15.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron15.Start();
            }else{
                cron15.Restart();
            }

        }else{
            StartButton15.setText("Start");
            cron15.Stop();
        }
    }//GEN-LAST:event_StartButton15ActionPerformed

    private void RestartButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton15ActionPerformed
        // TODO add your handling code here:
         cron15.IsRunning();
        
        if(StartButton15.getText().equals("Stop")){
            StartButton15.setText("Start");
        }
        
        
        Display15.setText(cron15.toString());
    }//GEN-LAST:event_RestartButton15ActionPerformed

    private void ButtonNew15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew15ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron15.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 15);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome15.setText(cron15.RetornaNome());
        EspacoCpf15.setText(cron15.RetornaCPF());
        EspacoTempoLimt15.setText(aux);
        
        cron15.IsRunning();
        if(StartButton15.getText().equals("Stop")){
            StartButton15.setText("Start");
        }
    
        Display15.setText(cron15.toString());
        Painel15.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew15ActionPerformed
//butoes 16
    private void StartButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton16ActionPerformed
        // TODO add your handling code here:
        if(StartButton16.getText().equals("Start")){
            StartButton16.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron16.Start();
            }else{
                cron16.Restart();
            }

        }else{
            StartButton16.setText("Start");
            cron16.Stop();
        }
    }//GEN-LAST:event_StartButton16ActionPerformed

    private void RestartButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton16ActionPerformed
        // TODO add your handling code here:
         cron16.IsRunning();
        
        if(StartButton16.getText().equals("Stop")){
            StartButton16.setText("Start");
        }
        
        
        Display16.setText(cron16.toString());
        
    }//GEN-LAST:event_RestartButton16ActionPerformed

    private void ButtonNew16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew16ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron16.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 16);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome16.setText(cron16.RetornaNome());
        EspacoCpf16.setText(cron16.RetornaCPF());
        EspacoTempoLimt16.setText(aux);
        
        cron16.IsRunning();
        if(StartButton16.getText().equals("Stop")){
            StartButton16.setText("Start");
        }
    
        Display16.setText(cron16.toString());
        Painel16.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew16ActionPerformed
//Butoes 17
    private void StartButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton17ActionPerformed
        // TODO add your handling code here:
        if(StartButton17.getText().equals("Start")){
            StartButton17.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron17.Start();
            }else{
                cron17.Restart();
            }

        }else{
            StartButton17.setText("Start");
            cron17.Stop();
        }
    }//GEN-LAST:event_StartButton17ActionPerformed

    private void RestartButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton17ActionPerformed
        // TODO add your handling code here:
         cron17.IsRunning();
        
        if(StartButton17.getText().equals("Stop")){
            StartButton17.setText("Start");
        }
        
        
        Display17.setText(cron17.toString());
    }//GEN-LAST:event_RestartButton17ActionPerformed

    private void ButtonNew17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew17ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron17.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 17);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome17.setText(cron17.RetornaNome());
        EspacoCpf17.setText(cron17.RetornaCPF());
        EspacoTempoLimt17.setText(aux);
        
        cron1.IsRunning();
        if(StartButton17.getText().equals("Stop")){
            StartButton17.setText("Start");
        }
    
        Display17.setText(cron17.toString());
        Painel17.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew17ActionPerformed
//Buttoes 18
    private void StartButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton18ActionPerformed
        // TODO add your handling code here:
        if(StartButton18.getText().equals("Start")){
            StartButton18.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron18.Start();
            }else{
                cron18.Restart();
            }

        }else{
            StartButton18.setText("Start");
            cron18.Stop();
        }
    }//GEN-LAST:event_StartButton18ActionPerformed

    private void RestartButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton18ActionPerformed
        // TODO add your handling code here:
         cron1.IsRunning();
        
        if(StartButton18.getText().equals("Stop")){
            StartButton18.setText("Start");
        }
        
        
        Display18.setText(cron18.toString());
    }//GEN-LAST:event_RestartButton18ActionPerformed

    private void ButtonNew18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew18ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron18.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 18);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome18.setText(cron18.RetornaNome());
        EspacoCpf18.setText(cron18.RetornaCPF());
        EspacoTempoLimt18.setText(aux);
        
        cron18.IsRunning();
        if(StartButton18.getText().equals("Stop")){
            StartButton18.setText("Start");
        }
    
        Display18.setText(cron18.toString());
        Painel18.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew18ActionPerformed
//Butoe 19/
    private void StartButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton19ActionPerformed
        // TODO add your handling code here:
        if(StartButton19.getText().equals("Start")){
            StartButton19.setText("Stop");
            cnt++;
            if(cnt==1){
                // t.start();// Atualizador
                cron19.Start();
            }else{
                cron19.Restart();
            }

        }else{
            StartButton19.setText("Start");
            cron19.Stop();
        }
    }//GEN-LAST:event_StartButton19ActionPerformed

    private void RestartButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton19ActionPerformed
        // TODO add your handling code here:
         cron1.IsRunning();
        
        if(StartButton19.getText().equals("Stop")){
            StartButton19.setText("Start");
        }
        
        
        Display19.setText(cron19.toString());
    }//GEN-LAST:event_RestartButton19ActionPerformed

    private void ButtonNew19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew19ActionPerformed
        // TODO add your handling code here:
         String aux = null;
        String Nome = null;
        String Cpf = null;
        int TempLimit = 0;
        
            Nome = JOptionPane.showInputDialog("Digite o Nome do Patinador:", "Digite o nome aqui.");
          
            Cpf = JOptionPane.showInputDialog("Digite o Cpf do Patinador:", "Digite o cpf aqui.");
           
            aux = JOptionPane.showInputDialog("Digite o tempo limite do Patinador:", "Digite o tempo aqui.");
            if(Nome != null || !Nome.equals(" ") && Cpf != null || !Cpf.equals(" ") && aux != null || !aux.equals(" ")  ){
               TempLimit = Integer.parseInt(aux);
               cron19.AtualizaDadosCadastrais(Nome, Cpf, TempLimit, 19);
               //System.out.println("Ta entrando nessa poha");
            }
       
        
        
        EspacoNome19.setText(cron19.RetornaNome());
        EspacoCpf19.setText(cron1.RetornaCPF());
        EspacoTempoLimt19.setText(aux);
        
        cron19.IsRunning();
        if(StartButton19.getText().equals("Stop")){
            StartButton19.setText("Start");
        }
    
        Display19.setText(cron19.toString());
        Painel19.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ButtonNew19ActionPerformed
//Butoes 20
    private void StartButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartButton20ActionPerformed

    private void RestartButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RestartButton20ActionPerformed

    private void ButtonNew20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNew20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonNew20ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonNew;
    private javax.swing.JButton ButtonNew1;
    private javax.swing.JButton ButtonNew10;
    private javax.swing.JButton ButtonNew11;
    private javax.swing.JButton ButtonNew12;
    private javax.swing.JButton ButtonNew13;
    private javax.swing.JButton ButtonNew14;
    private javax.swing.JButton ButtonNew15;
    private javax.swing.JButton ButtonNew16;
    private javax.swing.JButton ButtonNew17;
    private javax.swing.JButton ButtonNew18;
    private javax.swing.JButton ButtonNew19;
    private javax.swing.JButton ButtonNew2;
    private javax.swing.JButton ButtonNew20;
    private javax.swing.JButton ButtonNew3;
    private javax.swing.JButton ButtonNew4;
    private javax.swing.JButton ButtonNew5;
    private javax.swing.JButton ButtonNew6;
    private javax.swing.JButton ButtonNew7;
    private javax.swing.JButton ButtonNew8;
    private javax.swing.JButton ButtonNew9;
    private javax.swing.JLabel Display;
    private javax.swing.JLabel Display1;
    private javax.swing.JLabel Display10;
    private javax.swing.JLabel Display11;
    private javax.swing.JLabel Display12;
    private javax.swing.JLabel Display13;
    private javax.swing.JLabel Display14;
    private javax.swing.JLabel Display15;
    private javax.swing.JLabel Display16;
    private javax.swing.JLabel Display17;
    private javax.swing.JLabel Display18;
    private javax.swing.JLabel Display19;
    private javax.swing.JLabel Display2;
    private javax.swing.JLabel Display20;
    private javax.swing.JLabel Display3;
    private javax.swing.JLabel Display4;
    private javax.swing.JLabel Display5;
    private javax.swing.JLabel Display6;
    private javax.swing.JLabel Display7;
    private javax.swing.JLabel Display8;
    private javax.swing.JLabel Display9;
    private javax.swing.JLabel EspacoCpf;
    private javax.swing.JLabel EspacoCpf1;
    private javax.swing.JLabel EspacoCpf10;
    private javax.swing.JLabel EspacoCpf11;
    private javax.swing.JLabel EspacoCpf12;
    private javax.swing.JLabel EspacoCpf13;
    private javax.swing.JLabel EspacoCpf14;
    private javax.swing.JLabel EspacoCpf15;
    private javax.swing.JLabel EspacoCpf16;
    private javax.swing.JLabel EspacoCpf17;
    private javax.swing.JLabel EspacoCpf18;
    private javax.swing.JLabel EspacoCpf19;
    private javax.swing.JLabel EspacoCpf2;
    private javax.swing.JLabel EspacoCpf20;
    private javax.swing.JLabel EspacoCpf3;
    private javax.swing.JLabel EspacoCpf4;
    private javax.swing.JLabel EspacoCpf5;
    private javax.swing.JLabel EspacoCpf6;
    private javax.swing.JLabel EspacoCpf7;
    private javax.swing.JLabel EspacoCpf8;
    private javax.swing.JLabel EspacoCpf9;
    private javax.swing.JLabel EspacoNome;
    private javax.swing.JLabel EspacoNome1;
    private javax.swing.JLabel EspacoNome10;
    private javax.swing.JLabel EspacoNome11;
    private javax.swing.JLabel EspacoNome12;
    private javax.swing.JLabel EspacoNome13;
    private javax.swing.JLabel EspacoNome14;
    private javax.swing.JLabel EspacoNome15;
    private javax.swing.JLabel EspacoNome16;
    private javax.swing.JLabel EspacoNome17;
    private javax.swing.JLabel EspacoNome18;
    private javax.swing.JLabel EspacoNome19;
    private javax.swing.JLabel EspacoNome2;
    private javax.swing.JLabel EspacoNome20;
    private javax.swing.JLabel EspacoNome3;
    private javax.swing.JLabel EspacoNome4;
    private javax.swing.JLabel EspacoNome5;
    private javax.swing.JLabel EspacoNome6;
    private javax.swing.JLabel EspacoNome7;
    private javax.swing.JLabel EspacoNome8;
    private javax.swing.JLabel EspacoNome9;
    private javax.swing.JLabel EspacoTempoLimt;
    private javax.swing.JLabel EspacoTempoLimt1;
    private javax.swing.JLabel EspacoTempoLimt10;
    private javax.swing.JLabel EspacoTempoLimt11;
    private javax.swing.JLabel EspacoTempoLimt12;
    private javax.swing.JLabel EspacoTempoLimt13;
    private javax.swing.JLabel EspacoTempoLimt14;
    private javax.swing.JLabel EspacoTempoLimt15;
    private javax.swing.JLabel EspacoTempoLimt16;
    private javax.swing.JLabel EspacoTempoLimt17;
    private javax.swing.JLabel EspacoTempoLimt18;
    private javax.swing.JLabel EspacoTempoLimt19;
    private javax.swing.JLabel EspacoTempoLimt2;
    private javax.swing.JLabel EspacoTempoLimt20;
    private javax.swing.JLabel EspacoTempoLimt3;
    private javax.swing.JLabel EspacoTempoLimt4;
    private javax.swing.JLabel EspacoTempoLimt5;
    private javax.swing.JLabel EspacoTempoLimt6;
    private javax.swing.JLabel EspacoTempoLimt7;
    private javax.swing.JLabel EspacoTempoLimt8;
    private javax.swing.JLabel EspacoTempoLimt9;
    private javax.swing.JPanel Painel;
    private javax.swing.JPanel Painel1;
    private javax.swing.JPanel Painel10;
    private javax.swing.JPanel Painel11;
    private javax.swing.JPanel Painel12;
    private javax.swing.JPanel Painel13;
    private javax.swing.JPanel Painel14;
    private javax.swing.JPanel Painel15;
    private javax.swing.JPanel Painel16;
    private javax.swing.JPanel Painel17;
    private javax.swing.JPanel Painel18;
    private javax.swing.JPanel Painel19;
    private javax.swing.JPanel Painel2;
    private javax.swing.JPanel Painel20;
    private javax.swing.JPanel Painel3;
    private javax.swing.JPanel Painel4;
    private javax.swing.JPanel Painel5;
    private javax.swing.JPanel Painel6;
    private javax.swing.JPanel Painel7;
    private javax.swing.JPanel Painel8;
    private javax.swing.JPanel Painel9;
    private javax.swing.JButton RestartButton;
    private javax.swing.JButton RestartButton1;
    private javax.swing.JButton RestartButton10;
    private javax.swing.JButton RestartButton11;
    private javax.swing.JButton RestartButton12;
    private javax.swing.JButton RestartButton13;
    private javax.swing.JButton RestartButton14;
    private javax.swing.JButton RestartButton15;
    private javax.swing.JButton RestartButton16;
    private javax.swing.JButton RestartButton17;
    private javax.swing.JButton RestartButton18;
    private javax.swing.JButton RestartButton19;
    private javax.swing.JButton RestartButton2;
    private javax.swing.JButton RestartButton20;
    private javax.swing.JButton RestartButton3;
    private javax.swing.JButton RestartButton4;
    private javax.swing.JButton RestartButton5;
    private javax.swing.JButton RestartButton6;
    private javax.swing.JButton RestartButton7;
    private javax.swing.JButton RestartButton8;
    private javax.swing.JButton RestartButton9;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton StartButton1;
    private javax.swing.JButton StartButton10;
    private javax.swing.JButton StartButton11;
    private javax.swing.JButton StartButton12;
    private javax.swing.JButton StartButton13;
    private javax.swing.JButton StartButton14;
    private javax.swing.JButton StartButton15;
    private javax.swing.JButton StartButton16;
    private javax.swing.JButton StartButton17;
    private javax.swing.JButton StartButton18;
    private javax.swing.JButton StartButton19;
    private javax.swing.JButton StartButton2;
    private javax.swing.JButton StartButton20;
    private javax.swing.JButton StartButton3;
    private javax.swing.JButton StartButton4;
    private javax.swing.JButton StartButton5;
    private javax.swing.JButton StartButton6;
    private javax.swing.JButton StartButton7;
    private javax.swing.JButton StartButton8;
    private javax.swing.JButton StartButton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
