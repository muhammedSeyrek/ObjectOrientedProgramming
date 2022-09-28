#include <iostream>
using namespace std;
class FCircle{
	private : 
		static int sum;
		int height;
		int color;
	public :
		FCircle(int = 1, int = 1);
		~FCircle();
		static int getSum();
};
int FCircle :: sum = 0;
int main(){
	cout << "Total count of the fly circle = " << FCircle :: getSum() << endl;
	FCircle *a = new FCircle(3, 5);
	FCircle *b = new FCircle;
	cout << "Deleting fly circle....." << endl;
	delete a;
	delete b;
	return 0;
}
FCircle :: FCircle(int m, int n){
	height = m;
	color = n;
	sum++;
	cout << "Height = " << height << ", Color = " << color << " construct fly circle" << endl;
	cout << "At the moment count = " << sum << " have fly circle" << endl;
}
FCircle :: ~FCircle(){
	sum--;
	cout << "At the moment count = " << sum << " have piece fly circle" << endl;
}
int FCircle :: getSum(){
	return sum;
}
