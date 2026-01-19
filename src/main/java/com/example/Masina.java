package com.example;
import com.example.Roata;
import com.example.PreaMulteRoti;
import java.util.*;

public class Masina {

    private String marca;
    private ArrayList<Roata> roti;
    
    public Masina(String marca){
        this.marca = marca;
        this.roti = new ArrayList<Roata>();
    }
    
    public void adaugaRoata(Roata roataSaAdaug) throws PreaMulteRoti {
        try{
            if(roti.size() == 4){
                throw new PreaMulteRoti();
            }
            
            this.roti.add(roataSaAdaug);
        }catch(PreaMulteRoti ex){
            
        }
    }
        
        
    
    public double calculeazaArieTotala(){
        double arieTotala = 0;
        for(int i = 0; i < this.roti.size(); i++){
            arieTotala = this.roti.get(i).calculeazaArie();
        }
        
        return arieTotala;
    }

}