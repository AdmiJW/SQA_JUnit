package org.example;

public class CPACalculator {

    public String calculateGrade(Student st) {
        String gred;

        if (st.getAttendance() >= 80) {
            if (st.getMark() > 100 ) gred = "invalid";
            else if (st.getMark() >= 95) gred = "A+";
            else if (st.getMark() >= 80) gred = "A";
            else if (st.getMark() >= 70) gred = "B";
            else if (st.getMark() >= 60) gred = "C";
            else if (st.getMark() >= 50) gred = "D";
            else if (st.getMark() >= 0) gred = "Fail";
            else gred = "invalid";
        }
        else gred = "fail-attendance";

        return gred;
    }

    public double calculateCPA(Student st) throws IllegalArgumentException {
        double CPA = 0.0;

        if ( (st.getCarryCredit() <= 0) || (st.getCurrentCredit() <= 0) )
            throw new IllegalArgumentException();

        CPA = (
            (st.getCarryCPA() * st.getCarryCredit() ) +
            (st.getCGPA() * st.getCurrentCredit() )
        ) / (st.getCarryCredit() + st.getCurrentCredit() );

        return CPA;
    }
}
