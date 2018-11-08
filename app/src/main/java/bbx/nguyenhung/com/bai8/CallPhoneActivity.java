package bbx.nguyenhung.com.bai8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class CallPhoneActivity extends AppCompatActivity {
    EditText edtsdt;
    Button btnback;
    ImageButton imgcall;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_intent);
        edtsdt = findViewById(R.id.edtsdt);
        btnback = findViewById(R.id.btnback);
        imgcall = findViewById(R.id.imgcall);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        imgcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+edtsdt.getText().toString()));
                startActivity(callintent);
            }
        });
    }
}
