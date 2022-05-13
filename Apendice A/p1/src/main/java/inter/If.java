package inter;
import simbolos.*;

public class If extends Instr{
    Expr expr1;
    Instr instr2;
    public If(Expr x, Instr s){
        expr1 = x;
        instr2 = s;
        if(expr1.tipo != Tipo.Bool) expr1.error("se requere booleano en if");   
    }
    public void gen(int b, int a){
    int etiqueta = nuevaEtiqueta();
    expr1.salto(0, a);
    emitirEtiqueta(etiqueta); 
    instr2.gen(etiqueta, a);
    }
}
