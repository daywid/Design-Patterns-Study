const jwt = require('jsonwebtoken');

module.exports = (req, res, next) => {
  const token = req.headers.authorization;

  if (!token) {
    return res.status(401).json({ message: 'Token não fornecido' });
  }

  jwt.verify(token, 'secreto', (err, decoded) => {
    if (err) {
      return res.status(401).json({ message: 'Token inválido' });
    }

    req.userId = decoded.id;
    next();
  });
};
