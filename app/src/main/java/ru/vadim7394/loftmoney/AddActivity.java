package ru.vadim7394.loftmoney;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    private EditText nameInput;
    private EditText priceInput;
    private Button addBtn;

    private TextWatcher generalTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            addBtn.setEnabled(!TextUtils.isEmpty(nameInput.getText()) && !TextUtils.isEmpty(priceInput.getText()));
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        nameInput = findViewById(R.id.name);
        priceInput = findViewById(R.id.price);
        addBtn = findViewById(R.id.add_btn);

        nameInput.addTextChangedListener(generalTextWatcher);
        priceInput.addTextChangedListener(generalTextWatcher);
    }
}
