/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package solucionquiz;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class PiedPiper {
    
    private ListaPersonal lp;
    private ListaAccionista la;
    private Scanner sc = new Scanner(System.in);
    private Junta junta = new Junta();
    public ListaPersonal getLp() {
        return lp;
    }

    public void setLp(ListaPersonal lp) {
        this.lp = lp;
    }
    
    
    
    
    public PiedPiper(){
        
        lp = new ListaPersonal();
        la = new ListaAccionista();
        
        Menu();
    }
    
    
    public void AñadirProgramador(){
        
       
        System.out.println("Ingrese el nombre del nuevo programador");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido del nuevo programador");
        String apellido = sc.next();
        System.out.println("Ingrese la ci");
        int ci = sc.nextInt();
        System.out.println("Ingrese cuanto cuesta las horas de su trabajo");
        double costoH = sc.nextDouble();
       
        System.out.println("Que tipo de desarrollador desea agregar ?");
        System.out.println("(1) Web, (2) Android, (3) iOS");
        int rsp = sc.nextInt();
        
        if(rsp == 1){
            //SE AÑADE UN PROGRAMADOR WEB 
            lp.InsertaF(new NodoPersonal(new Web(nombre,apellido,ci,costoH))); //APLICACIÓN DE POLIFORMISMO
        }
        else if(rsp == 2){
            //SE AÑADE UN PROGRAMADOR DE ANDROID
            lp.InsertaF(new NodoPersonal(new Android(nombre,apellido,ci,costoH))); //APLICACION DE POLIFORMISMO
        }
        else{
            //SE AÑADE UN PROGRAMADOR DE IOS
            lp.InsertaF(new NodoPersonal(new Ios(nombre,apellido,ci,costoH))); //APLICACION DE POLIFORMISMO
        }
    }
    
    public void AñadirJuntaD(){
        
        System.out.println("Ingrese el nombre del nuevo directivo");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido del nuevo directivo");
        String apellido = sc.next();
        System.out.println("Ingrese la ci del nuevo directivo");
        int ci = sc.nextInt();
        System.out.println("Ingrese su salario");
        double salario = sc.nextDouble();
        
        lp.InsertaF(new NodoPersonal(new JuntaDirectiva(nombre,apellido,ci,salario)));
    }
    
    public void AñadirAccionista(){
        
        System.out.println("Ingrese el nombre del accionista");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido del accionista");
        String apellido = sc.next();
        
        System.out.println("Ingrese el tipo de accionista");
        System.out.println("(1) Accionista A ");
        System.out.println("(2) Accionista B");
        int rsp = sc.nextInt();
        
        if(rsp == 1){
            this.la.InsertaF(new NodoAccionista(new AccionistaA(nombre,apellido)));
        }else{
            this.la.InsertaF(new NodoAccionista(new AccionistaB(nombre,apellido)));
        }
        
    }
    
    public void CrearProyecto(){
        
        System.out.println("Ingrese el nombre del directivo que va a dirigir el proyecto");
        String directivo = sc.next();
        
        NodoPersonal aux = lp.getCabeza();
        while(aux != null){
            if(aux.getData() instanceof JuntaDirectiva && aux.getData().getNombre().equals(directivo)){
            System.out.println("Ingrese el nombre del proyecto");
            String nombre = sc.next();
            System.out.println("Ingrese la metodologia agil con que trabajara: XP, SCRUM, CRUD");
            String metodologia = sc.next();
            //SE CASTEA PAR ASIGNAR EL PROYECTO
            JuntaDirectiva D = (JuntaDirectiva) aux.getData();
            D.getLp().InsertaF(new NodoProyecto(new Proyecto(nombre,metodologia)));
            
            }
            
            aux = aux.getProx();
        }
    }
    
    
    
    
    public void Menu(){
        
        
        while(true){
            
            System.out.println("Bienvenidos al simulador de PiedPiper de HBO");
            System.out.println("Ingrese la opcion deseada");
            System.out.println("(1) Agregar Programadores");
            System.out.println("(2) Agregar Junta Directiva");
            System.out.println("(3) Agregar Accionistas ");
            System.out.println("(4) Mostrar Personal");
            System.out.println("(5) Mostrar Accionista");
            System.out.println("(6) Hacer  una Junta ");
            System.out.println("(7) Crear un proyecto");
            System.out.println("(8) Mostrar proyectos");
            System.out.println("(9) Salir");
            
            int rsp = sc.nextInt();
            
            switch(rsp){
                case 1:
                    AñadirProgramador();
                    break;
                case 2:
                    AñadirJuntaD();
                    break;
                case 3:
                    AñadirAccionista();
                    break;
                case 4:
                    lp.Mostrar();
                    break;
                case 5:
                    la.Mostrar();
                    break;
                case 6:
                    junta.CrearJunta(lp, la);
                    break;
                case 7:
                    CrearProyecto();
                    break;
                case 8:
                    lp.MostrarProyectos();
                    break;
                case 9:
                    System.exit(0); //se sale del programa
            }
        }
    }
}
