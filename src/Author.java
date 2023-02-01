public class Author {
        private String firstNameOfAuthor;
        private String lastNameOfAuthor;
        public Author(String firstNameOfAuthor, String lastNameOfAuthor) {
            this.firstNameOfAuthor = firstNameOfAuthor;
            this.lastNameOfAuthor = lastNameOfAuthor;
        }
        public String getLastNameOfAuthor() { return this.lastNameOfAuthor; }
        public String getFirstNameOfAuthor() { return this.firstNameOfAuthor; }
        @Override
        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            Author second = (Author) obj;
            return getFirstNameOfAuthor().equals(second);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(lastNameOfAuthor, firstNameOfAuthor);
        }
        @Override
        public String toString() {
            return getLastNameOfAuthor() + " " + getFirstNameOfAuthor();
    }
}
