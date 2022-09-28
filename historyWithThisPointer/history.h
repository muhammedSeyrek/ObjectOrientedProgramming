#ifndef HISTORY_H
#define HISTORY_H
class History{
	private :
		int day;
		int month;
		int year;	
	public : 
		History(int d, int m, int y);
		History findWhatsNext(History);
		void print();
};
#endif
