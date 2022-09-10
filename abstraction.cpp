#include<iostream>
#include<cstring>
using namespace std;
class Animal{
	public :
		virtual void talk() = 0;
};
class Cow : public Animal{
	public : 
	void talk(){
		cout << "Moo" << endl;
	}
};
class Dog : public Animal{
	public : 
	void talk(){
		cout << "Hav Hav" << endl;
	}
};
class Cat : public Animal{
	public : 
	void talk(){
		cout << "Miyav" << endl;
	}
};
int main(){
	Animal *ptr[3];
	ptr[0] = new Cow;
	ptr[1] = new Dog;
	ptr[2] = new Cat;
	cout << "Animals talking" << endl;
	for(int i = 0; i < 3; i++)
		ptr[i] -> talk();
	return 0;
}
