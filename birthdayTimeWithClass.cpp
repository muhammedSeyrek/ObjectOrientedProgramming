#include<iostream>
using namespace std;
typedef struct history{
	int day;
	int month;
	int year;
	void setting(int a, int b, int c){
		if(a > 0 && a < 32){
			day = a;
		}
		if(b > 0 && b < 13){
			month = b;
		}
		year = c;
	}
	void print(){
		cout << day << "/" << month << "/" << year;
	}
}Hs;
int main(){
	Hs birthday;
	birthday.setting(22, 10, 2000);
	birthday.print();
	return 0;
}
