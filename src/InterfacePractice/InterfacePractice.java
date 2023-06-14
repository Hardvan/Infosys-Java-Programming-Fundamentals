package InterfacePractice;

interface DataProvider {
    // Variables: public, static, final by default
    // Methods: public, abstract by default

    int totalMaximumMarks = 8000;

    void calcPercentage();
}

class Intern implements DataProvider {
    int marksSecured;
    int graceMarks;

    Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    @Override
    public void calcPercentage() {
        double percentage = (marksSecured + graceMarks) / (double) totalMaximumMarks * 100;
        if (percentage > 100) {
            System.out.println("Invalid percentage");
        }
        System.out.println("Percentage: " + percentage);
    }
}

class Trainee implements DataProvider {
    int marksSecured;

    Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    @Override
    public void calcPercentage() {
        double percentage = marksSecured / (double) totalMaximumMarks * 100;
        if (percentage > 100) {
            System.out.println("Invalid percentage");
        }
        System.out.println("Percentage: " + percentage);
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        Intern intern = new Intern(5000, 500);
        intern.calcPercentage();

        Trainee trainee = new Trainee(6000);
        trainee.calcPercentage();
    }
}
