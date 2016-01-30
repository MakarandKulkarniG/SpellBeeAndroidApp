package com.makarandkulkarni.spellbee;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class SpellActivity extends Activity implements  TextToSpeech.OnInitListener {

    private static final Word[] wordList = new Word[] {
            new Word("accessible"),
            new Word("accommodate"),
            new Word("accurate"),
            new Word("achieve"),
            new Word("acres"),
            new Word("Afghanistan"),
            new Word("alligator"),
            new Word("alteration"),
            new Word("amazement"),
            new Word("amphibians"),
            new Word("Antarctic"),
            new Word("antelope"),
            new Word("apartment"),
            new Word("appointment"),
            new Word("appearance"),
            new Word("applause"),
            new Word("aquarium"),
            new Word("article"),
            new Word("artificial"),
            new Word("ascending"),
            new Word("assistance"),
            new Word("astronaut"),
            new Word("atmosphere"),
            new Word("bachelor"),
            new Word("baggage"),
            new Word("Bangladesh"),
            new Word("barbecued"),
            new Word("bargain"),
            new Word("beagle"),
            new Word("bleachers"),
            new Word("blueberries"),
            new Word("bouquet"),
            new Word("brighten"),
            new Word("brilliant"),
            new Word("bruise"),
            new Word("calendar"),
            new Word("calories"),
            new Word("casserole"),
            new Word("catalogue"),
            new Word("celebration"),
            new Word("centipede"),
            new Word("chlorophyll"),
            new Word("collaborate"),
            new Word("combination"),
            new Word("commander"),
            new Word("commentary"),
            new Word("competition"),
            new Word("competitor"),
            new Word("concentration"),
            new Word("condemn"),
            new Word("confidence"),
            new Word("consonant"),
            new Word("containment"),
            new Word("coordination"),
            new Word("courageous"),
            new Word("courtesy"),
            new Word("dandruff"),
            new Word("decoration"),
            new Word("delegate"),
            new Word("deliberate"),
            new Word("delicious"),
            new Word("denominator"),
            new Word("desperate"),
            new Word("destination"),
            new Word("dictionary"),
            new Word("disturbance"),
            new Word("enormous"),
            new Word("envelope"),
            new Word("especially"),
            new Word("etiquette"),
            new Word("evidence"),
            new Word("excellent"),
            new Word("excursion"),
            new Word("favourite"),
            new Word("fertilize"),
            new Word("foreign"),
            new Word("fortunate"),
            new Word("fragrance"),
            new Word("freight"),
            new Word("furniture"),
            new Word("gangster"),
            new Word("garage"),
            new Word("geography"),
            new Word("glorious"),
            new Word("gnat"),
            new Word("gnaw"),
            new Word("government"),
            new Word("grammar"),
            new Word("guarantee"),
            new Word("guard"),
            new Word("gymnasium"),
            new Word("Halloween"),
            new Word("Hawaii"),
            new Word("hesitation"),
            new Word("Himalayas"),
            new Word("homeopathy"),
            new Word("hopscotch"),
            new Word("horrible"),
            new Word("hostile"),
            new Word("humiliation"),
            new Word("illiterate"),
            new Word("imaginary"),
            new Word("immature"),
            new Word("immediately"),
            new Word("impatient"),
            new Word("incentive"),
            new Word("incredible"),
            new Word("Independence Day"),
            new Word("independent"),
            new Word("indication"),
            new Word("indigestion"),
            new Word("inefficient"),
            new Word("information"),
            new Word("instruction"),
            new Word("instrument"),
            new Word("intellectual"),
            new Word("intelligent"),
            new Word("introduce"),
            new Word("investiture"),
            new Word("irreplaceable"),
            new Word("irritate"),
            new Word("island"),
            new Word("isolation"),
            new Word("janitor"),
            new Word("jealous"),
            new Word("jewellery"),
            new Word("Jharkhand"),
            new Word("journalism"),
            new Word("kangaroo"),
            new Word("kindergarten"),
            new Word("knickers"),
            new Word("knitting"),
            new Word("knob"),
            new Word("knowledge"),
            new Word("knuckle"),
            new Word("labour"),
            new Word("laundry"),
            new Word("legislation"),
            new Word("lemonade"),
            new Word("leopard"),
            new Word("lettuce"),
            new Word("liberation"),
            new Word("lilac"),
            new Word("lobster"),
            new Word("lubricant"),
            new Word("magnetism"),
            new Word("mahout"),
            new Word("manufacture"),
            new Word("marathon"),
            new Word("marvellous"),
            new Word("measurement"),
            new Word("migrate"),
            new Word("millionaire"),
            new Word("mischievous"),
            new Word("moderate"),
            new Word("monarch"),
            new Word("mosquito"),
            new Word("multinational"),
            new Word("multiplication"),
            new Word("naughty"),
            new Word("nomination"),
            new Word("November"),
            new Word("numerator"),
            new Word("nutrition"),
            new Word("oblique"),
            new Word("omlette"),
            new Word("ordinary"),
            new Word("orientation"),
            new Word("ornament"),
            new Word("ostriches"),
            new Word("ounce"),
            new Word("parachute"),
            new Word("parliament"),
            new Word("permanent"),
            new Word("passenger"),
            new Word("penicillin"),
            new Word("perfection"),
            new Word("petroleum"),
            new Word("pharmacist"),
            new Word("photosynthesis"),
            new Word("politeness"),
            new Word("population"),
            new Word("porcupine"),
            new Word("prevention"),
            new Word("production"),
            new Word("prohibition"),
            new Word("projection"),
            new Word("pronunciation"),
            new Word("puddle"),
            new Word("punctual"),
            new Word("punctuation"),
            new Word("purification"),
            new Word("qualification"),
            new Word("quench"),
            new Word("queue"),
            new Word("rectification"),
            new Word("refrigerator"),
            new Word("rehearsal"),
            new Word("relationship"),
            new Word("resistance"),
            new Word("restaurant"),
            new Word("rhombus"),
            new Word("satellite"),
            new Word("sculpture"),
            new Word("sensible"),
            new Word("separate"),
            new Word("several"),
            new Word("shimmering"),
            new Word("shrine"),
            new Word("signature"),
            new Word("significant"),
            new Word("simulate"),
            new Word("skeleton"),
            new Word("skilful"),
            new Word("spinach"),
            new Word("spindle"),
            new Word("strangle"),
            new Word("successful"),
            new Word("suddenly"),
            new Word("superstition"),
            new Word("sweater"),
            new Word("technological"),
            new Word("telescope"),
            new Word("temperament"),
            new Word("temperature"),
            new Word("terminal"),
            new Word("thermometer"),
            new Word("thoughtful"),
            new Word("ticklish"),
            new Word("tomorrow"),
            new Word("tongue"),
            new Word("tortoise"),
            new Word("tournament"),
            new Word("transferred"),
            new Word("travelling"),
            new Word("treasure"),
            new Word("treatment"),
            new Word("tremble"),
            new Word("unattractive"),
            new Word("unemployed"),
            new Word("uniform"),
            new Word("universe"),
            new Word("unruly"),
            new Word("unusual"),
            new Word("utensil"),
            new Word("vaccination"),
            new Word("valuable"),
            new Word("variety"),
            new Word("vegetarian"),
            new Word("vehicles"),
            new Word("vitamin"),
            new Word("volcanoes"),
            new Word("walruses"),
            new Word("wardrobe"),
            new Word("warrior"),
            new Word("weather"),
            new Word("whether"),
            new Word("whiskers"),
            new Word("whistle"),
            new Word("wrecked"),
            new Word("wren"),
            new Word("wrench"),
            new Word("wrestling"),
            new Word("wrist"),
            new Word("xerox"),
            new Word("xylophone"),
            new Word("yesterday"),
            new Word("yore"),
            new Word("yourselves"),
            new Word("Yugoslavia"),
            new Word("zealous"),
            new Word("zebra"),
            new Word("zenith"),
            new Word("zodiac"),
            new Word("Zoology")
    };

    private TextToSpeech tts;

    private Button btnSpeak;
    private Button btnNext;
    private Button btnCheck;
    private Button btnReset;
    private EditText txtText;
    private TextView txtView;

    private int correct = 0;
    private int attempt = 0;
    private boolean checkedAnswer = true;

    private Random rand = new Random();

    private int currIdx = rand.nextInt(1000) % wordList.length;

    private void checkAnswer(String answer) {
        int messageResId = 0;

        checkedAnswer = true;

        if (wordList[currIdx].checkSpelling(answer)) {
            messageResId = R.string.correctToast;
            wordList[currIdx].incCorrect();
            correct ++;

            btnSpeak.setEnabled(false);


            Toast.makeText(this,messageResId, Toast.LENGTH_SHORT).show();
        } else {
            messageResId = R.string.incorrectToast;

            Toast.makeText(this, "Awwwh! right spelling is " + wordList[currIdx].getSpelling(), Toast.LENGTH_LONG).show();
        }

        txtView.setText("Score: " + correct + "/" + attempt);

        btnCheck.setEnabled(false);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("KEY_currIdx", currIdx);
        savedInstanceState.putInt("KEY_correct", correct);
        savedInstanceState.putInt("KEY_attempt", attempt);

        savedInstanceState.putBoolean("KEY_checkedAnswer", checkedAnswer);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spell);

        tts = new TextToSpeech(this, this);

        btnSpeak = (Button) findViewById(R.id.btnSpeak);
        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnReset = (Button) findViewById(R.id.btnReset);
        txtText = (EditText) findViewById(R.id.txtText);
        txtView = (TextView) findViewById(R.id.scoreCard);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                attempt = correct = 0;
                checkedAnswer = true;

                txtView.setText("Score: " + correct + "/" + attempt);

                for (int i = 0; i < wordList.length; i++) {
                    wordList[i].setAttempt(0);
                    wordList[i].setCorrect(0);
                }

                currIdx = rand.nextInt(1000) % wordList.length;

                btnSpeak.setEnabled(false);
                btnNext.setEnabled(true);
            }
        });
        // button on click event
        btnSpeak.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                speakOut();

                //btnCheck.setEnabled(true);

                if (checkedAnswer) {
                    attempt ++;
                    checkedAnswer = false;
                }
                txtText.setText(null);
                txtText.setEnabled(true);
            }
        });


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = txtText.getText().toString();
                checkAnswer(answer);

                txtText.setText(null);
                txtText.setEnabled(false);

                btnNext.setEnabled(true);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                while (wordList[currIdx].getAttempt() > 0) {
                    currIdx = (currIdx + rand.nextInt(1000)) % wordList.length;
                }

                Log.d("Spell", "currIdx = " + currIdx + " attempted " + wordList[currIdx].getAttempt() + " " + wordList[currIdx].getSpelling());
                wordList[currIdx].incAttempt();
                // We do not want to pass string to speakOut since
                // it can be called even without going to next word
                speakOut();
                attempt ++;
                checkedAnswer = false;
                txtText.setEnabled(true);

                btnSpeak.setEnabled(true);
                btnNext.setEnabled(false);
                //txtView.setText("Score: " + correct + ":" + attempt);
            }
        });

        txtText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCheck.setEnabled(true);
            }
        });
        txtText.setEnabled(false);
        btnCheck.setEnabled(false);
        btnSpeak.setEnabled(false);

        if (savedInstanceState != null) {
            currIdx = savedInstanceState.getInt("KEY_currIdx", 0);
            correct = savedInstanceState.getInt("KEY_correct", 0);
            attempt = savedInstanceState.getInt("KEY_attempt", 0);

            checkedAnswer = savedInstanceState.getBoolean("KEY_checkedAnswer", checkedAnswer);

            if (!checkedAnswer) {
                btnNext.setEnabled(false);

                btnSpeak.setEnabled(true);
                txtText.setEnabled(true);
                txtView.setText("Score: " + correct + "/" + (attempt-1));
            }
            else {

                currIdx = (currIdx + rand.nextInt(1000)) % wordList.length;
                txtView.setText("Score: " + correct + "/" + attempt);
            }
        }

    }

    @Override
    public void onDestroy() {
        // Don't forget to shutdown!
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onInit(int status) {
        // TODO Auto-generated method stub

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);

            // tts.setPitch(4); // set pitch level

            // tts.setSpeechRate(1); // set speech speed rate

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "Language is not supported");
            }
        } else {
            Log.e("TTS", "Initilization Failed");
        }
    }

    private void speakOut() {

        String text = wordList[currIdx].getSpelling();

        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

}
