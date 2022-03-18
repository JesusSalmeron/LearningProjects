# Crear un archivo txt.
from ast import Delete
import os



f = open("hi.txt", "w")
f.write("Whats up mate!\n")
f.close()

f = open("hi.txt","a")
f.write("See you space cowboy.\n")
f.close()

f = open("hi.txt","r")
contenido = f.read()
f.close()

f = open("hi.txt","r")
lineas = f.readlines()
f.close()


os.path.exists("hi.txt")
os.remove("hi.txt")
os.path.exists("hi.txt")


os.mkdir("Sky")
os.path.exists("sky")
