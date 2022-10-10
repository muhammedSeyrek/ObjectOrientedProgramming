#include <iostream>
using namespace std;
class Otel{
	public : 
		int roomNo;
		float price;
		int kind;
		int floor;
		Otel(int a, int b, int c, int d){
			roomNo = a;
			kind = b;
			price = getCalc();
			floor = c;
		}
		int getCalc(){
			int day;
			cout << "How many day did you stay ? = ";
			cin >> day;
			if(kind == 1){
				return ((day * 25) + 125 * day);
			}
			else{
				return day * 125;
			}
		}
		void giveInformation(){
			cout << "------------------" << endl;
			cout << "Room no = " << roomNo << endl;
			cout << "Kind = " << kind << endl;
			cout << "Floor = " << floor << endl;
			cout << "Your dept = " << price << endl;
		}
};
int main(){
	int a, b, c;
	cout << "Enter a room number = ";
	cin >> a;
	cout << "Enter a kind of the room(1 = Lux, 2 = Standart) = ";
	cin >> b;
	cout << "Enter floor of the room = ";
	cin >> c;
	Otel first(a, b, c, 0);
	first.giveInformation();
	return 0;
}
