public class Printer {

    private int sheetsPaper;
    private int tonerVolume;

    public Printer(int sheetsPaper) {
        this.sheetsPaper = sheetsPaper;
        this.tonerVolume = 1000;
    }

    public int getSheetsPaper() {
        return sheetsPaper;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public int print(int copies, int pages){
        int sheetsNeeded = (copies*pages);
        if (this.sheetsPaper >= sheetsNeeded){
            this.sheetsPaper = (sheetsPaper - sheetsNeeded);
            return this.sheetsPaper;
        }
        return -1;
    }

    public int printTonerVolume(int copies, int pages){
        int sheetsNeeded = (copies*pages);
        if (this.tonerVolume >= sheetsNeeded){
            this.tonerVolume = (tonerVolume - sheetsNeeded);
            return this.tonerVolume;
        }
        return -1;
    }
}
