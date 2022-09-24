#include <iostream>
using namespace std;
class Try{
	private :
		int number;
	public :
		Try(int);
		void print();
};
int main(){
	Try a(23);
	a.print();
	return 0;
}
Try :: Try(int k){
	number = k;
}
void Try :: print(){
	cout << " number = " << number << endl;
	cout << " this -> number = " << this -> number << endl;
	cout << " (*this).number = " << (*this).number << endl;
}
