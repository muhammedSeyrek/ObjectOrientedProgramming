#include <iostream>
using namespace std;
class Draw{
	public : 
		int height;
		int width;
	Draw(int a = 1, int b = 1){
		height = a;
		width = b;
	}
	int getField(){
		return height * width; 
	}
	int getPerimeter(){
		return (height * 2) + (width * 2);
	}
	void print(){
		cout << getField() << " and " << getPerimeter();
	}
	Draw sorting(Draw a, Draw b){
		if(a.getField() > b.getField()){
			return a;
		}
		else{
			return b;
		}
	}
};
int main(){
	Draw a(5, 6);
	cout << "First field of rectangle and perimeter = ";
	a.print();
	cout << endl;
	Draw b(7, 8);
	cout << "Second field of rectangle and perimeter = ";
	b.print();
	Draw c = c.sorting(a, b);
	cout << "\nLargest rectangle (field and perimeter) = ";
	c.print();
	return 0;
}
