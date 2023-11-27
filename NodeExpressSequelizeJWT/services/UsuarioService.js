const { Usuario } = require('../models');
const jwt = require('jsonwebtoken');

exports.registrarUsuario = async (email, senha) => {
  const usuario = await Usuario.create({ email, senha });
  return usuario;
};

exports.loginUsuario = async (email, senha) => {
  const usuario = await Usuario.findOne({ where: { email, senha } });

  if (!usuario) {
    throw new Error('Credenciais inválidas');
  }

  const token = jwt.sign({ id: usuario.id }, 'secreto', { expiresIn: '1h' });
  return token;
};
