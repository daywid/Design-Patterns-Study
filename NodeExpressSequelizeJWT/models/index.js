const express = require('express');
const usuarioController = require('./controllers/UsuarioController');
const produtoController = require('./controllers/ProdutoController');
const authMiddleware = require('./middlewares/auth');

const app = express();
app.use(express.json());

// Endpoints de usuário
app.post('/api/usuarios/registrar', usuarioController.registrar);
app.post('/api/login', usuarioController.login);

// Middleware de autenticação
app.use(authMiddleware);

// Endpoints de produtos
app.post('/api/produtos', produtoController.criarProduto);
app.get('/api/produtos/:id', produtoController.consultarProduto);

// Configuração do Sequelize e start do servidor
const { sequelize } = require('./models');
sequelize.sync().then(() => {
  app.listen(3000, () => {
    console.log('Servidor rodando na porta 3000');
  });
});
