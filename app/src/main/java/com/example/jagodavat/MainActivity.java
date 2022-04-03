package com.example.jagodavat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private final String URL_PROD = "https://wl-api.mf.gov.pl/api/search/nip/";
    private final String URL_TEST = "https://wl-test.mf.gov.pl/api/search/nip/";

    //
    // nip prawdziwej firmy
    // 9291654514
    //
    // nip dla srodowiska testowego
    // 3245174504
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSearch = findViewById(R.id.buttonSearch);
        TextView txtResponse = findViewById(R.id.txtResponse);
        EditText etxtInput = findViewById(R.id.etxtInput);
        etxtInput.setHint("Wprowadz Nip");

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nip = etxtInput.getText().toString();
                String url = URL_TEST + nip + setDateUrlParameter();
                doRequest(url, txtResponse);
            }
        });
    }

    public void doRequest(String url, TextView txtResponse) {
        // Instantiate the cache
        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024); // 1MB cap

        // Set up the network to use HttpURLConnection as the HTTP client.
        Network network = new BasicNetwork(new HurlStack());

        // Instantiate the RequestQueue with the cache and network.
        RequestQueue requestQueue = new RequestQueue(cache, network);

        // Start the queue
        requestQueue.start();
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        Root root = gson.fromJson(response, Root.class);
                        txtResponse.setText(root.getVatStatus());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, "Request failed", Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.84 Safari/537.36");

                return params;
            }
        };
        requestQueue.add(stringRequest);
    }

    public String setDateUrlParameter() {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate = formatDate.format(date);
        return "?date=" + stringDate;
    }
}