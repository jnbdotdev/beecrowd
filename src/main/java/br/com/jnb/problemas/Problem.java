package br.com.jnb.problemas;

public abstract class Problem {

    private int level;
    private int number;
    private String category;

    public enum Categories {
        BEGINNER,
        AD_HOC,
        STRINGS,
        STRUCTURES,
        MATHEMATICS,
        PARADIGMS,
        GRAPHS,
        GEOMETRY,
        SQL
    }

    public abstract void problem();

    public String getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = String.valueOf(category);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
