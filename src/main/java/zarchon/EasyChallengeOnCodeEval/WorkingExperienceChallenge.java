package zarchon.EasyChallengeOnCodeEval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Zarc
 */
public class WorkingExperienceChallenge {
    
    public static int getMonthsOfWorkingExperience(String sMonth, String sYear, String eMonth, String eYear){
        
        if(sMonth != null && sYear != null && sMonth != null && eYear != null)
        {
            int months = ((Integer.valueOf(eYear)-Integer.valueOf(sYear))*12)-Integer.valueOf(sMonth)+Integer.valueOf(eMonth)+1;
            return months;
        }
        else
        {
            return 0;
        }
        
//        String[] splitDates;
//        String startingDate, endingDate, startingMonth, startingYear, endingMonth, endingYear;
//        
//        splitDates = workingDates.split("-");
//        startingDate = splitDates[0];
//        endingDate = splitDates[1];
//        splitDates = startingDate.split("\\s");
//        startingMonth = splitDates[0];
//        startingYear = splitDates[1];
//        endingMonth = splitDates[2];
//        endingYear = splitDates[3];
//
////        if(integerestartingDate >= Integer.parseInt(endingDate.split("\\s")))
////        {
////            
////        }
    }
    
    public static String monthsToNumbers(String[] dates){
        String datesToFix = "";
        for(int i = 0; i<dates.length; i++)
        {
            datesToFix = datesToFix + dates[i] + " ";
        }
        datesToFix = datesToFix.replace("Jan", "1");
        datesToFix = datesToFix.replace("Feb", "2");
        datesToFix = datesToFix.replace("Mar", "3");
        datesToFix = datesToFix.replace("Apr", "4");
        datesToFix = datesToFix.replace("May", "5");
        datesToFix = datesToFix.replace("Jun", "6");
        datesToFix = datesToFix.replace("Jul", "7");
        datesToFix = datesToFix.replace("Aug", "8");
        datesToFix = datesToFix.replace("Sep", "9");
        datesToFix = datesToFix.replace("Oct", "10");
        datesToFix = datesToFix.replace("Nov", "11");
        datesToFix = datesToFix.replace("Dec", "12");
        return datesToFix;
    }
    
//    public static String[] clearOverlappingDates(String[] dates){
//        String[] clearedDates = new String[dates.length];
//        int j = 0, monthsOfFirstJob, monthsOfSecondJob,
//        startingYear1, endingYear1, startingYear2, endingYear2;
//        for (int i = 0; i < dates.length; i++) 
//        {
//            if (i + 6 < dates.length-1) 
//            {
//                startingYear1 = Integer.valueOf(dates[i + 1]);
//                endingYear1 = Integer.valueOf(dates[i + 3]);
//                startingYear2 = Integer.valueOf(dates[i + 5]);
//                endingYear2 = Integer.valueOf(dates[i + 7]);
//
//                if (startingYear1 < startingYear2) 
//                {
//                    if(endingYear1 >= endingYear2)
//                    {
//                        clearedDates[j] = dates[i];
//                        clearedDates[j+1] = dates[i+1];
//                        clearedDates[j+2] = dates[i+2];
//                        clearedDates[j+3] = dates[i+3];
//                        j = j + 4;
//                    }
//                    else
//                    {
//                        monthsOfFirstJob = getMonthsOfWorkingExperience(dates[i],dates[i+1],dates[i+2],dates[i+3]);
//                        monthsOfSecondJob = getMonthsOfWorkingExperience(dates[i+4],dates[i+5],dates[i+6],dates[i+7]);
//                        if(monthsOfFirstJob > monthsOfSecondJob)
//                        {
//                            clearedDates[j] = dates[i];
//                            clearedDates[j+1] = dates[i+1];
//                            clearedDates[j+2] = dates[i+2];
//                            clearedDates[j+3] = dates[i+3];
//                            j = j + 4;
//                        }
//                        else
//                        {
//                            clearedDates[j] = dates[i+4];
//                            clearedDates[j+1] = dates[i+5];
//                            clearedDates[j+2] = dates[i+6];
//                            clearedDates[j+3] = dates[i+7];
//                            j = j + 4;
//                        }
//                    }
//                } 
//                else if ( startingYear1 > startingYear2 )
//                {
//                    if(endingYear1 <= endingYear2)
//                    {
//                        clearedDates[j] = dates[i+4];
//                        clearedDates[j+1] = dates[i+5];
//                        clearedDates[j+2] = dates[i+6];
//                        clearedDates[j+3] = dates[i+7];
//                        j = j + 4;
//                    }
//                    else
//                    {
//                        monthsOfFirstJob = getMonthsOfWorkingExperience(dates[i],dates[i+1],dates[i+2],dates[i+3]);
//                        monthsOfSecondJob = getMonthsOfWorkingExperience(dates[i+4],dates[i+5],dates[i+6],dates[i+7]);
//                        if(monthsOfFirstJob > monthsOfSecondJob)
//                        {
//                            clearedDates[j] = dates[i];
//                            clearedDates[j+1] = dates[i+1];
//                            clearedDates[j+2] = dates[i+2];
//                            clearedDates[j+3] = dates[i+3];
//                            j = j + 4;
//                        }
//                        else
//                        {
//                            clearedDates[j] = dates[i+4];
//                            clearedDates[j+1] = dates[i+5];
//                            clearedDates[j+2] = dates[i+6];
//                            clearedDates[j+3] = dates[i+7];
//                            j = j + 4;
//                        }
//                    }
//                }
//                else
//                {
//                    monthsOfFirstJob = getMonthsOfWorkingExperience(dates[i],dates[i+1],dates[i+2],dates[i+3]);
//                    monthsOfSecondJob = getMonthsOfWorkingExperience(dates[i+4],dates[i+5],dates[i+6],dates[i+7]);
//                    if(monthsOfFirstJob > monthsOfSecondJob)
//                    {
//                        clearedDates[j] = dates[i];
//                        clearedDates[j+1] = dates[i+1];
//                        clearedDates[j+2] = dates[i+2];
//                        clearedDates[j+3] = dates[i+3];
//                        j = j + 4;
//                    }
//                    else
//                    {
//                        clearedDates[j] = dates[i+4];
//                        clearedDates[j+1] = dates[i+5];
//                        clearedDates[j+2] = dates[i+6];
//                        clearedDates[j+3] = dates[i+7];
//                        j = j + 4;
//                    }
//                }
//            }
////            else if( dates.length%2 != 0 )
////            {
////                clearedDates[j] = dates[i];
////                clearedDates[j+1] = dates[i+1];
////                clearedDates[j+2] = dates[i+2];
////                clearedDates[j+3] = dates[i+3];
////            }
//            i = i + 3;
//        }
//        
//        return clearedDates;
//    }
    //Base Pointer values == 0 , 4 , 8 , 12 .... 
    public static String[] clearOverlappingDates(int basePointer, String[] dates)
    {
        String sYear1, eYear1, sYear2, eYear2;
        int monthsOfFirstJob,monthsOfSecondJob;
        //String[] clearedDates;
        for(int i = basePointer+4; i<dates.length; i += 4)
        {
            if(i+3 < dates.length)
            {
                sYear1 = dates[basePointer+1];
                eYear1 = dates[basePointer+3];
                sYear2 = dates[i+1];
                eYear2 = dates[i+3];
                if(Integer.parseInt(eYear1) <= Integer.parseInt(sYear2)) // || Integer.parseInt(sYear1) > Integer.parseInt(sYear2))
                {
                    //next cause they are not overlapping
                }
                else
                {
                    monthsOfFirstJob = getMonthsOfWorkingExperience(dates[basePointer],dates[basePointer+1],dates[basePointer+2],dates[basePointer+3]);
                    monthsOfSecondJob = getMonthsOfWorkingExperience(dates[i],dates[i+1],dates[i+2],dates[i+3]);
                    if(monthsOfFirstJob < monthsOfSecondJob)
                    {
                        dates[basePointer] = dates[i];
                        dates[basePointer+1] = dates[i+1];
                        dates[basePointer+2] = dates[i+2];
                        dates[basePointer+3] = dates[i+3];
                    }
                    dates[i] = null;
                    dates[i+1] = null;
                    dates[i+2] = null;
                    dates[i+3] = null;
                }
            }
            else
            {
                dates = clearOverlappingDates(basePointer+4, dates);
            }
        }
        return dates;
    }
    
//    public static String[] sortDatesByYear(String[] dates, int high, int low)
//    {
//        String[] sortedDates,tempDates = new String[4];
//        
//        int sYear1,eYear1,sYear2,eYear2;
//        for(int i=0; i<dates.length; i++)
//        {
//            sYear1 = Integer.parseInt(dates[i+1]);
//            eYear1 = Integer.parseInt(dates[i+3]);
//            sYear2 = Integer.parseInt(dates[i+5]);
//            eYear2 = Integer.parseInt(dates[i+7]);
//            if(i + 6 < dates.length-1)
//            {
//                if(sYear1 > sYear2 && eYear1 > eYear2)
//                {
//                    tempDates[0] = dates[i];
//                    tempDates[1] = dates[i+1];
//                    tempDates[2] = dates[i+2];
//                    tempDates[3] = dates[i+3];
//                    dates[i] = dates[i+4];
//                    dates[i+1] = dates[i+5];
//                    dates[i+2] = dates[i+6];
//                    dates[i+3] = dates[i+7];
//                    dates[i+4] = tempDates[0];
//                    dates[i+5] = tempDates[1];
//                    dates[i+6] = tempDates[2];
//                    dates[i+7] = tempDates[3];                                        
//                }
//                else if(sYear1 < sYear2 && eYear1 < eYear2)
//                {
//                    
//                }
//            }
//        }
//        return null;
//    }
    
    public static void workingExperienceChallenge(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, allDates, startingDate, endingDate;
            String[] workingDates, workingDates2;
            int totalMonths, totalDates;
            while((line = br.readLine()) != null && !line.trim().isEmpty())
            {
                totalMonths = 0;
                totalDates = 0;
                allDates = line.replace(";", "");
                allDates = allDates.replace("-", " ");
                workingDates = allDates.split("\\s");
                allDates = monthsToNumbers(workingDates);
                workingDates = allDates.split("\\s");
                //workingDates = sortDatesByYear(workingDates);
                workingDates2 = clearOverlappingDates(0,workingDates);
////                for(int i=0; i<workingDates2.length; i++)
////                {
////                    if(!workingDates2[i].equals("0"))
////                        totalDates++;
////                }
////                workingDates = new String[totalDates];
////                for(int i=0; i<workingDates.length; i++)
////                {
////                    workingDates[i] = workingDates2[i];
////                }
               // workingDates = clearOverlappingDates(workingDates);
                //workingDates2 = clearOverlappingDates(workingDates);
//                for(int i=0; i<splitDates.length/4; i++)
//                {
//                    if(i+4<splitDates.length)
//                    {
//                       
//                    }
//                }
                for(int i =0 ; i<workingDates2.length; i++)
                {
                    System.out.print(workingDates2[i] + " ");
                }
                System.out.println();
                for(int i =0 ; i < workingDates2.length; i+=4)
                {
                    //System.out.print(workingDates2[i] + " ");
                    if(i+3 < workingDates2.length)
                    {
                        totalMonths = totalMonths + getMonthsOfWorkingExperience(workingDates2[i], workingDates2[i+1], workingDates2[i+2], workingDates2[i+3]);
                        //i = i +3;
                    }
                }
                System.out.println("Total Working Experience in Months = " + totalMonths);
                System.out.println("Total Working Experience in Years = " + totalMonths/12);
                System.out.println("===============================================");
                totalMonths = 0;
               // System.out.println(monthsToNumbers(workingDates));
                 
               
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testWorkingExperience.txt");
        workingExperienceChallenge(file);
    }
    
}
