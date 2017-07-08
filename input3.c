#include <stdio.h>
#include <stdlib.h>
int randomnum()
{
	return rand();
}
int main()
{
	auto name[20] = "S.Park";
	auto score[3];
	auto i, total;
	auto num = 1;	
		
	if(num > 0)
	{
		auto j;
		j = 0;
		
		do{
			total = 0;
			
			for(i=0; i<3; i=i+1)
			{
				score[i] = randomnum()%100+1;
				printf("Score #%d: %d \n",i+1, score[i]);
				total = total + score[i];
			}
			printf("%s's total score is %d, average is %.2f \n",name,total,total/3.0);
			j = j + 1;
			switch(total){
			case 300:
				printf("Best scores!\n");
				break; 
			case 0:
				printf("Worst scores!\n");
				break;
			default:
				printf("Good!\n");
				break;
			}
		}while(j < num);
	}
	else
	{
		exit(1);
	}
	return 0;
}
