 import java.io.*;
import java.util.Scanner;
public class Split {
public static void main(String args[]) {
try{
String inputfile = "test.txt";
double nol = 5.0;
File file = new File(inputfile);
Scanner scanner = new Scanner(file);
int count = 0;
while (scanner.hasNextLine())
{
scanner.nextLine();
count++;
}
System.out.println("Lines in the file: " + count);
double temp = (count/nol);
int temp1=(int)temp;
int nof=0;
if(temp1==temp)
{
nof=temp1;
}
else
{
nof=temp1+1;
}
System.out.println("No. of files to be generated :"+nof);
BufferedReader br = new BufferedReader(new
FileReader(inputfile));
String strLine;
for (int j=1;j<=nof;j++)
{
FileWriter fw= new FileWriter("File"+j+".txt");
for (int i=1;i<=nol;i++)
{
strLine = br.readLine();
if (strLine!= null)
{
strLine=strLine+"\r\n";
fw.write(strLine);
}
}
fw.close();
}
br.close();
}
catch (Exception e) {
System.err.println("Error: " + e.getMessage());
}
}
}


// Create a new file and name it as test.txt
1.hello java programming language 
2.hello python
3.hello c++
4.hello c
5.hello android
6.hello data base 
