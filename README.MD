Consulta de Valuación Fiscal de Automotores:

Se debe construir una pantalla web que permita consultar las valuaciones de automotores provistas por AFIP las cuales
son utilizadas en las Declaraciones Juradas de Bienes Personales.

A tal efecto, AFIP publica anualmente una planilla Excel con la valuación fiscal de cada modelo de automotor del
mercado :

https://www.afip.gob.ar/gananciasYBienes/bienes-personales/valuaciones/periodo-fiscal-2021.asp

Se deberá descargar dicha planilla, analizar sus campos y diseñar una tabla de base de datos que permita guardar dicha
información considerando su normalización.

La carga de los datos desde la planilla Excel a la tabla creada se debería efectuar con ayuda de algún cliente de base
de datos que permita su importación masiva hacia la tabla creada a tal fin (por ejemplo DbVisualizer). Esta tarea es de
única vez y se efectuaría como paso previo a la consulta a desarrollar.

Luego se deberá construir una aplicación web consistente en una pantalla que permita consultar el valor de tabla de un
automotor en particular, mediante el ingreso de algunos campos que permitan filtrar la búsqueda. Dado que el set de
datos resultante puede ser de uno o más registros, se sugiere la utilización de alguna grilla para la visualización de
los resultados.

Se utilizó MySQL WORKBENCH
Inicializador: https://start.spring.io/
Se realizó con una arquitectura
Modelo-Vista-Controlador (MVC)
Modelo: Representado por las clases de entidad como Automovil. Estas clases modelan la estructura de los datos y
contienen la lógica de negocio básica.
Vista: Representada por las plantillas Thymeleaf(con bootstrap), como consultaAutomotorFormulario.html y
consultaAutomotorResultado.html. Estas plantillas definen cómo se presenta la información al usuario.
Controlador: Representado por clases como ConsultaAutomotorController. Los controladores gestionan las solicitudes HTTP,
interactúan con el modelo para obtener o actualizar datos y seleccionan la vista adecuada para mostrar al usuario.

La tabla fué creada automaticamente por #spring.jpa.hibernate.ddl-auto=update tomando los datos de la entidad.
