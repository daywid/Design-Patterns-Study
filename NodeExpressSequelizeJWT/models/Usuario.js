module.exports = (sequelize, DataTypes) => {
    const Usuario = sequelize.define('Usuario', {
      email: {
        type: DataTypes.STRING,
        allowNull: false,
        unique: true,
      },
      senha: {
        type: DataTypes.STRING,
        allowNull: false,
      },
    });
    return Usuario;
  };