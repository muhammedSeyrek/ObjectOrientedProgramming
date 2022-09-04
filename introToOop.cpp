#include<iostream>
using namespace std;
class Car{
	private:
		string brand;
		string color;
		int engine;
		int capasity;
	public:
	void run(string br, string cl, int eng, int cp){
		brand = br;
		color = cl;
		engine = eng;
		capasity = cp;
	}
	void print(){
		cout << brand << "\t" << color << "\t" << engine << "\t" << capasity << endl;
	}
};
int main(){
	Car truck, taxi;
	truck.run("BMC", "Red", 3000, 9000);
	taxi.run("Opel", "Gray", 1299, 2500);
	truck.print();
	taxi.print();
	return 0;
}
