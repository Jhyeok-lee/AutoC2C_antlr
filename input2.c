#include <stdio.h>

int main()
{
	auto g;
	auto A(int a){
		g = 1;
		g = g + a;
	}
	auto B(int b){
		auto g;
		g = 3.0;
		g = g + b;
		A(g);
	}
	B(3);
	printf("Value of g will be printed.\n", g);

	return 0;
}

