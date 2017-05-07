package com.example.debanikmoulick.buttonenable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button b1;
    EditText e1,e2;
    String data1,data2;
    int flag=0;
    int flag2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        data1=e1.getText().toString();
        data2=e2.getText().toString();
        b1.setEnabled(false);
        e1.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
                flag=0;


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if (s.length()>0)
                {
                    flag=1;
                    if((flag==1)&&(flag2==1))
                    {
                        b1.setEnabled(true);
                    }

                }
                else if (s.length()==0)
                {
                    flag=0;
                    b1.setEnabled(false);

                }

                Toast.makeText(MainActivity.this, " flag ontextChanged"+flag, Toast.LENGTH_SHORT).show();
//

            }

            @Override
            public void afterTextChanged(Editable s)
            {
                if (s.length() > 0) {
                    flag = 1;
                    if((flag==1)&&(flag2==1))
                    {
                        b1.setEnabled(true);
                    }

                } else if (s.length() == 0) {
                    flag = 0;
                    b1.setEnabled(false);
                }
                Toast.makeText(MainActivity.this, "flag in after changed"+flag, Toast.LENGTH_SHORT).show();


            }
       });
        e2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
                flag2=0;

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(s.length()>0)
                {
                    flag2=1;
                    if((flag==1)&&(flag2==1))
                    {
                        b1.setEnabled(true);
                    }
                }
                else if(s.length()<=0)
                {
                    flag2=0;
                    b1.setEnabled(false);
                }
                Toast.makeText(MainActivity.this, "flag 2 onTextChanged"+flag2, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void afterTextChanged(Editable s)
            {
                if(s.length()>0)
                {
                    flag2=1;
                    if((flag==1)&&(flag2==1))
                    {
                        b1.setEnabled(true);
                    }
                }
                else if(s.length()<=0)
                {
                    flag2=0;
                    b1.setEnabled(false);
                }
                Toast.makeText(MainActivity.this, "flag2 in after text changed"+flag2, Toast.LENGTH_SHORT).show();

            }
        });



    }

}
