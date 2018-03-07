package br.com.carloswgama.menuopes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opcoes, menu);

        MenuItem item = menu.findItem(R.id.bt_buscar);
        View v = item.getActionView();
        final EditText texto = v.findViewById(R.id.et_texto_menu);
        texto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                TextView textView = findViewById(R.id.tv_texto);
                textView.setText(texto.getText());
            }
        });

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView textView = findViewById(R.id.tv_texto);
        if (item.getItemId() == R.id.bt_adicionar)
            textView.setText("Adicionar");
        else if (item.getItemId() == R.id.bt_configuracoes)
            textView.setText("Configurações");
        else if (item.getItemId() == R.id.bt_sair)
            textView.setText("Sair");
        return super.onOptionsItemSelected(item);
    }
}
