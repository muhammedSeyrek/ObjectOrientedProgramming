#include <iostream>
using namespace std;
class Book{
	public :
		string name;
		string writer;
		string kind;
		int page;
		float price;
		int count;
		Book(string x , string y , string z , int a = 500, float b = 45.50, int c = 10){
			name = x;
			writer = y;
			kind = z;
			page = a;
			price = b;
			count = c;
		}
		void giveInformation(){
			cout << "Name of the book = " << name << endl;
			cout << "Writer of the book = " << writer << endl;
			cout << "Kind of the book = " << kind << endl;
			cout << "Page of the book = " << page << endl;
			cout << "Price of the book = " << price << endl;
			cout << "Number of books = " << count << endl;
		}
		void editToPage(int number){
			page += number;
		}
		void editToPrice(int number){
			price += number;
		}
		void makeARaise(int number){
			price += (price * ((float)number / 100));
		}
		void decreaseInCount(int number){
			count -= number;
		}
		void increaseInCount(int number){
			count += number;
		}
		bool isItSame(Book a, Book b){
			if(a.price != b.price){
				return false;
			}
			else{
				return true;
			}
		}
		
};
int main(){
	Book a("Criminal and Punish", "Dostoyevski", "Roman") , b = a;
	a.giveInformation();
	cout << "page of added = ";
	int number;
	cin >> number;
	a.editToPage(number);
	cout << "Would you like to change the price = ";
	cin >> number;
	a.editToPrice(number);
	cout << "Would you like to raise the price (similiar to (%)) = ";
	cin >> number;
	a.makeARaise(number);
	cout << "Would you like to decrease the price = ";
	cin >> number;
	a.decreaseInCount(number);
	cout << "Would you like to increase = ";
	cin >> number;
	a.increaseInCount(number);
	if(a.isItSame(a, b) == false){
		cout << "Not same" << endl;
	}
	else{
		cout << "Same" << endl;
	}
	a.giveInformation();
	return 0;
}












