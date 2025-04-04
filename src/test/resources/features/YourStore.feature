Feature: Navegando en Your Store

    @FlujoCompleto
    Scenario: Agregar producto de compras y remover el producto
        Given Estoy en la web de Your Store
        When Busco el producto "Iphone"
        And Agrego al carrito el producto
        Then Se visualiza el "iPhone" en el carrito correctamente
        When Remuevo el producto del carrito
        Then Visualizo el producto removido del carrito