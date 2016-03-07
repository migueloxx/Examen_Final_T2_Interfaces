package com.example.miguel.yep;


import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Miguel on 06/02/2016.
 */
public class LoginTestCase extends ActivityInstrumentationTestCase2<Login> {

    // Instanciamos los componentes
    private Login actividad;
    private EditText usuario;
    private EditText password;
    private Button loginBtn;

    // Inicializacion de variables para el Test
    private static final String USERNAME = "";
    private static final String PASSWORD = "";

    public LoginTestCase() {
        super(Login.class);
    }

    //  inicialización de todos los métodos de prueba
    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        usuario = (EditText) actividad.findViewById(R.id.textView);
        password = (EditText) actividad.findViewById(R.id.Passwordfield);
        loginBtn = (Button) actividad.findViewById(R.id.btn_login);
    }



    //  Este codigo se ejecuta despues de cada test
    protected void tearDown() throws Exception {
        super.tearDown();

    }

    // Pruebsas con metodos
    public void testAddValues() {

        TouchUtils.tapView(this, usuario);
        getInstrumentation().sendStringSync(USERNAME);

        TouchUtils.tapView(this, password);
        getInstrumentation().sendStringSync(PASSWORD);

        TouchUtils.clickView(this, loginBtn);
        String usuario = "";
        

        assertTrue("Add result should be...", usuario.equals(USERNAME));


    }

}
