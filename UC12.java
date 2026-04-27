import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmt {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("====================================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display Bogies
        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(b -> System.out.println(b.type + " -> " + b.cargo));

        // Stream and allMatch() validation
        boolean isSafe = goodsBogies.stream().allMatch(bogie -> {
            if ("Cylindrical".equalsIgnoreCase(bogie.type)) {
                return "Petroleum".equalsIgnoreCase(bogie.cargo);
            }
            return true;
        });

        // Display Results
        System.out.println("\nSafety Compliance Status: " + isSafe);
        System.out.println("Train formation is " + (isSafe ? "SAFE." : "NOT SAFE."));
        System.out.println("\nUC12 safety validation completed...");
    }
}
