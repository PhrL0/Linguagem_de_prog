import socket #biblioteca
import time #biblioteca
HOST = "10.110.12.34" #endereço do servidor
PORT = 5000 #porta que o servidor está utilizando
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM) #Instan. TCP família IPv4
dest = (HOST, PORT)
tcp.connect(dest) #conexão via tcp
while True:
    opcao = input("1. Conversão de temperatura \n2. Cálculo de Área")
    if opcao == 1:
        print('1. Celsius para Kelvin')
        print('2. Celsius para Fahrenheit')
        print('3. Kelvin para Celsius')
        print('4. Kelvin para Fahrenheit')
        print('5. Fahrenheit para Celsius')
        print('6. Farenheit para Kelvin')
        msg = input('Faça a escolha da operação e da temperatura neste formato "SXTXX":')
        tcp.send(msg.encode('utf-8'))  # enviando a mensagem
        time.sleep(1)  # tempo para envio da mensagem
        break
    else:
        msg = input('Escolha a largura eo comprimento neste formato "L0000A0000":')
        tcp.send(msg.encode('utf-8'))  # enviando a mensagem
        time.sleep(1)  # tempo para envio da mensagem
        break

