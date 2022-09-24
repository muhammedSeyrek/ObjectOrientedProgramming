#include<iostream>
using namespace std;
typedef struct history{
	int day;
	int month;
	int year;
}Hs;
void setting(Hs *birth, int a, int b, int c){
	if(a > 0 && a < 32){
		birth -> day = a;
	}
	if(b > 0 && b < 13){
		birth -> month = b; 
	}
	birth -> year = c;
}
void print(Hs *birth){
	cout << birth -> day << "/" << birth -> month << "/" << birth -> year;
}
int main(){
	Hs birthday;
	setting(&birthday, 22, 10, 2000);
	print(&birthday);
	return 0;
}

