package test;

/**
 * SubRegister
 */
public class SubRegister extends Subject {
    private int semester;
    private Float score;

    public SubRegister(
            String id, String name,
            int semester,
            Float score) {
        super(id, name);
        this.semester = semester;
        this.score = score;
    }

    public SubRegister() {
    };

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Float getScore() {
        return this.score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public String toString() {

        return "{" +
                " semester='" + getSemester() + "'" +
                ", score='" + getScore() + "'" + super.toString() +
                "}";
    }

}