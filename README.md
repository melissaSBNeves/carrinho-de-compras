# Carrinho de Compras

## Descrição

Este projeto consiste em uma implementação simples de um sistema de carrinho de compras em Java. Ele permite a adição de produtos nacionais e importados ao carrinho, cálculo do valor total dos produtos, remoção de produtos, e diversas outras operações relacionadas à manipulação dos itens no carrinho.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

1. **Produto:** Classe abstrata que define os atributos e métodos básicos de um produto, como código de barra, nome, descrição, preço, quantidade, e categoria.

2. **ProdutoNacional:** Subclasse de `Produto`, que representa produtos fabricados no Brasil. Inclui informações adicionais como a cidade de origem.

3. **ProdutoImportado:** Subclasse de `Produto`, que representa produtos importados. Inclui informações adicionais como taxa de importação e país de origem.

4. **Carrinho:** Classe que gerencia uma lista de produtos, permitindo adicionar, remover, e consultar produtos. Também realiza cálculos de valores totais e buscas por categorias.

## Funcionalidades

- **Adicionar Produtos ao Carrinho:** Permite adicionar tanto produtos nacionais quanto importados ao carrinho.
- **Listar Produtos:** Exibe todos os produtos atualmente no carrinho.
- **Verificar Existência de Produto:** Verifica se um produto existe no carrinho por meio do código de barras ou do índice na lista.
- **Obter Produto por Índice:** Retorna um produto específico baseado no índice na lista do carrinho.
- **Remover Produto:** Remove um produto do carrinho baseado no índice.
- **Calcular Valor Total:** Calcula o valor total de todos os produtos no carrinho.
- **Calcular Valor Total por Categoria:** Calcula o valor total dos produtos pertencentes a uma determinada categoria.
- **Buscar Produtos por Categoria:** Retorna uma lista de produtos que pertencem a uma categoria específica.

