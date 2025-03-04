public class ConcreteMixCalculator {

    // Method to calculate target mean strength
    public double calculateTargetMeanStrength(String grade, double fck) {
        double S = getStandardDeviation(grade);
        double targetMeanStrengthCase1 = fck + 1.65 * S;
        double X = getGradeFactor(grade);
        double targetMeanStrengthCase2 = fck + X;
        double result = Math.max(targetMeanStrengthCase1, targetMeanStrengthCase2);
        System.out.println("Target Mean Strength: " + result);
        return result;
    }

    // Method to determine standard deviation (S) based on grade
    private double getStandardDeviation(String grade) {
        double S;
        switch (grade.toUpperCase()) {
            case "M10":
            case "M15":
                S = 3.5;
                break;
            case "M20":
            case "M25":
                S = 4.0;
                break;
            case "M30":
            case "M35":
            case "M40":
            case "M45":
            case "M50":
            case "M55":
            case "M60":
                S = 5.0;
                break;
            case "M65":
            case "M70":
            case "M75":
            case "M80":
                S = 6.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid grade of concrete");
        }
        System.out.println("Standard Deviation (S): " + S);
        return S;
    }

    // Method to get grade factor (X) based on IS 10262 Table 1
    private double getGradeFactor(String grade) {
        double X;
        switch (grade.toUpperCase()) {
            case "M10":
            case "M15":
                X = 5.0;
                break;
            case "M20":
            case "M25":
                X = 5.5;
                break;
            case "M30":
            case "M35":
            case "M40":
            case "M45":
            case "M50":
            case "M55":
            case "M60":
                X = 6.5;
                break;
            case "M65":
            case "M70":
            case "M75":
            case "M80":
                X = 8.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid grade of concrete");
        }
        System.out.println("Grade Factor (X): " + X);
        return X;
    }

    // Method to calculate water content
    public double calculateWaterContent(int aggregateSize, int slump, String aggregateType) {
        double baseWaterContent;
        switch (aggregateSize) {
            case 10:
                baseWaterContent = 208;
                break;
            case 20:
                baseWaterContent = 186;
                break;
            case 40:
                baseWaterContent = 165;
                break;
            default:
                throw new IllegalArgumentException("Invalid aggregate size");
        }
        baseWaterContent += 0.03 * baseWaterContent * ((slump - 50) / 25.0);

        switch (aggregateType.toLowerCase()) {
            case "angular":
                break;
            case "sub-angular":
                baseWaterContent -= 10;
                break;
            case "gravel":
                baseWaterContent -= 15;
                break;
            case "rounded":
                baseWaterContent -= 20;
                break;
            default:
                throw new IllegalArgumentException("Invalid aggregate type");
        }
        System.out.println("Water Content: " + baseWaterContent);
        return baseWaterContent;
    }

    // Method to calculate cement content
    public static double calculateCementContent(double actualWaterContent, double wcRatio) {
        if (actualWaterContent <= 0 || wcRatio <= 0) {
            throw new IllegalArgumentException("Water content and water-cement ratio must be greater than zero");
        }
        double cementContent = actualWaterContent / wcRatio;
        if (cementContent < 300) {
            cementContent = 300;
        } else if (cementContent > 450) {
            cementContent = 450;
        }
        System.out.println("Cement Content: " + cementContent);
        return cementContent;
    }

    // Method to calculate coarse aggregate proportion
    public static double calculateCoarseAggregateVolume(int aggregateSize, int fineAggregateZone, double wcRatio) {
        double baseVolume;
        if (aggregateSize == 20) {
            switch (fineAggregateZone) {
                case 1:
                    baseVolume = 0.60;
                    break;
                case 2:
                    baseVolume = 0.62;
                    break;
                case 3:
                    baseVolume = 0.64;
                    break;
                case 4:
                    baseVolume = 0.66;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid fine aggregate zone");
            }
        } else {
            throw new IllegalArgumentException("Aggregate size not supported");
        }
        baseVolume -= (wcRatio - 0.50) * 0.01 / 0.05;
        System.out.println("Coarse Aggregate Volume: " + baseVolume);
        return baseVolume;
    }

    public static void main(String[] args) {
        // Create an instance of ConcreteMixCalculator
        ConcreteMixCalculator calculator = new ConcreteMixCalculator();

        // Define input values
        double waterContent = 148; // Example value in kg/m³
        double wcRatio = 0.36;     // Example water-cement ratio

        // Calculate cement content
        double cementContent = calculator.calculateCementContent(waterContent, wcRatio);
        System.out.println("Cement Content (kg/m³): " + cementContent);

        // Example usage of other methods
        double targetStrength = calculator.calculateTargetMeanStrength("M40", 40);
        System.out.println("Target Mean Strength: " + targetStrength);

        double water = calculator.calculateWaterContent(20, 0, "angular");
        System.out.println("Water Content: " + water);

        double coarseAggregateVolume = calculator.calculateCoarseAggregateVolume(20, 2, 0.36);
        System.out.println("Coarse Aggregate Volume: " + coarseAggregateVolume);
    }
}