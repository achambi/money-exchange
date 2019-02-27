# money-exchange
Repositorio para ejemplo de TDD

Requerimientos casa de cambios.
=================================
1. Se requiere un sistema pequeño para que realice cambios entre monedas.
2. Se debe realizar el manejo de tipos de cambio de compra y venta.
3. Cuando se configura el sistema pequeño el tipo de cambio de compra debe ser mayor al de venta. para la ganancia maxima Ej (dolares - bolivianos):

		- al comprar 100 dolares de un cliente le debemos pagar bajo la siguiente formula 100 * 6.95 es decir 695.
		- al vender 100 dolares a un cliente le pedimos la mayor cantidad de bolivianos es decir 100 * 6.97 es decir 697.

ATDD:
=====
	Caso 1: 
		Cuando realizo un tipo de cambio entre bolivianos y dolares.
		Configuro el tipo de cambio de compra y venta en 6.95 y 6.97.
		Entonces solicito convertir 100 dolares a bolivianos.
		Espero que me devuelva 695 bolivianos.

	Caso 2: 
		Cuando realizo un tipo de cambio entre bolivianos y dolares.
		Configuro el tipo de cambio de compra y venta en 6.95 y 6.97.
		Entonces solicito convertir 697 bolivianos a dolares.
		Espero que me devuelva 100 dolares.

	Caso 3: 
		Cuando realizo un tipo de cambio entre bolivianos y dolares.
		Configuro el tipo de cambio de compra y venta en 6.95 y 6.97.
		Entonces solicito convertir 50 dolares a bolivianos.
		Espero que me devuelva 347.5 bolivianos.

	Caso 4: 
		Cuando realizo un tipo de cambio entre bolivianos y dolares.
		Configuro el tipo de cambio de compra y venta en 6.95 y 6.97.
		Entonces solicito convertir 348.5 bolivianos a dolares.
		Espero que me devuelva 50 dolares.
