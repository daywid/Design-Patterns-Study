module.exports = (sequelize, DataTypes) => {
    const Produto = sequelize.define('Produto', {
      produto: {
        type: DataTypes.STRING,
        allowNull: false,
      },
      descricao: {
        type: DataTypes.STRING,
      },
      preco: {
        type: DataTypes.DECIMAL(10, 2),
        allowNull: false,
      },
    });
    return Produto;
  };