package com.example.pharmacyforcasting

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    private lateinit var etMedicine: EditText
    private lateinit var etCategory: EditText
    private lateinit var etPrice: EditText
    private lateinit var btnPredict: Button
    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etMedicine = findViewById(R.id.etMedicine)
        etCategory = findViewById(R.id.etCategory)
        etPrice = findViewById(R.id.etPrice)

        btnPredict = findViewById(R.id.btnPredict)
        txtResult = findViewById(R.id.txtResult)

        btnPredict.setOnClickListener {

            val json = JSONObject()

            json.put("Medicine_Name", etMedicine.text.toString().toInt())
            json.put("Category", etCategory.text.toString().toInt())
            json.put("Unit_Price", etPrice.text.toString().toDouble())

            json.put("Revenue", 5000)
            json.put("Month", 6)
            json.put("Year", 2026)
            json.put("DayOfWeek", 6)
            json.put("Quarter", 2)
            json.put("Day", 6)
            json.put("Week", 23)

            val url = "http://192.168.8.104:8080/predict"

            val request = JsonObjectRequest(
                Request.Method.POST,
                url,
                json,
                { response ->

                    val prediction =
                        response.getDouble("predicted_quantity")

                    txtResult.text =
                        "Predicted Quantity: $prediction"

                },
                { error ->

                    txtResult.text =
                        "Error: ${error.message}"

                }
            )

            Volley.newRequestQueue(this).add(request)
        }
    }
}