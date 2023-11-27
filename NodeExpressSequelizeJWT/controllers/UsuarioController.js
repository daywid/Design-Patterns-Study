// controllers/UsuarioController.js
const usuarioService = require('../services/UsuarioService');

exports.registrar = async (req, res) => {
  try {
    const { email, senha } = req.body;
    const usuario = await usuarioService.registrarUsuario(email, senha);
    return res.status(201).json(usuario);
  } catch (error) {
    return res.status(500).json({ error: 'Erro interno do servidor' });
  }
};

exports.login = async (req, res) => {
  try {
    const { email, senha } = req.body;
    const token = await usuarioService.loginUsuario(email, senha);
    return res.status(200).json({ token });
  } catch (error) {
    return res.status(401).json({ error: 'Credenciais inválidas' });
  }
};
