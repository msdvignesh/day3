package code.classRoom;

public class ClassRoom implements classRoomMethods{
	
	public void teach(LearningGuitar learningGuitar) {
		System.out.println("ClassRoom teaches guitar");
	}

	public ReportCard result(Grades g) {
		ReportCard reportCard= new ReportCard();
		System.out.println("");
		return reportCard;
		
	}
	
}
