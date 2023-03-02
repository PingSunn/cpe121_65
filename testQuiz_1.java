public class testQuiz_1 {

    public static class TV {
        private int channel;
        private int volumeLevel;
        private boolean on;

        public TV() { //Default Constructor
            this.channel = 1;
            this.volumeLevel = 1;
            this.on = false;
        }

        public TV(int ch, int Vol) { 
            this.channel = ch;
            this.volumeLevel = Vol;
        }
        
        //Toggle
        public void turnOn() {
            this.on = true;
        }
        public void turnOff() {
            this.on = false;
        }

        //Channel
        public void setChannel(int newChannel) {
           //if (channel <= 30 && (volumeLevel > 0 && volumeLevel <= 15))
           if (channel < 30) {
               this.channel = newChannel;
           }
        }
        public void channelUp() {
            if (channel < 30) {
            this.channel += 1;
            }
        }
        public void channelDown() {
            if (channel < 30) {
            this.channel -= 1;
            }
        }

        //Volume
        public void setVolume(int newVolumeLevel) {
            if (volumeLevel > 0 && volumeLevel < 15) {
                this.volumeLevel = newVolumeLevel;
            }
        }
        public void volumeUp() {
            if (volumeLevel > 0 && volumeLevel < 15) {
            this.volumeLevel += 1;
            }
        }
        public void volumeDown() {
            if (volumeLevel > 0 && volumeLevel < 15) {
            this.volumeLevel -= 1;
            }
        }

        //Get
        public int getChannel() {
            return channel;
        }
        public int getVolume() {
            return volumeLevel;
        }

        public void to_String() {
            if (on) {
                System.out.println("now TVs channel is " + channel + " and volume level is " + volumeLevel);
            }
        }
    }

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn(); tv1.to_String();

        TV tv2 = new TV(30, 3);
        tv2.turnOn(); tv2.to_String();

        TV tv3 = new TV(30, 1);
        tv3.turnOn(); tv3.channelUp();
        tv3.volumeDown(); tv3.volumeDown();
        tv3.to_String();
    }
    
}