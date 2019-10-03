package mx.edu.tesoem.isc.tlgr.p2tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class frm2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
    }
    public void pantalla3(View v){
        Intent frm3 = new Intent(this, frm3.class);
        startActivity(frm3);
        finish();
    }
}
