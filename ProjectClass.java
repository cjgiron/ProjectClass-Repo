class ProjectClass {
    private String name;
    private String description;

    public ProjectClass() {
    }

    public ProjectClass(String name) {
        this.name = name;
    }

    public ProjectClass(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String projectName){
        name = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String projectDescription) {
        description = projectDescription;
    }

    public String elevatorPitch(String name, String description) {
        return name + " : " + description;
    }
}