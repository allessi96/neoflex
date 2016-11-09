package tree;

public class AddNewNode extends javax.swing.JFrame {

    private TreeMainFrame MainFrame;

    public AddNewNode() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        Left = new javax.swing.JButton();
        Right = new javax.swing.JButton();
        Value = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(250, 160));
        setResizable(false);

        label.setText("<html>Определите вес: <br>Выберите узел:\n");

        Left.setText("Левый");
        Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftActionPerformed(evt);
            }
        });

        Right.setText("Правый");
        Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightActionPerformed(evt);
            }
        });

        Value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValueMouseClicked(evt);
            }
        });
        Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValueActionPerformed(evt);
            }
        });

        Cancel.setText("Отмена");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Left)
                        .addGap(39, 39, 39)
                        .addComponent(Right)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Left)
                    .addComponent(Right))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancel)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        label.getAccessibleContext().setAccessibleName("Выберите узел \nи определите вес ");

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftActionPerformed

        if (!TreeMainFrame.nodes.isEmpty()) {
            TreeMainFrame.nodes.add(new Node(MainFrame.selectedNode.getName() + "0", Integer.parseInt(Value.getText()), MainFrame.searchNode()));
            MainFrame.searchNode().left = TreeMainFrame.nodes.get(TreeMainFrame.nodes.size() - 1);
            MainFrame.selectedNode = TreeMainFrame.nodes.get(TreeMainFrame.nodes.size() - 1);
        } else {
            TreeMainFrame.nodes.add(new Node("Start", Integer.parseInt(Value.getText()), null));
            MainFrame.selectedNode = TreeMainFrame.nodes.get(0);
        }

        setVisible(false);

        MainFrame.gr2d.clearRect(0, 0, 440, 450);
        MainFrame.drawNode(Math.abs(MainFrame.DrawPanel.getWidth() / 2 - 10), 10, TreeMainFrame.nodes.get(0));
        TreeMainFrame.nodes.stream().forEach((node) -> {
            System.out.println(node.getName());
        });

        getMainFrame();

    }//GEN-LAST:event_LeftActionPerformed

    private void ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValueActionPerformed

    private void ValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValueMouseClicked
        // TODO add your handling code here:
        Value.setText("");
    }//GEN-LAST:event_ValueMouseClicked

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        getMainFrame();
    }//GEN-LAST:event_CancelActionPerformed

    private void RightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightActionPerformed
        // TODO add your handling code here:

        if (!TreeMainFrame.nodes.isEmpty()) {
            TreeMainFrame.nodes.add(new Node(MainFrame.selectedNode.getName() + "1", Integer.parseInt(Value.getText()), MainFrame.searchNode()));
            MainFrame.searchNode().right = TreeMainFrame.nodes.get(TreeMainFrame.nodes.size() - 1);
            MainFrame.selectedNode = TreeMainFrame.nodes.get(TreeMainFrame.nodes.size() - 1);
        } else {
            TreeMainFrame.nodes.add(new Node("Start", Integer.parseInt(Value.getText()), null));
            MainFrame.selectedNode = TreeMainFrame.nodes.get(0);
        }

        setVisible(false);

        MainFrame.gr2d.clearRect(0, 0, 440, 450);
        MainFrame.drawNode(Math.abs(MainFrame.DrawPanel.getWidth() / 2 - 10), 10, TreeMainFrame.nodes.get(0));
        TreeMainFrame.nodes.stream().forEach((node) -> {
            System.out.println(node.getName());
        });

        getMainFrame();

    }//GEN-LAST:event_RightActionPerformed

    public TreeMainFrame getMainFrame() {
        MainFrame.setEnabled(true);
        return MainFrame;
    }

    public void setMainFrame(TreeMainFrame MainFrame) {
        this.MainFrame = MainFrame;
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Left;
    private javax.swing.JButton Right;
    private javax.swing.JTextField Value;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
