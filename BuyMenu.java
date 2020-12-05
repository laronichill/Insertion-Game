import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuyMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuyMenu extends maps
{
    public BuyMenu()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MoneyCT moneyCT = new MoneyCT();
        addObject(moneyCT,300,150);
        MoneyT moneyT = new MoneyT();
        addObject(moneyT,300,150);
        UpgradeGunCT upgradeGunCT = new UpgradeGunCT();
        addObject(upgradeGunCT,300,150);
        UpgradeGunT upgradeGunT = new UpgradeGunT();
        addObject(upgradeGunT,300,150);
        BuyMenuItemsAndTexts buyMenuItemsAndTexts = new BuyMenuItemsAndTexts();
        addObject(buyMenuItemsAndTexts,300,150);
        UpgradeFeetCT upgradeCT = new UpgradeFeetCT();
        addObject(upgradeCT,300,150);
        UpgradeFeetT upgradeT = new UpgradeFeetT();
        addObject(upgradeT,300,150);
    }
}
