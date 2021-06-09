class ProjectClassTest {

    public static void main(String[] args) {
        ProjectClass proj1 = new ProjectClass();

        proj1.setName("java");
        proj1.setDescription("A heavily Object Oriented Programming language.");

        String proj1Name = proj1.getName();
        String proj1Description = proj1.getDescription();

        System.out.println(proj1.elevatorPitch(proj1Name, proj1Description));
    }
}