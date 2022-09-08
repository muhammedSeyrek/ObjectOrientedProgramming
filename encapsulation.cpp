#include<iostream>
using namespace std;
class TV{
	private:
		int lenght, width, height;
	public:
		void setLen(int p){
			lenght = p;
		}
		void setWid(int p){
			width = p;
		}
		void setHe(int p){
			height = p;
		}
	int getSound(){
		return (lenght * width * height);
	}
};
int main(){
	TV object;
	float sound;
	object.setLen(10);
	object.setWid(8);
	object.setHe(6);
	sound = object.getSound();
	cout << "Sound setting = " << sound << " monad";
	return 0;
}
