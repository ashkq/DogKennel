public class Dog {
    private Double Weight;
    private String Name;
    public double toKgs() {
        return Weight / 2.205;
    }
    public String toString() {
        return ("The name of the dog is " + Name + ", and it weighs " + Weight + " lbs");
    }
    public Dog() {
        Name = "dog";
        Weight = 0.0;
    }
    public String getName() {
        return Name;
        }
    public void setName(String newName) {
        this.Name = newName;
        }
    public Double getWeight() {
        return Weight;
        }
    public void setWeight(Double newWeight) {
        this.Weight = newWeight;
    }
}
