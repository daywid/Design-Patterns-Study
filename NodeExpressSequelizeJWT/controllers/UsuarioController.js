// controllers/UsuarioController.js
const usuarioService = require('../services/UsuarioService');


//post para registrar um novo usuário

// Parâmetros:

//email (string): Endereço de e-mail do usuário.
//senha (string): Senha do usuário.

// Possíveis Respostas:

// 201 Created: Usuário registrado com sucesso. Retorna os dados do usuário.
// 500 Internal Server Error: Erro interno do servidor.
exports.registrar = async (req, res) => {
  try {
    const { email, senha } = req.body;
    const usuario = await usuarioService.registrarUsuario(email, senha);
    return res.status(201).json(usuario);
  } catch (error) {
    return res.status(500).json({ error: 'Erro interno do servidor' });
  }
};

//post para autenticar um usuário e gerar um token JWT

// Parâmetros:

// email (string): Endereço de e-mail do usuário.
// senha (string): Senha do usuário.
// Possíveis Respostas:

// 200 OK: Login bem-sucedido. Retorna um token JWT.
// 401 Unauthorized: Credenciais inválidas.
// 500 Internal Server Error: Erro interno do servidor.
exports.login = async (req, res) => {
  try {
    const { email, senha } = req.body;
    const token = await usuarioService.loginUsuario(email, senha);
    return res.status(200).json({ token });
  } catch (error) {
    return res.status(401).json({ error: 'Credenciais inválidas' });
  }
};
