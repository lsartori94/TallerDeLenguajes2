1
  A:
	Es valido, ya que ambas clases estan definidas en el mismo paquete, los atributos y metodos de la clase Alpha
	estan definidos con el modificador de acceso protected; por lo tanto cualquier clase que esta dentro del paquete en el cual esta definida la clase Alpha
	puede acceder.

  B:
	Si, ya que se importa el paquete "griego" y la clase y sus metodos estan definidas como public.

  C:
	No es valido ya que si se crea una subclase en otro paquete distinto al de la superclase, la subclase tiene
	acceso sólo a los miembros public de la superclase. Y como Delta esta en el paquete romano y es subclase
	de Alpha que esta en el paquete griego no se puede acceder a sus metodos protegidos.

2
  A:
	IV. Si ya que la clase no es abstracta y los metodos definidos son metodos de clase.

  B:
	I. 	Nos indica que la clase Math no puede ser extendida.
	II. La mayoria de clases de la libreria standard de Java esta definidos como final, dos ejemplos son: java.lang.System y java.lang.String

  E:
	I. El archivo nuevo generado es el: META-INF/MANIFEST.MF el cual indica como se debe usar el archivo .jar .

3
  A:
	No va a compilar ya que el constructor de la SuperClase esta definido como private, por ende no es visible
	para lo que sea que este fuera de la clase SuperClase. La unica modificacion es cambiar el modificador de acceso del constructor
	de SuperClase de private a public.
