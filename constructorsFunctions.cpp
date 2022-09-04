#include<iostream>
using namespace std;
class Car{
	protected:
		int mSpeed = 0;
	public:
		string color = "Yellow";
		bool situation = false;
	public:
	void run(int speed){
		situation = true;
		if(situation == true)
			mSpeed += speed;
	}
	void stop(){
		if(situation == true){
			mSpeed = 0;
			situation = false;
		}
	}
	void show(){
		cout << "Running = " << situation << "\tSpeed = " << mSpeed << endl;
		cout << "Color = " << color << endl;
	}
	
};
	class Taxi : public Car{
		public:
			void fastMove(){
				mSpeed += 50;
				cout << "For now speed = " << mSpeed << endl;
			}
	};	
	class Truck : public Car{};

int main(){
	Taxi opel;
	Truck scania;
	opel.run(30);
	opel.show();
	opel.fastMove();
	scania.run(10);
	scania.show();
	scania.stop();
	scania.show();
	return 0;
}
