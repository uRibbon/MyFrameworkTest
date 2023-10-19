package dbConnect;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.book.dao.mapper.BookMapper;
import myspring.book.service.BookService;
import myspring.book.vo.BookVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/resources/spring-bean-book.xml")
public class DbConnectTest {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	BookMapper bookMapper;
	
	@Autowired
	BookService bookService;
	
	@Test
	public void dataSourceTest(){
		System.out.println(dataSource.getClass().getName());
	}

	@Test
	public void sqlSessionFactoryTest(){
		System.out.println(sqlSessionFactory.getClass().getName());
		System.out.println(sqlSessionFactory.getConfiguration());
	}
	
	@Test
	public void sqlSessionTest(){
		System.out.println(sqlSession.getClass().getName());
		List<BookVO> list = sqlSession.selectList("myspring.book.dao.mapper.BookMapper.selectAllBook");
		System.out.println("sqlSessionTest : "+list);
	}
	
	@Test
	public void bookMapperTest(){
		List<BookVO> list = bookMapper.selectAllBook();
		System.out.println("customerMapperTest : "+list);
	}
	
	@Test
	public void bookServiceTest(){
		List<BookVO> list = bookService.getAllBookList();
		System.out.println("bookServiceTest : "+list);
	}
}
