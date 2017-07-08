#include <stdio.h>

void main(){
	auto g;
	auto A(int a){
		g = 3 + a;
	}
	g = 1;
	A(3);
}

