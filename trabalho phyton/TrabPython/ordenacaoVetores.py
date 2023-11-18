import PySimpleGUI as sg
import random
import time
import pickle
import os

# VARIÁVEIS GLOBAIS
vetorPequeno = [0]
vetorMedio   = [0]
vetorGrande  = [0]

# 7 MÉTODOS DE ORDENAR OS VETORES

def selectionSort(lista):
    trocas = 0
    inicio = time.time()
    for step in range(len(lista)):
        min_idx = step

        for i in range(step + 1, len(lista)):
            if lista[i] < lista[min_idx]:
                min_idx = i
                trocas += 1

        (lista[step], lista[min_idx]) = (lista[min_idx], lista[step])
    fim = time.time()
    janela['tempo1'].update(fim - inicio)
    janela['trocas1'].update(trocas)
    return lista

def bubbleSort(lista):
    trocas = 0
    inicio = time.time()
    elementos = len(lista)-1
    ordenado = False
    while not ordenado:
        ordenado = True
        for i in range(elementos):
            if lista[i] > lista[i+1]:
                lista[i], lista[i+1] = lista[i+1], lista[i]
                ordenado = False
                trocas += 1
    fim = time.time()
    janela['tempo2'].update(fim - inicio)
    janela['trocas2'].update(trocas)
    return lista

def insertionSort(lista):
    trocas = 0
    inicio = time.time()
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1
        while j >= 0 and lista[j] > chave:
            lista[j + 1] = lista[j]
            j -= 1
            trocas += 1
        lista[j + 1] = chave
    fim = time.time()
    janela['tempo3'].update(fim - inicio)
    janela['trocas3'].update(trocas)
    return lista

def shellSort(lista):
    trocas = 0
    inicio = time.time()
    interval = len(lista) // 2
    while interval > 0:
        for i in range(interval, len(lista)):
            temp = lista[i]
            j = i
            while j >= interval and lista[j - interval] > temp:
                lista[j] = lista[j - interval]
                j -= interval
                trocas += 1

            lista[j] = temp
        interval //= 2
    fim = time.time()
    janela['tempo4'].update(fim - inicio)
    janela['trocas4'].update(trocas)
    return lista

def mergeSort(lista):
    trocas = 0
    inicio = time.time()
    tamanho_da_lista = len(lista) - 1

    for posicao_atual in range(0, tamanho_da_lista):
        posicao_menor = posicao_atual
        menor_nome = lista[posicao_menor]

        for posicao_busca in range(posicao_atual, tamanho_da_lista):
            nome_busca = lista[posicao_busca + 1]

            if menor_nome > nome_busca:
                menor_nome = nome_busca
                posicao_menor = posicao_busca + 1
                trocas += 1

        if posicao_menor != posicao_atual:
            menor_nome = lista[posicao_menor]
            lista[posicao_menor] = lista[posicao_atual]
            lista[posicao_atual] = menor_nome
    fim = time.time()
    janela['tempo5'].update(fim - inicio)
    janela['trocas5'].update(trocas)
    return lista

def quickSort(lista, trocas = 0):
    inicio = time.time()
    if len(lista) <= 1:
        return lista, trocas
    else:
        pivo = lista[0]
        menores = [x for x in lista[1:] if x <= pivo]
        maiores = [x for x in lista[1:] if x > pivo]
        
        ordenados_menores, trocas_menores = quickSort(menores, trocas)
        ordenados_maiores, trocas_maiores = quickSort(maiores, trocas)
        
        trocas = trocas_menores + trocas_maiores + len(menores) + len(maiores)
        return ordenados_menores + [pivo] + ordenados_maiores, trocas

def countingSort(lista):
    trocas = 0
    inicio = time.time()
    valor_maximo = max(lista)
    valor_minimo = min(lista)
    intervalo_elementos = valor_maximo - valor_minimo + 1
    contagem = [0] * intervalo_elementos
    resultado = [0] * len(lista)

    for i in range(len(lista)):
        contagem[lista[i] - valor_minimo] += 1

    for i in range(1, len(contagem)):
        contagem[i] += contagem[i - 1]

    i = len(lista) - 1
    while i >= 0:
        resultado[contagem[lista[i] - valor_minimo] - 1] = lista[i]
        contagem[lista[i] - valor_minimo] -= 1
        i -= 1
        trocas += 1

    for i in range(len(lista)):
        lista[i] = resultado[i]
    fim = time.time()
    janela['tempo7'].update(fim - inicio)
    janela['trocas7'].update(trocas)
    return lista


#   FUNÇÃO AUXILIAR PARA CHAMADA DE CADA FUNÇÃO DE ORDENAÇÃO
def chamaFuncao(num, lista):
    if num == 1:
        listaOrdenada = selectionSort(lista)
    elif num == 2:
        listaOrdenada = bubbleSort(lista)
    elif num == 3:
        listaOrdenada = insertionSort(lista)
    elif num == 4:
        listaOrdenada = shellSort(lista)
    elif num == 5:
        listaOrdenada = mergeSort(lista)
    elif num == 6:
        inicio = time.time()
        listaOrdenada, trocas = quickSort(lista)
        fim = time.time()
        janela['tempo6'].update(fim - inicio)
        janela['trocas6'].update(trocas)
    elif num == 7:
        listaOrdenada = countingSort(lista)
    return listaOrdenada

# SALVAR E CARREGAR ARQUIVO
def salvar_vetor_em_arquivo(vetor, nome_arquivo):
    with open(nome_arquivo, 'wb') as arquivo:
        pickle.dump(vetor, arquivo)

def carregar_vetor_de_arquivo(nome_arquivo):
    with open(nome_arquivo, 'rb') as arquivo:
        vetor = pickle.load(arquivo)
    return vetor

# CRIA ARQUIVOS DE VETORES
def criarVetores():
    vetorPequeno    = random.sample(range(10000000), 100)
    vetorMedio      = random.sample(range(10000000), 1000)
    vetorGrande     = random.sample(range(10000000), 10000)
    salvar_vetor_em_arquivo(vetorPequeno, 'vetorPequeno.txt')
    salvar_vetor_em_arquivo(vetorMedio, 'vetorMedio.txt')
    salvar_vetor_em_arquivo(vetorGrande, 'vetorGrande.txt')

# Layout
sg.theme('Reddit')

layout =  [
    [sg.Button('Criar novos vetores', size=(20,1))],
    [sg.Button('Carregar vetores', size=(20,1))],
    [sg.Text()],
    [sg.Button('Ordenar vetor pequeno', size=(20,1)), sg.Button('Ordenar vetor médio', size=(20,1)), sg.Button('Ordenar vetor grande', size=(20,1))],
    [sg.Text()],
    [sg.Text('Tipo de ordenação:', size=(20,1))     , sg.Text('Qtd de trocas:', size=(20,1)), sg.Text('Tempo:', size=(20,1))],
    [sg.Text('')],
    [sg.Text('Selection Sort', size=(20,1))     , sg.Text('', size=(20,1), key='trocas1')      , sg.Text('', size=(20,1), key='tempo1')],
    [sg.Text('Bubble Sort', size=(20,1))        , sg.Text('', size=(20,1), key='trocas2')      , sg.Text('', size=(20,1), key='tempo2')],
    [sg.Text('Insertion Sort', size=(20,1))     , sg.Text('', size=(20,1), key='trocas3')      , sg.Text('', size=(20,1), key='tempo3')],
    [sg.Text('Shell Sort', size=(20,1))         , sg.Text('', size=(20,1), key='trocas4')      , sg.Text('', size=(20,1), key='tempo4')],
    [sg.Text('Merge Sort', size=(20,1))         , sg.Text('', size=(20,1), key='trocas5')      , sg.Text('', size=(20,1), key='tempo5')],
    [sg.Text('Quick Sort', size=(20,1))         , sg.Text('', size=(20,1), key='trocas6')      , sg.Text('', size=(20,1), key='tempo6')],
    [sg.Text('Counting Sort', size=(20,1))      , sg.Text('', size=(20,1), key='trocas7')      , sg.Text('', size=(20,1), key='tempo7')],
]

# Janela
janela = sg.Window('Tela de login', layout, size=(700,500), element_justification='l')

# Eventos
def lerEventos():
    try:
        while True:
            eventos, valores =  janela.read()
            if eventos == sg.WINDOW_CLOSED:
                break
            elif eventos == 'Criar novos vetores':
                criarVetores()
                print('Vetores criados com valores aleatorios!')
            elif eventos == 'Carregar vetores':
                vetorPequeno    = carregar_vetor_de_arquivo('vetorPequeno.txt')
                vetorMedio      = carregar_vetor_de_arquivo('vetorMedio.txt')
                vetorGrande     = carregar_vetor_de_arquivo('vetorGrande.txt')
                print('Vetores carregados')
            elif eventos == 'Ordenar vetor pequeno':
                chamaFuncao(1, vetorPequeno.copy())
                chamaFuncao(2, vetorPequeno.copy())
                chamaFuncao(3, vetorPequeno.copy())
                chamaFuncao(4, vetorPequeno.copy())
                chamaFuncao(5, vetorPequeno.copy())
                chamaFuncao(6, vetorPequeno.copy())
                chamaFuncao(7, vetorPequeno.copy())
            elif eventos == 'Ordenar vetor médio':
                chamaFuncao(1, vetorMedio.copy())
                chamaFuncao(2, vetorMedio.copy())
                chamaFuncao(3, vetorMedio.copy())
                chamaFuncao(4, vetorMedio.copy())
                chamaFuncao(5, vetorMedio.copy())
                chamaFuncao(6, vetorMedio.copy())
                chamaFuncao(7, vetorMedio.copy())
            elif eventos == 'Ordenar vetor grande':
                chamaFuncao(1, vetorGrande.copy())
                chamaFuncao(2, vetorGrande.copy())
                chamaFuncao(3, vetorGrande.copy())
                chamaFuncao(4, vetorGrande.copy())
                chamaFuncao(5, vetorGrande.copy())
                chamaFuncao(6, vetorGrande.copy())
                chamaFuncao(7, vetorGrande.copy())
    except Exception as e:
        print(e)

def main():
    os.system('cls')
    while True:
        lerEventos()
    
    #print(vetorPequeno)
    #mergeSort(vetorGrande)

        
    #print("Tempo de execução:", fim - inicio, "segundos")

if __name__ == "__main__":
    main()