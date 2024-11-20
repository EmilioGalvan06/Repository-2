Algoritmo sin_titulo
	imprimir "Ingresa un numero"
	leer a
	t=1
	mientras t<=a Hacer
		x=1
		mientras x<=t Hacer
			m=1
			mientras m<=t Hacer
				x2=x^2
				m2=m^2
				t2=t^2
				r=m2+x2
				si t2=r Entonces
					imprimir t2 "=" x2 "+" m2
				FinSi
				m=m+1
			FinMientras
			x=x+1
		FinMientras
		t=t+1
	FinMientras
FinAlgoritmo
