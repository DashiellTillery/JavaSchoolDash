public class School {
    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount;
    public School(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section[] getSections() {
        return sections;
    }
    public void addSections(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }
    public String toString() {
        return "The School named " + this.name + " has " + this.sectionCount + " sections";
    }
}
