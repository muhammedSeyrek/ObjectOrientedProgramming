#include <iostream>
using namespace std;
class Time{
	private :
		int hour;
		int minute;
		int second;
	public :
		Time(int h = 0, int m = 0, int s = 0){
			hour = h;
			minute = m;
			second = s;
		}
		void print(){
			cout << "\t" << hour << " : " << minute << " : " << second << "\t";
		}
		bool operator==(const Time temp){
			if(hour != temp.hour)
				return false;
			if(minute != temp.minute)
				return false;
			if(second != temp.second)
				return false;
			return true;
		}
		bool operator!=(const Time temp){
			return !(*this == temp);
		}
		void operator+=(int added){
			second += added;
			if(second >= 60){
				minute += (second / 60);
				second %= 60;
			}
			if(minute >= 60){
				hour += (minute / 60);
				minute %= 60;
			}
			if(hour >= 24){
				hour %= 24;
			}
		}
		Time operator++(){
			*this += 1;
			return *this;
		}
		Time operator++(int){
			Time temp(hour, minute, second);
			*this += 1;
			return temp;
		}
		Time operator+(int added){
			Time temp(hour, minute, second);
			temp.second += added;
			if(temp.second >= 60){
				temp.minute += (temp.second / 60);
				temp.second %= 60;
			}
			if(temp.minute >= 60){
				temp.hour += (temp.minute / 60);
				temp.minute %= 60;
			}
			if(temp.hour >= 24){
				temp.hour %= 24;
			}
			return temp;
		}
		Time operator+(const Time added){
			Time temp(hour, minute, second);
			temp.second += added.second;
			if(temp.second >= 60){
				temp.minute += (temp.second / 60);
				temp.second %= 60;
			}
			temp.minute += added.minute;
			if(temp.minute >= 60){
				temp.hour += (temp.minute / 60);
				temp.minute %= 60;
			}
			temp.hour += added.hour;
			if(temp.hour >= 24){
				temp.hour %= 24;
			}
			return temp;
		}
};
int main(){
	Time aTime(13, 14, 55), anotherTime(13, 14, 55);
	cout << "aTime \t = "; aTime.print();
	cout << "\nanotherTime \t = "; anotherTime.print();
	cout << "\n\nAre the two times equal ? \n";
	cout << " aTime == anotherTime ";
	if(aTime == anotherTime){
		cout << "\nResult = Two times equal";
	}
	else{
		cout << "\nResult = Two times not equal";
	}
	cout << "Are the two times different ? \n";
	cout << " aTime != anotherTime ";
	if(aTime == anotherTime)
		cout << "\n Result = Two different times";
	else
		cout << "\n Result = Two not different times";
	cout << "\n\nAddition with an integer \n";
	cout << "aTime = anotherTime + 10";
	aTime = aTime + 10;
	cout << "\n Result = "; aTime.print();
	cout << "\n\nCollections process \n";
	cout << "aTime += 10";
	aTime += 10;
	cout << "\n Result = "; aTime.print();
	cout << "\n\nCollection of two times \n";
	cout << " aTime + anotherTime = ";
	anotherTime = anotherTime + aTime;
	cout << "\n Result = "; anotherTime.print();
	cout << "\n\nAn increase (front increment) \n";
	cout << " ++aTime ";
	++aTime;
	cout << "\n Result = "; aTime.print();
	cout << "\n\nAn increase (Penultimate) \n";
	cout << " aTime++ ";
	aTime++;
	cout << "\n Result = "; aTime.print();	
	return 0;
}
