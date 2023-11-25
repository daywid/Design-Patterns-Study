const userService = require('../services/userService');

class UserController {
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

  async createProduct(req, res) {
    const { name, category, listPrice } = req.body;

    try {
      const newProduct = await userService.createProduct(name, category, listPrice);
      res.status(201).json(newProduct);
    } catch (error) {
      console.error('Erro ao criar produto:', error);
      res.status(500).json({ error: 'Ocorreu um erro durante a criação do produto.' });
    }
  }

  async getProductById(req, res) {
    const { productId } = req.params;

    try {
      const product = await userService.getProductById(productId);
      res.status(200).json(product);
    } catch (error) {
      console.error('Erro ao buscar produto:', error);
      res.status(500).json({ error: 'Ocorreu um erro durante a busca do produto.' });
    }
  }

  async getAllProducts(req, res) {
    try {
      const products = await userService.getAllProducts();
      res.status(200).json(products);
    } catch (error) {
      console.error('Erro ao buscar produtos:', error);
      res.status(500).json({ error: 'Ocorreu um erro durante a busca dos produtos.' });
    }
  }

}

module.exports = new UserController();
