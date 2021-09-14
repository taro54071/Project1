/*
    6313133 ปุญญาวัตน์ เจริญศิริพงศ์
    6313218 วศิน ไพจิตร์
*/

import java.util.*;
import java.io.*;


class Film implements Comparable<Film> {
    private String name;
    private int year, best, wins, nominations;
    public Film(String n, int y, int b, int w, int no){
        name = n;
        year = y;
        best = b;
        wins = w;
        nominations = no;
        //System.out.printf("%s\t\t\t%d,%d,%d,%d\n",name,y,b,w,no);
    }
    public void print() {
        if(best == 0) System.out.printf("%-20s\t\t\t\t%3d\t\t\t%d\t\t\t%d\n",name,wins,nominations,year);
        else System.out.printf("%-20s\t(best film)\t\t%3d\t\t\t%d\t\t\t%d\n",name,wins,nominations,year);
    }
    public int compareTo(Film other){
        //System.out.printf("%s\t\t\t%d,%d,%d,%d\n",this.name,this.year,this.best,this.wins,this.nominations);
        if(this.wins == other.wins){
            if(this.nominations == other.nominations){
                if(this.best == other.best){
                    if(this.year == other.year){
                        if(this.name.compareTo(other.name) > 0){
                            return 1;
                            //move backward
                        }
                        else if(this.name.compareTo(other.name) < 0){
                            return -1;
                            // move forward
                        }
                        else return 0;
                        // stay still

                    }
                    else if(this.year < other.year) return -1;
                    else return 1;
                }
                else if (this.best > other.best){
                    return -1;
                }
                else return 1;
            }
            else if(this.nominations > other.nominations) return -1;
            else return 1;
        }
        else if(this.wins > other.wins) return -1;
        else return 1; 
    }
}

// class Myexception extends ArithmeticException{

// }


public class Statistics {
    public static void main(String[] args){
        Boolean opensuccess = false;
        String filename = "oscars_errors.txt";
        ArrayList<Film> AL = new ArrayList<Film>();
        Scanner keyboardscan = new Scanner(System.in);
        while(!opensuccess){
            try(
                
                Scanner s = new Scanner(new File(filename));
            ){
                opensuccess = true;
            }
            catch(FileNotFoundException e){
                System.out.println(e);
                System.out.println("File name = ");
                filename = keyboardscan.next();
            }
        }
        

        try{
            Scanner s = new Scanner(new File(filename));
            while(s.hasNext()){
                String line = s.nextLine();
                String [] buf = line.split(",");
                try{
                    if(Integer.parseInt(buf[2].trim()) != 1 && Integer.parseInt(buf[2].trim()) != 0){
                        throw new ArithmeticException("My exception for invalid flag :" + buf[2]);
                    }
                    for(int i=1;i<buf.length;i++){
                        if(Integer.parseInt(buf[i].trim()) < 0){
                            throw new ArithmeticException("My exception for negative value :" + buf[i]);
                        }
                    }
                    
                    Film f = new Film(buf[0],Integer.parseInt(buf[1].trim()),Integer.parseInt(buf[2].trim()),Integer.parseInt(buf[3].trim()),Integer.parseInt(buf[4].trim()));
                    AL.add(f);
                }
                catch(Exception e){
                    System.out.println(e);
                    System.out.printf("%s,",buf[0]);
                    for(int i=1;i<buf.length;i++){
                        if(i==buf.length-1) System.out.printf(buf[i]);
                        else System.out.printf(buf[i] + ",");
                    }
                    System.out.println();
                }
            }

            Collections.sort(AL);
            System.out.printf("\nFilm\t\t\t\t\t\tWins\t\t   Nominations\t\t\tYear\n");
            System.out.printf("====================================================================================================================\n");
            for(int i =0; i<AL.size(); i++){
                AL.get(i).print();
            }
        }
        catch (Exception e){
            System.out.println("Error has occur, End program");
        }
        finally{
            keyboardscan.close();
        }
    }
}