
package modell;


public class Csigusz {

    private Csigusz(String nev, String piros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public enum Szinek{PIROS,ZOLD,KEK;

        public char charAt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String Blue = "\u001B[34m";
    private String nev;
    private  Szinek szinNev;
    private String szinKod;
    private String RESET;

    public Csigusz(String nev)throws Exception{
        this(nev,"piros");
        //this.nev=nev;
        //this.szin="fekete";

    }
    public Csigusz(String nev,Szinek szinNEv) throws Exception{
        //this.nev=nev;
        setNev(nev);
        this.szinKod = RESET;
        setSzin();
        this.szinNev = szinNev;
        
        //this.szinNev=szinNev;
    }
    
    public Csigusz()throws Exception{
        this("Csigusz Doe");
    }

    public void setNev(String nev) throws Exception {
        if (nev.length() >= 3){
        char nevElso = nev.charAt(0);
        if(Character.isLowerCase(nevElso)){
            nevElso = Character.toUpperCase(nevElso);
            nev = nevElso + nev.substring(1);
        }
        this.nev = nev;
    }else{
            throw new Exception("A név túl rövid!");
        }
        
    }
    private void setSzin(){
        switch(szinNev){
            case PIROS:
                szinKod=Csigusz.RED;
                break;
            case KEK:
                szinKod=Csigusz.Blue;
                break;
            case ZOLD:
                szinKod=Csigusz.GREEN;
        }
    }
    public String getSzin(){
        return szinNev.toString();
    }
    public String getNev(){
        return nev;
    }
    
    @Override
    public String toString(){
        return szinNev + "CSigusz{"+"nev=" + nev;
    }
    
}
