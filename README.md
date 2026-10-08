Essas foram questões passadas pelo Prof. Emerson Domingos. Aqui estão elas com enunciado:
Questão 1: Sistema de Cupons Avançado (when e Null Safety)
Contexto: Um aplicativo de e-commerce possui diferentes cupons de desconto. Às vezes o usuário não digita nada, deixando o campo nulo.
Enunciado: Crie uma função chamada calcularDesconto que receba o valor de um produto (Double) e o código de um cupom (String?). Utilize a estrutura when para verificar o cupom:
Se for "PROMO10", retorne o valor menos 10.
Se for "PROMO20", retorne o valor menos 20.
Se for nulo ou qualquer outra coisa, retorne o valor original.
Imprima o resultado testando na função main.
Questão 2: Auditoria de Entregas (Laço de Repetição e Elvis Operator)
Contexto: O sistema de um app de entregas recebe uma lista de endereços do servidor. Devido a falhas no GPS, alguns endereços vêm nulos.
Enunciado: Crie uma função que receba uma lista de endereços (List<String?>). Utilize um laço de repetição (for) para percorrer a lista. Dentro do laço, use o Operador Elvis (?:) para substituir endereços nulos pela frase "Endereço Desconhecido". Utilize if/else para imprimir "Entrega Pendente: Falta de dados" se o endereço for desconhecido, e "Rota traçada para: [endereço]" caso seja um endereço válido.
Questão 3: Validação de Perfil de Streaming (if/else e Safe Call)
Contexto: Para criar um perfil infantil no app de streaming, a biografia da criança não pode ultrapassar 50 caracteres.
Enunciado: Escreva uma função chamada validarBioInfantil que receba a biografia (String?). Usando a Chamada Segura (?.) e o Operador Elvis (?:), descubra o tamanho do texto (se for nulo, considere o tamanho como 0). Use if/else para imprimir "Bio aceita" se o tamanho for menor ou igual a 50, e "Bio muito longa" caso contrário.
Questão 4: Processamento de Transações Pix (Laço e if/else)
Contexto: Um aplicativo de banco precisa somar todas as transferências Pix do dia, mas transações que falharam aparecem como nulas no sistema.
Enunciado: Crie uma lista contendo os seguintes valores de transferências: [50.0, null, 120.5, null, 10.0]. Crie um laço de repetição que percorra essa lista. Se o valor não for nulo (use if), some-o a uma variável total. Se for nulo, imprima "Transação ignorada". Ao final do laço, imprima o valor total processado.
Questão 5: Classificação de Feedback de Motoristas (when e Null Safety)
Contexto: Após uma corrida, o passageiro pode dar uma nota (de 1 a 5) para o motorista, mas essa ação é opcional (pode ser nulo).
Enunciado: Escreva uma função chamada avaliarMotorista que receba uma nota: Int?. Utilize o Operador Elvis para converter notas nulas em 0. Em seguida, use a estrutura when para imprimir:
5: "Excelente corrida!"
4: "Boa corrida."
1, 2, 3: "Precisamos melhorar."
0: "Nenhuma avaliação fornecida."
Questão 6: Função Lambda para Cálculo de Gorjeta (Lambda, Null Safety e if)
Contexto: Um restaurante permite que os clientes deixem uma gorjeta opcional através de um tablet na mesa.
Enunciado: Crie uma variável que armazene uma função Lambda. Essa função deve receber um valor de gorjeta (Double?) e usar o parâmetro implícito it. Se a gorjeta for nula ou menor que 0, a função deve retornar 0.0. Caso contrário (se for maior que 0), deve retornar o próprio valor da gorjeta. Teste a lambda passando valores nulos e válidos na função main.
Questão 7: Limpeza de Banco de Dados de Usuários (Laços e Múltiplas Condições)
Contexto: O sistema de uma empresa tem uma lista de e-mails cadastrados. Alguns usuários não cadastraram e-mail (valor nulo) e outros cadastraram e-mails em branco ("").
Enunciado: Crie uma função que receba uma lista de e-mails (List<String?>). Crie um contador numérico de "contas inválidas" iniciando em 0. Faça um laço de repetição for pela lista. Se o e-mail for nulo OU se o e-mail estiver em branco (verifique o .length usando Safe Call e Elvis), adicione 1 ao contador de contas inválidas e imprima um aviso de deleção. Caso contrário, imprima que a conta é válida. Ao fim do laço, mostre quantas contas precisam ser apagadas.
