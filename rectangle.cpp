#include <iostream>
using namespace std;
class Rectangle{
	private :
		int height;
		int width;
	public :
		Rectangle(int x = 1, int y = 1){
			height = x;
			width = y;		
		}
		void setHeight(int x){
			height = x;
		}
		void setWidth(int y){
			width = y;
		}
		int getField(){
			return height * width;
		}
		int getPerimeter(){
			return (width + width) + (height + height);
		}
		void print(){
			cout << "Field = " << getField() << "\tPerimeter = " << getPerimeter();
		}
};
int main(){
	Rectangle first;
	first.setHeight(3);
	first.setWidth(5);
	first.getField();
	first.getPerimeter();
	first.print();
	return 0;
}
