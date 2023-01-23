class Human{
    private String name;
    private String nid;
    private int age;
    private String nationality;
    private String religion;
    private String gender;
    
    public Human(String name,String nid, int age,String nationality, String religion, String gender){
        this.name = name;
        this.nid = nid;
        this.age = age;
        this.nationality = nationality;
        this.religion = religion;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNid(){
        return nid;
    }
    public void setNid(String nid){
        this.nid = nid;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public String getReligion(){
        return religion;
    }
    public void setReligion(String religion){
        this.religion = religion;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void display(){
        System.out.println(name);
        System.out.println("");
        System.out.println(nid);
        System.out.println(age);
        System.out.println(nationality);
        System.out.println(religion);
        System.out.println(gender);
    }
}

class Main {
    public static void main(String[] args) {
       Human obj = new Human("Mutasaddeq","23546",24,"Bangladeshi","Islam","Male");
       obj.display();
    }
}
