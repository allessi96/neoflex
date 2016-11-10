package tree;

import javax.swing.JOptionPane;

public class AddNewNode extends javax.swing.JFrame {

    private TreeMainFrame MainFrame;

    public AddNewNode() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valLabel = new javax.swing.JLabel();
        left = new javax.swing.JButton();
        right = new javax.swing.JButton();
        value = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        addLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(250, 160));
        setResizable(false);

        valLabel.setText(" Определите вес: ");

        left.setText("Левый");
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });

        right.setText("Правый");
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });

        value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valueMouseClicked(evt);
            }
        });

        cancel.setText("Отмена");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        addLabel.setText("Какой узел создать?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(left))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(53, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(right)
                                .addGap(25, 25, 25))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right)
                    .addComponent(left))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel)
                .addContainerGap())
        );

        valLabel.getAccessibleContext().setAccessibleName("Выберите узел \nи определите вес ");

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed

        try {
            if (!TreeMainFrame.nodes.isEmpty()) {
                TreeMainFrame.nodes.add(new Node(MainFrame.selectedNode.getName() + "0", Integer.parseInt(value.getText()), MainFrame.selectedNode));
                MainFrame.selectedNode.setLeft(TreeMainFrame.nodes.get(TreeMainFrame.nodes.size() - 1));
                MainFrame.selectedNode = MainFrame.selectedNode.getLeft();
            } else {
                TreeMainFrame.nodes.add(new Node("Start", Integer.parseInt(value.getText()), null));
                MainFrame.selectedNode = TreeMainFrame.nodes.get(0);
            }

            setVisible(false);

            MainFrame.gr2d.clearRect(0, 0, 440, 450);
            MainFrame.drawNode(Math.abs(MainFrame.DrawPanel.getWidth() / 2 - 10), 10, TreeMainFrame.nodes.get(0));
            TreeMainFrame.nodes.stream().forEach((node) -> {
                System.out.println(node.getName());
            });

            getMainFrame();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода данных.Попробуйте снова");
        }
    }//GEN-LAST:event_leftActionPerformed

    private void valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valueMouseClicked
        // TODO add your handling code here:
        value.setText("");
    }//GEN-LAST:event_valueMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        
        setVisible(false);
        getMainFrame();
    }//GEN-LAST:event_cancelActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        
        try {
            if (!TreeMainFrame.nodes.isEmpty()) {
                TreeMainFrame.nodes.add(new Node(MainFrame.selectedNode.getName() + "1", Integer.parseInt(value.getText()), MainFrame.selectedNode));
                MainFrame.selectedNode.setRight(TreeMainFrame.nodes.get(TreeMainFrame.nodes.size() - 1));
                MainFrame.selectedNode = MainFrame.selectedNode.getRight();
            } else {
                TreeMainFrame.nodes.add(new Node("Start", Integer.parseInt(value.getText()), null));
                MainFrame.selectedNode = TreeMainFrame.nodes.get(0);
            }

            setVisible(false);

            MainFrame.gr2d.clearRect(0, 0, 440, 450);
            MainFrame.drawNode(Math.abs(MainFrame.DrawPanel.getWidth() / 2 - 10), 10, TreeMainFrame.nodes.get(0));
            TreeMainFrame.nodes.stream().forEach((node) -> {
                System.out.println(node.getName());
            });

            getMainFrame();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода данных.Попробуйте снова");
        }
    }//GEN-LAST:event_rightActionPerformed

    public TreeMainFrame getMainFrame() {
        MainFrame.setEnabled(true);
        return MainFrame;
    }

    public void setMainFrame(TreeMainFrame MainFrame) {
        this.MainFrame = MainFrame;
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton cancel;
    private javax.swing.JButton left;
    private javax.swing.JButton right;
    private javax.swing.JLabel valLabel;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
