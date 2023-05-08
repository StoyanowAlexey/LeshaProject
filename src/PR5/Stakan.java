package PR5;

public class Stakan {
        double mass;
        double volume;
        double content;

        public Stakan() {
        }

        public Stakan(double m, double v, double c) {
            this.mass = m;
            this.volume = v;
            this.content = c;
        }

        public double getContent() {
            return this.content;
        }

        public double getMass() {
            return this.mass;
        }

        public double getVolume() {
            return this.volume;
        }

        boolean setMass(double m) {
            this.mass = m;
            return m > 0.0;
        }

        boolean setVolume(double v) {
            this.volume = v;
            return v > 0.0;
        }

        boolean setContent(double c) {
            this.content = c;
            return c > 0.0;
        }

        public String toString() {
            return "Mass: " + this.mass + "g, Volume: " + this.volume + "ml, Content: " + this.content + "ml.";
        }

        public static void main(String[] args) {
            Stakan stakan1 = new Stakan(30.0, 200.0, 0.0);
            boolean result_v,result_c,result_m;
            System.out.println(stakan1);
            result_v = stakan1.setVolume(13.0);
            result_m = stakan1.setMass(-123.0);
            result_c = stakan1.setContent(-23.0);
            if(result_c == false ||  result_m == false ||  result_v == false) System.out.println("False inforamation");
        else System.out.println(stakan1);
        }
}
