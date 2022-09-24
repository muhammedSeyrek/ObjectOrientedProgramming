#include <iostream>
using namespace std;
#include "sFrac.h"
SFrac :: SFrac(int n, int d){
	setShare(n);
	setDenom(d);
	if(share > denom)
		swap();
}
SFrac SFrac :: sum(SFrac a){
	SFrac t;
	t.share = t.share * denom + a.denom * share;
	t.denom = a.denom * denom;
	t.simplify();
	return t; 
}
void SFrac :: print(void){
	cout << "\n\t" << share << "\n\t----\n\t " << denom << endl;
}
int SFrac :: getShare(void){
	return share;
} 
int SFrac :: getDenom(void){
	return denom;
}
void SFrac :: setShare(int k){
	share = k;
}
void SFrac :: setDenom(int k){
	denom = k;
}
void SFrac :: swap(void){
	int temp;
	temp = share;
	share = denom;
	denom = temp;
}
void SFrac :: simplify(void){
	for(int i = share; i >= 2; i--){
		if(share % i == 0 && denom % i == 0){
			share /= i;
			denom /= i;
			i = 1;
		}
	}
}
