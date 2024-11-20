Algoritmo Serie_fibonacci
        definir n, a, b, c, i Como Entero
		escribir "Escribe tu cantidad"
		leer n
		a=1
		b=1
		i=3
		escribir "1=",a
		escribir "2=",b
		mientras i<=n Hacer
			c=a+b
			escribir i,"=",c
			a=b
			b=c
			i=i+1
		FinMientras	
FinAlgoritmo
