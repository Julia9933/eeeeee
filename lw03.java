public class lw03 implements var10 
{

	public void poka(double P)
	{
		double nachVkl = 1000.0;
		int i = 0;
		do {
			i++;
			nachVkl += nachVkl*P;
		} while (nachVkl < 1100.0);
		System.out.println("Сумма вклада превысит 1100 через " + i + "месяцев");
	}
	public void massivy(double[] A)
	{
		int j = 0;
		for (int i=0; i<(A.length-1); i++){
			if (((A[i]%2==0) && ((A[i+1]%2!=0))) || (((A[i]%2!=0)) && (A[i+1]%2==0))) {
				j=0;	
				continue;
			}
			else{
				j=1;
				break;
			}
		}
		double ch = 0;
		double nch = 0;
		if (j == 0){
			for (int k=0; k<(A.length-1); k++){
				if(A[k]%2==0){
					ch = ch+A[k];
				}
				else if (A[k]%2!=0){
					nch = nch + A[k];
				}

			}
			System.out.println("чередуются - 0");
			System.out.println("Сумма четных чисел = " + ch);
			System.out.println("Сумма четных чисел = " + nch);
		}
		else if (j == 1){
			System.out.println("нечередуются - 1");
		}
	}
	public double logika(double d1, double d2, double d3)
	{
		double min = 0;
		double max = 0;
		if (d1<d2 && d1<d3){
			min = d1;
		} else if (d2<d1 && d2<d3){
			min = d2;
		}
		else {
			min = d3;
		}
		if (d1>d2 && d1>d3){
			max = d1;
		} else if (d2>d1 && d2>d3){
			max = d2;
		}
		else {
			max = d3;
		}
		double otvet = max % min;
		System.out.println("Остаток от деления большего на меньшее число = " + otvet);
		return 0;
	}
}