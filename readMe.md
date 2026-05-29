Sistema BurgerKing - Requisitos Funcionais
Objetivo
Desenvolver um sistema de lanchonete em Java puro utilizando orientação a objetos, persistência em JSON e execução via console.
 
Fluxo Principal
Menu Inicial
Ao iniciar o sistema, deve ser exibido um menu com as seguintes opções:
BURGER KING 

1 - Cadastrar cliente
2 - Fazer login
0 - Sair
 
Requisitos Funcionais
RF01 - Cadastro de cliente
O sistema deve permitir cadastrar um novo cliente contendo:
nome
Regras:
o e-mail não pode ser duplicado
 
RF02 - Login
O sistema deve permitir autenticação utilizando:
e-mail
Regras:
validar se o usuário existe
 
- Menu do cliente autenticado
Após login realizado com sucesso, o sistema deve exibir:
===== MENU CLIENTE =====

1 - Ver cardápio
2 - Ver pontos fidelidade
0 - Logout
 
Visualizar cardápio
O sistema deve listar os produtos disponíveis da lanchonete.
Exemplo:
1 - Whopper
2 - X-Burger
3 - Batata Frita
4 - Refrigerante
Cada produto deve possuir:
nome
 
RF05 - Clube de fidelidade
O sistema deve permitir visualizar os pontos acumulados do cliente.
Regras:
cada cliente possui uma quantidade de pontos