
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

        label = new javax.swing.JLabel();
        Left = new javax.swing.JButton();
        Right = new javax.swing.JButton();
        Value = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(250, 125));
        setResizable(false);

        label.setText("Выберите узел");

        Left.setText("Левый");
        Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftActionPerformed(evt);
            }
        });

        Right.setText("Правый");

        Value.setText("jTextField1");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Left)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Right)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Left)
                    .addComponent(Right))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftActionPerformed
        try{
            if(!TreeMainFrame.nodes.isEmpty()){
                TreeMainFrame.nodes.add(new Node(MainFrame.SelectedNode.getName()+"0", 18, MainFrame.SelectedNode));
            }
            else TreeMainFrame.nodes.add(new Node("Start",Integer.parseInt(Value.getText()), MainFrame.SelectedNode));
            
                setVisible(false);
                MainFrame.DrawNode(Math.abs(MainFrame.DrawPanel.getWidth()/2-10),10,TreeMainFrame.nodes.get(0));
                getMainFrame();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ошибка, попробуйте снова");
        }
    }//GEN-LAST:event_LeftActionPerformed

    private void ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValueActionPerformed

    private void ValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValueMouseClicked
        // TODO add your handling code here:
        Value.setText("");
    }//GEN-LAST:event_ValueMouseClicked
    
        public TreeMainFrame getMainFrame() {
            MainFrame.setEnabled(true);
            return MainFrame;
        }

        public void setMainFrame(TreeMainFrame MainFrame) {
            this.MainFrame = MainFrame;
            this.setVisible(true);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Left;
    private javax.swing.JButton Right;
    private javax.swing.JTextField Value;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
