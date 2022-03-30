package code;

public class Friend {
	
	private int friendId;
	private String friendName;
	private String friendRelationShip;
	Friend(int friendId, String friendName, String friendRelationShip) {
		super();
		this.friendId = friendId;
		this.friendName = friendName;
		this.friendRelationShip = friendRelationShip;
	}
	@Override
	public String toString() {
		return "Friend [friendId=" + friendId + ", friendName=" + friendName + ", friendRelationShip="
				+ friendRelationShip + "]";
	}
	
	 

}
