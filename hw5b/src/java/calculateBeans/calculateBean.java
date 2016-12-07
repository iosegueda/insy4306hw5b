/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateBeans;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Iris Osegueda
 */
@ManagedBean(name="calculateBean")
public class calculateBean {
    private int num1;
    private int num2;
    private int choice;
    private int result;
    
    public void setNum1(int n)
    {
        this.num1 = n;
    }
    public void setNum2(int n)
    {
        this.num2 = n;
    }
    public void setChoice(int c)
    {
        this.choice = c;
    }
    public void setResult(int r)
    {
        this.result = r;
    }
    public int getNum1()
    {
        return this.num1;
    }
    public int getNum2()
    {
        return this.num2;
    }
    public int getChoice()
    {
        return this.choice;
    }
    public int getResult()
    {
        return this.result;
    }
    public void listener()
    {
        this.result = calc(this.getChoice());
    }
    public int calc(int c)
    {
        switch(c){
            case 1: return(add());
            case 2: return(sub());
            case 3: return(mult());
            case 4: return(div());
            default: return(0);
        }
    }
    public int add()
    {
        return(this.num1 + this.num2);
    }
    public int sub()
    {
        return(this.num1 - this.num2);
    }
    public int mult()
    {
        return(this.num1 * this.num2);
    }
    public int div()
    {
        return(this.num1 / this.num2);
    }
}
