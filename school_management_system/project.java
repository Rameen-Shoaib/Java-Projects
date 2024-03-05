package school_management_system;

import java.beans.*;
import java.sql.*;
import java.sql.ResultSet;

/**
 *
 * @author ramee
 */

import java.util.*; 
import java.util.Arrays;
import java.io.FileWriter;


interface Student 
{
	void Display(String sname[], String rno[], String semester[], int index);
}

 class Admin 
 {
	private String Name;
	private int id;
	private char password;
        int count = 0;
        
	public void AddTeacher(String Name[], String id[], String courseteaching[], int index)
        {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter Name:");
                        String tname = sc.nextLine();
                        Name[index] = tname;
                        System.out.println("Enter Id:");
                        String tid = sc.nextLine();
                        id[index] = tid; 
                        System.out.println("Enter Course Teaching:");
                        String cteaching = sc.nextLine();
                        courseteaching[index] = cteaching; 
                        
                        System.out.println("Record inserted successfully");
                        System.out.println("===============================================");
        }
        
        public void ShowTeacher(String Name[], String id[], String courseteaching[], int index)
        {
            if(id[0] == null)
            {
                System.out.println("No Record available");
            }
            for(int i = 0 ;i <= id.length ; i++)
            {
            if(id[i] == null)
            {
                break;
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("Teacher Name : "+Name[i]);
            System.out.println("ID           :"+id[i]);
            System.out.println("Course Teaching :"+courseteaching[i]);
            System.out.println("-----------------------------------------------------------");
            }
        }

	public void RemoveTeacher(String id[], String Name[], String courseteaching[]) 
        {
         try
         {
            String id3;
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter Teacher id");
                 id3 = obj.nextLine();
                 
            for(int i = 0 ; i < id.length ; i++)
            {
                if(id[i].equals(id3))
                {
                    for(int j = i; j < id.length - 1; j++)
                    {
                         id[j] = id[j+1];
                         Name[j]=Name[j+1];
                         courseteaching[j]=courseteaching[j+1];   
                    }
                    System.out.println("deleted");
                    break;
                }
            }
          }
         catch(Exception e)
         {
             System.out.println("No such id found");
         }   
	}

	public void AddStudent(String sname[], String rno[], String semester[], int index ) 
        {
                       Scanner sc = new Scanner(System.in);
                        System.out.println("Enter Name:");
                        String sname1 = sc.nextLine();
                        sname[index] = sname1;
                        System.out.println("Enter Roll Number:");
                        String rno1 = sc.nextLine();
                        rno[index] = rno1; 
                        System.out.println("Enter Semester:");
                        String semester1 = sc.nextLine();
                        semester[index] = semester1; 
                        
                        System.out.println("Record Of student inserted successfully");
                        System.out.println("===============================================");
	}

	public void AddTestPaper() 
        {
		// TODO - implement Admin.AddTestPaper
		throw new UnsupportedOperationException();
	}

	public void RemoveTestPaper() 
        {
		// TODO - implement Admin.RemoveTestPaper
		throw new UnsupportedOperationException();
	}

	public void File()
        {
             try 
             {
                  FileWriter myWriter = new FileWriter("filename.txt");
                  myWriter.write("WELCOME TO OUR STUDENTINFO MANAGEMENT SYSTEM");
                   myWriter.close();
                   System.out.println("Successfully wrote to the file.");
             } 
             catch (Exception e)
             {
             System.out.println("An error occurred.");
             e.printStackTrace();
             }
	}
}
 
class Teacher extends Admin 
{
	private String Name;
	private int id;

	public void AddTestPaper()
        {
            
	}

	public void RemoveTestPaper() 
        {
		// TODO - implement Teacher.RemoveTestPaper
		throw new UnsupportedOperationException();
	}
}
 
  class TestPaper implements Student 
  {
	private String Name;
	private int CourseNo;

	public void AddMarks(String rnomarks[], String rnocourse[], int marks[], int index) 
        {
            Scanner sc = new Scanner(System.in);    
            System.out.println("Enter Roll Number Of Student:");
            String rno1 = sc.nextLine();
            rnomarks[index] = rno1;
            System.out.println("Enter course Name");
            String cname = sc.nextLine();
            rnocourse[index]= cname;
            System.out.println("Enter Marks Obtained");
            int cmarks = sc.nextInt();
            marks[index] = cmarks;
            System.out.println("Record Of Marks inserted successfully");
            System.out.println("====================================================================");           
	}
        
        public void ShowMarks(String rnomarks[], String rnocourse[], int marks[], int index)
        {
            if(rnomarks[0] == null)
            {
                System.out.println("No Record available");
            }
            for(int i = 0 ;i <= index-1 ; i++)
            {
            if(rnomarks[i] == null)
            {
                break;
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("Roll Number : "+rnomarks[i]);
            System.out.println("Course Name :"+rnocourse[i]);
            System.out.println("Marks Obtained :"+marks[i]+"/100");
            System.out.println("-----------------------------------------------------------");
            }
        }

	public void DeleteMarks(String rnomarks[] ,String rnocourse[] ,int marks[]) 
        {
            try
            {
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter Roll Number:");
                 String crno = obj.nextLine();
                 
            for(int i = 0 ; i < rnomarks.length ; i++)
            {
                if(rnomarks[i].equals(crno))
                {
                    for(int j = i; j < rnomarks.length - 1; j++)
                    {
                         rnomarks[j] = rnomarks[j+1];
                         rnocourse[j]= rnocourse[j+1];
                         marks[j] = marks[j+1];  
                    }
                    System.out.println("deleted");
                    break;
                }
            }
          }
         catch(Exception e)
         {
             System.out.println("No such id found");
         }
	}

    @Override
    public void Display(String sname[], String rno[], String semester[], int index) 
    {
            if(rno[0] == null)
            {
                System.out.println("No Record available");
            }
            for(int i = 0 ;i <= index-1 ; i++)
            {
            if(rno[i] == null)
            {
                break;
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("Name       : "+sname[i]);
            System.out.println("Roll No    :"+rno[i]);
            System.out.println("Semester   :"+semester[i]);
            System.out.println("-----------------------------------------------------------");
            }
    }
  }
 
 class Courses extends TestPaper
 {
	private String Name;
	private int Course;

	public void AddCourse(String course[],int index) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name of course");
            String course1 = sc.nextLine();
            
            course[index] = course1;
            
            System.out.println("Course Added Successfully");  
	}
        
        public void ShowCourse(String course[],int index)
        {
            if(course[0] == null)
            {
                 System.out.println("No Course Available");
            }   
            for(int i = 0 ;  i <= index-1 ; i++)
                 {
                     if(course[i] == null)
                     {
                         break;
                     }
                     System.out.println("=========================================================");
                     System.out.println("Course :"+course[i]);
                     System.out.println("=========================================================");
                 }     
        }

	public void DeleteCourse(String course[]) 
        {
		try
                {
                    Scanner obj = new Scanner(System.in);
                    System.out.println("Course Name");
                    String course1 = obj.nextLine();
                 
                    for(int i = 0 ; i < course.length ; i++)
                      {
                         if(course[i].equals(course1))
                          {
                           for(int j = i; j < course.length - 1; j++)
                            {
                               course[j] = course[j+1];
                         
                            }
                              System.out.println("Course Deleted");
                              break;
                          }
                      }
                }
                catch(Exception e)
                {
                    System.out.println("No Such Record Found");
                }
	}
}
 
 class Teacher_Salary extends Admin
 {
	private String Name;
	private int Id;

	public void AddSalary(String rnomarks[], int marks[], int index)
        {
            System.out.println("=======================================================================================");
            System.out.println("RollNo "+rnomarks[index]+" Has marks "+marks[index]+" Which is greater than 90 so Teacher will have an increment in salary ");
	}

	public void DecrementSalary(String rnomarks[], int marks[], int index) 
        {            
                     System.out.println("=======================================================================================");
                     System.out.println("RollNo "+rnomarks[index]+" Has marks "+marks[index]+" is less than 60 so Teacher will have decrement in salary ");
	}
}
 
 class Result extends Teacher_Salary 
 {
	private String Name;
	private int CourseId;
 }

public class project
{
    public static void main(String args[]) throws Exception
    {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con = DriverManager.getConnection("jdbc:unaccess://Project.accdb");
        
        
        String sql = "Select * from Teacher";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        
        while(rs.next())
        {
            System.out.print("ID : " + rs.getInt(1)+"\t");
            System.out.print("Teacher Name : " + rs.getString(2)+"\t");
            System.out.print("Course Teaching : " + rs.getString(3));
        }
        
        
        sql = "Select * from Student";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        
        while(rs.next())
        {
            System.out.print("Roll Number : " + rs.getInt(1)+"\t");
            System.out.print("Student Name : " + rs.getString(2)+"\t");
            System.out.print("Semester Number : " + rs.getInt(3));
        }
        
        
        sql = "Select * from Course";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        
        while(rs.next())
        {
            System.out.print("Course Name : " + rs.getString(1));
        }
        
        
        String  name[] = new String[50];
        String idno[] = new String[50];
        String courseteaching[] = new String[50];
        String sname[] = new String[50];
        String rollno[] = new String[50];
        String semester[] = new String[50];
        String course[] = new String[50];
        int marks[] = new int[50];
        String rnomarks[] = new String[50];
        String rnocourse[] = new String[50];
        

        
        while(true)
        {
        Admin admin = new Admin();
        String [] TeacherName = {};
        String id = "admin";
        String password = "admin";
        
        Scanner obj = new Scanner(System.in);
        System.out.println("######################################WELCOME TO STUDENTINFO SYSTEM#############################################");
        System.out.println("Enter ID:");
        String id1 = obj.nextLine();
        System.out.println("Enter Password:");
        String  pass = obj.nextLine();
        Courses cs = new Courses();
            
            if(id1.equals(id) && pass.equals(password))
            {
                
                for(int i = 0 ; i <= 50;i++)
                {
                    try
                    {
                System.out.println("||######################################################################################################||");
                System.out.println("\t\t\t\t\t  SYSTEM MENU");                
                System.out.println("\t\t\t\t\t---------------");
                System.out.println("\t\t\t\t\t1. Add Teacher.");
                System.out.println("\t\t\t\t\t2. Show Teachers list");
                System.out.println("\t\t\t\t\t3. RemoveTeacher.");
                System.out.println("\t\t\t\t\t4. Add Student.");
                System.out.println("\t\t\t\t\t5. Show Students list.");
                System.out.println("\t\t\t\t\t6. Add Course.");
                System.out.println("\t\t\t\t\t7. Show Course.");
                System.out.println("\t\t\t\t\t8. Delete Course.");
                System.out.println("\t\t\t\t\t9. Add Course Marks.");
                System.out.println("\t\t\t\t\t10.Show Course Marks.");
                System.out.println("\t\t\t\t\t11.Delete Course Marks.");
                System.out.println("\t\t\t\t\t12.Increase OR Decrease Salary.");
                System.out.println("\t\t\t\t\t13.Create File.");
                System.out.println("\t\t\t\t\t14.Exit.");
                System.out.println("\t\t\t\t\tEnter Your Choice:");
                int choice = obj.nextInt();
                
                if(choice == 1)
                {
                     admin.AddTeacher(name, idno, courseteaching,i);
                        continue;
                }    
                else if(choice == 2)
                {
                    admin.ShowTeacher(name, idno, courseteaching, i);
                                        i=0;
                    continue;
                }
                else if(choice == 3)
                {
                    admin.RemoveTeacher(idno,name,courseteaching);
                    continue;
                }
                else if(choice == 4)
                {
                    admin.AddStudent(sname, rollno, semester, i);
                    continue;
                }
                else if(choice == 5)
                {
                    TestPaper tp = new TestPaper();
                    tp.Display(sname, rollno, semester, i);
                    i=0;
                    continue;
                }
                else if(choice == 6)
                {
                    cs.AddCourse(course,i);
                    continue;
                }
                else if(choice == 7)
                {
                    cs.ShowCourse(course,i);
                    continue;
                }
                else if(choice == 8)
                {
                    cs.DeleteCourse(course);
                    continue;
                }
                else if(choice == 9)
                {
                    cs.AddMarks(rnomarks,rnocourse,marks,i);
                    continue;
                }
                else if(choice == 10)
                {
                    cs.ShowMarks(rnomarks,rnocourse,marks,i);
                    i=0;
                    continue;
                }
                else if(choice == 11)
                {
                    cs.DeleteMarks(rnomarks,rnocourse,marks);
                    continue;
                }
                else if(choice == 12)
                {
                    
                    for(int k=0;k<=marks.length;k++)
                    {
                        try
                        {
                        if(marks[k]<60 && marks[k]!=0)
                        {
                            Result result = new Result();
                            result.DecrementSalary(rnomarks,marks,k);   
                        }
                        if(marks[k]>=90)
                        {
                            Result result = new Result();
                            result.AddSalary(rnomarks,marks,k);
                        }
                        if(marks[k]<90 && marks[k]>60)
                        {
                            System.out.println("Roll No " +rnomarks[k]+" Has Satisfactory Marks So no changes in Teachers Salary will be done");
                        }
                        }
                        catch(Exception e)
                        {
                            break;
                        } 
                    }
                }
                else if(choice == 13)
                {
                    admin.File();
                }
                else if(choice == 14)
                {
                    System.exit(0);
                }
                }
                    catch(Exception e)
                {
                    break;
                }
                }
                
               
            }
            else
            {
                System.out.println("INCORRECT ID OR PASSWORD!!!TRYAGAIN");
                continue;
            }
           
        }       
    }
}
