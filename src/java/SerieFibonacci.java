/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class SerieFibonacci {
    private int n;

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n<0?0:n;
    }
    
    private int r(int n)
    {
        if (n==0 || n==1) return n;
        
        return r(n-1)+r(n-2);
    }
    
    public int calcular()
    {
        return r(n);
    }
}
