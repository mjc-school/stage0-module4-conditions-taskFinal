package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year>0 && month>0 && month<13) {
            if(java.time.Year.of(year).isLeap() && month==2){
                System.out.println("29");
            } else {
                switch (month) {
                    case 1:
                        System.out.println("31");
                        break;
                    case 2:
                        System.out.println("28");
                        break;
                    case 3:
                        System.out.println("31");
                        break;
                    case 4:
                        System.out.println("30");
                        break;
                    case 5:
                        System.out.println("31");
                        break;
                    case 6:
                        System.out.println("30");
                        break;
                    case 7:
                        System.out.println("31");
                        break;
                    case 8:
                        System.out.println("31");
                        break; 
                    case 9:
                        System.out.println("30");
                        break;
                    case 10:
                        System.out.println("31");
                        break;
                    case 11:
                        System.out.println("30");
                        break;
                    case 12:
                        System.out.println("31");
                        break;    
                }
            }
        } else System.out.println("invalid date");
    }
}
