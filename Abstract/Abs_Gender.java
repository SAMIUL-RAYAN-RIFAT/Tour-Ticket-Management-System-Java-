package Abstract;

public abstract class Abs_Gender{
    protected String gender;

    public Abs_Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void showDetails();        //abstract method
}