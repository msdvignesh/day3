package code;

import java.util.ArrayList;

public interface FriendDAO {
	
	void create(Friend friend);
	void update(Friend friend);
	void delete(int friend_id);
	Friend select(int friend_id);
	ArrayList<Friend> selectAll();
	

}
