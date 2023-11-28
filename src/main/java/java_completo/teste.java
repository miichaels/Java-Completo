package java_completo;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class
teste extends JFrame implements ActionListener {
        private JTextField txtCodigo, txtNome, txtValor, txtQuantidade, txtDataVencimento;
        private JButton btnCadastrar;
        private Connection conexao;
        private Statement comando;

        public teste() {
            setTitle("Gerenciador de Estoque");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 300);
            setLocationRelativeTo(null);

            JPanel painel = new JPanel();
            painel.setLayout(null);

            JLabel lblCodigo = new JLabel("Código:");
            lblCodigo.setBounds(20, 20, 80, 20);
            painel.add(lblCodigo);

            txtCodigo = new JTextField();
            txtCodigo.setBounds(120, 20, 200, 20);
            painel.add(txtCodigo);

            // Adicione outros campos de entrada para os outros dados do produto (nome, valor, quantidade, data de vencimento)

            btnCadastrar = new JButton("Cadastrar");
            btnCadastrar.setBounds(120, 180, 100, 30);
            btnCadastrar.addActionListener(this);
            painel.add(btnCadastrar);

            add(painel);
            setVisible(true);

            conectarBancoDados();
        }

        public void conectarBancoDados() {
            try {
                Class.forName("org.sqlite.JDBC");
                conexao = DriverManager.getConnection("jdbc:sqlite:Armazem.db");
                comando = conexao.createStatement();
                criarTabela();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void criarTabela() {
            try {
                String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                        "codigo INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "nome TEXT NOT NULL," +
                        "valor REAL," +
                        "quantidade INTEGER," +
                        "data_vencimento DATE" +
                        ")";
                comando.executeUpdate(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnCadastrar) {
                cadastrarProduto();
            }
        }

        public void cadastrarProduto() {
            try {
                String nome = txtNome.getText();
                double valor = Double.parseDouble(txtValor.getText());
                int quantidade = Integer.parseInt(txtQuantidade.getText());
                String dataVencimento = txtDataVencimento.getText();

                String sql = "INSERT INTO produtos (nome, valor, quantidade, data_vencimento) " +
                        "VALUES ('" + nome + "', " + valor + ", " + quantidade + ", '" + dataVencimento + "')";

                comando.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto.");
            }
        }

        public static void main(String[] args) {
            new teste();
        }
    }

