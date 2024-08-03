La prueba de rendimiento benchmark, es un proceso que evalúa la eficiencia y capacidad de un sistema. En este contexto,
estamos analizando los resultados de ejecutar la misma operación de dos formas distintas, utilizando Stream y
parallelStream.

Como resultado, observamos que el desempeño de parallelStreamFilter es mejor que el del streamFilter, indicando que el
primero realizó más operaciones por segundo que el segundo. Esto ocurre porque parallelStream facilita la ejecución
simultánea mediante varios hilos, optimizando así el rendimiento general.

## Reporte de cobertura

![Captura de pantalla 2024-07-29 a la(s) 5.31.12 p. m..png](..%2F..%2F..%2FCaptura%20de%20pantalla%202024-07-29%20a%20la%28s%29%205.31.12%E2%80%AFp.%C2%A0m..png)

## Benchmark

![Captura de pantalla 2024-07-29 a la(s) 5.34.44 p. m..png](..%2F..%2F..%2FCaptura%20de%20pantalla%202024-07-29%20a%20la%28s%29%205.34.44%E2%80%AFp.%C2%A0m..png)

# Correcciones - Estado: RE-ENTREGA

## Necesarias para aprobar:

- La carpeta "Ejemplo" no debería de existir, el contenido del repositorio debería de ir dentro de la carpeta root. Lo
  mismo con el README.md, y el .gitignore, deberían de ubicarse en el root del proyecto.
- Usar Java 21
- No se pueden ver las imágenes de las conclusiones
- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido que se pisa ya que no se renueva en cada @Test.
- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. NO utilizar
  optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les
  permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo
  acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination
- En la elaboración de sus conclusiones, es fundamental que incluyan los valores obtenidos en la descripción y
  cuantifiquen los resultados con medidas específicas. Se podría analizar qué Modo de Benchmark utilizaron, por qué lo
  eligieron (o incluso comparar los resultados entre los distintos modos), análizar qué representan los resultados, cómo
  influye la tasa de errores, etc. Al hacer esto, sus conclusiones serán más precisas y sólidas.
  Para futuros trabajos, les sugiero actualizar directamente el archivo `README.md` con estas conclusiones y las nuevas
  imágenes pertinentes, en lugar de incluirlas únicamente en la sección de "Correcciones realizadas".

## Adicionales:

- Seguir como estándar CamelCase para los nombres de las variables en las clases, y corregir los nombres de las clases y
  archivos para seguir un mismo estándar.
- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar, ni los archivos propios del
  framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta
  build, "hs_err_pid5148.log" y otros.
- La estructura de las carpetas podría separarse entre cada ejercicio de una manera más granular. Pordían separar entre
  ClasesATestear, Ejercicio3, Ejercicio4, Ejercicio2/PruebaBenchmark y colocar cada archivo en cada package
  correspondiente.
- En ésta misma linea, si hacen el refactor sugerido en el punto anterior, los tests siempre deberían de ir en el mismo
  package y tener la misma estructura de carpetas que en main, por lo tanto en vez de ir en test/java deberían de ir
  dentro de test/java/org/example/TestClasesATestear
- Les sugiero que sigan buenas prácticas al realizar commits, tales como utilizar verbos en
  imperativo y emplear prefijos para aportar claridad semántica. Les recomiendo leer éste artículo sobre un
  desarrollador español que aborda estos aspectos y otros puntos relevantes. [1]
- Además, he notado que los archivos no han sido formateados adecuadamente y no se ha respetado el número máximo de
  caracteres por línea (la línea gris vertical que tienen en Intellij marca justamente ésto). Un ejemplo es en el
  archivo `README.md`, donde las líneas largas dificultan la lectura al exceder los límites visibles de la pantalla. En
  IntelliJ, pueden formatear el código utilizando el atajo de teclado Ctrl + Alt + L [2]. Con otros shortcuts pueden
  optimizar los imports, y muchas cosas más, aunque esto puede variar según el caso si han cambiado la configuración por
  default.

### Bibliografía:

- \[1]: https://midu.dev/buenas-practicas-escribir-commits-git/
- \[2]: https://www.jetbrains.com/guide/java/tutorials/reading-code/formatting/#:~:text=If%20we%20encounter%20code%20that,L%20(Windows%2FLinux).
