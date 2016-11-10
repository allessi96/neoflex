package tree;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class SearchNode extends javax.swing.JFrame {

    private TreeMainFrame MainFrame;

    public SearchNode() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        valLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        valText = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nameLabel.setText("Поиск по имени:");

        valLabel.setText("Поиск по значению:");

        nameText.setEnabled(false);

        valText.setEnabled(false);

        cancelButton.setText("Отмена");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Поиск");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameText)
                    .addComponent(valText)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valLabel)
                    .addComponent(valText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(searchButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
        getMainFrame();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        boolean flag = false;

        try {
            if (!nameText.getText().equals("") || !valText.getText().equals("")) {
                if (nameText.isEnabled()) {
                    for (Node n : TreeMainFrame.nodes) {
                        if (n.getName().equals(nameText.getText())) {
                            MainFrame.selectedNode = n;
                            flag = true;
                            break;
                        }
                    }
                } else {
                    for (Node n : TreeMainFrame.nodes) {
                        if (n.getValue() == Integer.parseInt(valText.getText())) {
                            MainFrame.selectedNode = n;
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag == false) {
                    JOptionPane.showMessageDialog(null, "Узел не найден. Проверьте данные.");
                }

                setVisible(false);

                MainFrame.gr2d.clearRect(0, 0, 440, 450);
                MainFrame.drawNode(Math.abs(MainFrame.DrawPanel.getWidth() / 2 - 10), 10, TreeMainFrame.nodes.get(0));
                nameText.setEnabled(false);
                valText.setEnabled(false);
                getMainFrame();
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Ошибка поиска. Проверьте данные.");
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    public TreeMainFrame getMainFrame() {
        MainFrame.setEnabled(true);
        return MainFrame;
    }

    public void setMainFrame(TreeMainFrame MainFrame) {
        this.MainFrame = MainFrame;
        this.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel nameLabel;
    public javax.swing.JTextField nameText;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel valLabel;
    public javax.swing.JTextField valText;
    // End of variables declaration//GEN-END:variables
}
