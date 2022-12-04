Uma classe deve ter apenas uma responsabilidade.

O princípio da responsabilidade única nos auxiliar a criar componentes /classes especialista em uma determinada tarefa ou seja uma classe deve ter apenas uma responsabilidade.
ex:

    -   Uma classe DAO "Data Acess Object" deve existir para implementar os métodos utilizados no banco de dados como consultas, atualizações, remoção , buscar por um parametro etc.
    -   uma classe DataSouce deve saber como conectar e desconectar do banco de dados e assim por diante.
    -   uma Classe que defina uma abstração do mundo real deve possuir apenas os atributos necessários para criação do tipo de dados que será referenciado no sistema.


seguindo o exemplo acima temos classe/componentes com o acoplamento necessário para finalidade proposta.

