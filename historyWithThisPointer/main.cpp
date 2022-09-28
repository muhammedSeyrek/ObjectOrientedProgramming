#include <iostream>
using namespace std;
#include "history.h"
int main(){
	History x(23, 12, 2023);
	History a(26, 11, 2015);
	History b(22, 10, 2000);
	History c(0, 0, 0);
	History y(0, 0, 0);
	c = a.findWhatsNext(b);
	y = x.findWhatsNext(c);
	y.print();
	return 0;
}
