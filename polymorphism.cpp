#include<iostream>
using namespace std;
class Animal{
	public :
		virtual void talk(){
			cout << "I am animal" << endl;
		}
};
class Cow : public Animal{
	public :
		void talk(){
			cout << "Moo" << endl;
		}
};
class Cat : public Animal{
	public : 
		void talk(){
			cout << "Miyav" << endl;
		}
};
class Dog : public Animal{
	public : 
		void talk(){
			cout << "Hav Hav" << endl;
		}
};
int main(){
	Animal *a[3];
	a[0] = new Cat();
	a[1] = new Dog();
	a[2] = new Cow();
	for(int i = 0; i < 3; i++)
		a[i] -> talk();
	return 0;
}
