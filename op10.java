import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;
class Student  
{ 	
	Scanner sc = new Scanner(System.in);
    String name; 
    static int rollNo,i;  
    static String cllgName; 
    static int counter = 0; 
    void setfname(String name)  
    { 
        this.name = name;       
        this.rollNo = setRollNo(); 
    }
    static int setRollNo() 
    { 
        counter++; 
        return counter; 
    }
	static int counterdmt=0,cdmt=0;
	static int counterde=0,cde=0;
	static int counteroop=0,coop=0;
	static int counteroopl=0,coopl=0;
	static int counterdsa=0,cdsa=0;
	static int counterdm=0,cdm=0;
	static int counterdc=0,cdc=0;
	static int counterdct=0,cdct=0;
	static int counterpe=0,cpe=0;
	static int counterdsal=0,cdsal=0;
	static int counterdel=0,cdel=0;
	static int setcounterdmt() 
    { 
        counterdmt++; 
        return counterdmt; 
    }
	static int setcdmt() 
    { 
        cdmt++; 
        return cdmt; 
    }
	static int setcounterde() 
    { 
        counterde++; 
        return counterde; 
    }
	static int setcde() 
    { 
        cde++; 
        return cde; 
    }
	static int setcounteroop() 
    { 
        counteroop++; 
        return counteroop; 
    }
	static int setcoop() 
    { 
        coop++; 
        return coop; 
    }
	static int setcounteroopl() 
    { 
        counteroopl++; 
        return counteroopl; 
    }
	static int setcoopl() 
    { 
        coopl++; 
        return coopl; 
    }
	static int setcounterdsa() 
    { 
        counterdsa++; 
        return counterdsa; 
    }
	static int setcdsa() 
    { 
        cdsa++; 
        return cdsa; 
    }
	static int setcounterdm() 
    { 
        counterdm++; 
        return counterdm; 
    }
	static int setcdm() 
    { 
        cdm++; 
        return cdm; 
    }
	static int setcounterdc() 
    { 
        counterdc++; 
        return counterdc; 
    }
	static int setcdc() 
    { 
        cdc++; 
        return cdc; 
    }
	static int setcounterdct() 
    { 
        counterdct++; 
        return counterdct; 
    }
	static int setcdct() 
    { 
        cdct++; 
        return cdct; 
    }
	static int setcounterpe() 
    { 
        counterpe++; 
        return counterpe; 
    }
	static int setcpe() 
    { 
        cpe++; 
        return cpe; 
    }
	static int setcounterdsal() 
    { 
        counterdsal++; 
        return counterdsal; 
    }
	static int setcdsal() 
    { 
        cdsal++; 
        return cdsal; 
    }
	static int setcounterdel() 
    { 
        counterdel++; 
        return counterdel; 
    }
	static int setcdel() 
    { 
        cdel++; 
        return cdel; 
    }
	int L=0,M=0,N=0,O=0,P=0,Q=0,R=0,S=0,T=0,U=0,V=0;
	float cnet[][] = new float[50][50]; 
	void setAttendence(int l)
	{
		System.out.println("Enter Student "+l+" Detail");	
		System.out.println("Enter day");
		String day = sc.nextLine();
		if(day.equals("Monday"))
		{
			System.out.println("Enter DMT for update attendence of that student");
			System.out.println("Enter DE for update attendence of that student");
			System.out.println("Enter OOP for update attendence of that student");
			System.out.println("Enter OOPL for update attendence of that student");
			for(i=0;i<8;i++)
			{
				String sub1 = sc.nextLine();
				if(sub1.equals("DMT"))
				{
					try{
					String s,r;
					File dmtt = new File("F:\\java\\dmtt.txt");
					File cdmtt = new File("F:\\java\\cdmtt.txt");
					boolean fvar = dmtt.createNewFile();
					boolean fvar1 = cdmtt.createNewFile();	
					if(!dmtt.exists())
					{
						dmtt.createNewFile();
					}
					if(!cdmtt.exists())
					{
						cdmtt.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dmtt,false);
					FileWriter fw2 = new FileWriter(cdmtt,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DMT has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDMT has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DMT") && y==1)
						{							
							t = setcounterdmt() - L;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdmt();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "F:\\java\\dmtt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);							
							float k = t*100/u;
							cnet[l][0]= k;
						}
						else
						{
							t=setcounterdmt()-L-1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdmt();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "F:\\java\\dmtt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);							
							float k = t*100/u;
							cnet[l][0]= k;
							L++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DMT = "+cnet[l][0]);
				}catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("DE"))
				{
					try{
					String s,r;
					File det = new File("F:\\java\\det.txt");
					File cdet = new File("F:\\java\\cdet.txt");
					boolean fvar = det.createNewFile();
					boolean fvar1 = cdet.createNewFile();	
					if(!det.exists())
					{
						det.createNewFile();
					}
					if(!cdet.exists())
					{
						cdet.createNewFile();
					}
					FileWriter fw1 = new FileWriter(det,false);
					FileWriter fw2 = new FileWriter(cdet,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DE has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDE has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DE") && y==1)
						{
							t = setcounterde() - M;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcde();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "F:\\java\\det.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][1]= k;
						}
						else
						{
							t=setcounterde()-M-1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcde();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\det.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][1]= k;
							M++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DE = "+cnet[l][1]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("OOP"))
				{
					try{
					String s,r;
					File oopt = new File("G:\\java\\oopt.txt");
					File coopt = new File("G:\\java\\coopt.txt");
					boolean fvar = oopt.createNewFile();
					boolean fvar1 = coopt.createNewFile();	
					if(!oopt.exists())
					{
						oopt.createNewFile();
					}
					if(!coopt.exists())
					{
						coopt.createNewFile();
					}
					FileWriter fw1 = new FileWriter(oopt,false);
					FileWriter fw2 = new FileWriter(coopt,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File OOP has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File COOP has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("OOP") && y==1)
						{
							t = setcounteroop() - N;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcoop();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\oopt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][2]= k;
						}
						else
						{
							t = setcounteroop() - N - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcoop();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\oopt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][2]= k;
							N++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in OOP = "+cnet[l][2]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("OOPL"))
				{
					try{
					String s,r;
					File ooplt = new File("G:\\java\\ooplt.txt");
					File cooplt = new File("G:\\java\\cooplt.txt");
					boolean fvar = ooplt.createNewFile();
					boolean fvar1 = cooplt.createNewFile();	
					if(!ooplt.exists())
					{
						ooplt.createNewFile();
					}
					if(!cooplt.exists())
					{
						cooplt.createNewFile();
					}
					FileWriter fw1 = new FileWriter(ooplt,false);
					FileWriter fw2 = new FileWriter(cooplt,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File OOPL has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File COOPL has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent Acco. to sub");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("OOPL") && y==1)
						{
							t = setcounteroopl()-O;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcoopl();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\ooplt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][3]= k;
						}
						else
						{
							t = setcounteroopl()-O-1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcoopl();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\ooplt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][3]= k;
							O++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in OOPL = "+cnet[l][3]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
			}
		}
		else if(day.equals("Tuesday"))
		{
			System.out.println("Enter DSA for update attendence of that student");
			System.out.println("Enter DM for update attendence of that student");
			System.out.println("Enter OOP for update attendence of that student");
			System.out.println("Enter DC for update attendence of that student");
			System.out.println("Enter DCT for update attendence of that student");
			for(i=0;i<10;i++)
			{
				String sub1 = sc.nextLine();
				if(sub1.equals("DSA"))
				{
					try{
					String s,r;
					File dsat = new File("G:\\java\\dsat.txt");
					File cdsat = new File("G:\\java\\cdsat.txt");
					boolean fvar = dsat.createNewFile();
					boolean fvar1 = cdsat.createNewFile();	
					if(!dsat.exists())
					{
						dsat.createNewFile();
					}
					if(!cdsat.exists())
					{
						cdsat.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dsat,false);
					FileWriter fw2 = new FileWriter(cdsat,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DSA") && y==1)
						{
							t = setcounterdsa() - P;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdsa();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dsat.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][4]= k;
						}
						else
						{
							t = setcounterdsa() - P - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdsa();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dsat.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][4]= k;
							P++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DSA = "+cnet[l][4]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("DM"))
				{
					try{
					String s,r;
					File dmm = new File("G:\\java\\dmm.txt");
					File cdmm = new File("G:\\java\\cdmm.txt");
					boolean fvar = dmm.createNewFile();
					boolean fvar1 = cdmm.createNewFile();	
					if(!dmm.exists())
					{
						dmm.createNewFile();
					}
					if(!cdmm.exists())
					{
						cdmm.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dmm,false);
					FileWriter fw2 = new FileWriter(cdmm,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DM") && y==1)
						{
							t = setcounterdm() - Q;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdm();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dmm.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][5]= k;
						}
						else
						{
							t = setcounterdm() - Q - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdm();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dmm.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][5]= k;
							Q++;
						}
						System.out.println("Attendence pre "+t+" of "+u+"Lacture in DM = "+cnet[l][5]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("OOP"))
				{
					try{
					String s,r;
					File oopt = new File("G:\\java\\oopt.txt");
					File coopt = new File("G:\\java\\coopt.txt");
					boolean fvar = oopt.createNewFile();
					boolean fvar1 = coopt.createNewFile();	
					if(!oopt.exists())
					{
						oopt.createNewFile();
					}
					if(!coopt.exists())
					{
						coopt.createNewFile();
					}
					FileWriter fw1 = new FileWriter(oopt,false);
					FileWriter fw2 = new FileWriter(coopt,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File OOP has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File COOP has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("OOP") && y==1)
						{
							t = setcounteroop() - N;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcoop();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\oopt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][2]= k;
						}
						else
						{
							t = setcounteroop() - N - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcoop();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\oopt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][2]= k;
							N++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in OOP = "+cnet[l][2]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("DC"))
				{
					try{
					String s,r;
					File dct = new File("G:\\java\\dct.txt");
					File cdct = new File("G:\\java\\cdct.txt");
					boolean fvar = dct.createNewFile();
					boolean fvar1 = cdct.createNewFile();	
					if(!dct.exists())
					{
						dct.createNewFile();
					}
					if(!cdct.exists())
					{
						cdct.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dct,false);
					FileWriter fw2 = new FileWriter(cdct,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DC has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDC has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DC") && y==1)
						{
							t = setcounterdc() - R;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdc();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dct.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][6]= k;
						}
						else
						{
							t = setcounterdc() - R - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdc();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dct.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][6]= k;
							R++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DC = "+cnet[l][6]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("DCT"))
				{
					try{
					String s,r;
					File dctt = new File("G:\\java\\dctt.txt");
					File cdctt = new File("G:\\java\\cdctt.txt");
					boolean fvar = dctt.createNewFile();
					boolean fvar1 = cdctt.createNewFile();	
					if(!dctt.exists())
					{
						dctt.createNewFile();
					}
					if(!cdctt.exists())
					{
						cdctt.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dctt,false);
					FileWriter fw2 = new FileWriter(cdctt,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DCT has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDCT has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DCT") && y==1)
						{
							t = setcounterdct() - S;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdct();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dctt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][7]= k;
						}
						else
						{
							t = setcounterdct() - S - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdct();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dctt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][7]= k;
							S++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DCT = "+cnet[l][7]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
			}
		}
		else if(day.equals("Wednesday"))
		{
			System.out.println("Enter DM for update attendence of that student");
			System.out.println("Enter DSA for update attendence of that student");
			System.out.println("Enter PE for update attendence of that student");
			System.out.println("Enter DSAL for update attendence of that student");
			for(int j=0;j<8;j++)
			{
				String sub1 = sc.nextLine();
				if(sub1.equals("DM"))
				{
					try{
					String s,r;
					File dmm = new File("G:\\java\\dmm.txt");
					File cdmm = new File("G:\\java\\cdmm.txt");
					boolean fvar = dmm.createNewFile();
					boolean fvar1 = cdmm.createNewFile();	
					if(!dmm.exists())
					{
						dmm.createNewFile();
					}
					if(!cdmm.exists())
					{
						cdmm.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dmm,false);
					FileWriter fw2 = new FileWriter(cdmm,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DM") && y==1)
						{
							t = setcounterdm() - Q;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdm();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dmm.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][5]= k;
						}
						else
						{
							t = setcounterdm() - Q - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdm();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dmm.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][5]= k;
							Q++;
						}
						System.out.println("Attendence pre "+t+" of "+u+"Lacture in DM = "+cnet[l][5]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("DSA"))
				{
					try{
					String s,r;
					File dsat = new File("G:\\java\\dsat.txt");
					File cdsat = new File("G:\\java\\cdsat.txt");
					boolean fvar = dsat.createNewFile();
					boolean fvar1 = cdsat.createNewFile();	
					if(!dsat.exists())
					{
						dsat.createNewFile();
					}
					if(!cdsat.exists())
					{
						cdsat.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dsat,false);
					FileWriter fw2 = new FileWriter(cdsat,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DSA") && y==1)
						{
							t = setcounterdsa() - P;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdsa();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dsat.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][4]= k;
						}
						else
						{
							t = setcounterdsa() - P - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdsa();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dsat.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][4]= k;
							P++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DSA = "+cnet[l][4]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("PE"))
				{
					try{
					String s,r;
					File pet = new File("G:\\java\\pet.txt");
					File cpet = new File("G:\\java\\cpet.txt");
					boolean fvar = pet.createNewFile();
					boolean fvar1 = cpet.createNewFile();	
					if(!pet.exists())
					{
						pet.createNewFile();
					}
					if(!cpet.exists())
					{
						cpet.createNewFile();
					}
					FileWriter fw1 = new FileWriter(pet,false);
					FileWriter fw2 = new FileWriter(cpet,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File PE has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CPE has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("PE") && y==1)
						{
							t = setcounterpe() - T;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcpe();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\pet.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][8]= k;
						}
						else
						{
							t = setcounterpe() - T - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcpe();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\pet.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][8]= k;
							T++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in PE = "+cnet[l][8]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("DSAL"))
				{
					try{
					String s,r;
					File dsalt = new File("G:\\java\\dsalt.txt");
					File cdsalt = new File("G:\\java\\cdsalt.txt");
					boolean fvar = dsalt.createNewFile();
					boolean fvar1 = cdsalt.createNewFile();	
					if(!dsalt.exists())
					{
						dsalt.createNewFile();
					}
					if(!cdsalt.exists())
					{
						cdsalt.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dsalt,false);
					FileWriter fw2 = new FileWriter(cdsalt,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DSAL has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDSAL has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DSAL") && y==1)
						{
							t = setcounterdsal() - U;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdsal();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dsalt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][9]= k;
						}
						else
						{
							t = setcounterdsal() - U - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdsal();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dsalt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][9]= k;
							U++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DSAL = "+cnet[l][9]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
			}
		}
		else if(day.equals("Thursday"))
		{
			System.out.println("Enter DEL for update attendence of that student");
			System.out.println("Enter DC for update attendence of that student");
			for(i=0;i<4;i++)
			{
				String sub1 = sc.nextLine();
				if(sub1.equals("DEL"))
				{
					try{
					String s,r;
					File delt = new File("G:\\java\\delt.txt");
					File cdelt = new File("G:\\java\\cdelt.txt");
					boolean fvar = delt.createNewFile();
					boolean fvar1 = cdelt.createNewFile();	
					if(!delt.exists())
					{
						delt.createNewFile();
					}
					if(!cdelt.exists())
					{
						cdelt.createNewFile();
					}
					FileWriter fw1 = new FileWriter(delt,false);
					FileWriter fw2 = new FileWriter(cdelt,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DEL has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDEL has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DEL") && y==1)
						{
							t = setcounterdel() - V;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdel();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\delt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][10]= k;
						}
						else
						{
							t=setcounterdel()-V-1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdel();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\delt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][10]= k;
							V++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DEL = "+cnet[l][10]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("DC"))
				{
					try{
					String s,r;
					File dct = new File("G:\\java\\dct.txt");
					File cdct = new File("G:\\java\\cdct.txt");
					boolean fvar = dct.createNewFile();
					boolean fvar1 = cdct.createNewFile();	
					if(!dct.exists())
					{
						dct.createNewFile();
					}
					if(!cdct.exists())
					{
						cdct.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dct,false);
					FileWriter fw2 = new FileWriter(cdct,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DC has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDC has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DC") && y==1)
						{
							t = setcounterdc() - R;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdc();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dct.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][6]= k;
						}
						else
						{
							t = setcounterdc() - R - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdc();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dct.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][6]= k;
							R++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DC = "+cnet[l][6]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
			}
		}
	    else if(day.equals("Friday"))
		{
			System.out.println("Enter PE for update attendence of that student");
			System.out.println("Enter OOPL for update attendence of that student");
			System.out.println("Enter DSA for update attendence of that student");
			System.out.println("Enter DE for update attendence of that student");
			for(i=0;i<8;i++)
			{
				String sub1 = sc.nextLine();
				if(sub1.equals("PE"))
				{
					try{
					String s,r;
					File pet = new File("G:\\java\\pet.txt");
					File cpet = new File("G:\\java\\cpet.txt");
					boolean fvar = pet.createNewFile();
					boolean fvar1 = cpet.createNewFile();	
					if(!pet.exists())
					{
						pet.createNewFile();
					}
					if(!cpet.exists())
					{
						cpet.createNewFile();
					}
					FileWriter fw1 = new FileWriter(pet,false);
					FileWriter fw2 = new FileWriter(cpet,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File PE has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CPE has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("PE") && y==1)
						{
							t = setcounterpe() - T;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcpe();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\pet.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][8]= k;
						}
						else
						{
							t = setcounterpe() - T - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcpe();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\pet.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][8]= k;
							T++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in PE = "+cnet[l][8]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("OOPL"))
				{
					try{
					String s,r;
					File ooplt = new File("G:\\java\\ooplt.txt");
					File cooplt = new File("G:\\java\\cooplt.txt");
					boolean fvar = ooplt.createNewFile();
					boolean fvar1 = cooplt.createNewFile();	
					if(!ooplt.exists())
					{
						ooplt.createNewFile();
					}
					if(!cooplt.exists())
					{
						cooplt.createNewFile();
					}
					FileWriter fw1 = new FileWriter(ooplt,false);
					FileWriter fw2 = new FileWriter(cooplt,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File OOPL has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File COOPL has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent Acco. to sub");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("OOPL") && y==1)
						{
							t = setcounteroopl()-O;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcoopl();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\ooplt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][3]= k;
						}
						else
						{
							t = setcounteroopl()-O-1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcoopl();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\ooplt.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][3]= k;
							O++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in OOPL = "+cnet[l][3]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("DSA"))
				{
					try{
					String s,r;
					File dsat = new File("G:\\java\\dsat.txt");
					File cdsat = new File("G:\\java\\cdsat.txt");
					boolean fvar = dsat.createNewFile();
					boolean fvar1 = cdsat.createNewFile();	
					if(!dsat.exists())
					{
						dsat.createNewFile();
					}
					if(!cdsat.exists())
					{
						cdsat.createNewFile();
					}
					FileWriter fw1 = new FileWriter(dsat,false);
					FileWriter fw2 = new FileWriter(cdsat,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDSA has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DSA") && y==1)
						{
							t = setcounterdsa() - P;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdsa();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dsat.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][4]= k;
						}
						else
						{
							t = setcounterdsa() - P - 1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcdsa();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\dsat.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][4]= k;
							P++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DSA = "+cnet[l][4]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
				else if(sub1.equals("DE"))
				{
					try{
					String s,r;
					File det = new File("G:\\java\\det.txt");
					File cdet = new File("G:\\java\\cdet.txt");
					boolean fvar = det.createNewFile();
					boolean fvar1 = cdet.createNewFile();	
					if(!det.exists())
					{
						det.createNewFile();
					}
					if(!cdet.exists())
					{
						cdet.createNewFile();
					}
					FileWriter fw1 = new FileWriter(det,false);
					FileWriter fw2 = new FileWriter(cdet,false);
					BufferedWriter bw1 = new BufferedWriter(fw1);
					BufferedWriter bw2 = new BufferedWriter(fw2);
					if(fvar1)
					{ 
						 System.out.println("File DE has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					if(fvar)
					{
						System.out.println("File CDE has been create successfully");
					}
					else
					{
						System.out.println("File already present in specific location");
					}
					System.out.println("Press 1 for present and 0 for absent");
					int y = sc.nextInt();
					int t,u;
						if(sub1.equals("DE") && y==1)
						{
							t = setcounterde() - M;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcde();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\det.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);
							float k = t*100/u;
							cnet[l][1]= k;
						}
						else
						{
							t=setcounterde()-M-1;
							s = Float.toString(t);
							fw1.write(s);
							fw1.close();
							u = setcde();
							r=Float.toString(u);
							fw2.write(r);
							fw2.close();
							String fileName = "G:\\java\\det.txt";
							FileReader fileReader = new FileReader(fileName);
                            String line,line1=null;  
							try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
							 
							  while((line = bufferedReader.readLine()) != null) {
								  line1 = line;
								System.out.println(line);
							  }
							  bufferedReader.close();
							}
							System.out.println(line1);
							float cm = Float.parseFloat(line1);
							System.out.println(cm);	
							float k = t*100/u;
							cnet[l][1]= k;
							M++;
						}
						System.out.println("Attendence pre "+t+" of "+u+" Lacture in DE = "+cnet[l][1]);
				}
				catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
				}
			}
		}
				
	}	
    static void setCllg(String name)
	{ 
        cllgName = name ; 
    } 
    void getStudentInfo()
	{ 
        System.out.println("name : " + this.name); 
        System.out.println("rollNo : " + this.rollNo); 
        System.out.println("cllgName : " + cllgName);
		for(i=0;i<10;i++)
		{
		try
		{
		File file = new File("G:\\java\\StudentInfo.txt");
		//String content = "This is my content whilch would be appended at the end";
		//file.delete();
		boolean fvar = file.createNewFile();
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		if(fvar)
		{
			System.out.println("File has been create successfully");
		}
		else
		{
			System.out.println("File already present in specific location");
		}
		String s;
		switch (i)
		{
			case 0:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("DMT Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 1:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("DE Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 2:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("OOP Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 3:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("OOPL Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 4:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("DSA Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 5:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("DM Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 6:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("DC Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 7:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("DCT Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 8:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("PE Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 9:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("DSAL Att. = ");
			bw.write(s);
			bw.close();
			break;
			case 10:
			s=Float.toString(cnet[0][i]);
			bw.newLine();
			bw.write("DEL Att. = ");
			bw.write(s);
			bw.close();
			break;
		}
		}catch(IOException e){
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
			System.out.println(cnet[0][i]);
		}
    } 
} 
class StaticDemo  
{ 
    public static void main(String[] args) 
    { 
		int i,j;
		Scanner bi = new Scanner(System.in);
        Student.setCllg("Nirma University"); 
		Student s[] = new Student[5];
		for(i=0;i<1;i++)
		{
			System.out.println("Enter student name :");
			String fname = bi.nextLine();
			s[i] = new Student();
			s[i].setfname(fname);
		} 
		for(j=0;j<5;j++) //Day wise attendence
		{
			for(i=0;i<1;i++) //Students attendence in a day
			{
				s[i].setAttendence(i);
			}
		}
		System.out.println("Enter id Attendence detail :");
		int id; 
		id = bi.nextInt(); 
		for(i=0;i<5;i++)
		{
			if(i==id)
			s[i].getStudentInfo();
		}
    } 
} 