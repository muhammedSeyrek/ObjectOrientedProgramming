#include<iostream>
using namespace std;
class constructor{
	private:
		double pi, r;
	public:
		constructor(){
			pi = 3.14;
			r = 4;
		}
		constructor(double x, double y){
			pi = x;
			r = y;
		}
		double field(){
			return pi * r;
		}
};
int main(){
	constructor first;
	constructor second(3.14, 5);
	cout << "Area of a circle with a radius of 4 cm = " << first.field() << endl;
	cout << "Area of a circle with a radius of 5 cm = " << second.field() << endl;
	return 0;
}
