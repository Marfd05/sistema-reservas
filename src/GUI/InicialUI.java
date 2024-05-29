package GUI;

import KentHipos.Kensoft;
import java.util.List;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Habitacion;
import sistemareserva.Main;

/**
 *
 * @author Usuario
 */
public class InicialUI extends javax.swing.JFrame {

    private static final int MAX_PER_PAGE_HOME_HABITACION = 3;
    private int habitacionespaginaActual = 0;
    private int habitacionesPaginasTotales;

    /**
     * Creates new form Inicial
     */
    public InicialUI() {
        habitacionesPaginasTotales = Main.habitaciones().size() / MAX_PER_PAGE_HOME_HABITACION;
        if (Main.habitaciones().size() % MAX_PER_PAGE_HOME_HABITACION != 0) {
            habitacionesPaginasTotales++;
        }
        initComponents();

        menuHomeBtn.addActionListener(this::changePanel);
        menuLoginBtn.addActionListener(this::changePanel);
        menuAboutBtn.addActionListener(this::changePanel);

        loginActionBtn.addActionListener(this::loginAction);

        homecreation();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        toolbar = new javax.swing.JPanel();
        logoImg = new javax.swing.JLabel();
        menuButton = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        menuHomeBtn = new javax.swing.JButton();
        menuLoginBtn = new javax.swing.JButton();
        menuAboutBtn = new javax.swing.JButton();
        content = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        borderhedadhome = new javax.swing.JPanel();
        scrollHomepage = new javax.swing.JScrollPane();
        ContentHomeScroll = new javax.swing.JPanel();
        body1home = new javax.swing.JPanel();
        fraseHome = new javax.swing.JLabel();
        backgroundhome = new javax.swing.JLabel();
        body2home = new javax.swing.JPanel();
        foto2bodyhome = new javax.swing.JLabel();
        fot2bodyhome2 = new javax.swing.JLabel();
        titulo2bodyhome = new javax.swing.JLabel();
        descripcionHotelhome2body = new javax.swing.JLabel();
        body3home = new javax.swing.JPanel();
        contentHabitaciones = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginFormPanel = new javax.swing.JPanel();
        loginEmailLabel = new javax.swing.JLabel();
        loginEmailText = new javax.swing.JTextField();
        loginPasswordLabel = new javax.swing.JLabel();
        loginPasswordText = new javax.swing.JPasswordField();
        loginActionBtn = new javax.swing.JButton();
        loginErrorMessage = new javax.swing.JLabel();
        loginBackground = new javax.swing.JLabel();
        aboutPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toolbar.setBackground(new java.awt.Color(0, 0, 0));
        toolbar.setMaximumSize(new java.awt.Dimension(910, 80));
        toolbar.setMinimumSize(new java.awt.Dimension(910, 80));

        logoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logonombre.png"))); // NOI18N

        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ic_menu.png"))); // NOI18N
        menuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolbarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(menuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 734, Short.MAX_VALUE)
                .addComponent(logoImg)
                .addGap(56, 56, 56))
        );
        toolbarLayout.setVerticalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoImg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(toolbarLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(menuButton)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        menu.setBackground(new java.awt.Color(0, 0, 0, 190));
        menu.setMaximumSize(new java.awt.Dimension(180, 720));
        menu.setMinimumSize(new java.awt.Dimension(180, 720));
        menu.setPreferredSize(new java.awt.Dimension(180, 720));

        menuHomeBtn.setBackground(new java.awt.Color(51, 51, 51));
        menuHomeBtn.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        menuHomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        menuHomeBtn.setText("Home");
        menuHomeBtn.setBorderPainted(false);
        menuHomeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeBtnActionPerformed(evt);
            }
        });

        menuLoginBtn.setBackground(new java.awt.Color(51, 51, 51));
        menuLoginBtn.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        menuLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        menuLoginBtn.setText("Iniciar Sesión");
        menuLoginBtn.setBorderPainted(false);
        menuLoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuAboutBtn.setBackground(new java.awt.Color(51, 51, 51));
        menuAboutBtn.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        menuAboutBtn.setForeground(new java.awt.Color(255, 255, 255));
        menuAboutBtn.setText("Acerca de");
        menuAboutBtn.setBorderPainted(false);
        menuAboutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuHomeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuLoginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(menuAboutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(menuHomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuAboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 180, 720));

        content.setEnabled(false);
        content.setMaximumSize(new java.awt.Dimension(900, 680));
        content.setMinimumSize(new java.awt.Dimension(900, 680));
        content.setPreferredSize(new java.awt.Dimension(900, 680));

        homePanel.setMaximumSize(new java.awt.Dimension(1080, 645));
        homePanel.setMinimumSize(new java.awt.Dimension(1080, 645));
        homePanel.setPreferredSize(new java.awt.Dimension(1080, 645));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borderhedadhome.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout borderhedadhomeLayout = new javax.swing.GroupLayout(borderhedadhome);
        borderhedadhome.setLayout(borderhedadhomeLayout);
        borderhedadhomeLayout.setHorizontalGroup(
            borderhedadhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        borderhedadhomeLayout.setVerticalGroup(
            borderhedadhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        homePanel.add(borderhedadhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1070, 20));

        scrollHomepage.setBorder(null);
        scrollHomepage.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollHomepage.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollHomepage.setHorizontalScrollBar(null);
        scrollHomepage.setPreferredSize(new java.awt.Dimension(1080, 1890));

        ContentHomeScroll.setBackground(new java.awt.Color(0, 0, 0));
        ContentHomeScroll.setPreferredSize(new java.awt.Dimension(1070, 1930));
        ContentHomeScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body1home.setBackground(new java.awt.Color(0, 0, 0));
        body1home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fraseHome.setFont(new java.awt.Font("Constantia", 1, 48)); // NOI18N
        fraseHome.setForeground(new java.awt.Color(255, 255, 255));
        fraseHome.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        body1home.add(fraseHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 400, 180));

        backgroundhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/homebackground.jpg"))); // NOI18N
        body1home.add(backgroundhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 630));

        ContentHomeScroll.add(body1home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 630));

        body2home.setBackground(new java.awt.Color(0, 0, 0));
        body2home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto2bodyhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/homepage2body2.jpg"))); // NOI18N
        body2home.add(foto2bodyhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 300, 440));

        fot2bodyhome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/homepage2body.jpg"))); // NOI18N
        fot2bodyhome2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        fot2bodyhome2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        body2home.add(fot2bodyhome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 430, 660));

        titulo2bodyhome.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        titulo2bodyhome.setForeground(new java.awt.Color(255, 255, 255));
        body2home.add(titulo2bodyhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 290, 90));

        descripcionHotelhome2body.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descripcionHotelhome2body.setForeground(new java.awt.Color(255, 255, 255,180));
        body2home.add(descripcionHotelhome2body, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 330, 360));

        ContentHomeScroll.add(body2home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1070, 660));

        body3home.setBackground(new java.awt.Color(0, 0, 0,160));
        body3home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentHabitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        body3home.add(contentHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 640));

        ContentHomeScroll.add(body3home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1290, 1070, 640));

        scrollHomepage.setViewportView(ContentHomeScroll);

        homePanel.add(scrollHomepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1080, 630));

        content.addTab("tab1", homePanel);

        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginFormPanel.setBackground(new java.awt.Color(0, 0, 0, 210));
        loginFormPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inicio de Sesión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        loginEmailLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        loginEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginEmailLabel.setText("Email");

        loginEmailText.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        loginEmailText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginEmailText.setText("camila@email.com");
        loginEmailText.setBorder(null);

        loginPasswordLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        loginPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginPasswordLabel.setText("Contraseña");

        loginPasswordText.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        loginPasswordText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginPasswordText.setText("123456");
        loginPasswordText.setBorder(null);

        loginActionBtn.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        loginActionBtn.setText("Iniciar Sesión");
        loginActionBtn.setBorder(null);
        loginActionBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        loginErrorMessage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        loginErrorMessage.setForeground(new java.awt.Color(204, 51, 0));
        loginErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout loginFormPanelLayout = new javax.swing.GroupLayout(loginFormPanel);
        loginFormPanel.setLayout(loginFormPanelLayout);
        loginFormPanelLayout.setHorizontalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginEmailLabel)
                    .addComponent(loginEmailText)
                    .addComponent(loginPasswordLabel)
                    .addComponent(loginActionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(loginPasswordText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginFormPanelLayout.setVerticalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(loginEmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(loginActionBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(loginErrorMessage)
                .addContainerGap())
        );

        loginPanel.add(loginFormPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 129, 648, 387));

        loginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.jpg"))); // NOI18N
        loginPanel.add(loginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, -1, 710));

        content.addTab("tab2", loginPanel);

        aboutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("about");
        aboutPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

        content.addTab("tab3", aboutPanel);

        content.setSelectedIndex(1);

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1080, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toggleMenu() {
        Kensoft animate = new Kensoft();
        if (menu.getLocation().x == 0) {
            animate.jPanelXLeft(0, -180, 1, 1, menu);
        } else {
            animate.jPanelXRight(-180, 0, 1, 1, menu);
        }
    }

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        toggleMenu();
    }//GEN-LAST:event_menuButtonMouseClicked

    private void menuHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHomeBtnActionPerformed

    private void changePanel(java.awt.event.ActionEvent evt) {
        if (evt.getActionCommand().equals(menuHomeBtn.getActionCommand())) {
            content.setSelectedIndex(0);
        } else if (evt.getActionCommand().equals(menuLoginBtn.getActionCommand())) {
            content.setSelectedIndex(1);
        } else {
            content.setSelectedIndex(2);
        }
        toggleMenu();
    }

    private void loginAction(java.awt.event.ActionEvent evt) {
        loginErrorMessage.setText("");
        String email = loginEmailText.getText();
        String pass = new String(loginPasswordText.getPassword());

        Empleado empleadoLogged = null;
        Cliente clienteLogged = null;

        for (Empleado empleado : Main.empleados()) {
            if (empleado.getEmail().equals(email)) {
                if (empleado.getPassword().equals(pass)) {
                    empleadoLogged = empleado;
                }
            }
        }

        for (Cliente cliente : Main.clientes()) {
            if (cliente.getEmail().equals(email)) {
                if (cliente.getPassword().equals(pass)) {
                    clienteLogged = cliente;
                }
            }
        }
        
        if(empleadoLogged != null) {
            EmpleadoUI empleadoUI = new EmpleadoUI(empleadoLogged);
            empleadoUI.setVisible(true);
            dispose();
        } else if (clienteLogged != null) {
            ClienteUI cliente = new ClienteUI(clienteLogged);
            cliente.setVisible(true);
            dispose();
        } else {
            loginErrorMessage.setText("usuario o contraseña incorrectos");
        }
    }

    private void cargarHabitaciones() {
     

        contentHabitaciones.removeAll();
        contentHabitaciones.revalidate();
        contentHabitaciones.repaint();  
        
        List<Habitacion> filtrados;
        

        if (Main.habitaciones().size() <= MAX_PER_PAGE_HOME_HABITACION) {
            filtrados = Main.habitaciones();
        } else {
            int inicio = habitacionespaginaActual * MAX_PER_PAGE_HOME_HABITACION;
            int fin = inicio + MAX_PER_PAGE_HOME_HABITACION;
            if (fin > Main.habitaciones().size()) {
                fin = Main.habitaciones().size();
            }
            filtrados = Main.habitaciones().subList(inicio, fin);
        }
        
        javax.swing.JLabel titlehome3body = new javax.swing.JLabel();
        titlehome3body.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        titlehome3body.setForeground(new java.awt.Color(255, 255, 255));
        titlehome3body.setText("Habitaciones:");
        contentHabitaciones.add(titlehome3body, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 260, 70));
        
        buildHabitacioncard(filtrados.get(0), 50); // primer card
        if (filtrados.size() > 1) {
            buildHabitacioncard(filtrados.get(1), 380); //segunda card
        }
        if (filtrados.size() > 2) {
            buildHabitacioncard(filtrados.get(2), 715); //tercer card
        }
        buildButtonhabitacion("<", 270);
        buildButtonhabitacion(">", 720);
        
        javax.swing.JLabel body3background = new javax.swing.JLabel();
        body3background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/homepage3body.jpg"))); // NOI18N
        contentHabitaciones.add(body3background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 640));
        



    }

    private void buildButtonhabitacion(String contentButton, int x) {
        javax.swing.JButton buttonHabitacion = new javax.swing.JButton();
        buttonHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        buttonHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        buttonHabitacion.setText(contentButton);
        buttonHabitacion.addActionListener(this::changeHabitacionesPage);
        contentHabitaciones.add(buttonHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, 550, 70, 30 ));
    }

    private void  buildHabitacioncard(Habitacion habitacion, int x) {
        javax.swing.JPanel habitacionPanel = new javax.swing.JPanel();
        javax.swing.JPanel preciocontent = new javax.swing.JPanel();
        javax.swing.JLabel precioHabitacion = new javax.swing.JLabel();
        javax.swing.JLabel precioetiqueta = new javax.swing.JLabel();
        javax.swing.JLabel iconHabitacion = new javax.swing.JLabel();
        javax.swing.JButton Reservarbutton = new javax.swing.JButton();
        javax.swing.JLabel tipoHabitacion = new javax.swing.JLabel();
        javax.swing.JPanel detallesHabitacion = new javax.swing.JPanel();
        javax.swing.JLabel detalle1 = new javax.swing.JLabel();
        javax.swing.JLabel detalle2 = new javax.swing.JLabel();
        javax.swing.JLabel detalle3 = new javax.swing.JLabel();
        javax.swing.JLabel detalle4 = new javax.swing.JLabel();

        habitacionPanel.setBackground(new java.awt.Color(255, 255, 255));
        habitacionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        preciocontent.setBackground(new java.awt.Color(0, 0, 0));

        precioHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        precioHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        precioHabitacion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        precioHabitacion.setText("" + habitacion.getPrecioPorNoche());

        precioetiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/receipt-dollar_1.png"))); // NOI18N
        precioetiqueta.setText("");
        precioetiqueta.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout preciocontentLayout = new javax.swing.GroupLayout(preciocontent);
        preciocontent.setLayout(preciocontentLayout);
        preciocontentLayout.setHorizontalGroup(
                preciocontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preciocontentLayout.createSequentialGroup()
                                .addContainerGap(7, Short.MAX_VALUE)
                                .addComponent(precioetiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
        );
        preciocontentLayout.setVerticalGroup(
                preciocontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(precioHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precioetiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        habitacionPanel.add(preciocontent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 110, 40));

        iconHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        iconHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource(habitacion.getIcono())));
        habitacionPanel.add(iconHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 230));

        Reservarbutton.setBackground(new java.awt.Color(0, 0, 0));
        Reservarbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reservarbutton.setForeground(new java.awt.Color(255, 255, 255));
        Reservarbutton.setText("Reservar");
        habitacionPanel.add(Reservarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        tipoHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 18));// NOI18N
        tipoHabitacion.setText(habitacion.getTipo().name() + " (" + habitacion.getNumero() + ")");
        habitacionPanel.add(tipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 20));

        detallesHabitacion.setLayout(new java.awt.GridLayout(1, 4));

        detalle1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        detalle1.setText(habitacion.getDetalles().isTv() ? "TV" : "");
        detallesHabitacion.add(detalle1);

        detalle2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        detalle2.setText(habitacion.getDetalles().isCamaDoble() ? "<html><p>Cama<br>doble</p></html>" : "");
        detallesHabitacion.add(detalle2);

        detalle3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        detalle3.setText(habitacion.getDetalles().isMinibar() ? "<html><p>Mini<br>bar</p></html>" : "");
        detallesHabitacion.add(detalle3);

        detalle4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        detalle4.setText(habitacion.getDetalles().isJacuzzi() ? "Jacuzzi" : "");
        detallesHabitacion.add(detalle4);

        habitacionPanel.add(detallesHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 250, 50));
        contentHabitaciones.add(habitacionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, 140, 290, 390));

    }
    
    private void changeHabitacionesPage(java.awt.event.ActionEvent evt) {
        if (evt.getActionCommand().equals(">")) {
            if (habitacionespaginaActual < habitacionesPaginasTotales - 1) {
                habitacionespaginaActual++;
                cargarHabitaciones();
            }
        } else {
            if (habitacionespaginaActual > 0) {
                habitacionespaginaActual--;
                cargarHabitaciones();
            }
        }

    }
    public void homecreation() {

        fraseHome.setText("<html><p>Vive la Experiencia,<br>" + Main.hotel.getNombre() + "</p></html>");
        titulo2bodyhome.setText("<html><p>Bienvenido a " + Main.hotel.getNombre() + "</p></html>");
        descripcionHotelhome2body.setText("<html>" + Main.hotel.getDescripcion());
        cargarHabitaciones();

    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InicialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InicialUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentHomeScroll;
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JLabel backgroundhome;
    private javax.swing.JPanel body1home;
    private javax.swing.JPanel body2home;
    private javax.swing.JPanel body3home;
    private javax.swing.JPanel borderhedadhome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane content;
    private javax.swing.JPanel contentHabitaciones;
    private javax.swing.JLabel descripcionHotelhome2body;
    private javax.swing.JLabel fot2bodyhome2;
    private javax.swing.JLabel foto2bodyhome;
    private javax.swing.JLabel fraseHome;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginActionBtn;
    private javax.swing.JLabel loginBackground;
    private javax.swing.JLabel loginEmailLabel;
    private javax.swing.JTextField loginEmailText;
    private javax.swing.JLabel loginErrorMessage;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JPasswordField loginPasswordText;
    private javax.swing.JLabel logoImg;
    private javax.swing.JPanel menu;
    private javax.swing.JButton menuAboutBtn;
    private javax.swing.JLabel menuButton;
    private javax.swing.JButton menuHomeBtn;
    private javax.swing.JButton menuLoginBtn;
    private javax.swing.JScrollPane scrollHomepage;
    private javax.swing.JLabel titulo2bodyhome;
    private javax.swing.JPanel toolbar;
    // End of variables declaration//GEN-END:variables
}
