#ifndef SIMPLEF_H
#define SIMPLEF_H
class SFrac{
	public : 
		SFrac(int = 0, int = 1);
		SFrac sum(SFrac);
		void print(void);
		int getShare(void);
		int getDenom(void);
		void setShare(int);
		void setDenom(int);
		void simplify(void);
	private : 
		int share;
		int denom;
		void swap();		
};
#endif
