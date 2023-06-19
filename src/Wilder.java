public class Wilder {
        private String firstName;
        private boolean present;

        public Wilder(String firstName, boolean aware) {
            this.firstName = firstName;
            this.present = aware;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public boolean isAware() {
            return this.present;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setAware(boolean aware) {
            this.present = aware;
        }

        public String whoAmI() {
            if (this.present) {
                return "Je m'appelle " + this.firstName + " et je suis présent(e)";
            } else {
                return "Je m'appelle " + this.firstName + " et je ne suis pas présent(e)";
            }
        }
}

