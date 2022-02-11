package Builder;

public class Book {
    private final String isbn;
    private final String title;
    private final String genre;
    private final String author;
    private final String description;

    private Book(Builder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.genre = builder.genre;
        this.author = builder.author;
        this.description = builder.description;
    }


    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getAuthor() {
        return author;
    }
    public String getDescription() {
        return description;
    }

    public static class Builder {
        private String isbn;
        private String title;
        private String genre;
        private String author;
        private String description;
        
        public Builder() {}

        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        private void validate() throws IllegalStateException {
            String infoError = "";
            if (isbn == null) {
                infoError += "ISBN cannot be null\n";
            }

            if (title == null) {
                infoError += "Title cannot be null\n";
            } else if (title.length() < 2) {
                infoError += "Title length cannot be less than two\n";
            }

            if (description != null && description.length() > 500) {
                infoError += "Description cannot have more than 500 character\n";
            }

            if (infoError.length() > 0) {
                throw new IllegalStateException(infoError);
            }
        }

        public Book build() throws IllegalStateException {
            validate();
            return new Book(this);
        }
    }
}
