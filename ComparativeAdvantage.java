import java.util.Scanner;
public class ComparativeAdvantage {
    public static void main(String[] args) {
        String producerA;
        System.out.println("Enter name of producer A: ");
        Scanner hh = new Scanner(System.in);
        producerA = hh.nextLine();

        String producerB;
        System.out.println("Enter name of producer B: ");
        Scanner bb = new Scanner(System.in);
        producerB = bb.nextLine();

        int TimeForGood1; // time for producer A to make good one
        System.out.println("Enter time it takes " + producerA + " to make Good one in minutes: ");
        Scanner mm = new Scanner(System.in);
        TimeForGood1 = bb.nextInt();

        float producerAg1 = 480 / TimeForGood1; // number of good one

        int TimeForGood2; // time for producer A to make good two
        System.out.println("Enter time it takes " + producerA + " to make Good two in minutes: ");
        Scanner ff = new Scanner(System.in);
        TimeForGood2 = ff.nextInt();

        float producerAg2 = 480 / TimeForGood2;// number of good two

        int TimeForGood1B; // time for producer B to make good one
        System.out.println("Enter time it takes " + producerB + " to make Good one in minutes: ");
        Scanner sc = new Scanner(System.in);
        TimeForGood1B = sc.nextInt();

        float producerBg1 = 480 / TimeForGood1B; // number of good one

        int TimeForGood2B; // time for producer B to make good two
        System.out.println("Enter time it takes " + producerB + " to make Good one in minutes: ");
        Scanner kk = new Scanner(System.in);
        TimeForGood2B = kk.nextInt();

        float producerBg2 = 480 / TimeForGood2B;// number of good two

        System.out.println(producerA + " produced " + producerAg1 + " units of good one\n" +
                " and " + producerAg2 + " units of good two.");
        System.out.println(producerB + " produced " + producerBg1 + " units of good one\n" +
                " and " + producerBg2 + " units of good two.");

        //opportunity costs of producing good 1 for A
        float opCostAg1 = producerAg2 / producerAg1;
        //opportunity costs of producing good 2 for A
        float opCostAg2 = producerAg1 / producerAg2;

        System.out.println("The opportunity cost of " + producerA + " to produce good one is\n"
                + opCostAg1 + " units.");
        System.out.println("The opportunity cost of " + producerA + " to produce good two is\n"
                + opCostAg2 + " units.");

        //opportunity costs of producing good 1 for B
        float opCostBg1 = producerBg2 / producerBg1;
        //opportunity costs of producing good 2 for B
        float opCostBg2 = producerBg1 / producerBg2;

        System.out.println("The opportunity cost of " + producerB + " to produce good one is\n"
                + opCostBg1 + " units.");
        System.out.println("The opportunity cost of " + producerB + " to produce good two is\n"
                + opCostBg2 + " units.");

        if ((opCostAg1 > opCostBg1) || (opCostAg2 > opCostBg2));{
            System.out.println("No trade should take place");
        }

        if (opCostAg1 > opCostBg1) {
            System.out.println(producerB + " should specialize in producing good one");

        }
            else {
            System.out.println(producerA + " should specialize in producing good one");
        }
        if (opCostAg2 > opCostBg2) {
            System.out.println(producerB + " should specialize in producing good two");
        }
            else {
                System.out.println(producerA + " should specialize in producing good two");
        }

    }

    }

