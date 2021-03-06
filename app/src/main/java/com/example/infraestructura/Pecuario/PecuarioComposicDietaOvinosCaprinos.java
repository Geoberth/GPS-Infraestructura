package com.example.infraestructura.Pecuario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.infraestructura.Pecuario.GlobalPecuario.GlobalPecuario;
import com.example.infraestructura.R;

public class PecuarioComposicDietaOvinosCaprinos extends AppCompatActivity {


    //Variables locales
    //Pecuario Forrajes pastoreo en Agostadero
    private String PASTAGOSTENE = null;
    private String PASTAGOSTFEB = null;
    private String PASTAGOSTMAR = null;
    private String PASTAGOSTABR = null;
    private String PASTAGOSTMAY = null;
    private String PASTAGOSTJUN = null;
    private String PASTAGOSTJUL = null;
    private String PASTAGOSTAGO = null;
    private String PASTAGOSTSEP = null;
    private String PASTAGOSTOCT = null;
    private String PASTAGOSTNOV = null;
    private String PASTAGOSTDIC = null;

    private String PASTAGOSTCOS = null;

    //Pecuario Forrajes pastoreo en praderas
    private String PASTPRADENE = null;
    private String PASTPRADFEB = null;
    private String PASTPRADMAR = null;
    private String PASTPRADABR = null;
    private String PASTPRADMAY = null;
    private String PASTPRADJUN = null;
    private String PASTPRADJUL = null;
    private String PASTPRADAGO = null;
    private String PASTPRADSEP = null;
    private String PASTPRADOCT = null;
    private String PASTPRADNOV = null;
    private String PASTPRADDIC = null;

    private String PASTPRADCOS = null;


    //Pecuario Forrajes pastoreo en rastrojos
    private String PASTRASTROENE = null;
    private String PASTRASTROFEB = null;
    private String PASTRASTROMAR = null;
    private String PASTRASTROABR = null;
    private String PASTRASTROMAY = null;
    private String PASTRASTROJUN = null;
    private String PASTRASTROJUL = null;
    private String PASTRASTROAGO = null;
    private String PASTRASTROSEP = null;
    private String PASTRASTROOCT = null;
    private String PASTRASTRONOV = null;
    private String PASTRASTRODIC = null;

    private String PASTRASTROCOS = null;


    //Pecuario Forrajes pastoreo en cortes verdes
    private String PASTCORVERENE = null;
    private String PASTCORVERFEB = null;
    private String PASTCORVERMAR = null;
    private String PASTCORVERABR = null;
    private String PASTCORVERMAY = null;
    private String PASTCORVERJUN = null;
    private String PASTCORVERJUL = null;
    private String PASTCORVERAGO = null;
    private String PASTCORVERSEP = null;
    private String PASTCORVEROCT = null;
    private String PASTCORVERNOV = null;
    private String PASTCORVERDIC = null;

    private String PASTCORVERCOS = null;



    //Pecuario Forrajes maiz
    private String PASTMAIZENE = null;
    private String PASTMAIZFEB = null;
    private String PASTMAIZMAR = null;
    private String PASTMAIZABR = null;
    private String PASTMAIZMAY = null;
    private String PASTMAIZJUN = null;
    private String PASTMAIZJUL = null;
    private String PASTMAIZAGO = null;
    private String PASTMAIZSEP = null;
    private String PASTMAIZOCT = null;
    private String PASTMAIZNOV = null;
    private String PASTMAIZDIC = null;

    private String PASTMAIZCOS = null;


    //Pecuario Forrajes henos
    private String PASTHENOSENE = null;
    private String PASTHENOSFEB = null;
    private String PASTHENOSMAR = null;
    private String PASTHENOSABR = null;
    private String PASTHENOSMAY = null;
    private String PASTHENOSJUN = null;
    private String PASTHENOSJUL = null;
    private String PASTHENOSAGO = null;
    private String PASTHENOSSEP = null;
    private String PASTHENOSOCT = null;
    private String PASTHENOSNOV = null;
    private String PASTHENOSDIC = null;

    private String PASTHENOSCOS = null;


    //EditText
    EditText edtPecpaagoscos;
    EditText edtPecpastpradcos;
    EditText edtPecpastrastrocos;
    EditText edtPecforcorvercos;
    EditText edtPecenmaizcos;
    EditText edtPechepaccos;



    Button btnPecucompdietaovinos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecuario_composic_dieta_ovinos_caprinos);


        //EditText
        edtPecpaagoscos = (EditText)findViewById(R.id.edtPecpaagoscos);
        edtPecpastpradcos = (EditText)findViewById(R.id.edtPecpastpradcos);
        edtPecpastrastrocos = (EditText)findViewById(R.id.edtPecpastrastrocos);
        edtPecforcorvercos = (EditText)findViewById(R.id.edtPecforcorvercos);
        edtPecenmaizcos = (EditText)findViewById(R.id.edtPecenmaizcos);
        edtPechepaccos = (EditText)findViewById(R.id.edtPechepaccos);




        btnPecucompdietaovinos = (Button)findViewById(R.id.pecuario_next_dietas_ovinoscaprinos);



        btnPecucompdietaovinos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GlobalPecuario.PASTAGOSTENE = PASTAGOSTENE;
                GlobalPecuario.PASTAGOSTFEB = PASTAGOSTFEB;
                GlobalPecuario.PASTAGOSTMAR = PASTAGOSTMAR;
                GlobalPecuario.PASTAGOSTABR = PASTAGOSTABR;
                GlobalPecuario.PASTAGOSTMAY = PASTAGOSTMAY;
                GlobalPecuario.PASTAGOSTJUN = PASTAGOSTJUN;
                GlobalPecuario.PASTAGOSTJUL = PASTAGOSTJUL;
                GlobalPecuario.PASTAGOSTAGO = PASTAGOSTAGO;
                GlobalPecuario.PASTAGOSTSEP = PASTAGOSTSEP;
                GlobalPecuario.PASTAGOSTOCT = PASTAGOSTOCT;
                GlobalPecuario.PASTAGOSTNOV = PASTAGOSTNOV;
                GlobalPecuario.PASTAGOSTDIC = PASTAGOSTDIC;
                pastforrajagostad();
                GlobalPecuario.PASTAGOSTCOS = PASTAGOSTCOS;



                GlobalPecuario.PASTPRADENE = PASTPRADENE;
                GlobalPecuario.PASTPRADFEB = PASTPRADFEB;
                GlobalPecuario.PASTPRADMAR = PASTPRADMAR;
                GlobalPecuario.PASTPRADABR = PASTPRADABR;
                GlobalPecuario.PASTPRADMAY = PASTPRADMAY;
                GlobalPecuario.PASTPRADJUN = PASTPRADJUN;
                GlobalPecuario.PASTPRADJUL = PASTPRADJUL;
                GlobalPecuario.PASTPRADAGO = PASTPRADAGO;
                GlobalPecuario.PASTPRADSEP = PASTPRADSEP;
                GlobalPecuario.PASTPRADOCT = PASTPRADOCT;
                GlobalPecuario.PASTPRADNOV = PASTPRADNOV;
                GlobalPecuario.PASTPRADDIC = PASTPRADDIC;
                pastforrajpraderas();
                GlobalPecuario.PASTPRADCOS = PASTPRADCOS;


                GlobalPecuario.PASTRASTROENE = PASTRASTROENE;
                GlobalPecuario.PASTRASTROFEB = PASTRASTROFEB;
                GlobalPecuario.PASTRASTROMAR = PASTRASTROMAR;
                GlobalPecuario.PASTRASTROABR = PASTRASTROABR;
                GlobalPecuario.PASTRASTROMAY = PASTRASTROMAY;
                GlobalPecuario.PASTRASTROJUN = PASTRASTROJUN;
                GlobalPecuario.PASTRASTROJUL = PASTRASTROJUL;
                GlobalPecuario.PASTRASTROAGO = PASTRASTROAGO;
                GlobalPecuario.PASTRASTROSEP = PASTRASTROSEP;
                GlobalPecuario.PASTRASTROOCT = PASTRASTROOCT;
                GlobalPecuario.PASTRASTRONOV = PASTRASTRONOV;
                GlobalPecuario.PASTRASTRODIC = PASTRASTRODIC;
                pastforrajrastrojos();
                GlobalPecuario.PASTRASTROCOS = PASTRASTROCOS;


                GlobalPecuario.PASTCORVERENE = PASTCORVERENE;
                GlobalPecuario.PASTCORVERFEB = PASTCORVERFEB;
                GlobalPecuario.PASTCORVERMAR = PASTCORVERMAR;
                GlobalPecuario.PASTCORVERABR = PASTCORVERABR;
                GlobalPecuario.PASTCORVERMAY = PASTCORVERMAY;
                GlobalPecuario.PASTCORVERJUN = PASTCORVERJUN;
                GlobalPecuario.PASTCORVERJUL = PASTCORVERJUL;
                GlobalPecuario.PASTCORVERAGO = PASTCORVERAGO;
                GlobalPecuario.PASTCORVERSEP = PASTCORVERSEP;
                GlobalPecuario.PASTCORVEROCT = PASTCORVEROCT;
                GlobalPecuario.PASTCORVERNOV = PASTCORVERNOV;
                GlobalPecuario.PASTCORVERDIC = PASTCORVERDIC;
                pastforrajcorteverde();
                GlobalPecuario.PASTCORVERCOS = PASTCORVERCOS;


                GlobalPecuario.PASTMAIZENE = PASTMAIZENE;
                GlobalPecuario.PASTMAIZFEB = PASTMAIZFEB;
                GlobalPecuario.PASTMAIZMAR = PASTMAIZMAR;
                GlobalPecuario.PASTMAIZABR = PASTMAIZABR;
                GlobalPecuario.PASTMAIZMAY = PASTMAIZMAY;
                GlobalPecuario.PASTMAIZJUN = PASTMAIZJUN;
                GlobalPecuario.PASTMAIZJUL = PASTMAIZJUL;
                GlobalPecuario.PASTMAIZAGO = PASTMAIZAGO;
                GlobalPecuario.PASTMAIZSEP = PASTMAIZSEP;
                GlobalPecuario.PASTMAIZOCT = PASTMAIZOCT;
                GlobalPecuario.PASTMAIZNOV = PASTMAIZNOV;
                GlobalPecuario.PASTMAIZDIC = PASTMAIZDIC;
                pastforrajemaiz();
                GlobalPecuario.PASTMAIZCOS = PASTMAIZCOS;


                GlobalPecuario.PASTHENOSENE = PASTHENOSENE;
                GlobalPecuario.PASTHENOSFEB = PASTHENOSFEB;
                GlobalPecuario.PASTHENOSMAR = PASTHENOSMAR;
                GlobalPecuario.PASTHENOSABR = PASTHENOSABR;
                GlobalPecuario.PASTHENOSMAY = PASTHENOSMAY;
                GlobalPecuario.PASTHENOSJUN = PASTHENOSJUN;
                GlobalPecuario.PASTHENOSJUL = PASTHENOSJUL;
                GlobalPecuario.PASTHENOSAGO = PASTHENOSAGO;
                GlobalPecuario.PASTHENOSSEP = PASTHENOSSEP;
                GlobalPecuario.PASTHENOSOCT = PASTHENOSOCT;
                GlobalPecuario.PASTHENOSNOV = PASTHENOSNOV;
                GlobalPecuario.PASTHENOSDIC = PASTHENOSDIC;
                pastforrajehenos();
                GlobalPecuario.PASTHENOSCOS = PASTHENOSCOS;
                startActivity(new Intent(PecuarioComposicDietaOvinosCaprinos.this, PecuarioDietaOvinosCaprinosAlimentos.class));
                finish();
            }
        });
    }



    ////////////////////////////////////////////////////////////////////////////////
    //Meses para pastoreo de forrajes pastoreo en agostadero
    public void clickPastforagostad(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.chPecupaagosen:
                if (checked) {
                    PASTAGOSTENE = "S??";

                }
                else{
                    PASTAGOSTENE = "No";
                }
                break;

            case R.id.chPecupaagosfeb:
                if (checked) {
                    PASTAGOSTFEB = "S??";
                }
                else{
                    PASTAGOSTFEB = "No";
                }
                break;

            case R.id.chPecupatagosdmar:
                if (checked) {
                    PASTAGOSTMAR = "S??";

                }else{
                    PASTAGOSTMAR = "No";
                }
                break;

            case R.id.chPecupaagosabr:
                if (checked) {
                    PASTAGOSTABR = "S??";

                }else{
                    PASTAGOSTABR = "No";
                }
                break;

            case R.id.chPecupaagosmayo:
                if (checked) {
                    PASTAGOSTMAY = "S??";

                }else{
                    PASTAGOSTMAY = "No";
                }
                break;

            case R.id.chPecupaagosjun:
                if (checked) {
                    PASTAGOSTJUN = "S??";

                }else{
                    PASTAGOSTJUN = "No";
                }
                break;

            case R.id.chPecupaagosjul:
                if (checked) {
                    PASTAGOSTJUL = "S??";

                }else{
                    PASTAGOSTJUL = "No";
                }
                break;

            case R.id.chPecupaagosagos:
                if (checked) {
                    PASTAGOSTAGO = "S??";

                }else{
                    PASTAGOSTAGO = "No";
                }
                break;

            case R.id.chPecupaagossept:
                if (checked) {
                    PASTAGOSTSEP = "S??";

                }else{
                    PASTAGOSTSEP = "No";
                }
                break;

            case R.id.chPecupaagosoct:
                if (checked) {
                    PASTAGOSTOCT = "S??";

                }else{
                    PASTAGOSTOCT = "No";
                }
                break;

            case R.id.chPecupaagosnov:
                if (checked) {
                    PASTAGOSTNOV = "S??";

                }else{
                    PASTAGOSTNOV = "No";
                }
                break;

            case R.id.chPecupaagosdic:
                if (checked) {
                    PASTAGOSTDIC = "S??";

                }else{
                    PASTAGOSTDIC = "No";
                }
                break;
        }
    }


    public void pastforrajagostad(){
        if(!edtPecpaagoscos.getText().toString().isEmpty()){
            PASTAGOSTCOS = edtPecpaagoscos.getText().toString();
        } else{
            PASTAGOSTCOS = null;
        }

    }


    ////////////////////////////////////////////////////////////////////////////////
    //Meses para pastoreo de forrajes pastoreo en praderas
    public void clickPastforprad(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.chPecupapradene:
                if (checked) {
                    PASTPRADENE = "S??";

                }
                else{
                    PASTPRADENE = "No";
                }
                break;

            case R.id.chPecupapradfeb:
                if (checked) {
                    PASTPRADFEB = "S??";
                }
                else{
                    PASTPRADFEB = "No";
                }
                break;

            case R.id.chPecupapradmar:
                if (checked) {
                    PASTPRADMAR = "S??";

                }else{
                    PASTPRADMAR = "No";
                }
                break;

            case R.id.chPecupapradabr:
                if (checked) {
                    PASTPRADABR = "S??";

                }else{
                    PASTPRADABR = "No";
                }
                break;

            case R.id.chPecupapradmay:
                if (checked) {
                    PASTPRADMAY = "S??";

                }else{
                    PASTPRADMAY = "No";
                }
                break;

            case R.id.chPecupapradjun:
                if (checked) {
                    PASTPRADJUN = "S??";

                }else{
                    PASTPRADJUN = "No";
                }
                break;

            case R.id.chPecupapradjul:
                if (checked) {
                    PASTPRADJUL = "S??";

                }else{
                    PASTPRADJUL = "No";
                }
                break;

            case R.id.chPecupapradagos:
                if (checked) {
                    PASTPRADAGO = "S??";

                }else{
                    PASTPRADAGO = "No";
                }
                break;

            case R.id.chPecupapradsept:
                if (checked) {
                    PASTPRADSEP = "S??";

                }else{
                    PASTPRADSEP = "No";
                }
                break;

            case R.id.chPecupapradoct:
                if (checked) {
                    PASTPRADOCT = "S??";

                }else{
                    PASTPRADOCT = "No";
                }
                break;

            case R.id.chPecupapradnov:
                if (checked) {
                    PASTPRADNOV = "S??";

                }else{
                    PASTPRADNOV = "No";
                }
                break;

            case R.id.chPecupapraddic:
                if (checked) {
                    PASTPRADDIC = "S??";

                }else{
                    PASTPRADDIC = "No";
                }
                break;
        }
    }


    public void pastforrajpraderas(){
        if(!edtPecpastpradcos.getText().toString().isEmpty()){
            PASTPRADCOS = edtPecpastpradcos.getText().toString();
        } else{
            PASTPRADCOS = null;
        }

    }



    ////////////////////////////////////////////////////////////////////////////////
    //Meses para pastoreo de forrajes pastoreo en rastrojos
    public void clickPastforrastro(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.chPecparastrosene:
                if (checked) {
                    PASTRASTROENE = "S??";

                }
                else{
                    PASTRASTROENE = "No";
                }
                break;

            case R.id.chPecparastrofeb:
                if (checked) {
                    PASTRASTROFEB = "S??";
                }
                else{
                    PASTRASTROFEB = "No";
                }
                break;

            case R.id.chPecparastromar:
                if (checked) {
                    PASTRASTROMAR = "S??";

                }else{
                    PASTRASTROMAR = "No";
                }
                break;

            case R.id.chPecparastroabr:
                if (checked) {
                    PASTRASTROABR = "S??";

                }else{
                    PASTRASTROABR = "No";
                }
                break;

            case R.id.chPecparastromay:
                if (checked) {
                    PASTRASTROMAY = "S??";

                }else{
                    PASTRASTROMAY = "No";
                }
                break;

            case R.id.chPecparastrojun:
                if (checked) {
                    PASTRASTROJUN = "S??";

                }else{
                    PASTRASTROJUN = "No";
                }
                break;

            case R.id.chPecparastrojul:
                if (checked) {
                    PASTRASTROJUL = "S??";

                }else{
                    PASTRASTROJUL = "No";
                }
                break;

            case R.id.chPecpasastroagos:
                if (checked) {
                    PASTRASTROAGO = "S??";

                }else{
                    PASTRASTROAGO = "No";
                }
                break;

            case R.id.chPecparastrosept:
                if (checked) {
                    PASTRASTROSEP = "S??";

                }else{
                    PASTRASTROSEP = "No";
                }
                break;

            case R.id.chPecparastrooct:
                if (checked) {
                    PASTRASTROOCT = "S??";

                }else{
                    PASTRASTROOCT = "No";
                }
                break;

            case R.id.chPecparastronov:
                if (checked) {
                    PASTRASTRONOV = "S??";

                }else{
                    PASTRASTRONOV = "No";
                }
                break;

            case R.id.chPecparastrodic:
                if (checked) {
                    PASTRASTRODIC = "S??";

                }else{
                    PASTRASTRODIC = "No";
                }
                break;
        }
    }


    public void pastforrajrastrojos(){
        if(!edtPecpastrastrocos.getText().toString().isEmpty()){
            PASTRASTROCOS = edtPecpastrastrocos.getText().toString();
        } else{
            PASTRASTROCOS = null;
        }

    }


    ////////////////////////////////////////////////////////////////////////////////
    //Meses para pastoreo de forrajes pastoreo en cortes verdes
    public void clickPastforcorteverde(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.chPecforcorverene:
                if (checked) {
                    PASTCORVERENE = "S??";

                }
                else{
                    PASTCORVERENE = "No";
                }
                break;

            case R.id.chPecforcorverfeb:
                if (checked) {
                    PASTCORVERFEB = "S??";
                }
                else{
                    PASTCORVERFEB = "No";
                }
                break;

            case R.id.chPecforcorvermar:
                if (checked) {
                    PASTCORVERMAR = "S??";

                }else{
                    PASTCORVERMAR = "No";
                }
                break;

            case R.id.chPecforcorverabr:
                if (checked) {
                    PASTCORVERABR = "S??";

                }else{
                    PASTCORVERABR = "No";
                }
                break;

            case R.id.chPecforcorvermay:
                if (checked) {
                    PASTCORVERMAY = "S??";

                }else{
                    PASTCORVERMAY = "No";
                }
                break;

            case R.id.chPecforcorverjun:
                if (checked) {
                    PASTCORVERJUN = "S??";

                }else{
                    PASTCORVERJUN = "No";
                }
                break;

            case R.id.chPecforcorverjul:
                if (checked) {
                    PASTCORVERJUL = "S??";

                }else{
                    PASTCORVERJUL = "No";
                }
                break;

            case R.id.chPecforcorveragos:
                if (checked) {
                    PASTCORVERAGO = "S??";

                }else{
                    PASTCORVERAGO = "No";
                }
                break;

            case R.id.chPecforcorversept:
                if (checked) {
                    PASTCORVERSEP = "S??";

                }else{
                    PASTCORVERSEP = "No";
                }
                break;

            case R.id.chPecforcorveroct:
                if (checked) {
                    PASTCORVEROCT = "S??";

                }else{
                    PASTCORVEROCT = "No";
                }
                break;

            case R.id.chPecforcorvernov:
                if (checked) {
                    PASTCORVERNOV = "S??";

                }else{
                    PASTCORVERNOV = "No";
                }
                break;

            case R.id.chPecforcorverdic:
                if (checked) {
                    PASTCORVERDIC = "S??";

                }else{
                    PASTCORVERDIC = "No";
                }
                break;
        }
    }


    public void pastforrajcorteverde(){
        if(!edtPecforcorvercos.getText().toString().isEmpty()){
            PASTCORVERCOS = edtPecforcorvercos.getText().toString();
        } else{
            PASTCORVERCOS = null;
        }

    }


    ////////////////////////////////////////////////////////////////////////////////
    //Meses para pastoreo de forrajes maiz
    public void clickPastformaiz(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.chPecenmaizene:
                if (checked) {
                    PASTMAIZENE = "S??";

                }
                else{
                    PASTMAIZENE = "No";
                }
                break;

            case R.id.chPecenmaizfeb:
                if (checked) {
                    PASTMAIZFEB = "S??";
                }
                else{
                    PASTMAIZFEB = "No";
                }
                break;

            case R.id.chPecenmaizmar:
                if (checked) {
                    PASTMAIZMAR = "S??";

                }else{
                    PASTMAIZMAR = "No";
                }
                break;

            case R.id.chPecenmaizabr:
                if (checked) {
                    PASTMAIZABR = "S??";

                }else{
                    PASTMAIZABR = "No";
                }
                break;

            case R.id.chPecuenmaizmay:
                if (checked) {
                    PASTMAIZMAY = "S??";

                }else{
                    PASTMAIZMAY = "No";
                }
                break;

            case R.id.chPecenmaizjun:
                if (checked) {
                    PASTMAIZJUN = "S??";

                }else{
                    PASTMAIZJUN = "No";
                }
                break;

            case R.id.chPecenmaizjul:
                if (checked) {
                    PASTMAIZJUL = "S??";

                }else{
                    PASTMAIZJUL = "No";
                }
                break;

            case R.id.chPecenmaizagos:
                if (checked) {
                    PASTMAIZAGO = "S??";

                }else{
                    PASTMAIZAGO = "No";
                }
                break;

            case R.id.chPecenmaizsept:
                if (checked) {
                    PASTMAIZSEP = "S??";

                }else{
                    PASTMAIZSEP = "No";
                }
                break;

            case R.id.chPecuenmaizoct:
                if (checked) {
                    PASTMAIZOCT = "S??";

                }else{
                    PASTMAIZOCT = "No";
                }
                break;

            case R.id.chPecenmaiznov:
                if (checked) {
                    PASTMAIZNOV = "S??";

                }else{
                    PASTMAIZNOV = "No";
                }
                break;

            case R.id.chPecenmaizdic:
                if (checked) {
                    PASTMAIZDIC = "S??";

                }else{
                    PASTMAIZDIC = "No";
                }
                break;
        }
    }


    public void pastforrajemaiz(){
        if(!edtPecenmaizcos.getText().toString().isEmpty()){
            PASTMAIZCOS = edtPecenmaizcos.getText().toString();
        } else{
            PASTMAIZCOS = null;
        }

    }


    ////////////////////////////////////////////////////////////////////////////////
    //Meses para pastoreo de forrajes henos
    public void clickPastforhenos(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.checkPecuhenospacasenero:
                if (checked) {
                    PASTHENOSENE = "S??";

                }
                else{
                    PASTHENOSENE = "No";
                }
                break;

            case R.id.checkPecuhenospacasfebrero:
                if (checked) {
                    PASTHENOSFEB = "S??";
                }
                else{
                    PASTHENOSFEB = "No";
                }
                break;

            case R.id.checkPecuhenospacasmarzo:
                if (checked) {
                    PASTHENOSMAR = "S??";

                }else{
                    PASTHENOSMAR = "No";
                }
                break;

            case R.id.checkPecuhenospacasabril:
                if (checked) {
                    PASTHENOSABR = "S??";

                }else{
                    PASTHENOSABR = "No";
                }
                break;

            case R.id.checkPecuhenospacasmayo:
                if (checked) {
                    PASTHENOSMAY = "S??";

                }else{
                    PASTHENOSMAY = "No";
                }
                break;

            case R.id.checkPecuhenospacasjunio:
                if (checked) {
                    PASTHENOSJUN = "S??";

                }else{
                    PASTHENOSJUN = "No";
                }
                break;

            case R.id.checkPecuhenospacasjulio:
                if (checked) {
                    PASTHENOSJUL = "S??";

                }else{
                    PASTHENOSJUL = "No";
                }
                break;

            case R.id.checkPecuhenospacasagosto:
                if (checked) {
                    PASTHENOSAGO = "S??";

                }else{
                    PASTHENOSAGO = "No";
                }
                break;

            case R.id.checkPecuariohenospacasseptiembre:
                if (checked) {
                    PASTHENOSSEP = "S??";

                }else{
                    PASTHENOSSEP = "No";
                }
                break;

            case R.id.checkPecuhenospacasoctubre:
                if (checked) {
                    PASTHENOSOCT = "S??";

                }else{
                    PASTHENOSOCT = "No";
                }
                break;

            case R.id.checkPecuhenospacasnoviembre:
                if (checked) {
                    PASTHENOSNOV = "S??";

                }else{
                    PASTHENOSNOV = "No";
                }
                break;

            case R.id.checkPecuhenospacasdiciembre:
                if (checked) {
                    PASTHENOSDIC = "S??";

                }else{
                    PASTHENOSDIC = "No";
                }
                break;
        }
    }


    public void pastforrajehenos(){
        if(!edtPechepaccos.getText().toString().isEmpty()){
            PASTHENOSCOS = edtPechepaccos.getText().toString();
        } else{
            PASTHENOSCOS = null;
        }

    }


    @Override
    public void onBackPressed() {

    }



}
