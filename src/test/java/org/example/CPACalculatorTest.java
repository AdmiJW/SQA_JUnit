package org.example;

import org.junit.*;
import static org.junit.Assert.*;



public class CPACalculatorTest {

    Student st;
    CPACalculator cpaCalculator;

    @Before
    public void setUp() {
        st = new Student();
        cpaCalculator = new CPACalculator();
    }

    //================================
    // a) calculateGrade()
    //================================
    @Test
    public void TC_A_001_AttendanceValid() {
        st.setAttendance(80);
        st.setMark(95);

        String expected = "A+";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_002_AttendanceInvalid() {
        st.setAttendance(79);
        st.setMark(95);

        String expected = "fail-attendance";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_003_GradeAPlusUpper() {
        st.setAttendance(80);
        st.setMark(100);

        String expected = "A+";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_004_GradeALower() {
        st.setAttendance(80);
        st.setMark(80);

        String expected = "A";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_005_GradeAUpper() {
        st.setAttendance(80);
        st.setMark(94);

        String expected = "A";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_006_GradeBLower() {
        st.setAttendance(80);
        st.setMark(70);

        String expected = "B";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_007_GradeBUpper() {
        st.setAttendance(80);
        st.setMark(79);

        String expected = "B";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_008_GradeCLower() {
        st.setAttendance(80);
        st.setMark(60);

        String expected = "C";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_009_GradeCUpper() {
        st.setAttendance(80);
        st.setMark(69);

        String expected = "C";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_010_GradeDLower() {
        st.setAttendance(80);
        st.setMark(50);

        String expected = "D";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_011_GradeDUpper() {
        st.setAttendance(80);
        st.setMark(59);

        String expected = "D";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_012_GradeFailLower() {
        st.setAttendance(80);
        st.setMark(0);

        String expected = "Fail";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_013_GradeFailUpper() {
        st.setAttendance(80);
        st.setMark(49);

        String expected = "Fail";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_014_MarkInvalidUpper() {
        st.setAttendance(80);
        st.setMark(101);

        String expected = "invalid";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }

    @Test
    public void TC_A_015_MarkInvalidLower() {
        st.setAttendance(80);
        st.setMark(-1);

        String expected = "invalid";
        String actual = cpaCalculator.calculateGrade(st);

        assertEquals(expected, actual);
    }


    //================================
    // b) c) calculateCPA()
    //================================
    @Test
    public void TC_B_001_Valid() {
        st.setCarryCredit(1);
        st.setCurrentCredit(1);
        st.setCarryCPA(3.5);
        st.setCGPA(3.7);

        double expected = 3.6;
        double actual = cpaCalculator.calculateCPA(st);

        assertEquals(expected, actual, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TC_B_002_InvalidCurrentCredit() {
        st.setCarryCredit(1);
        st.setCurrentCredit(0);

        cpaCalculator.calculateCPA(st);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TC_B_003_InvalidCarryCredit() {
        st.setCarryCredit(0);
        st.setCurrentCredit(1);

        cpaCalculator.calculateCPA(st);
    }
}