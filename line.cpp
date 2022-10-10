#include <iostream>
using namespace std;
class Line{
	public :
		int xF, yF, xS, yS; 
		Line(int x1 = 1, int y1 = 1, int x2 = 1, int y2 = 1){
			xF = x1;
			yF = y1;
			xS = x2;
			yS = y2;
		}	
		float getSlope(){
			return (float)(yF - yS) / (float)(xF - xS);
		}
		void setScrollFirst(int number){
			xF += number;
			yF += number;
		}	
		void setScrollYSecond(int number){
			xS += number;
			yS += number;
		}
		void print(){
			cout << "x1 = " << xF << " x2 = " << xS << endl;
			cout << "y1 = " << yF << " y2 = " << yS << endl;
 			cout << "Slope of the line = " << getSlope() << endl;
		}
};
int main(){
	Line a(2, 4, 5, 6);
	a.print();
	a.setScrollFirst(1);
	a.print();
	return 0;
}
