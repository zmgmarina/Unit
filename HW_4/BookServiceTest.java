package seminar3test.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar3.book.Book;
import seminar3.book.BookRepository;
import seminar3.book.BookService;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;
import java.util.Arrays;



class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    void setup() {

        bookRepository = mock(BookRepository.class);
        Book book = mock(Book.class);
        bookService = new BookService(bookRepository);
        when(bookRepository.findById("1")).thenReturn(book);
        when(bookRepository.findAll()).thenReturn(Arrays.asList(book, book));
    }

    @Test
    void testFindBookById() {
        assertThat(bookService.findBookById("1")).isInstanceOf(Book.class);
        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    void testFindAllBooks() {
        assertThat(bookService.findAllBooks().size()).isEqualTo(2);
        verify(bookRepository, times(1)).findAll();
    }


}
