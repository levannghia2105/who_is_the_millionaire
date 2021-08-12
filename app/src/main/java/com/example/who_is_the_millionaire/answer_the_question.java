package com.example.who_is_the_millionaire;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.skydoves.progressview.ProgressView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import mehdi.sakout.fancybuttons.FancyButton;

public class answer_the_question extends AppCompatActivity implements View.OnClickListener {
    TextView txtQuestion, txtAnswer1, txtAnswer2, txtAnswer3, txtAnswer4,txtCountDown;
    int cunrrectQuestion = 0;
    ArrayList<Question> questionArrayList;
    Question mquestion;
    Button btnSaveScore, btnBackMenu;
    DataQuestion dataQuestion = new DataQuestion();
    ArrayList<ArrayList> listquestion = new ArrayList<>();
    ImageView img50, imgAskForOpinion, imgCall, imgRonaldo, imgMessi, imgObama, imgEinstein;
    int cout = 0;
    TextView txtPersonHelp;
    ArrayList<String> ArrayScore = new ArrayList<>() ;
    RecyclerView recyScore ;
    ScoreArapter scoreArapter ;
    int posadapter =14 ;
    int scorePlayer ;
    EditText edtPlayerName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_the_question);


        innit();
        setRecyScore();
        listquestion = dataQuestion.getQuestion();
        questionArrayList = listquestion.get(cunrrectQuestion);
        Collections.shuffle(questionArrayList);
        setQuestion(questionArrayList.get(0));

    }

    private void setRecyScore() {

        scoreArapter = new ScoreArapter(this,ArrayScore);
        recyScore.setAdapter(scoreArapter);
        recyScore.setLayoutManager(new LinearLayoutManager(this));

    }


    private void setQuestion(Question question) {
        mquestion = question;
        setdefautcolorbutton();
        Collections.shuffle(question.getAnswserArrayList());
        txtQuestion.setText(question.getContentQuestion());
        txtAnswer1.setText(question.getAnswserArrayList().get(0).getContentAnswser());
        txtAnswer2.setText(question.getAnswserArrayList().get(1).getContentAnswser());
        txtAnswer3.setText(question.getAnswserArrayList().get(2).getContentAnswser());
        txtAnswer4.setText(question.getAnswserArrayList().get(3).getContentAnswser());

        scoreArapter.setvitri(posadapter);

        txtAnswer1.setOnClickListener(this);
        txtAnswer2.setOnClickListener(this);
        txtAnswer3.setOnClickListener(this);
        txtAnswer4.setOnClickListener(this);

        img50.setOnClickListener(this);
        imgAskForOpinion.setOnClickListener(this);
        imgCall.setOnClickListener(this);
        demNguoc();


    }

    private void demNguoc() {
        new CountDownTimer(30000,1000){
            @Override
            public void onTick(long mil) {
                txtCountDown.setText(""+mil/1000);
            }

            @Override
            public void onFinish() {
                displaycorrectanswer();

                if (posadapter==14){
                    scorePlayer = 100000;
                    showDialog();
                    return;
                }
                scorePlayer = Integer.parseInt(ArrayScore.get(posadapter+1));
                showDialog();

            }
        }.start();
    }

    private void innit() {
        txtQuestion = findViewById(R.id.txt_conntent);
        txtAnswer1 = findViewById(R.id.btn_anwser_one);
        txtAnswer2 = findViewById(R.id.btn_anwser_two);
        txtAnswer3 = findViewById(R.id.btn_anwser_three);
        txtAnswer4 = findViewById(R.id.btn_anwser_four);
        recyScore = findViewById(R.id.recy_Score);
        img50 = findViewById(R.id.img_50_50);
        imgAskForOpinion = findViewById(R.id.img_help);
        imgCall = findViewById(R.id.img_call);
        txtCountDown =findViewById(R.id.txt_CountDown);

        ArrayScore.add("50000000");
        ArrayScore.add("30000000");
        ArrayScore.add("25000000");
        ArrayScore.add("20000000");
        ArrayScore.add("14000000");
        ArrayScore.add("10000000");
        ArrayScore.add("5000000");
        ArrayScore.add("3000000");
        ArrayScore.add("2000000");
        ArrayScore.add("1500000");
        ArrayScore.add("1000000");
        ArrayScore.add("500000");
        ArrayScore.add("400000");
        ArrayScore.add("200000");
        ArrayScore.add("100000");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_anwser_one:
                txtAnswer1.setBackgroundResource(R.drawable.clickbuttonanswser);
                checkAnwser(txtAnswer1, mquestion.getAnswserArrayList().get(0));
                break;
            case R.id.btn_anwser_two:
                txtAnswer2.setBackgroundResource(R.drawable.clickbuttonanswser);
                checkAnwser(txtAnswer2, mquestion.getAnswserArrayList().get(1));
                break;
            case R.id.btn_anwser_three:
                txtAnswer3.setBackgroundResource(R.drawable.clickbuttonanswser);
                checkAnwser(txtAnswer3, mquestion.getAnswserArrayList().get(2));
                break;
            case R.id.btn_anwser_four:
                txtAnswer4.setBackgroundResource(R.drawable.clickbuttonanswser);
                checkAnwser(txtAnswer4, mquestion.getAnswserArrayList().get(3));
                break;
            case R.id.img_50_50:
                removeAnswerErr();
                img50.setVisibility(View.INVISIBLE);
                break;
            case R.id.img_help:
                showDialogHelp();
                 imgAskForOpinion.setVisibility(View.INVISIBLE);
                break;
            case R.id.img_call:
                showDialogCall();
                imgCall.setVisibility(View.INVISIBLE);
                break;

        }
    }

    private void showDialogHelp() {
        LayoutInflater layoutInflater = getLayoutInflater();
        View showdialoghelp = layoutInflater.inflate(R.layout.custom_aksforopinion, null);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder((this));
        alertDialog.setView(showdialoghelp);
       ProgressView progressViewA = showdialoghelp.findViewById(R.id.progress_A);
       ProgressView progressViewB = showdialoghelp.findViewById(R.id.progress_B);
         ProgressView progressViewC = showdialoghelp.findViewById(R.id.progress_C);
        ProgressView progressViewD = showdialoghelp.findViewById(R.id.progress_D);
        Random random = new Random();
        int value1 = random.nextInt((25-5)+1)+5;
        int value2 = random.nextInt((25-5)+1)+5;
        int value3 = random.nextInt((25-5)+1)+5;
        int value4 = 100 - value1 - value2 - value3;

        if (mquestion.getAnswserArrayList().get(0).isAnswser()) {

            progressViewA.setProgress(value4);
            progressViewA.setLabelText(value4+"%");
            progressViewB.setProgress(value1);
            progressViewB.setLabelText(value1+"%");
            progressViewC.setProgress(value2);
            progressViewC.setLabelText(value2+"%");
            progressViewD.setProgress(value3);
            progressViewD.setLabelText(value3+"%");

        } else if (mquestion.getAnswserArrayList().get(1).isAnswser()) {
            progressViewB.setProgress(value4);
            progressViewB.setLabelText(value4+"%");
            progressViewA.setProgress(value1);
            progressViewA.setLabelText(value1+"%");
            progressViewC.setProgress(value2);
            progressViewC.setLabelText(value2+"%");
            progressViewD.setProgress(value3);
            progressViewD.setLabelText(value3+"%");


        } else if (mquestion.getAnswserArrayList().get(2).isAnswser()) {
            progressViewC.setProgress(value4);
            progressViewC.setLabelText(value4+"%");
            progressViewA.setProgress(value1);
            progressViewA.setLabelText(value1+"%");
            progressViewB.setProgress(value2);
            progressViewB.setLabelText(value2+"%");
            progressViewD.setProgress(value3);
            progressViewD.setLabelText(value3+"%");


        } else if (mquestion.getAnswserArrayList().get(3).isAnswser()) {
            progressViewD.setProgress(value4);
            progressViewD.setLabelText(value4+"%");
            progressViewA.setProgress(value1);
            progressViewA.setLabelText(value1+"%");
            progressViewB.setProgress(value2);
            progressViewB.setLabelText(value2+"%");
            progressViewC.setProgress(value3);
            progressViewC.setLabelText(value3+"%");

        }
        AlertDialog dialog = alertDialog.create();
        dialog.show();

    }

    // hiện dialog những người trợ giúp
    private void showDialogCall() {
        LayoutInflater layoutInflater = getLayoutInflater();
        View showdialoghelp = layoutInflater.inflate(R.layout.customdialog_help, null);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setView(showdialoghelp);
        imgEinstein = showdialoghelp.findViewById(R.id.img_anhtanh);
        imgMessi = showdialoghelp.findViewById(R.id.img_messi);
        imgRonaldo = showdialoghelp.findViewById(R.id.img_ronaldo);
        imgObama = showdialoghelp.findViewById(R.id.img_obama);
        txtPersonHelp = showdialoghelp.findViewById(R.id.txt_personhelp);
        AlertDialog dialog = alertDialog.create();
        imgEinstein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showpesonhelp("Einstein");
            }


        });
        imgMessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showpesonhelp("Messi");
            }
        });
        imgRonaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showpesonhelp("Ronaldo");
            }
        });
        imgObama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showpesonhelp("Obama");
            }
        });
        dialog.show();

    }
          // trợ giúp khán giả
    private void showpesonhelp(String name) {
        if (mquestion.getAnswserArrayList().get(0).isAnswser() == true) {
            txtPersonHelp.setText(name + " khuyên bạn nên chọn đáp án " + mquestion.getAnswserArrayList().get(0).getContentAnswser());
        }
        if (mquestion.getAnswserArrayList().get(1).isAnswser() == true) {
            txtPersonHelp.setText(name + " khuyên bạn nên chọn đáp án " + mquestion.getAnswserArrayList().get(1).getContentAnswser());
        }
        if (mquestion.getAnswserArrayList().get(2).isAnswser() == true) {
            txtPersonHelp.setText(name + " khuyên bạn nên chọn đáp án " + mquestion.getAnswserArrayList().get(2).getContentAnswser());
        }
        if (mquestion.getAnswserArrayList().get(3).isAnswser() == true) {
            txtPersonHelp.setText(name + " khuyên bạn nên chọn đáp án " + mquestion.getAnswserArrayList().get(3).getContentAnswser());
        }

    }

    // hàm loại bỏ đi 2 đáp án sai
    private void removeAnswerErr() {

        if (mquestion.getAnswserArrayList().get(0).isAnswser() == false) {
            txtAnswer1.setVisibility(View.INVISIBLE);
            cout++;
        }
        if (mquestion.getAnswserArrayList().get(1).isAnswser() == false && cout < 2) {
            txtAnswer2.setVisibility(View.INVISIBLE);
            cout++;
        }
        if (mquestion.getAnswserArrayList().get(2).isAnswser() == false && cout < 2) {
            txtAnswer3.setVisibility(View.INVISIBLE);
            cout++;
        }
        if (mquestion.getAnswserArrayList().get(3).isAnswser() == false && cout < 2) {
            txtAnswer4.setVisibility(View.INVISIBLE);
            cout++;
        }
    }


    private void checkAnwser(TextView name, Answser answser) {
//        disableButton();

//        CountDownTimer countDown = new CountDownTimer(2000, 2000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//            }
//
//            @Override
//            public void onFinish() {
//                if (answser.isAnswser() == true) {
//
//                    CountDownTimer countDownTimer = new CountDownTimer(3000, 3000) {
//                        @Override
//                        public void onTick(long millisUntilFinished) {
//                        }
//
//                        @Override
//                        public void onFinish() {
//                            name.setBackgroundResource(R.drawable.backgroundred);
//                            nextQuestion();
//                        }
//                    };
//                    countDownTimer.start();
//
//                } else
////                    name.setBackgroundResource(R.drawable.backgroundblue);
//
//                    displaycorrectanswer();
//                    showDialog();
//            }
//        };
//        countDown.start()
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (answser.isAnswser() == true) {
                    name.setBackgroundResource(R.drawable.backgroundred);
                    nextQuestion();
                    return;
                } else
//                    name.setBackgroundResource(R.drawable.backgroundblue);
                    displaycorrectanswer();

                    if (posadapter==14){
                        scorePlayer = 100000;
                        showDialog();
                        return;
                    }
                scorePlayer = Integer.parseInt(ArrayScore.get(posadapter+1));
                showDialog();
            }
        }, 2000);

    }


    // hiển thị câu trả lời đúng khi người chơi trả lời sai
    private void displaycorrectanswer() {
        if (mquestion.getAnswserArrayList().get(0).isAnswser() == true) {
            txtAnswer1.setBackgroundResource(R.drawable.backgroundred);
        } else if (mquestion.getAnswserArrayList().get(1).isAnswser() == true) {
            txtAnswer2.setBackgroundResource(R.drawable.backgroundred);
        } else if (mquestion.getAnswserArrayList().get(2).isAnswser() == true) {
            txtAnswer3.setBackgroundResource(R.drawable.backgroundred);
        } else if (mquestion.getAnswserArrayList().get(3).isAnswser() == true) {
            txtAnswer4.setBackgroundResource(R.drawable.backgroundred);
        }
    }


    private void nextQuestion() {
        if (cunrrectQuestion == listquestion.size() - 1) {
            Toast.makeText(answer_the_question.this, "Xin chúc mừng bạn đã trở thành triệu phú", Toast.LENGTH_SHORT).show();
            scorePlayer = Integer.parseInt(ArrayScore.get(0));
            showDialog();

        } else {
            EnableButton();
            showTextView();
            cunrrectQuestion++;
            posadapter-- ;
            questionArrayList = listquestion.get(cunrrectQuestion);
            Collections.shuffle(questionArrayList);
            setQuestion(questionArrayList.get(0));

        }

    }

    //show dialog khi người dùng trả lời sai
    private void showDialog() {
        LayoutInflater inflater = getLayoutInflater();
        View showdialog = inflater.inflate(R.layout.customdialog_losergame, null);
        btnBackMenu = showdialog.findViewById(R.id.btn_Backmenu);
        btnSaveScore = showdialog.findViewById(R.id.btn_Savescore);
        TextView txtMoney = showdialog.findViewById(R.id.txt_money);
        edtPlayerName = showdialog.findViewById(R.id.edt_Name);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setView(showdialog);
        AlertDialog dialog = alert.create();

        txtMoney.setText(txtMoney.getText()+""+scorePlayer);
        btnBackMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(answer_the_question.this, MainActivity.class);
                startActivity(intent);
            }

        });
        btnSaveScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String namePlayer = edtPlayerName.getText()+"";
                 PlayerGame playerGame = new PlayerGame(namePlayer,String.valueOf(scorePlayer));
                Intent intent = new Intent(answer_the_question.this, SaveScore.class);
                intent.putExtra("objPlayerGame", (Serializable) playerGame);

                startActivity(intent);

            }
        });

        dialog.show();


    }

    private void setdefautcolorbutton() {
        txtAnswer1.setBackgroundResource(R.drawable.custom_textview);
        txtAnswer2.setBackgroundResource(R.drawable.custom_textview);
        txtAnswer3.setBackgroundResource(R.drawable.custom_textview);
        txtAnswer4.setBackgroundResource(R.drawable.custom_textview);

    }

    public void disableButton() {
        txtAnswer1.setEnabled(false);
        txtAnswer2.setEnabled(false);
        txtAnswer3.setEnabled(false);
        txtAnswer4.setEnabled(false);

    }

    public void EnableButton() {
        txtAnswer1.setEnabled(true);
        txtAnswer2.setEnabled(true);
        txtAnswer3.setEnabled(true);
        txtAnswer4.setEnabled(true);

    }

    public void showTextView() {
        txtAnswer1.setVisibility(View.VISIBLE);
        txtAnswer2.setVisibility(View.VISIBLE);
        txtAnswer3.setVisibility(View.VISIBLE);
        txtAnswer4.setVisibility(View.VISIBLE);

    }
}