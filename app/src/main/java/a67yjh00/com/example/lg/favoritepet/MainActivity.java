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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,View.OnClickListener{
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
        butOk.setOnClickListener(this);
    }//end of onCreate
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

    @Override
    public void onClick(View v) {
        switch(rg.getCheckedRadioButtonId()) {//체크된 라디오버튼의 아이디를 반환
            case R.id.radio_dog:
                imgvpet.setImageResource(R.drawable.dog);
                break;
            case R.id.radio_hedgehog:
                imgvpet.setImageResource(R.drawable.hedgehog);
                break;
            case R.id.radio_lion:
                imgvpet.setImageResource(R.drawable.lion);
                break;
            default:
                Toast.makeText(this,"라디오버튼이 선택 되지 않았습니다.",Toast.LENGTH_SHORT).show();
        }
    }
}
