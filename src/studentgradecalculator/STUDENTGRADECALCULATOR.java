
package studentgradecalculator;

import javax.swing.JOptionPane;


public class STUDENTGRADECALCULATOR {

    
    public static void main(String[] args) {
    
        String Num=JOptionPane.showInputDialog(null,"Input Student Number");
        String NumSubct=JOptionPane.showInputDialog(null,"Enter Number  Subject");
        int numberOfsubct=Integer.parseInt(NumSubct);
        
        
        String[] subjectName=new  String[numberOfsubct];
        int[] marks=new int[subjectName.length];
        
        for(int i=0;i< subjectName.length;i++)
        {
         subjectName[i]=JOptionPane.showInputDialog(null,"Input Name of Subject "+(i+1));
         
         
         do
         {
         marks[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Input Marks for "+subjectName[i]));  
         }while(marks[i]>100||marks[i]<0);
         
        }
        
        
      int  totalMarks= CalcTotalMarks(marks);
      int average=CalcAverage(numberOfsubct,totalMarks);
      String result=GradeCalculation(average);
      DisplayResults(subjectName,marks,average,result,Num);
    }
    
    
    public static int CalcTotalMarks(int[] Marks)
    {
        
        int TotalMarks=0;
        
        for(int i=0;i<Marks.length;i++)
       {
          TotalMarks+=Marks[i];
       }
        
        return TotalMarks;
    }
    
    
       public static int CalcAverage(int NumSubjects,int TotalMarks)
    {
       return TotalMarks/NumSubjects;
    }
    
    public static String GradeCalculation(int Average)
    {
    
        String results="";
        
        if(Average>75 && Average<90)
        {
          results="Meritorious Achievement ( B )";
        }
        else  if(Average>90)
        {
          results="Outstanding Achievement ( A )";
        }
        else  if(Average>=60 && Average<70)
        {
          results="Substantial Achievement  ( C )";
        }
         else  if(Average>=50 && Average<60)
        {
          results="Substantial Achievement ( D )";
        }
        else 
        {
          results="Failed ";
        }
        
        
        return results;
    
    }
       
       
    public static void DisplayResults(String[] SubjectName,int[] Marks,int average,String result,String Num)
    {
             System.out.println("*************************"+Num+"****************************************");
        
             String  OverAllString="SUBJECT NAME\tMARKS\n";
             for(int i=0;i<Marks.length;i++)
             {
             OverAllString+=SubjectName[i]+ "\t\t" + Marks[i]+"%\n";
        
             }
             System.out.println(" ");
             
             
            OverAllString+="AVERAGE\t\t"+average+"%\nGRADE\t\t"+result;
            System.out.println(OverAllString);
             
            System.out.println(" ");
            System.out.println("************************"+Num+"*******************************************");
     
    }
    
    
    
}
