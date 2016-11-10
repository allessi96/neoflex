package tree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TreeMainFrame extends javax.swing.JFrame {

    public static ArrayList<Node> nodes = new ArrayList<>();
    Graphics g;
    Graphics2D gr2d;
    Node selectedNode;

    public TreeMainFrame() {
        initComponents();
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        this.g = DrawPanel.getGraphics();
        this.gr2d = (Graphics2D) g;
        gr2d.setBackground(Color.white);
        gr2d.setColor(Color.green);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        DrawPanel = new javax.swing.JPanel();
        newNode = new javax.swing.JButton();
        removeNode = new javax.swing.JButton();
        searchName = new javax.swing.JButton();
        searchValue = new javax.swing.JButton();
        allValue = new javax.swing.JButton();
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

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, DrawPanel, org.jdesktop.beansbinding.ObjectProperty.create(), DrawPanel, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

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

        newNode.setText("Создать узел");
        newNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNodeActionPerformed(evt);
            }
        });

        removeNode.setText("Удалить узел");
        removeNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNodeActionPerformed(evt);
            }
        });

        searchName.setText("Поиск по имени");
        searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameActionPerformed(evt);
            }
        });

        searchValue.setText("Поиск по значению");
        searchValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchValueActionPerformed(evt);
            }
        });

        allValue.setText("Вывод всех значений");

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
                    .addComponent(newNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeNode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allValue, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Dev)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newNode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(removeNode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(allValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Dev))
                    .addComponent(DrawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

//обработчик нажатий на стрелки
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        System.out.println(this.isFocusable());
        if (!nodes.isEmpty()) {
            if (KeyEvent.getKeyText(evt.getKeyCode()).equals("Up") && (selectedNode.getParent() != null)) {
                System.out.println("up");
                selectedNode = selectedNode.getParent();
            } else if (KeyEvent.getKeyText(evt.getKeyCode()).equals("Left") && (selectedNode.getLeft() != null)) {
                System.out.println("left");
                selectedNode = selectedNode.getLeft();
            } else if (KeyEvent.getKeyText(evt.getKeyCode()).equals("Right") && (selectedNode.getRight() != null)) {
                System.out.println("rig");
                selectedNode = selectedNode.getRight();
            }
        }

        System.out.println("SN=" + selectedNode.name);

        gr2d.clearRect(0, 0, 440, 450);
        drawNode(Math.abs(DrawPanel.getWidth() / 2 - 10), 10, nodes.get(0));

    }//GEN-LAST:event_formKeyPressed

    private void newNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNodeActionPerformed
        new AddNewNode().setMainFrame(TreeMainFrame.this);
        setEnabled(false);
        this.requestFocus();
    }//GEN-LAST:event_newNodeActionPerformed

    private void removeNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNodeActionPerformed

        if ((selectedNode.getLeft() == null) && (selectedNode.getRight() == null)) {

            nodes.remove(selectedNode);
            Node parent = selectedNode.getParent();
            if (parent == null) {
                nodes.clear();
                gr2d.clearRect(0, 0, 440, 450);
            } else {
                if (parent.getLeft() != null && parent.getLeft().equals(selectedNode)) {
                    selectedNode.getParent().setLeft(null);
                } else {
                    selectedNode.getParent().setRight(null);
                }
                selectedNode = parent;
                gr2d.clearRect(0, 0, 440, 450);
                drawNode(Math.abs(DrawPanel.getWidth() / 2 - 10), 10, nodes.get(0));
            }

        } else {
            JOptionPane.showMessageDialog(null, "Удаление невозможно. У узла есть потомки.");
        }

        this.requestFocus();
    }//GEN-LAST:event_removeNodeActionPerformed

    private void searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameActionPerformed

        SearchNode sn = new SearchNode();
        sn.setMainFrame(TreeMainFrame.this);
        sn.nameText.setEnabled(true);
        setEnabled(false);
        this.requestFocus();

    }//GEN-LAST:event_searchNameActionPerformed

    private void searchValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchValueActionPerformed

        SearchNode sn = new SearchNode();
        sn.setMainFrame(TreeMainFrame.this);
        sn.valText.setEnabled(true);
        setEnabled(false);
        this.requestFocus();

    }//GEN-LAST:event_searchValueActionPerformed

    public void drawNode(int x, int y, Node n) {

        if (n.equals(selectedNode)) {
            gr2d.fillOval(x, y, 20, 20);
        } else {
            gr2d.drawOval(x, y, 20, 20);
        }

        Node l = n.getLeft();
        if (l != null) {
            drawNode(x - 50, y + 30, n.getLeft());
        }

        Node r = n.getRight();
        if (r != null) {
            drawNode(x + 50, y + 30, n.getRight());
        }

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
    private javax.swing.JLabel Dev;
    public javax.swing.JPanel DrawPanel;
    private javax.swing.JButton allValue;
    private javax.swing.JButton newNode;
    private javax.swing.JButton removeNode;
    private javax.swing.JButton searchName;
    private javax.swing.JButton searchValue;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
