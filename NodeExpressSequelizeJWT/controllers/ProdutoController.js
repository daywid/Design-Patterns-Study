const produtoService = require('../services/ProdutoService');

exports.criarProduto = async (req, res) => {
  try {
    const { produto, descricao, preco } = req.body;
    const novoProduto = await produtoService.criarProduto(produto, descricao, preco);
    return res.status(201).json(novoProduto);
  } catch (error) {
    return res.status(500).json({ error: 'Erro interno do servidor' });
  }
};

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
