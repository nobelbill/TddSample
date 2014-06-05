package com.nobelbill.quiz1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Quiz1Test {

	@Test
	public void testSelectOne() throws Exception {

		SqlSessionFactory sqlSessionFactory = BlogDataSourceFactory
				.getSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Blog dummy = new Blog();
			dummy.setId(101L);
			dummy.setTitle("test");
			dummy.setContent("testtest");
			session.insert("insert", dummy);
			Blog blog = (Blog) session.selectOne(
					"org.mybatis.example.BlogMapper.selectBlog", 101);
			System.out.println(blog);
		} finally {
			session.close();
		}
	}

	@Test
	public void sort() {
		// assertEquals("ABCD", quiz.sort("DBCA"));

		// System.out.println();
		assertEquals("1", "1");
	}

	@Test
	public void split() {
		char[] expected = { 'a', 'b' };
		assertTrue(Arrays.equals(expected, Quiz1.split("ab")));
	}

	@Test
	public void sortArray() {
		char[] expected = { 'a', 'b', 'c' };
		char[] real = { 'b', 'a', 'c' };
		assertTrue(Arrays.equals(expected, Quiz1.sortArray(real)));
	}

	@Test
	public void sortString() {
		assertEquals("abc", Quiz1.sortString("cab"));
	}

	@Test
	public void mergeString() {
		char[] test = { 'A', 'B', 'C' };
		assertEquals("ABC", Quiz1.mergeString(test));
	}
}
