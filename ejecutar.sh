#!/bin/bash

cd src/main/java/

javac es/etg/psp/dmc/museo/Museo.java
javac es/etg/psp/dmc/museo/salas/Sala.java
javac es/etg/psp/dmc/museo/salas/acciones/Entrada.java
javac es/etg/psp/dmc/museo/salas/acciones/Salida.java
javac es/etg/psp/dmc/museo/util/Texto.java

java es.etg.psp.dmc.museo.Museo

cd ../../..