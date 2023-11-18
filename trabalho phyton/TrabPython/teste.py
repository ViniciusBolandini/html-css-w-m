import matplotlib.pyplot as plt
import numpy as np

def plotar_dois_graficos(x1, y1, x2, y2):
    # Criar uma figura com duas sub-figuras (gráficos)
    fig, (ax1, ax2) = plt.subplots(1, 2, figsize=(10, 5))

    # Gráfico 1
    ax1.bar(x1, y1, color='blue')
    ax1.set_title('Gráfico 1')
    ax1.set_xlabel('Eixo X')
    ax1.set_ylabel('Eixo Y')

    # Gráfico 2
    ax2.bar(x2, y2, color='green')
    ax2.set_title('Gráfico 2')
    ax2.set_xlabel('Eixo X')
    ax2.set_ylabel('Eixo Y')

    # Ajustar o layout para evitar sobreposição
    plt.tight_layout()

    # Exibir a janela com os dois gráficos
    plt.show()

# Exemplo de dados para os dois gráficos
dados_x1 = ['Item 1', 'Item 2', 'Item 3', 'Item 4', 'Item 5']
dados_y1 = [10, 24, 15, 30, 20]

dados_x2 = ['Item A', 'Item B', 'Item C', 'Item D', 'Item E']
dados_y2 = [15, 22, 18, 25, 30]

# Chamar a função para plotar os dois gráficos
plotar_dois_graficos(dados_x1, dados_y1, dados_x2, dados_y2)
