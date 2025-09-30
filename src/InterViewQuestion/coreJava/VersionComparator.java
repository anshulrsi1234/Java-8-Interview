package InterViewQuestion.coreJava;

/**
 * 
 */
public class VersionComparator {

    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int maxLength = Math.max(v1.length, v2.length);

        for (int i = 0; i < maxLength; i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.001";

        int result = compareVersion(version1, version2);

        if (result == 0) {
            System.out.println("Versions are equal.");
        } else if (result < 0) {
            System.out.println(version1 + " is less than " + version2);
        } else {
            System.out.println(version1 + " is greater than " + version2);
        }
    }
}
