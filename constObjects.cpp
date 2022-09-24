#include <iostream>
using namespace std;
class Try{
	private :
		int member1;
		int member2;
	public :
		Try(int, int);
		void printMember() const;
		void printMember2();
		void settingMember1(int);
};
int main(){
	Try a(23, 45);
	const Try b(2, 5);
	cout << "Before object a is modified = \n";
	a.printMember();
	a.printMember2();
	a.settingMember1(1);
	cout << "After object a is modified = \n";
	a.printMember();
	cout << "Before object b is modified = \n";
	b.printMember();
	//b.printMember2(); Error
	//b.settingMember1(); Error
	cout << "After object b is modified = \n";
	b.printMember();
	return 0;
}
Try :: Try(int k, int m){
	member1 = k;
	member2 = m;
}
void Try :: printMember() const{
	cout << "Member1 of object = " << member1 << endl;
}
void Try :: printMember2(){
	cout << "Member2 of object = " << member2 << endl;
}
void Try :: settingMember1(int k){
	member1 = k;
}

