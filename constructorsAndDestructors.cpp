#include <iostream>
using namespace std;
class Try{
	private :
		int number;
	public : 
		Try(int k){
			number = k;
			cout << number << " Worked constructor" << endl;
		}
		~Try(){
			cout << number <<" Worked destructor" << endl;
		} 
};
void f(){
	Try c(3);
	static Try d(4);
}
Try e(0);
int main(){
	Try a(1);
	f();
	Try b(2);
	cout << "Program its done \n";
	return 0;
}

