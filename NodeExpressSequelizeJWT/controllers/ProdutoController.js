const produtoService = require('../services/ProdutoService');


//post para criar um produto novo

// Parâmetros:

// produto (string): Nome do produto.
// descricao (string): Descrição do produto.
// preco (number): Preço do produto.
// Possíveis Respostas:

// 201 Created: Produto criado com sucesso. Retorna os dados do produto.
// 500 Internal Server Error: Erro interno do servidor.
exports.criarProduto = async (req, res) => {
  try {
    const { produto, descricao, preco } = req.body;
    const novoProduto = await produtoService.criarProduto(produto, descricao, preco);
    return res.status(201).json(novoProduto);
  } catch (error) {
    return res.status(500).json({ error: 'Erro interno do servidor' });
  }
};

//post para consultar informações de um produto pelo ID.

// Parâmetros:

// id (string): ID do produto a ser consultado.
// Possíveis Respostas:

// 200 OK: Retorna os dados do produto.
// 404 Not Found: Produto não encontrado.
// 500 Internal Server Error: Erro interno do servidor.
exports.consultarProduto = async (req, res) => {
  try {
    const { id } = req.params;
    const produto = await produtoService.consultarProdutoPorId(id);

    if (!produto) {
      return res.status(404).json({ error: 'Produto não encontrado' });
    }

    return res.status(200).json(produto);
  } catch (error) {
    return res.status(500).json({ error: 'Erro interno do servidor' });
  }
};
