#include <iostream>
#include <cstdlib>
using namespace std;
class History{
	private : 
		int day;
		int month;
		int year;
	public :
		History(int d, int m, int y){
			day = d;
			month = m;
			year = y;
		}
		void print(){
			cout << day << "/" << month << "/" << year;
		}
};
int main(){
	History *ptr = new History(22, 10, 2000);
	ptr -> print();
	return 0;
}
