public class Author {
        private String firstName;
        private String lastName;
        public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String getLastName() { return this.lastName; }
        public String getFirstName() { return this.firstName; }

        public void setFirstName(String firstName) { this.firstName = firstName; }

        public void setLastName(String lastName) { this.lastName = lastName; }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) { return true; }
            if (obj == null || getClass() != obj.getClass()) { return false; }

            Author author = (Author) obj;

            return getLastName() != null || getFirstName() != null ? getLastName().equals(author.getLastName()) || getFirstName().equals(author.getFirstName()) :
                    author.getLastName() == null || author.getFirstName() == null;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(lastName, firstName);
        }
        @Override
        public String toString() {
            return getLastName() + " " + getFirstName();
    }
}
