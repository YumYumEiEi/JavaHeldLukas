package StringUebungen;

public class BookStringReorganizer {
    public static void go() {
        String text =
                "I'm dishonest, and a to watch out for,\n" +
                        "dishonest man you    because you can\n" +
                        "can always trust to  never predict when\n" +
                        "be dishonest.        they're going to do\n" +
                        "Honestly, it's the   something incredibly\n" +
                        "honest ones you want stupid.";

        String[] singleLines = seperateLines(text);

        cutWhiteAtTheEnd(singleLines);
        int pageSplit = findPageSplit(singleLines);
        if (pageSplit == -1) {
            System.out.println("No page split was found");
            return;
        }
        String reorganizedText = reorganize(singleLines, pageSplit);
        System.out.println(reorganizedText);
    }

    private static String reorganize(String[] singleLines, int pageSplit) {
        String pageOne = "";
        String pageTwo = "";

        for (int index = 0; index < singleLines.length; index++) {
            pageOne = pageOne + singleLines[index].substring(0, pageSplit) + " \n";
            pageTwo = pageTwo + singleLines[index].substring(pageSplit + 1) + " \n";
        }
        return pageOne +  pageTwo;
    }

    private static int findPageSplit(String[] singleLines) {
        int pageSplit = -1;
        for (String line : singleLines) {
            pageSplit = line.lastIndexOf("  ");
            if (pageSplit != -1) {
                return pageSplit + 1;
            }
        }
        return pageSplit;
    }

    private static void cutWhiteAtTheEnd(String[] singleLines) {
        for (int index = 0; index < singleLines.length; index++) {
            singleLines[index] = singleLines[index].stripTrailing();
        }
    }

    private static String[] seperateLines(String text) {
        return text.split("\n");
    }
}
