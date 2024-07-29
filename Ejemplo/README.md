
La prueba de rendimiento benchmark, es un proceso que evalúa la eficiencia y capacidad de un sistema. En este contexto, estamos analizando los resultados de ejecutar la misma operación de dos formas distintas, utilizando Stream y parallelStream.

Como resultado, observamos que el desempeño de parallelStreamFilter es mejor que el del streamFilter, indicando que el primero realizó más operaciones por segundo que el segundo. Esto ocurre porque parallelStream facilita la ejecución simultánea mediante varios hilos, optimizando así el rendimiento general.
 
## Reporte de cobertura
![Captura de pantalla 2024-07-29 a la(s) 5.31.12 p. m..png](..%2F..%2F..%2FCaptura%20de%20pantalla%202024-07-29%20a%20la%28s%29%205.31.12%E2%80%AFp.%C2%A0m..png)

## Benchmark
![Captura de pantalla 2024-07-29 a la(s) 5.34.44 p. m..png](..%2F..%2F..%2FCaptura%20de%20pantalla%202024-07-29%20a%20la%28s%29%205.34.44%E2%80%AFp.%C2%A0m..png)