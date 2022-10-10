#include <iostream>
using namespace std;
class Toy{
	public :
		string name;
		string manufacturer;
		int age;
		string color;
		float price;
		int count;
		Toy(string a, string b, int c, string d, float e, int f = 10){
			name = a;
			manufacturer = b;
			age = c;
			color = d;
			price = e;
			count = f;
		}
		void giveInformation(){
			cout << "Name = " << name << endl;
			cout << "Manufacturer = " << manufacturer << endl;
			cout << "Age = " << age << endl;
			cout << "Color = " << color << endl;
			cout << "Price = " << price << endl;
			cout << "Count = " << count << endl;
		}
		int getFixAge(int number){
			age = number;
			return age;
		}
		float getFixPrice(float number){
			price = number;
			return price;
		}
		void makeARaise(int number = 10){
			price += (price * number / 100);
		}
		void increase(int number = 1){
			count += number;
		}
		void descrease(int number = 1){
			count -= number;
		}
		bool isItSame(Toy b){
			if(name == b.name)
				return true;
			else
				return false;
			if(manufacturer == b.manufacturer)
				return true;
			else
				return false;
		}
};
int main(){
	Toy a("Lightning Mcqueen", "Disney", 18, "Red", 43.50), b = a;
	a.makeARaise(20);
	if(a.isItSame(b) == false){
		cout << "Not same\n";
	}
	else{
		cout << "Same\n";
	}
	a.giveInformation();
	b.giveInformation();
	return 0;
}
