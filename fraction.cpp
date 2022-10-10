#include <iostream>
using namespace std;
class Fraction{
	public :
		int full, share, denominator;
		Fraction(int a = 1, int b = 2, int c = 3){
			full = a;
			share = b;
			denominator = c;
		}
		void print(){
			cout << full << " " << share << "/" << denominator << endl;
		}
};
int main(){
	Fraction first(3, 5, 4), second(11, 3);
	first.print();
	second.print();
	return 0;
}
