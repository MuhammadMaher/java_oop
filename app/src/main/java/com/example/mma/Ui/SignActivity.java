package com.example.mma.Ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mma.MainActivity;
import com.example.mma.R;

public class SignActivity extends AppCompatActivity{
    //  اروح اعمل Global Variable من نفس نوع الview المستخدمة
    EditText editTextEmail;
    EditText editTextPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        // استخدمfindViewById

        editTextEmail=findViewById(R.id.et_email);
        editTextPassword=findViewById(R.id.et_password);

    }
    // استخدمة
    public void Regester2(View view) {
        String email =editTextEmail.getText().toString();
        // اورح عمل check validation عن طريق string Functions
        if(email.isEmpty()){
            editTextEmail.setError(getString(R.string.email_required));

            return;
        }
        String password=editTextPassword.getText().toString();
        if (password.isEmpty()){
         //editTextPassword.setError("Password required");
           editTextPassword.setError(getString(R.string.password_required));
        }

        if(email.equals("maher@gmail.com")&& password.equals("123456789")){
            Intent intent =new Intent(SignActivity.this, MainActivity.class);
            intent.putExtra("email", email);
            startActivity(intent);
        }
        // لان التوست بترجع integer وهو هنا text
        //        Toast.makeText(this, R.string.account_created, Toast.LENGTH_LONG).show();

        else{
        Toast.makeText(this, getString(R.string.account_created), Toast.LENGTH_LONG).show();
        System.out.println(email);
        System.out.println(password);
        // عاوزين نقفل ال activity الي انا واقف فيها
        finish();
    }}
}





