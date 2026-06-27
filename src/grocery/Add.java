package grocery;

import java.io.*;
import java.util.*;

public class Add extends javax.swing.JFrame {

    public Add(String content) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        
        
        subtract.setVisible(false);
        add.setVisible(false);
        buttons();
        
        productNamePH.setText(content);
            
        switch (content) {
            // <editor-fold defaultstate="collapsed" desc="DAIRY PRODUCT PRICING"> 
            case "Butter":
                productPricePH.setText("200");
                try (Scanner scannerButter = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Butter.txt"))){
                    int quantityButter = scannerButter.nextInt();
                    stock.setText(Integer.toString(quantityButter));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case "Buttermilk":
                productPricePH.setText("120");
                try (Scanner scannerButtermilk = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Buttermilk.txt"))) {
                    int quantityButtermilk = scannerButtermilk.nextInt();
                    stock.setText(Integer.toString(quantityButtermilk));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case "Cheese":
                productPricePH.setText("450");
                try (Scanner scannerCheese = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Cheese.txt"))){
                    int quantityCheese = scannerCheese.nextInt();
                    stock.setText(Integer.toString(quantityCheese));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "CottageCheese":
                productPricePH.setText("200");
                try (Scanner scannerCottageCheese = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\CottageCheese.txt"))){
                    int quantityCottageCheese = scannerCottageCheese.nextInt();
                    stock.setText(Integer.toString(quantityCottageCheese));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Cream":
                productPricePH.setText("40");
                try (Scanner scannerCream = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Cream.txt"))){
                    int quantityCream = scannerCream.nextInt();
                    stock.setText(Integer.toString(quantityCream));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "IceCream":
                productPricePH.setText("300");
                try (Scanner scannerIceCream = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\IceCream.txt"))){
                    int quantityIceCream = scannerIceCream.nextInt();
                    stock.setText(Integer.toString(quantityIceCream));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Milk":
                productPricePH.setText("120");
                try (Scanner scannerMilk = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Milk.txt"))){
                    int quantityMilk = scannerMilk.nextInt();
                    stock.setText(Integer.toString(quantityMilk));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Parmesan":
                productPricePH.setText("350");
                try (Scanner scannerParmesan = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\ParmesanCheese.txt"))){
                    int quantityParmesan = scannerParmesan.nextInt();
                    stock.setText(Integer.toString(quantityParmesan));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "SourCream":
                productPricePH.setText("100");
                try (Scanner scannerSourCream = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\SourCream.txt"))){
                    int quantitySourCream = scannerSourCream.nextInt();
                    stock.setText(Integer.toString(quantitySourCream));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Yogurt":
                productPricePH.setText("50");
                try (Scanner scannerYogurt = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\Dairy\\Yogurt.txt"))){
                    int quantityYogurt = scannerYogurt.nextInt();
                    stock.setText(Integer.toString(quantityYogurt));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="BEVERAGE PRODUCT PRICING"> 
            case "AppleJuice":
            productPricePH.setText("60");
            try (Scanner scannerAppleJuice = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\AppleJuice.txt"))) {
                int quantityAppleJuice = scannerAppleJuice.nextInt();
                stock.setText(Integer.toString(quantityAppleJuice));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Coffee":
            productPricePH.setText("150");
            try (Scanner scannerCoffee = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Coffee.txt"))) {
                int quantityCoffee = scannerCoffee.nextInt();
                stock.setText(Integer.toString(quantityCoffee));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Chardonnay":
            productPricePH.setText("2000");
            try (Scanner scannerChardonnay = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Chardonnay.txt"))) {
                int quantityChardonnay = scannerChardonnay.nextInt();
                stock.setText(Integer.toString(quantityChardonnay));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "HotChocolate":
            productPricePH.setText("80");
            try (Scanner scannerHotChocolate = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\HotChocolate.txt"))) {
                int quantityHotChocolate = scannerHotChocolate.nextInt();
                stock.setText(Integer.toString(quantityHotChocolate));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "IcedTea":
            productPricePH.setText("30");
            try (Scanner scannerIcedTea = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\IcedTea.txt"))) {
                int quantityIcedTea = scannerIcedTea.nextInt();
                stock.setText(Integer.toString(quantityIcedTea));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Lemonade":
            productPricePH.setText("50");
            try (Scanner scannerLemonade = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Lemonade.txt"))) {
                int quantityLemonade = scannerLemonade.nextInt();
                stock.setText(Integer.toString(quantityLemonade));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Merlot":
            productPricePH.setText("2500");
            try (Scanner scannerMerlot = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Merlot.txt"))) {
                int quantityMerlot = scannerMerlot.nextInt();
                stock.setText(Integer.toString(quantityMerlot));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "OrangeJuice":
            productPricePH.setText("60");
            try (Scanner scannerOrangeJuice = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\OrangeJuice.txt"))) {
                int quantityOrangeJuice = scannerOrangeJuice.nextInt();
                stock.setText(Integer.toString(quantityOrangeJuice));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "PinotNoir":
            productPricePH.setText("2100");
            try (Scanner scannerPinotNoir = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\PinotNoir.txt"))) {
                int quantityPinotNoir = scannerPinotNoir.nextInt();
                stock.setText(Integer.toString(quantityPinotNoir));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Water":
            productPricePH.setText("20");
            try (Scanner scannerWater = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Beverage\\Water.txt"))) {
                int quantityWater = scannerWater.nextInt();
                stock.setText(Integer.toString(quantityWater));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="PRODUCE PRODUCT PRICING"> 
            case "Apples":
                productPricePH.setText("50");
                try (Scanner scannerApples = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Apples.txt"))) {
                    int quantityApples = scannerApples.nextInt();
                    stock.setText(Integer.toString(quantityApples));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Carrots":
                productPricePH.setText("30");
                try (Scanner scannerCarrots = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Carrots.txt"))) {
                    int quantityCarrots = scannerCarrots.nextInt();
                    stock.setText(Integer.toString(quantityCarrots));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Garlic":
                productPricePH.setText("80");
                try (Scanner scannerGarlic = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Garlic.txt"))) {
                    int quantityGarlic = scannerGarlic.nextInt();
                    stock.setText(Integer.toString(quantityGarlic));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Grapes":
            productPricePH.setText("300");
            try (Scanner scannerGrapes = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Grapes.txt"))) {
                int quantityGrapes = scannerGrapes.nextInt();
                stock.setText(Integer.toString(quantityGrapes));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Lettuce":
            productPricePH.setText("50");
            try (Scanner scannerLettuce = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Lettuce.txt"))) {
                int quantityLettuce = scannerLettuce.nextInt();
                stock.setText(Integer.toString(quantityLettuce));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Orange":
            productPricePH.setText("60");
            try (Scanner scannerOranges = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Oranges.txt"))) {
                int quantityOranges = scannerOranges.nextInt();
                stock.setText(Integer.toString(quantityOranges));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Potatoes":
            productPricePH.setText("200");
            try (Scanner scannerPotatoes = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Potatoes.txt"))) {
                int quantityPotatoes = scannerPotatoes.nextInt();
                stock.setText(Integer.toString(quantityPotatoes));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Spinach":
            productPricePH.setText("100");
            try (Scanner scannerSpinach = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Spinach.txt"))) {
                int quantitySpinach = scannerSpinach.nextInt();
                stock.setText(Integer.toString(quantitySpinach));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Tomstoes":
            productPricePH.setText("80");
            try (Scanner scannerTomatoes = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Tomstoes.txt"))) {
                int quantityTomatoes = scannerTomatoes.nextInt();
                stock.setText(Integer.toString(quantityTomatoes));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            case "Watermelons":
            productPricePH.setText("150");
            try (Scanner scannerWatermelons = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Produce\\Watermelons.txt"))) {
                int quantityWatermelons = scannerWatermelons.nextInt();
                stock.setText(Integer.toString(quantityWatermelons));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            break;
            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="HOUSEHOLD SUPPLIES PRODUCT PRICING"> 
            case "Bleach":
                productPricePH.setText("120");
                try (Scanner scannerBleach = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Store Database\\Presets\\House Supplies\\Bleach.txt"))) {
                    int quantityBleach = scannerBleach.nextInt();
                    stock.setText(Integer.toString(quantityBleach));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "DishSoap":
                productPricePH.setText("150");
                try (Scanner scannerDishSoap = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\DishSoap.txt"))) {
                    int quantityDishSoap = scannerDishSoap.nextInt();
                    stock.setText(Integer.toString(quantityDishSoap));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "LaundryDetergent":
                productPricePH.setText("300");
                try (Scanner scannerLaundryDetergent = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\LaundryDetergent.txt"))) {
                    int quantityLaundryDetergent = scannerLaundryDetergent.nextInt();
                    stock.setText(Integer.toString(quantityLaundryDetergent));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "PaperTowels":
                productPricePH.setText("150");
                try (Scanner scannerPaperTowels = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\PaperTowels.txt"))) {
                    int quantityPaperTowels = scannerPaperTowels.nextInt();
                    stock.setText(Integer.toString(quantityPaperTowels));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "RubbingAlcohol":
                productPricePH.setText("100");
                try (Scanner scannerRubbingAlcohol = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\RubbingAlcohol.txt"))) {
                    int quantityRubbingAlcohol = scannerRubbingAlcohol.nextInt();
                    stock.setText(Integer.toString(quantityRubbingAlcohol));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Sponges":
                productPricePH.setText("120");
                try (Scanner scannerSponges = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\Sponges.txt"))) {
                    int quantitySponges = scannerSponges.nextInt();
                    stock.setText(Integer.toString(quantitySponges));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Softener":
                productPricePH.setText("80");
                try (Scanner scannerSoftener = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\Softener.txt"))) {
                    int quantitySoftener = scannerSoftener.nextInt();
                    stock.setText(Integer.toString(quantitySoftener));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "ToiletPaper":
                productPricePH.setText("100");
                try (Scanner scannerToiletPaper = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\ToiletPaper.txt"))) {
                    int quantityToiletPaper = scannerToiletPaper.nextInt();
                    stock.setText(Integer.toString(quantityToiletPaper));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "TrashBag":
                productPricePH.setText("100");
                try (Scanner scannerTrashBags = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\TrashBags.txt"))) {
                    int quantityTrashBags = scannerTrashBags.nextInt();
                    stock.setText(Integer.toString(quantityTrashBags));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Vinegar":
                productPricePH.setText("80");
                try (Scanner scannerVinegar = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\HouseSupplies\\Vinegar.txt"))) {
                    int quantityVinegar = scannerVinegar.nextInt();
                    stock.setText(Integer.toString(quantityVinegar));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="MEAT PRODUCT PRICING"> 
            case "Bacon":
                productPricePH.setText("300");
                    try (Scanner scannerBacon = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Bacon.txt"))) {
                    int quantityBacon = scannerBacon.nextInt();
                    stock.setText(Integer.toString(quantityBacon));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Beef":
                productPricePH.setText("500");
                try (Scanner scannerBeef = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Beef.txt"))) {
                    int quantityBeef = scannerBeef.nextInt();
                    stock.setText(Integer.toString(quantityBeef));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Chicken":
                productPricePH.setText("250");
                try (Scanner scannerChicken = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Chicken.txt"))) {
                    int quantityChicken = scannerChicken.nextInt();
                    stock.setText(Integer.toString(quantityChicken));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Duck":
                productPricePH.setText("800");
                try (Scanner scannerDuck = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Duck.txt"))) {
                    int quantityDuck = scannerDuck.nextInt();
                    stock.setText(Integer.toString(quantityDuck));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Lamb":
                productPricePH.setText("850");
                try (Scanner scannerLamb = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Lamb.txt"))) {
                    int quantityLamb = scannerLamb.nextInt();
                    stock.setText(Integer.toString(quantityLamb));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Pork":
                productPricePH.setText("300");
                try (Scanner scannerPork = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Pork.txt"))) {
                    int quantityPork = scannerPork.nextInt();
                    stock.setText(Integer.toString(quantityPork));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Salmon":
                productPricePH.setText("525");
                try (Scanner scannerSalmon = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Salmon.txt"))) {
                    int quantitySalmon = scannerSalmon.nextInt();
                    stock.setText(Integer.toString(quantitySalmon));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Shrimp":
                productPricePH.setText("375");
                try (Scanner scannerShrimp = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Shrimp.txt"))) {
                    int quantityShrimp = scannerShrimp.nextInt();
                    stock.setText(Integer.toString(quantityShrimp));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Turkey":
                productPricePH.setText("600");
                try (Scanner scannerTurkey = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Turkey.txt"))) {
                    int quantityTurkey = scannerTurkey.nextInt();
                    stock.setText(Integer.toString(quantityTurkey));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            case "Tuna":
                productPricePH.setText("400");
                try (Scanner scannerTuna = new Scanner(new File("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\Dont Click\\Store Database\\Presets\\Meat\\Tuna.txt"))) {
                    int quantityTuna = scannerTuna.nextInt();
                    stock.setText(Integer.toString(quantityTuna));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            // </editor-fold>
        } 
        
    }   

    private void buttons(){
        subtract.setVisible(true);
        add.setVisible(true);
        subtract.setText("-");
        add.setText("+");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        productNamePH = new javax.swing.JLabel();
        productPricePH = new javax.swing.JLabel();
        stock = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        qua = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 238, 214));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        productNamePH.setBackground(new java.awt.Color(255, 255, 255));
        productNamePH.setForeground(new java.awt.Color(0, 0, 0));
        productNamePH.setText("jLabel1");
        productNamePH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productNamePH.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        productPricePH.setBackground(new java.awt.Color(255, 204, 204));
        productPricePH.setForeground(new java.awt.Color(0, 0, 0));
        productPricePH.setText("jLabel2");
        productPricePH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        stock.setBackground(new java.awt.Color(255, 204, 204));
        stock.setForeground(new java.awt.Color(0, 0, 0));
        stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stock.setText("jLabel3");
        stock.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addToCart.setBackground(new java.awt.Color(234, 195, 140));
        addToCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addToCart.setForeground(new java.awt.Color(0, 0, 0));
        addToCart.setText("Add To Cart");
        addToCart.setFocusable(false);
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        subtract.setBackground(new java.awt.Color(234, 195, 140));
        subtract.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subtract.setForeground(new java.awt.Color(0, 0, 0));
        subtract.setText("-");
        subtract.setFocusable(false);
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        qua.setBackground(new java.awt.Color(255, 204, 204));
        qua.setForeground(new java.awt.Color(0, 0, 0));
        qua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qua.setText("0");
        qua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Stock left:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Product:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Price");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("$");

        add.setBackground(new java.awt.Color(234, 195, 140));
        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setText("+");
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(productNamePH, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(productPricePH, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(qua, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(addToCart)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productNamePH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(productPricePH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(qua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        int quantity, lowerLimit;
        lowerLimit = Integer.parseInt(stock.getText());
        quantity = Integer.parseInt(qua.getText());
        if (quantity > lowerLimit) {
            quantity--;
            qua.setText(Integer.toString(quantity));
        }
    }//GEN-LAST:event_subtractActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        int quantityCheck = Integer.parseInt(qua.getText());
        if (quantityCheck == 0){
            this.setVisible(false);
        } else {
            this.setVisible(false);
            toCart();
        }
    }//GEN-LAST:event_addToCartActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        int quantity, upperLimit;
        upperLimit = Integer.parseInt(stock.getText());
        quantity = Integer.parseInt(qua.getText());
        if (quantity < upperLimit) {
            quantity++;
            qua.setText(Integer.toString(quantity));
        }
    }//GEN-LAST:event_addActionPerformed
    
    private void toCart(){
        try {
            FileWriter cartWriter = new FileWriter("C:\\Jishe\\Villaruz_JohnCarl\\Grocery\\TOP SECRET\\VERY CONFIDENTIAL\\LIKE SERIOUSLY\\DONT CLICK\\Admin\\Cart.txt", true);
            BufferedWriter buff = new BufferedWriter(cartWriter);
            
            String productName = productNamePH.getText();
            int productQuantity = Integer.parseInt(qua.getText());
            int productPrice = Integer.parseInt(productPricePH.getText());
            int productPriceTotal = productQuantity * productPrice;
            
            buff.write(productName + " " + productQuantity + " " + productPriceTotal + "\n");
            buff.flush();
        } catch (IOException io) {
        
        }
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String content = null;
                new Add(content).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel productNamePH;
    private javax.swing.JLabel productPricePH;
    private javax.swing.JLabel qua;
    private javax.swing.JLabel stock;
    private javax.swing.JButton subtract;
    // End of variables declaration//GEN-END:variables
}