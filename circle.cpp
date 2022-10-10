#include <iostream>
#include <cmath>
#define PI 3.14
using namespace std;
class Circle{
	public : 
		double centerx;
		double centery;
		double radius;
		Circle(double x = 1.0, double y = 1.0, double r = 1.0){
			centerx = x;
			centery = y;
			radius = r;
		}
		double getField(){
			return PI * pow(radius, 2);
		}
		double getDistance(Circle a, Circle b){
			return sqrt(pow((a.centerx - b.centerx), 2) + pow((a.centery - b.centery), 2));
		}
		void print(){
			cout << "Field = " << getField();
		}
		Circle sorting(Circle a, Circle b){
			if(a.getField() > b.getField()){
				return a;
			}
			else{
				return b;
			}
		}
		Circle oppositeSorting(Circle a, Circle b){
			if(a.getField() < b.getField()){
				return a;
			}
			else{
				return b;
			}
		}
};
int main(){
	Circle a(5, 9, 6);
	Circle b(1, 3, 4);
	Circle c(0, 0);
	Circle d(0, 0);
	double distance;
	c = c.sorting(a, b);
	d = d.oppositeSorting(a, b);
	c.print();
	distance = d.getDistance(c, d);
	cout << endl << "Distance = " << distance << endl;
	return 0;
}
