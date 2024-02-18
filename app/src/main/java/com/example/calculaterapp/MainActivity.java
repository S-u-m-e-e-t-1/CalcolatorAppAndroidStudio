package com.example.calculaterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvsec;
    private TextView tvMain;
    private Button bac;
    private Button bc;
    private Button bbrac1;
    private Button bbrac2;
    private Button bsin;
    private Button bcos;
    private Button btan;
    private Button blog;
    private Button bln;
    private Button bfact;
    private Button bsquare;
    private Button bsqrt;
    private Button binv;
    private Button b0;
    private Button b9;
    private Button b8;
    private Button b7;
    private Button b6;
    private Button b5;
    private Button b4;
    private Button b3;
    private Button b2;
    private Button b1;
    private Button bpi;
    private Button bmul;
    private Button bminus;
    private Button bplus;
    private Button bequal;
    private Button bdot;
    private Button bdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvsec = findViewById(R.id.idTVSecondary);
        tvMain = findViewById(R.id.idTVprimary);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bbrac1 = findViewById(R.id.bbrac1);
        bbrac2 = findViewById(R.id.bbrac2);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bfact = findViewById(R.id.bfact);
        bsquare = findViewById(R.id.bsquare);
        bsqrt = findViewById(R.id.bsqrt);
        binv = findViewById(R.id.binv);
        b0 = findViewById(R.id.b0);
        b9 = findViewById(R.id.b9);
        b8 = findViewById(R.id.b8);
        b7 = findViewById(R.id.b7);
        b6 = findViewById(R.id.b6);
        b5 = findViewById(R.id.b5);
        b4 = findViewById(R.id.b4);
        b3 = findViewById(R.id.b3);
        b2 = findViewById(R.id.b2);
        b1 = findViewById(R.id.b1);
        bpi = findViewById(R.id.bpi);
        bmul = findViewById(R.id.bmul);
        bminus = findViewById(R.id.bminus);
        bplus = findViewById(R.id.bplus);
        bequal = findViewById(R.id.bequal);
        bdot = findViewById(R.id.bdot);
        bdiv = findViewById(R.id.bdiv);

        b1.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "1"));
        b2.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "2"));
        b3.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "3"));
        b4.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "4"));
        b5.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "5"));
        b6.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "6"));
        b7.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "7"));
        b8.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "8"));
        b9.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "9"));
        b0.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "0"));
        bdot.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "."));
        bplus.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "+"));
        bdiv.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "/"));
        bbrac1.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "("));
        bbrac2.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + ")"));
        bpi.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "3.142");
            tvsec.setText(bpi.getText().toString());
        });
        bsin.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "sin"));
        bcos.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "cos"));
        btan.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "tan"));
        binv.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "^" + "(-1)"));
        bln.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "ln"));
        blog.setOnClickListener(v -> tvMain.setText(tvMain.getText().toString() + "log"));

        bminus.setOnClickListener(v -> {
            String str = tvMain.getText().toString();
            if (!str.substring(str.length() - 1).equals("-")) {
                tvMain.setText(tvMain.getText().toString() + "-");
            }
        });
        bmul.setOnClickListener(v -> {
            String str = tvMain.getText().toString();
            if (!str.substring(str.length() - 1).equals("*")) {
                tvMain.setText(tvMain.getText().toString() + "*");
            }
        });
        bsqrt.setOnClickListener(v -> {
            if (tvMain.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
            } else {
                String str = tvMain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(str));
                String result = Double.toString(r);
                tvMain.setText(result);
            }
        });
        bequal.setOnClickListener(v -> {
            String str = tvMain.getText().toString();
            double result = evaluate(str);
            String r = Double.toString(result);
            tvMain.setText(r);
            tvsec.setText(str);
        });
        bac.setOnClickListener(v -> {
            tvMain.setText("");
            tvsec.setText("");
        });
        bc.setOnClickListener(v -> {
            String str = tvMain.getText().toString();
            if (!str.equals("")) {
                str = str.substring(0, str.length() - 1);
                tvMain.setText(str);
            }
        });
        bsquare.setOnClickListener(v -> {
            if (tvMain.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
            } else {
                double d = Double.parseDouble(tvMain.getText().toString());
                double square = d * d;
                tvMain.setText(Double.toString(square));
                tvsec.setText(d + "²");
            }
        });
        bfact.setOnClickListener(v -> {
            if (tvMain.getText().toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
            } else {
                int value = Integer.parseInt(tvMain.getText().toString());
                int fact = factorial(value);
                tvMain.setText(Integer.toString(fact));
                tvsec.setText(value + "`!");
            }
        });
    }

    private int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    private double evaluate(String str) {
        return new Object() {
            int pos = -1;
            int ch = 0;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                while (true) {
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                while (true) {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = pos;

                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, pos));
                } else if ((ch >= 'a' && ch <= 'z')) {
                    while ((ch >= 'a' && ch <= 'z')) nextChar();
                    String func = str.substring(startPos, pos);
                    x = parseFactor();
                    switch (func) {
                        case "sqrt":
                            x = Math.sqrt(x);
                            break;
                        case "sin":
                            x = Math.sin(Math.toRadians(x));
                            break;
                        case "cos":
                            x = Math.cos(Math.toRadians(x));
                            break;
                        case "tan":
                            x = Math.tan(Math.toRadians(x));
                            break;
                        case "log":
                            x = Math.log10(x);
                            break;
                        case "ln":
                            x = Math.log(x);
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }

                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor());
                return x;
            }

        }.parse();
    }
}
