package exemploarray1;

/**
 *
 * @author epastorizalorenzo
 */
public class Metodos {
    //collemos espazo para 7 elementos tipo float
    // float[]temperaturas={1f,2f,3f,4f,5f,6f,7f};
    float[]temperaturas=new float[7];
    public void crearArray(){
        for(int i=0; i<temperaturas.length;i++)
            temperaturas[i]=i+1;                           
    }

    public void visualizar(){
        for(int i=0;i<temperaturas.length;i++)
        System.out.println("temperaturas ["+i+"]= "+temperaturas[i]);
}
}