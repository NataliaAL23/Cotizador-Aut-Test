#language:es

Característica: Ingreso al cotizador
  Yo como usuario administrador del cotizador
  Quiero ingresar al cctizador
  Para realizar las transacciones necesarias en él

@Prueba1
  Esquema del escenario:
    Dado que el usuario se loguea en el cotizador con las credenciales
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |


    Ejemplos:
      | usuario  | contrasena |
      | benjmohe | benjmohe   |
      | carlpase | carlpase   |





