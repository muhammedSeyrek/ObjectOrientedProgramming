#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
class Student{
	public : 
		string name;
		string no;
		double lastNote[8] = {0};
		int ects[8] = {0};
		Student(string x, string y){
			name = x;
			no = y;
		}
		double getGPA(){
			double avg = 0;
			double sum = 0;
			for(int i = 0; i < 8; i++){
				avg += (lastNote[i] * ects[i]);
				sum += ects[i];
			}
			return avg / sum;
		}
		void giveInformation(){
			cout << name << " " << no << endl;
			for(int i = 0; i < 8; i++){
				cout << "Notes = " << lastNote[i] << " \tEcts =  " << ects[i] << endl;
			}
			cout << "Grade point avarage = " << getGPA() << endl;
		}
		void increaseLesson(int a){
			lastNote[a] = rand() % 100 + 1;
			ects[a] = rand() % 7 + 1;
		}
		Student betterStudent(Student a){
			if(getGPA() > a.getGPA()){
				name = name;
				return *this;
			}
			else{
				name = a.name;
				return a;
			}				
		}
};
int main(){
	srand(time(NULL));
	Student first("Muhammed Seyrek", "210303080"), second("Merve Erkan", "210313019"), 
	third("Ahmet Hamdi Ozkan", "185036042");
	for(int i = 0; i < 7; i++){
		first.lastNote[i] = rand() % 100 + 1;
		first.ects[i] = rand() % 7 + 1;
		second.lastNote[i] = rand() % 100 + 1;
		second.ects[i] = rand() % 7 + 1;
		third.lastNote[i] = rand() % 100 + 1;
		third.ects[i] = rand() % 7 + 1;
	}
	first.giveInformation();
	second.giveInformation();
	third.giveInformation();
	first.increaseLesson(7);
	second.increaseLesson(7);
	third.increaseLesson(7);
	first.giveInformation();
	second.giveInformation();
	third.giveInformation();
	Student best("","");
	best = first.betterStudent(second);
	cout << "Best student = ";
	best.giveInformation();
	return 0;
}
