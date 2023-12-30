import time

def loop():
    for i in range(1000000):
        pass

start = time.perf_counter_ns()
loop()
end = time.perf_counter_ns()

print(f"O loop levou {(end - start)*1000} milissegundos para ser executado.")
