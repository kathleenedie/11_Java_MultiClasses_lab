public class Printer {

    private int sheetsPaper;

    public Printer(int sheetsPaper) {
        this.sheetsPaper = sheetsPaper;
    }

    public int getSheetsPaper() {
        return sheetsPaper;
    }

    public int print(int copies, int pages){
        int sheetsNeeded = (copies*pages);
        if (this.sheetsPaper >= sheetsNeeded){
            this.sheetsPaper = (sheetsPaper - sheetsNeeded);
            return this.sheetsPaper;
        }
        return -1;
    }
}
