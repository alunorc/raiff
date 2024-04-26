# check_guest.py
# Script para verificar se um nome está na lista de convidados e se o convidado é maior de idade.

def check_guest(name, guest_list):
    # Verifica se o nome fornecido está na lista de convidados e se o convidado é maior de idade.
    if name in guest_list:
        if guest_list[name] >= 18:
            print("Acesso permitido.")
        else:
            print("Usuário convidado, bloqueado por ser de menor.")
        else:
            print("Sem resposta.")

def main():
    # Lista de convidados autorizados com suas respectivas idades
    guest_list = {"Alice": 17, "Bob": 25, "Charlie": 17, "Diana": 18, "Jimmy": 42, "Marry": 23, "Rafael": 15}

    # Solicita ao usuário que digite um nome
    name = input("Digite o nome do convidado: ")

    # Chama a função de verificação
    check_guest(name, guest_list)

if __name__ == "__main__":
    main()