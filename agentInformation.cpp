#include <iostream>
using namespace std;
class Agent{
	public :
		string name;
		string nickName;
		string kind;
		int level;
		float performance;
		int yearOfEntry;
		int numberOfMission;
		void takeInformation(){
			cout << "Enter a name = ";cin >> name;
			cout << "Enter a nick name = ";cin >> nickName;
			cout << "Enter the kind of agent = ";cin >> kind;
			cout << "Level = ";cin >> level;
			cout << "Enter the performance of agent = ";cin >> performance;
			cout << "Enter the year of entry of the agent = ";cin >> yearOfEntry;
			cout << "Enter the agents mission number = ";cin >> numberOfMission;
		}
		void giveInformation(){
			cout << "Name = " << name << endl;
			cout << "Nick name = " << nickName << endl;
			cout << "Kind = " << kind << endl;
			cout << "Performance = " << performance << endl;
			cout << "Level = " << level << endl;
			cout << "Year of entry = " << yearOfEntry << endl;
			cout << "Number of mission = " << numberOfMission << endl; 
		}
		void levelFix(int number){
			level += level;
		}
		void changeKind(string txt){
			kind = txt;
		}
		void entryFix(int number){
			yearOfEntry = number;
		}
		void increasePerformance(int number){
			performance += number;
		}
		void increaseMission(int number){
			numberOfMission += number;
		}
		bool isItSame(Agent x){
			if(name == x.name){
				return true;
			}
			else{
				return false;
			}
		}
		Agent better(Agent x){
			Agent temp;
			if(performance > x.performance){
				temp.name = name;
				temp.nickName = nickName;
				temp.kind = kind;
				temp.level = level;
				temp.performance = performance;	
				temp.yearOfEntry = yearOfEntry;
				temp.numberOfMission = numberOfMission;
			}
			else{
				temp.name = x.name;
				temp.nickName = x.nickName;
				temp.kind = x.kind;
				temp.level = x.level;
				temp.performance = x.performance;	
				temp.yearOfEntry = x.yearOfEntry;
				temp.numberOfMission = x.numberOfMission;
			}
			return temp;
		}
};
int main(){
	Agent agents[2];
	Agent best;
	for(int i = 0; i < 2; i++){
		agents[i].takeInformation();
	}
	for(int i = 0; i < 2; i++){
		agents[i].giveInformation();
	}
	if(agents[0].isItSame(agents[1]) == false){
		cout << "Not same" << endl;
	}
	else{
		cout << "Same" << endl;
	}
	best = agents[0].better(agents[1]);
	cout << "Best agent is" << endl;
	best.giveInformation();
	return 0;
}
