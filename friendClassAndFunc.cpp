#include <iostream>
using namespace std;
class Try{
	friend void f(Try &b, int k);
	private :
		int number;
	public : 
		Try(int);
		void print();
};
void f(Try &b, int k){
	b.number = k;
}
int main(){
	Try a(23);
	cout << "Before object a is modified = ";
	a.print();
	f(a, 4);
	cout << "After object a is modified = ";
	a.print();
	return 0;
}
Try :: Try(int k){
	number = k;
}
void Try :: print(){
	cout << " number = " << number << endl;
}
