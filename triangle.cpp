#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>
using namespace std;
class Triangle{
	public :
		int firstE, secondE, thirdE, s;
		Triangle(int a = 1, int b = 1){
			firstE = a;
			secondE = b;
			thirdE = rand() % ((firstE + secondE) - (secondE - firstE)) + (secondE - firstE);
		}
		int getField(){
			s = (firstE + secondE + thirdE) / 2;
			return sqrt(s * (s - firstE) * (s - secondE) * (s - thirdE));
		}
		void print(){
			cout << "Field of the triangle = " << getField() << endl;
			cout << "Perimeter of the triangle = " << s * 2;
		}
};
int main(){
	srand(time(0));
	Triangle a(3, 4);
	a.print(); 
	return 0;
}
