package classes;

public class CalcDamage {
    private int basicDamage;
    private int skillDamage;
    private double skillDamagePer;
    private int skillEnhancement;
    private int criticalDamage;
    private double criticalDamagePer;
    private double penetration;
    private double additionalDamagePer;
    private boolean critical;

    public CalcDamage() {
        basicDamage = -1;
        skillDamage = -1;
        skillDamagePer = -1;
        skillEnhancement = -1;
        criticalDamage = -1;
        criticalDamagePer = -1;
        penetration = -1;
        additionalDamagePer = -1;
        critical = false;
    }
    public void setStats(int bDmg, int sDmg, double sDmgP, int sEnh, int cDmg, double cDmgP, double pen, double aDmgP, boolean crit) {
        basicDamage = bDmg;
        skillDamage = sDmg;
        skillDamagePer = sDmgP;
        skillEnhancement = sEnh;
        criticalDamage = cDmg;
        criticalDamagePer = cDmgP;
        penetration = pen;
        additionalDamagePer = aDmgP;
        critical = crit;
    }
    public double getDamage(){
        double totalDamage = 0;
        if(critical) {
            totalDamage = (((((basicDamage * 2) + (skillDamage * 2) + (skillDamage * skillDamagePer)
            + (skillEnhancement * 2) + criticalDamage) * criticalDamagePer) * penetration) * additionalDamagePer);
        }
        if(!(critical)){
            totalDamage = (((basicDamage + skillDamage + (skillDamage * skillDamagePer)
                    + skillEnhancement) * penetration) * additionalDamagePer);
        }

        return totalDamage;
    }
}
