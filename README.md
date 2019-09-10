# dexfood
Dexfood - Software para controle de vendas de lanche usando java/Spring backend e React no Frontend

[![Build Status](https://travis-ci.org/brunocrodriguessouza/dexfood.svg?branch=master)](https://travis-ci.org/brunocrodriguessouza/dexfood)

GET http://localhost:8080/ingredientes
GET http://localhost:8080/lanches
GET http://localhost:8080/pedidos

POST http://localhost:8080/pedidos
{
    "lanche": {
        "ingredientes": [
            "Hambúrguer de Carne",
            "Queijo"
        ],
        "nomeLanche": "X-Burguer",
        "preco": 6.5
    },
    "adicionais": [
        "Hambúrguer de Carne",
        "Hambúrguer de Carne",
        "Hambúrguer de Carne",
        "Hambúrguer de Carne",
        "Hambúrguer de Carne"
    ]
}
