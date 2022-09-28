#include <iostream>
using namespace std;
#include "history.h"
History :: History(int d, int m, int y){
	day = d;
	month = m;
	year = y;
}
History History :: findWhatsNext(History m){
	if(m.year > year)
		return m;
	else if((m.year == year) && (m.month > month))
		return m;
	else if((m.year == year) && (m.month == month) && (m.day > day))
		return m;
	else 
		return *this;
}
void History :: print(){
	cout << "\n" << day << "/" << month << "/" << year << "\n";
}
