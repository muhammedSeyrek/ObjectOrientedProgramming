#include<iostream>
using namespace std;
class Birthday{
	private :
		int day, month, year;
	public :
		void settings(int a, int b, int c){
			day = a;
			month = b;
			year = c;
		}
		void print(){
			cout << day << "/" << month << "/" << year;
		}
};
int main(){
	Birthday bt;
	bt.settings(22, 10, 2000); 
	bt.print();
	return 0;
}
