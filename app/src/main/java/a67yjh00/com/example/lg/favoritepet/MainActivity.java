package a67yjh00.com.example.lg.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    CheckBox checkSelect;
    TextView textQuest;
    RadioGroup rg;
    RadioButton radiodog, radiohedgehog, radiolion;
    Button butOk;
    ImageView imgvpet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=(CheckBox)findViewById(R.id.check_select);
        textQuest=(TextView)findViewById(R.id.text_quest);
        rg=(RadioGroup) findViewById(R.id.rg);
        radiodog=(RadioButton)findViewById(R.id.radio_dog);
        radiohedgehog=(RadioButton)findViewById(R.id.radio_hedgehog);
        radiolion=(RadioButton)findViewById(R.id.radio_lion);
        butOk=(Button)findViewById(R.id.but_ok);
        imgvpet=(ImageView)findViewById(R.id.imgv_pet);
        checkSelect.setOnCheckedChangeListener(this);
    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()){
           textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvpet.setVisibility(View.VISIBLE);
        }
        else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvpet.setVisibility(View.INVISIBLE);
        }
    }
}
