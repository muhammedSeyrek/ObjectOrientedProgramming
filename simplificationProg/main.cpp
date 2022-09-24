#include <iostream>
using namespace std;
#include "sFrac.h"
int main(){
	SFrac c(15, 25), d(21, 7), x;
	cout << "Before the c object is simplified" << endl;
	c.print();
	c.simplify();
	cout << "After the c object is simplified" << endl;
	c.print();
	cout << "Share of the c object = " << c.getShare() << endl;
	c.setShare(2);
	cout << "After change of share = " << c.getShare() << endl;
	c.print();
	cout << "\n with \n";
	d.print();
	cout << "+---------------+";
	x = c.sum(d);
	x.print();
	return 0;
}
