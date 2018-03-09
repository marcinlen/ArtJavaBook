package CollectionClasses;

import acm.program.*;

public class TestSSMap extends ConsoleProgram {
	
	public void run() {
		
		SimpleStringMap ssmap = new SimpleStringMap();
		ssmap.put("buzzards", "Jack");
		ssmap.put("righto", "Herrer");
		println(ssmap.get("buzzards"));
		println(ssmap.get("righto"));
	}

}
