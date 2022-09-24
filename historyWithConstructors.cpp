#include <iostream>
#include <string.h>
using namespace std;
class History{
	private :
		int day, month, year;
		char his[];
	public :
		History(int d = 22, int m = 10, int y = 2000){
			day = d;
			month = m;
			year = y;
		}
		History(char s[]){
			strcat(his,s);
		}
		void print1(){
			cout << day << "/" << month << "/" << year << endl;
		}
		void print2(){
			cout << his << endl;
		}
};
int main(){
	History hs2(23);
	hs2.print1();
	History hs1("22/10/2002");
	hs1.print2();
	History hs3("01/08/2002");
	hs3.print2();
	return 0;
}
