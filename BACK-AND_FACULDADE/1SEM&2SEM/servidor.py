import socket  #biblioteca

HOST = "10.110.12.34"  #endereço do servidor
PORT = 5000  #porta que o servidor irá ficar ouvindo a rede
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)  #Instan. TCP família IPv4
orig = (HOST, PORT)
tcp.bind(orig)  #Passagem do endereço e porta
tcp.listen(1)  #Quantidade de conexões


def calc(sel, tempera):
    if sel == 0:  # Celsius para Kelvin
        kelvin = temp + 273.15
        return f"{temp} °C são: {kelvin} K"
    elif sel == 1:  # Celsius para Fahrenheit
        fahrenheit = (temp * 9 / 5) + 32
        return f"{temp} °C são: {fahrenheit} °F"
    elif sel == 2:  # Kelvin para Celsius
        celsius = temp - 273.15
        return f"{temp} K são: {celsius} °C"
    elif sel == 3:  # Kelvin para Fahrenheit
        fahrenheit = ((temp - 273.15) * 9 / 5) + 32
        return f"{temp} K são: {fahrenheit} °F"
    elif sel == 4:  # Fahrenheit para Celsius
        celsius = (temp - 32) * 5 / 9
        return f"{temp} °F são: {celsius} °C"
    elif sel == 5:  # Fahrenheit para Kelvin
        kelvin = ((temp - 32) * 5 / 9) + 273.15
        return f"{temp} °F são: {kelvin} K"
    else:
        return "Opção inválida"



while True:  #Loop
    print('Aguardando conexão')  #mensagem para orientação
    con, cliente = tcp.accept()  #aguardando o aceite da conexão
    print('Conectado por:', cliente)  #mensagem de conexão
    while True:  #loop de recebimento de mensagens
        msg = con.recv(1024)  #variável onde será recebida a mensagem
        if not msg:  #verifica se há mensagem
            break  #se não houver mensagem sai do loop
        flag = str(msg[0:1])
        if flag == 'S' | flag == 's':
            selecao = int(msg[1:2])
            temp = float(msg[3:])
            print(calc(selecao, temp))
        else:
            largura = (msg[0:5])
            print(largura)

        print('Finalizando conexão do cliente', cliente)  #mensagem de orientação
    con.close()  #finalização da conexão
