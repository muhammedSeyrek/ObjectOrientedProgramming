#include <iostream>
using namespace std;
class Complex{
	public :
		int reel;
		int imaginer;
		Complex(int tempR = 0, int tempI = 0){
			reel = tempR;
			imaginer = tempI;
		}
		Complex sum(Complex x, Complex y){
			Complex temp;
			temp.reel = x.reel + y.reel;
			temp.imaginer = x.imaginer + y.imaginer;
			return temp;
		}
		Complex extraction(Complex x, Complex y){
			Complex temp;
			temp.reel = x.reel - y.reel;
			temp.imaginer = x.imaginer - y.imaginer;
			return temp;
		}
		void print(){
			cout << reel << " + " << imaginer << "i";
		}
};
int main(){
	Complex a(5, 1);
	Complex b(6, 2);
	Complex c(0, 0);
	c = c.sum(a, b);
	c = c.extraction(a, b);
	c.print();
	return 0;
}
