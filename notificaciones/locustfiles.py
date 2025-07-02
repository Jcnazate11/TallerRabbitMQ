from locust import HttpUser, task, between
import random

class PublicacionUser(HttpUser):
    host = "http://localhost:8000"

    wait_time = between(0.5, 1.5)

    @task
    def crear_libro(self):
        autor_id = random.randint(1, 5)

        payload = {
            "titulo": f"Libro Aleatorio {random.randint(1000, 9999)}",
            "anioPublicacion": 2023,
            "editorial": "Editorial Ejemplo",
            "isbn": f"ISBN{random.randint(1000000000000, 9999999999999)}",
            "resumen": "Resumen del libro de prueba.",
            "genero": "Ciencia Ficción",
            "numeroPaginas": 300,
            "idAutor": autor_id
        }

        self.client.post("/libros", json=payload)

