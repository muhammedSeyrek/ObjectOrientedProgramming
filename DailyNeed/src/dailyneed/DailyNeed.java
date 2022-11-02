
package dailyneed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DailyNeed {

        static String pathProject = "C:\\Users\\Seyrek\\Documents\\NetBeansProjects"
                            + "\\DailyNeed\\src\\dailyneed\\";
	static Persons persons[] = new Persons[35];
	static Foods foods[] = new Foods[83];
	static Spor spor[] = new Spor[45];
	static Commands commands[] = new Commands[14];

	static Persons GetPerson(String personId) {
            for (Persons person1 : persons) {
                if (person1.personId.equals(personId)) {
                    return person1;
                }
            }
		return null;
	}

	static Foods GetFood(String foodId) {
		for (int i = 0; i < foods.length; i++) {
			if (foods[i].foodId.equals(foodId)) {
				return foods[i];
			}
		}
		return null;
	}

	static Spor GetSpor(String sporId) {
            for (Spor spor1 : spor) {
                if (spor1.sporId.equals(sporId)) {
                    return spor1;
                }
            }
		return null;
	}

	static Commands GetCommand(String mission) {
            for (Commands command : commands) {
                if (command.mission.equals(mission)) {
                    return command;
                }
            }
		return null;
	}

	public static String printCommand(Persons[] person, Commands command) throws IOException, Exception {
		String filePath = "C:\\Users\\Seyrek\\Documents\\NetBeansProjects"
                            + "\\DailyNeed\\src\\dailyneed\\monitoring2.txt";
		File f = new File(filePath);
		char commandMissionFirstNumber = command.mission.charAt(0);
		if (commandMissionFirstNumber == '1') {
			Foods foodTemp = GetFood(command.mission);
			int burned = (foodTemp.calorieCount * command.count);
			Persons personTemp = GetPerson(command.personId);
			personTemp.top += burned;
			String result = command.personId + "\thas\ttaken\t" 
                                + burned + "  from  " + foodTemp.nameOfFood;
			return result;
		}
		if (commandMissionFirstNumber == '2') {
			Spor sporTemp = GetSpor(command.mission);
			int feed = ((sporTemp.calorieBurned * (command.count) / 60));
			Persons personTemp = GetPerson(command.personId);
			personTemp.top -= feed;
                        personTemp.burnedSpor += feed;
			String result = command.personId + "\thas\tburned\t" + 
                                (sporTemp.calorieBurned * (command.count) / 60) + " "
                                + " thanks to  " + sporTemp.nameOfSport;
			return result;
		}
		if (command.mission.equals("printWarn")) {
                    for (Persons personTemp : person) {
                        if (personTemp.top > personTemp.dailyNeeds) {
                            String result = (personTemp.name + "\t" + 
                                    String.valueOf(2022 - personTemp.dateOfBirth) + "\t"
                                    + String.valueOf(personTemp.dailyNeeds) + "\t" + 
                                    String.valueOf(personTemp.top) + "\t"
                                    + String.valueOf(personTemp.burnedSpor) + "\t"
                                    + String.valueOf(personTemp.dailyNeeds - personTemp.top));
                            return result;
                        } else {
                            String result = ("there\tis\tno\tsuch\tperson");
                            return result;
                        }
                    }
		}
		if (command.mission.equals("printList")) {
                    for (Persons personTemp : person) {
                        if (personTemp.top > 0) {
                            String result = personTemp.name + "\t" + 
                                    String.valueOf(2022 - personTemp.dateOfBirth) 
                                    + "\t" + String.valueOf(personTemp.dailyNeeds) +
                                    "\t" + String.valueOf(personTemp.top) + "\t" +
                                    String.valueOf(personTemp.burnedSpor) 
                                    + "\t" + String.valueOf(personTemp.dailyNeeds - personTemp.top);     
                            return result;
                        }
                    }
		}
		if (command.mission.equals("print")) {
			Persons personTemp = GetPerson(command.personId);
			String result = (personTemp.name + "\t" + String.valueOf(2022 - personTemp.dateOfBirth) + "\t" +
                                String.valueOf(personTemp.dailyNeeds)
					+ "\t" + String.valueOf(personTemp.top) + "\t"
                                + String.valueOf(personTemp.burnedSpor) + "\t" +
                                String.valueOf(personTemp.dailyNeeds - personTemp.top));
			return result;
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		File fileC = new File("C:\\Users\\Seyrek\\Documents\\NetBeansProjects"
                            + "\\DailyNeed\\src\\dailyneed\\people.txt");
		try {
			FileReader fileRC = new FileReader(fileC);
			BufferedReader bufC = new BufferedReader(fileRC);
			for (int i = 0; i < 35; i++) {
				String[] line = bufC.readLine().split("\t");
				persons[i] = new Persons(line[0], line[1], line[2], line[3], line[4], line[5]);
			}
		} catch (FileNotFoundException ex) {
                    
		}
		File fileF = new File("C:\\Users\\Seyrek\\Documents\\NetBeansProjects"
                            + "\\DailyNeed\\src\\dailyneed\\food.txt");
		try {
			FileReader fileFC = new FileReader(fileF);
			BufferedReader bufF = new BufferedReader(fileFC);
			for (int j = 0; j < 83; j++) {
				String[] line = bufF.readLine().split("\t");
				foods[j] = new Foods(line[0], line[1], line[2]);
			}
		} catch (FileNotFoundException ex) {

		}

		File fileS = new File("C:\\Users\\Seyrek\\Documents\\NetBeansProjects"
                            + "\\DailyNeed\\src\\dailyneed\\sport.txt");
		try {
			FileReader fileSC = new FileReader(fileS);
			BufferedReader bufS = new BufferedReader(fileSC);
			for (int i = 0; i < 45; i++) {
				String[] line = bufS.readLine().split("\t");
				spor[i] = new Spor(line[0], line[1], line[2]);
			}
		} catch (FileNotFoundException ex) {

		}
                int counter = -1;
                int flag = 1;
		File fileCo = new File("C:\\Users\\Seyrek\\Documents\\NetBeansProjects"
                            + "\\DailyNeed\\src\\dailyneed\\command.txt");
		String lastResult = "";
		try {
                        
			FileReader fileRCo = new FileReader(fileCo);
			BufferedReader bufCo = new BufferedReader(fileRCo);
			for (int i = 0; i < 14; i++) {
				String[] line = bufCo.readLine().split("\t");
                                
				if (line.length > 1) {
					if (line[1].charAt(0) == '1' || line[1].charAt(0) == '2') {
						commands[i] = new Commands(line[0], line[1], line[2]);
						String result = printCommand(persons, commands[i]);
						System.out.println(result);
						lastResult += result + "\n";
					}
				} else {
                                       
					if (line[0].equals("printWarn")) {
						commands[i] = new Commands();
						commands[i].mission = line[0];
						String result = printCommand(persons, commands[i]);
						System.out.println(result);
						lastResult += result + "\n";
					}
					if (line[0].equals("printList")) {
						commands[i] = new Commands();
						commands[i].mission = line[0];
                                                for(int k = 0; k <= counter; k++){
                                                    String result = printCommand(persons, commands[k]);
                                                    System.out.println(result);
                                                    lastResult += result + "\n";
                                                }
						
					}
					if (line[0].startsWith("print(")) {
						String[] line2 = line[0].split("\\(");
						commands[i] = new Commands(line2[0], 
                                         line2[1].substring(0, line2[1].length() - 1));
						String result = printCommand(persons, commands[i]);
						System.out.println(result);
						lastResult += result + "\n";
					}
				}
			}
		} catch (FileNotFoundException ex) {
		}
            try (
                BufferedWriter writer = new BufferedWriter
                    (new FileWriter("C:\\Users\\Seyrek\\Documents\\NetBeansProjects"
                            + "\\DailyNeed\\src\\dailyneed\\monitoring2.txt"))) {
                writer.write(lastResult);
            }
	}
    
}
