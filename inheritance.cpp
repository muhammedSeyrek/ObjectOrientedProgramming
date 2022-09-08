#include<iostream>
using namespace std;
class Vehicles{
	protected:
		int mSpeed = 0;
	private:
		string color = "yellow";
		bool situation = false;
	public:
		void run(int speed){
			situation = true;
			if(situation == true)
				mSpeed = speed;
		}
		void stop(){
			if(situation == true){
				mSpeed = 0;
				situation = false;
			}
		}
		void show(){
			cout << "Running = " << situation << "\nSpeed = " << mSpeed << "\nColor = " << color << endl;
		}
};
class Taxi : public Vehicles{
	public:
		void fastDrive(){
			mSpeed += 50;
			cout << "Instantaneous speed = " << mSpeed << endl;
		}
};
class Truck : public Vehicles{};
int main(){
	Taxi opel;
	Truck bmc;
	cout << "Car\n";
	opel.run(30);
	opel.show();
	opel.fastDrive();
	cout << "Truck\n";
	bmc.run(20);
	bmc.show();
	bmc.stop();
	bmc.show();
}









