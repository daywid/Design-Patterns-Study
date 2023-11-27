const { Produto } = require('../models');

exports.criarProduto = async (produto, descricao, preco) => {
  const novoProduto = await Produto.create({ produto, descricao, preco });
  return novoProduto;
};

exports.consultarProdutoPorId = async (id) => {
  const produto = await Produto.findByPk(id);
  return produto;
};
