package android.studioprojects.everydayspells.Model;

public class CategoryItem {
    private String spellName;
    private String spellDescription;

    public CategoryItem() {


    }

    public CategoryItem(String spellName, String spellDescription) {
        this.spellName = spellName;
        this.spellDescription = spellDescription;

    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getSpellDescription() {
        return spellDescription;
    }

    public void setSpellDescription(String spellDescription) {
        this.spellDescription = spellDescription;
    }
}
