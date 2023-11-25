const userService = require('../services/userService');
// services/userService.js
const User = require('../models/user');
const Product = require('../models/product'); 

class UserService {
  async createUser(req, res) {
    const { name, email, password } = req.body;

    try {
      const newUser = await userService.createUser(name, email, password);
      res.status(201).json(newUser);
    } catch (error) {
      console.error('Erro ao criar usuário:', error);
      res.status(500).json({ error: 'Ocorreu um erro durante a criação do usuário.' });
    }
  }

  async getUserByEmail(req, res) {
    const { email } = req.params;

    try {
      const user = await userService.getUserByEmail(email);
      res.status(200).json(user);
    } catch (error) {
      console.error('Erro ao buscar usuário:', error);
      res.status(500).json({ error: 'Ocorreu um erro durante a busca do usuário.' });
    }
  }

   // Função para criar um produto
   async createProduct(name, category, listPrice) {
    return Product.create({ name, category, listPrice });
  }

  // Função para obter um produto por ID
  async getProductById(productId) {
    return Product.findByPk(productId);
  }

   // Função para obter todos os produtos
   async getAllProducts() {
    return Product.findAll();
  }

  
}

module.exports = new UserService();
