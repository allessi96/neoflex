package tree.view;

import tree.view.draw.Drawing;
import tree.view.draw.GraphicsConstants;
import tree.model.Node;
import tree.controller.ControlsNode;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TreeMainFrame extends javax.swing.JFrame {

    public static Node root;
    public static Node selectedNode;

    public TreeMainFrame() {
        initComponents();
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        Drawing.gr2d.setBackground(Color.white);
        Drawing.gr2d.setColor(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        drawPanel = new javax.swing.JPanel();
        newNode = new javax.swing.JButton();
        removeNode = new javax.swing.JButton();
        searchName = new javax.swing.JButton();
        searchValue = new javax.swing.JButton();
        allValue = new javax.swing.JButton();
        dev = new javax.swing.JLabel();
        help = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Задание 1. Бинарное дерево. Пархоменко Александра");
        setLocation(new java.awt.Point(300, 200));
        setPreferredSize(new java.awt.Dimension(730, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drawPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawPanel.setPreferredSize(new java.awt.Dimension(440, 450));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, drawPanel, org.jdesktop.beansbinding.ObjectProperty.create(), drawPanel, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        getContentPane().add(drawPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 427));

        newNode.setText("Создать узел");
        newNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNodeActionPerformed(evt);
            }
        });
        getContentPane().add(newNode, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 11, 222, 39));

        removeNode.setText("Удалить узел");
        removeNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNodeActionPerformed(evt);
            }
        });
        getContentPane().add(removeNode, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 100, 222, 39));

        searchName.setText("Поиск по имени");
        searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameActionPerformed(evt);
            }
        });
        getContentPane().add(searchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 189, 222, 39));

        searchValue.setText("Поиск по значению");
        searchValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchValueActionPerformed(evt);
            }
        });
        getContentPane().add(searchValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 278, 222, 39));

        allValue.setText("Вывод всех значений");
        allValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allValueActionPerformed(evt);
            }
        });
        getContentPane().add(allValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 367, 222, 39));

        dev.setText("Пархоменко Александра");
        getContentPane().add(dev, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        help.setText("*Переключение между узлами: стрелка вверх - родитель, влево - левый дочерний узел, вправо - правый дочерний узел.");
        getContentPane().add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNodeActionPerformed

        new AddNewNode().setMainFrame(TreeMainFrame.this);
        setEnabled(false);

    }//GEN-LAST:event_newNodeActionPerformed

    private void removeNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNodeActionPerformed

        if ((selectedNode.getLeft() == null) && (selectedNode.getRight() == null)) {
            ControlsNode.remove(selectedNode);
        } else {
            JOptionPane.showMessageDialog(null, "Удаление невозможно. У узла есть потомки.");
        }

    }//GEN-LAST:event_removeNodeActionPerformed

    private void searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameActionPerformed
        if (root != null) {
            new SearchNode().setMainFrame(TreeMainFrame.this, true);
            setEnabled(false);
        }
    }//GEN-LAST:event_searchNameActionPerformed

    private void searchValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchValueActionPerformed
        if (root != null) {
            new SearchNode().setMainFrame(TreeMainFrame.this, false);
            setEnabled(false);
        }
    }//GEN-LAST:event_searchValueActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:

        if (root != null) {
            if (KeyEvent.getKeyText(evt.getKeyCode()).equals("Up") && (selectedNode.getParent() != null)) {
                selectedNode = selectedNode.getParent();
            } else if (KeyEvent.getKeyText(evt.getKeyCode()).equals("Left") && (selectedNode.getLeft() != null)) {
                selectedNode = selectedNode.getLeft();
            } else if (KeyEvent.getKeyText(evt.getKeyCode()).equals("Right") && (selectedNode.getRight() != null)) {
                selectedNode = selectedNode.getRight();
            }
        }

        Drawing.gr2d.clearRect(0, 0, GraphicsConstants.wight, GraphicsConstants.height);
        Drawing.drawNode(Math.abs(GraphicsConstants.wight/2 - 10), 10, root, 110);

    }//GEN-LAST:event_formKeyReleased

    private void allValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allValueActionPerformed
        ControlsNode.allValue(selectedNode);
        JOptionPane.showMessageDialog(null, ControlsNode.valuesStr);

        Drawing.gr2d.clearRect(0, 0, GraphicsConstants.wight, GraphicsConstants.height);
        Drawing.drawNode(Math.abs(GraphicsConstants.wight/2 - 10), 10, root, 110);

    }//GEN-LAST:event_allValueActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (root != null) {
            Drawing.drawNode(Math.abs(GraphicsConstants.wight/2 - 10), 10, root, 110);
        }
        requestFocus(true);
    }//GEN-LAST:event_formWindowActivated

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreeMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TreeMainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allValue;
    private javax.swing.JLabel dev;
    public static javax.swing.JPanel drawPanel;
    private javax.swing.JLabel help;
    private javax.swing.JButton newNode;
    private javax.swing.JButton removeNode;
    private javax.swing.JButton searchName;
    private javax.swing.JButton searchValue;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
