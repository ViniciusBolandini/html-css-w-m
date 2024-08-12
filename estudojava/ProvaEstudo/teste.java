package ProvaEstudo;

public class teste {

    static class Geraex {
        public Geraex(){
            try{
                int i = 0;
                int j = 1/i;
                System.out.println(j);
            }
            catch(Exception e){
                System.out.println("erro foi o " + e);
            }
            finally{
                System.out.println("finalmente");
            }
        }

        

    }



    static public void main(String[] args){
        Geraex g = new Geraex();
    }
}
