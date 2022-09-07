public class Branch {
    private int cityId ;
    private String city ;
    private int grade;

    public Branch(int cityId, String city, int grade) {
        this.cityId = cityId;
        this.city = city;
        setGrade(grade);
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {

        switch (grade){
            case 1:
                this.grade =1;
                break;
            case 2:
                this.grade=2;
                break;
            case 3 :
                this.grade=3;
                break;
            default:
                System.err.println("invalid input for grade");
        }

    }

    public String toString(){
        return String.format("City: %s \n City ID : %d \n Grade: %d",this.city,this.cityId,this.grade);
    }
}
