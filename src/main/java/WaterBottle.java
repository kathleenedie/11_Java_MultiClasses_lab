public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public int drink() {
        if(this.volume >= 10) {
            this.volume = (this.volume - 10);
            return this.volume;
        }
        return -1;
    }

    public int empty() {
        if (this.volume > 0) {
            this.volume = (this.volume - this.volume);
            return this.volume;
        }
        return -1;
    }

    public int fill() {
        this.volume = 100;
        return this.volume;
    }


}
