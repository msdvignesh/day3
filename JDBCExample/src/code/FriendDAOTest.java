package code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriendDAOTest {
	
	FriendDAOImpl friendDAO  = new FriendDAOImpl(); 
	
	@Test
	void createFriend() {
		
		Assertions.assertTrue(friendDAO!=null);
	}
}
