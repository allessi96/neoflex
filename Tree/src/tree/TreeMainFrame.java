
package tree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class TreeMainFrame extends javax.swing.JFrame {
    
    public static ArrayList<Node> nodes=new ArrayList<>();
    Graphics g;
    Node SelectedNode;
    
    public TreeMainFrame() {
        initComponents();
        this.g = DrawPanel.getGraphics();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DrawPanel = new javax.swing.JPanel();
        NewNode = new javax.swing.JButton();
        RemoveNode = new javax.swing.JButton();
        SearchName = new javax.swing.JButton();
        SearchValue = new javax.swing.JButton();
        AllValue = new javax.swing.JButton();
        AllValueBalans = new javax.swing.JButton();
        Dev = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        DrawPanel.setBackground(new java.awt.Color(255, 255, 255));
        DrawPanel.setPreferredSize(new java.awt.Dimension(440, 450));

        javax.swing.GroupLayout DrawPanelLayout = new javax.swing.GroupLayout(DrawPanel);
        DrawPanel.setLayout(DrawPanelLayout);
        DrawPanelLayout.setHorizontalGroup(
            DrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        DrawPanelLayout.setVerticalGroup(
            DrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        NewNode.setText("Создать узел");
        NewNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNodeActionPerformed(evt);
            }
        });

        RemoveNode.setText("Удалить узел");
        RemoveNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveNodeActionPerformed(evt);
            }
        });

        SearchName.setText("Поиск по имени");

        SearchValue.setText("Поиск по значению");

        AllValue.setText("Вывод всех значений");

        AllValueBalans.setText("Вывод всех значений(баланс)");

        Dev.setText("Пархоменко Александра");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DrawPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllValueBalans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Dev)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(NewNode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveNode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AllValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AllValueBalans, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(Dev))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DrawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("TreeMainFrame");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


//обработчик нажатий на стрелки
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        String key=KeyEvent.getKeyText(evt.getKeyCode());
        SelectedNode=nodes.get(0);
        if(KeyEvent.getKeyText(evt.getKeyCode()).equals("Up")&&(SelectedNode.parent!=null))
            SelectedNode=SelectedNode.parent;
        else if(KeyEvent.getKeyText(evt.getKeyCode()).equals("Left")&&(SelectedNode.left!=null)) 
            SelectedNode=SelectedNode.left;
        else if(KeyEvent.getKeyText(evt.getKeyCode()).equals("Right")&&(SelectedNode.right!=null)) 
            SelectedNode=SelectedNode.right;
        DrawNode(Math.abs(DrawPanel.getWidth()/2-10),10,TreeMainFrame.nodes.get(0));
        
    }//GEN-LAST:event_formKeyPressed

    private void NewNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewNodeActionPerformed
        // TODO add your handling code here:
       new AddNewNode().setMainFrame(TreeMainFrame.this);
       setEnabled(false);
    }//GEN-LAST:event_NewNodeActionPerformed

    private void RemoveNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveNodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveNodeActionPerformed
    
    public void DrawNode(int x,int y,Node n){
        g.setColor(Color.green);
        if(n.equals(SelectedNode)) g.fillOval(x, y, 20, 20);
        else  g.drawOval(x, y, 20, 20);
        y+=30;x-=50;
        
        Node l=n.getLeft();
        if (l!=null)
        DrawNode(x,y,n.getLeft());
        
        Node r=n.getRight();
        x+=100;
        if (r!=null)
        DrawNode(x,y,n.getRight());
                
    }
   
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TreeMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreeMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreeMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreeMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreeMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllValue;
    private javax.swing.JButton AllValueBalans;
    private javax.swing.JLabel Dev;
    public javax.swing.JPanel DrawPanel;
    private javax.swing.JButton NewNode;
    private javax.swing.JButton RemoveNode;
    private javax.swing.JButton SearchName;
    private javax.swing.JButton SearchValue;
    // End of variables declaration//GEN-END:variables
}
