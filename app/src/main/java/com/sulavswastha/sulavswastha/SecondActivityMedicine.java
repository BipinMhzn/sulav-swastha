package com.sulavswastha.sulavswastha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class SecondActivityMedicine extends AppCompatActivity {
    Toolbar mToolbar;
    TextView headingdefs,usesdefs,sideeffectdefs,dosagedefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_medicine);

        mToolbar= (Toolbar) findViewById(R.id.toolbar_amedicine);
        headingdefs= (TextView) findViewById(R.id.tvheadingdefs);
        usesdefs= (TextView) findViewById(R.id.tvusesdef);
        sideeffectdefs= (TextView) findViewById(R.id.tvsideeffectdefs);
        dosagedefs= (TextView) findViewById(R.id.tvdosagedefs);

        Bundle bundle=getIntent().getExtras();
        if(bundle !=null){
            mToolbar.setTitle(bundle.getString("MedicineName"));
            if(mToolbar.getTitle().toString().equalsIgnoreCase("Paracetamol")){
                headingdefs.setText("Paracetamol (acetaminophen) is a pain reliever and a fever reducer. The exact mechanism of action of is not known.\n" +
                        "\n" +
                        "Paracetamol is used to treat many conditions such as headache, muscle aches, arthritis, backache, toothaches, colds, and fevers. It relieves pain in mild arthritis but has no effect on the underlying inflammation and swelling of the joint.\n" +
                        "\n" +
                        "Paracetamol may also be used for other purposes not listed in this medication guide.");
                usesdefs.setText("Use paracetamol exactly as directed on the label, or as prescribed by your doctor.\n" +
                        "\n" +
                        "Do not use more of this medication than is recommended. An overdose of paracetamol can cause serious harm. The maximum amount for adults is 1 gram (1000 mg) per dose and 4 grams (4000 mg) per day. Using more paracetamol could cause damage to your liver. If you drink more than three alcoholic beverages per day, talk to your doctor before taking paracetamol and never use more than 2 grams (2000 mg) per day. If you are treating a child, use a pediatric form of paracetamol . Carefully follow the dosing directions on the medicine label. Do not give the medication to a child younger than 2 years old without the advice of a doctor.\n" +
                        "\n" +
                        "Measure the liquid form of paracetamol with a special dose-measuring spoon or cup, not a regular table spoon. If you do not have a dose-measuring device, ask your pharmacist for one. You may need to shake the liquid before each use. Follow the directions on the medicine label.\n" +
                        "\n" +
                        "The paracetamol chewable tablet must be chewed thoroughly before you swallow it.\n" +
                        "\n" +
                        "Make sure your hands are dry when handling the paracetamol disintegrating tablet. Place the tablet on your tongue. It will begin to dissolve right away. Do not swallow the tablet whole. Allow it to dissolve in your mouth without chewing.\n" +
                        "\n" +
                        "To use the paracetamol effervescent granules, dissolve one packet of the granules in at least 4 ounces of water. Stir this mixture and drink all of it right away. To make sure you get the entire dose, add a little more water to the same glass, swirl gently and drink right away.\n" +
                        "\n" +
                        "Do not take a paracetamol rectal suppository by mouth. It is for use only in your rectum. Wash your hands before and after inserting the suppository.\n" +
                        "\n" +
                        "Try to empty your bowel and bladder just before using the paracetamol suppository. Remove the outer wrapper from the suppository before inserting it. Avoid handling the suppository too long or it will melt in your hands.\n" +
                        "\n" +
                        "For best results from the suppository, lie down and insert the suppository pointed tip first into the rectum. Hold in the suppository for a few minutes. It will melt quickly once inserted and you should feel little or no discomfort while holding it in. Avoid using the bathroom just after inserting the suppository.\n" +
                        "\n" +
                        "Stop using paracetamol and call your doctor if:\n" +
                        "\n" +
                        "    you still have a fever after 3 days of use;\n" +
                        "\n" +
                        "    you still have pain after 7 days of use (or 5 days if treating a child);\n" +
                        "\n" +
                        "    you have a skin rash, ongoing headache, or any redness or swelling; or\n" +
                        "\n" +
                        "    if your symptoms get worse, or if you have any new symptoms.\n" +
                        "\n" +
                        "Urine glucose tests may produce false results while you are taking paracetamol . Talk to your doctor if you are diabetic and you notice changes in your glucose levels during treatment.\n" +
                        "\n" +
                        "Store paracetamol at room temperature away from heat and moisture. The rectal suppositories can be stored at room temperature or in the refrigerator.");
                sideeffectdefs.setText("Get emergency medical help if you have any of these signs of an allergic reaction to paracetamol: hives; difficulty breathing; swelling of your face, lips, tongue, or throat. Stop using this medication and call your doctor at once if you have a serious side effect such as:\n" +
                        "\n" +
                        "    low fever with nausea, stomach pain, and loss of appetite;\n" +
                        "\n" +
                        "    dark urine, clay-colored stools; or\n" +
                        "\n" +
                        "    jaundice (yellowing of the skin or eyes).\n" +
                        "\n" +
                        "This is not a complete list of paracetamol side effects and others may occur. Call your doctor for medical advice about side effects. You may report side effects to FDA at 1-800-FDA-1088.");
                dosagedefs.setText("Usual Adult Paracetamol Dose for Fever:\n" +
                        "\n" +
                        "General Dosing Guidelines: 325 to 650 mg every 4 to 6 hours or 1000 mg every 6 to 8 hours orally or rectally.\n" +
                        "\n" +
                        "Paracetamol 500mg tablets: Two 500 mg tablets orally every 4 to 6 hours\n" +
                        "\n" +
                        "Usual Adult Paracetamol Dose for Pain:\n" +
                        "\n" +
                        "General Dosing Guidelines: 325 to 650 mg every 4 to 6 hours or 1000 mg every 6 to 8 hours orally or rectally.\n" +
                        "\n" +
                        "Paracetamol 500mg tablets: Two 500 mg tablets orally every 4 to 6 hours\n" +
                        "\n" +
                        "Usual Pediatric Dose for Fever:\n" +
                        "\n" +
                        "Oral or Rectal:\n" +
                        "\n" +
                        "<=1 month: 10 to 15 mg/kg/dose every 6 to 8 hours as needed.\n" +
                        "\n" +
                        ">1 month to 12 years: 10 to 15 mg/kg/dose every 4 to 6 hours as needed (Maximum: 5 doses in 24 hours)\n" +
                        "\n" +
                        "Fever: 4 months to 9 years: Initial Dose: 30 mg/kg (Reported by one study (n=121) to be more effective in reducing fever than a 15 mg/kg maintenance dose with no difference regarding clinical tolerance.)\n" +
                        "\n" +
                        ">=12 years: 325 to 650 mg every 4 to 6 hours or 1000 mg every 6 to 8 hours.\n" +
                        "\n" +
                        "Usual Pediatric Dose for Pain:\n" +
                        "\n" +
                        "Oral or Rectal:\n" +
                        "\n" +
                        "<=1 month: 10 to 15 mg/kg/dose every 6 to 8 hours as needed.\n" +
                        "\n" +
                        ">1 month to 12 years: 10 to 15 mg/kg/dose every 4 to 6 hours as needed (Maximum: 5 doses in 24 hours)\n" +
                        "\n" +
                        "Fever: 4 months to 9 years: Initial Dose: 30 mg/kg (Reported by one study (n=121) to be more effective in reducing fever than a 15 mg/kg maintenance dose with no difference regarding clinical tolerance.)\n" +
                        "\n" +
                        ">=12 years: 325 to 650 mg every 4 to 6 hours or 1000 mg every 6 to 8 hours.");
            }
            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Pantoprazole")){
                headingdefs.setText("Pantoprazole is a proton pump inhibitor that decreases the amount of acid produced in the stomach.\n" +
                        "\n" +
                        "Pantoprazole is used to treat erosive esophagitis (damage to the esophagus from stomach acid), and other conditions involving excess stomach acid such as Zollinger-Ellison syndrome.\n" +
                        "\n" +
                        "Pantoprazole is not for immediate relief of heartburn symptoms.");
                usesdefs.setText("Pantoprazole is used to treat certain stomach and esophagus problems (such as acid reflux). It works by decreasing the amount of acid your stomach makes. This medication relieves symptoms such as heartburn, difficulty swallowing, and persistent cough. It helps heal acid damage to the stomach and esophagus, helps prevent ulcers, and may help prevent cancer of the esophagus. Pantoprazole belongs to a class of drugs known as proton pump inhibitors (PPIs).");
                sideeffectdefs.setText("Get emergency medical help if you have signs of an allergic reaction to pantoprazole: hives; difficulty breathing; swelling of your face, lips, tongue, or throat.\n" +
                        "\n" +
                        "Call your doctor at once if you have:\n" +
                        "\n" +
                        "    severe stomach pain, nausea, vomiting, and weight loss;\n" +
                        "\n" +
                        "    diarrhea that is watery or bloody;\n" +
                        "\n" +
                        "    seizure (convulsions);\n" +
                        "\n" +
                        "    bruising or swelling where the medicine was injected;\n" +
                        "\n" +
                        "    new or worsening symptoms of lupus- joint pain or swelling with a butterfly-shaped skin rash on your cheeks and nose (worsens in sunlight);\n" +
                        "\n" +
                        "    kidney problems - urinating less than usual, blood in your urine, swelling, rapid weight gain; or\n" +
                        "\n" +
                        "    symptoms of low magnesium - dizziness; fast heartbeats; tremors (shaking) or jerking muscle movements; feeling jittery; muscle cramps, muscle spasms in your hands and feet; cough or choking feeling.\n" +
                        "\n" +
                        "Common pantoprazole side effects may include:\n" +
                        "\n" +
                        "    headache, dizziness;\n" +
                        "\n" +
                        "    mild diarrhea;\n" +
                        "\n" +
                        "    stomach pain, gas, nausea, vomiting;\n" +
                        "\n" +
                        "    fever;\n" +
                        "\n" +
                        "    cold symptoms such as stuffy nose, sneezing, sore throat;\n" +
                        "\n" +
                        "    rash; or\n" +
                        "\n" +
                        "    joint pain.\n");
                dosagedefs.setText("Usual Adult Dose for Erosive Esophagitis:\n" +
                        "\n" +
                        "Treatment of Erosive Esophagitis:\n" +
                        "40 mg orally once a day for up to 8 weeks; however an additional 8 weeks may be considered for patients who have not healed after the initial treatment. Safety and efficacy beyond 16 weeks of therapy have not been established.\n" +
                        "\n" +
                        "Maintenance of Healing of Erosive Esophagitis:\n" +
                        "40 mg orally once a day. Controlled studies have been limited to 12 months of pantoprazole therapy.\n" +
                        "\n" +
                        "Usual Adult Dose for Gastroesophageal Reflux Disease:\n" +
                        "\n" +
                        "Parenteral: 40 mg once a day for 7 to 10 days, administered via intravenous infusion over a period of 15 minutes. Intravenous therapy should be discontinued as soon as the patient is able to resume oral therapy.\n" +
                        "\n" +
                        "Oral: 40 mg orally once a day, for short-term administration (up to 8 weeks); however an additional 8 weeks may be considered for patients who have not healed after the initial treatment. Safety and efficacy beyond 16 weeks of therapy have not been established.\n" +
                        "\n" +
                        "Usual Adult Dose for Duodenal Ulcer:\n" +
                        "\n" +
                        "Study (n=54)\n" +
                        "40 mg orally once a day, dose was increased every 12 weeks by 40 mg increments to a maximum of 120 mg per day, for 28 weeks. Data have revealed that monotherapy with daily doses of 40 mg have been associated with complete duodenal ulcer healing in up to 87% and 94% of patients after 4 weeks and 8 weeks respectively.\n" +
                        "\n" +
                        "Usual Adult Dose for Gastric Ulcer:\n" +
                        "\n" +
                        "40 mg orally once a day. Data have revealed that monotherapy with daily doses of 40 mg have been associated with complete gastric ulcer healing in up to 87% and 97% of patients after 4 weeks and 8 weeks respectively.\n" +
                        "\n" +
                        "Usual Adult Dose for Helicobacter pylori Infection:\n" +
                        "\n" +
                        "Study (n=242) - Triple therapy:\n" +
                        "40 mg orally twice daily for 7 days, commonly in conjunction with clarithromycin and either amoxicillin or metronidazole to eradicate Helicobacter pylori, followed with 40 mg pantoprazole orally once daily until day 28. Triple therapy has resulted in eradication rates of greater than 95%.\n" +
                        "\n" +
                        "The QUADRATE Study (n=405) - Quadruple therapy:\n" +
                        "40 mg orally twice daily for 7 days, concomitantly with bismuth subcitrate and tetracycline, both four times daily, and metronidazole 200 mg three times daily and 400 mg at bedtime. Helicobacter Pylori eradication was achieved in 82% of patients.\n" +
                        "\n" +
                        "Usual Adult Dose for Zollinger-Ellison Syndrome:\n" +
                        "\n" +
                        "Parenteral: 80 mg every 12 hours, administered by 15-minute infusion. Daily doses higher than 240 mg administered in equally divided doses by 15-minute infusion, or administered for more than 6 days have not been studied.\n" +
                        "\n" +
                        "Oral: 40 mg twice daily, to a maximum of 240 mg per day. Some patients have received treatment with pantoprazole for more than 2 years.\n" +
                        "\n" +
                        "Usual Adult Dose for Stress Ulcer Prophylaxis:\n" +
                        "\n" +
                        "Study (n=21) - Stress Ulcer bleeding prophylaxis in the Critical Care Setting:\n" +
                        "80 mg twice daily, as a bolus infusion over a period of 15 minutes, to a maximum daily dose of 240 mg, divided into three equal doses.\n" +
                        "\n" +
                        "Study (n=20 ) - Peptic Ulcer rebleeding prophylaxis after hemostasis in the Critical Care Setting:\n" +
                        "80 mg IV bolus, followed by continuous infusion of 8 mg/hr for 3 days, after which therapy may be continued with an oral PPI.\n" +
                        "\n" +
                        "Usual Adult Dose for Peptic Ulcer:\n" +
                        "\n" +
                        "Study (n=21) - Stress Ulcer bleeding prophylaxis in the Critical Care Setting:\n" +
                        "80 mg twice daily, as a bolus infusion over a period of 15 minutes, to a maximum daily dose of 240 mg, divided into three equal doses.\n" +
                        "\n" +
                        "Study (n=20 ) - Peptic Ulcer rebleeding prophylaxis after hemostasis in the Critical Care Setting:\n" +
                        "80 mg IV bolus, followed by continuous infusion of 8 mg/hr for 3 days, after which therapy may be continued with an oral PPI.");
            }

            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Aspirin")){
                headingdefs.setText("Aspirin is a salicylate (sa-LIS-il-ate). It works by reducing substances in the body that cause pain, fever, and inflammation.\n" +
                        "\n" +
                        "Aspirin is used to treat pain, and reduce fever or inflammation. It is sometimes used to treat or prevent heart attacks, strokes, and chest pain (angina).\n" +
                        "\n" +
                        "Aspirin should be used for cardiovascular conditions only under the supervision of a doctor.");
                usesdefs.setText("Take aspirin exactly as directed on the label, or as prescribed by your doctor. Do not use in larger or smaller amounts or for longer than recommended.\n" +
                        "\n" +
                        "Take with food if aspirin upsets your stomach.\n" +
                        "\n" +
                        "Do not crush, chew, break, or open an enteric-coated or delayed-release pill. Swallow it whole.\n" +
                        "\n" +
                        "The chewable tablet form must be chewed before swallowing.\n" +
                        "\n" +
                        "If you use the orally disintegrating tablet or the dispersible tablet, follow all dosing instructions provided with your medicine.\n" +
                        "\n" +
                        "If you need surgery, tell the surgeon ahead of time that you are using this medicine. You may need to stop using it for a short time.\n" +
                        "\n" +
                        "Do not take this medicine if you smell a strong vinegar odor in the bottle. The medicine may no longer be effective.\n" +
                        "\n" +
                        "Store at room temperature away from moisture and heat.");
                sideeffectdefs.setText("Get emergency medical help if you have signs of an allergic reaction to aspirin: hives; difficult breathing; swelling of your face, lips, tongue, or throat.\n" +
                        "\n" +
                        "Stop using this medicine and call your doctor at once if you have:\n" +
                        "\n" +
                        "    ringing in your ears, confusion, hallucinations, rapid breathing, seizure (convulsions);\n" +
                        "\n" +
                        "    severe nausea, vomiting, or stomach pain;\n" +
                        "\n" +
                        "    bloody or tarry stools, coughing up blood or vomit that looks like coffee grounds;\n" +
                        "\n" +
                        "    fever lasting longer than 3 days; or\n" +
                        "\n" +
                        "    swelling, or pain lasting longer than 10 days.\n" +
                        "\n" +
                        "Common aspirin side effects may include:\n" +
                        "\n" +
                        "    upset stomach, heartburn;\n" +
                        "\n" +
                        "    drowsiness; or\n" +
                        "\n" +
                        "    mild headache.\n" +
                        "\n" +
                        "This is not a complete list of side effects and others may occur. Call your doctor for medical advice about side effects. ");
                dosagedefs.setText("oral tablet, extended release, oral tablet, oral delayed release tablet, oral tablet, chewable, rectal suppository, compounding powder, oral tablet, disintegrating, oral tablet, dispersible, oral powder for reconstitution, oral gum, oral delayed release capsule, oral capsule, extended release");
            }

            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Ibuprofen")){
                headingdefs.setText("Ibuprofen is a nonsteroidal anti-inflammatory drug (NSAID). It works by reducing hormones that cause inflammation and pain in the body.\n" +
                        "\n" +
                        "Ibuprofen is used to reduce fever and treat pain or inflammation caused by many conditions such as headache, toothache, back pain, arthritis, menstrual cramps, or minor injury.\n" +
                        "\n" +
                        "Ibuprofen is used in adults and children who are at least 6 months old.");
                usesdefs.setText("Use ibuprofen exactly as directed on the label, or as prescribed by your doctor. Do not use in larger amounts or for longer than recommended. Use the lowest dose that is effective in treating your condition.\n" +
                        "\n" +
                        "Do not take more than your recommended dose. An ibuprofen overdose can damage your stomach or intestines. The maximum amount of ibuprofen for adults is 800 milligrams per dose or 3200 mg per day (4 maximum doses). Use only the smallest amount needed to get relief from your pain, swelling, or fever.\n" +
                        "\n" +
                        "A child's dose of ibuprofen is based on the age and weight of the child. Carefully follow the dosing instructions provided with your child's medicine for the age and weight of your child. Ask a doctor or pharmacist if you have questions.\n" +
                        "\n" +
                        "Take ibuprofen with food or milk to lessen stomach upset.\n" +
                        "\n" +
                        "Shake the oral suspension (liquid) well just before you measure a dose. Measure liquid medicine with the dosing syringe provided, or with a special dose-measuring spoon or medicine cup. If you do not have a dose-measuring device, ask your pharmacist for one.\n" +
                        "\n" +
                        "The ibuprofen chewable tablet must be chewed before you swallow it.\n" +
                        "\n" +
                        "If you use this medicine long-term, you may need frequent medical tests.\n" +
                        "\n" +
                        "Store at room temperature away from moisture and heat. Do not allow the liquid medicine to freeze.");
                sideeffectdefs.setText("Get emergency medical help if you have signs of an allergic reaction to ibuprofen: sneezing, runny or stuffy nose; wheezing or trouble breathing; hives; swelling of your face, lips, tongue, or throat.\n" +
                        "\n" +
                        "Get emergency medical help if you have signs of a heart attack or stroke: chest pain spreading to your jaw or shoulder, sudden numbness or weakness on one side of the body, slurred speech, leg swelling, feeling short of breath.\n" +
                        "\n" +
                        "Stop using ibuprofen and call your doctor at once if you have:\n" +
                        "\n" +
                        "    changes in your vision;\n" +
                        "\n" +
                        "    shortness of breath (even with mild exertion);\n" +
                        "\n" +
                        "    swelling or rapid weight gain;\n" +
                        "\n" +
                        "    the first sign of any skin rash, no matter how mild;\n" +
                        "\n" +
                        "    signs of stomach bleeding - bloody or tarry stools, coughing up blood or vomit that looks like coffee grounds;\n" +
                        "\n" +
                        "    liver problems - nausea, upper stomach pain, itching, tired feeling, flu-like symptoms, loss of appetite, dark urine, clay-colored stools, jaundice (yellowing of the skin or eyes);\n" +
                        "\n" +
                        "    kidney problems - little or no urinating, painful or difficult urination, swelling in your feet or ankles, feeling tired or short of breath;\n" +
                        "\n" +
                        "    low red blood cells (anemia) - pale skin, feeling light-headed or short of breath, rapid heart rate, trouble concentrating; or\n" +
                        "\n" +
                        "    severe skin reaction - fever, sore throat, swelling in your face or tongue, burning in your eyes, skin pain followed by a red or purple skin rash that spreads (especially in the face or upper body) and causes blistering and peeling.\n" +
                        "\n" +
                        "Common ibuprofen side effects may include:\n" +
                        "\n" +
                        "    upset stomach, mild heartburn, nausea, vomiting;\n" +
                        "\n" +
                        "    bloating, gas, diarrhea, constipation;\n" +
                        "\n" +
                        "    dizziness, headache, nervousness;\n" +
                        "\n" +
                        "    mild itching or rash; or\n" +
                        "\n" +
                        "    ringing in your ears.\n");
                dosagedefs.setText("oral suspension, oral tablet, oral tablet, chewable, oral capsule, compounding powder, intravenous solution");
            }

            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Penicillin")){
                headingdefs.setText("Penicillin V is an antibiotic in the penicillin group of drugs. It fights bacteria in your body.\n" +
                        "\n" +
                        "Penicillin V is used to treat many different types of infections caused by bacteria, such as ear infections,.\n" +
                        "\n" +
                        "Penicillin V may also be used for other purposes not listed in this medication guide.");
                usesdefs.setText("Take penicillin V exactly as it was prescribed for you. Do not take the medication in larger amounts, or take it for longer than recommended by your doctor. Follow the directions on your prescription label.\n" +
                        "\n" +
                        "You may take penicillin V with or without food.\n" +
                        "\n" +
                        "To be sure penicillin V is helping your condition, your blood will need to be tested on a regular basis. Your kidney or liver function may also need to be tested. Do not miss any scheduled visits to your doctor.\n" +
                        "\n" +
                        "Shake the oral suspension (liquid) well just before you measure a dose. To be sure you get the correct dose, measure the liquid with a marked measuring spoon or medicine cup, not with a regular table spoon. If you do not have a dose-measuring device, ask your pharmacist for one.\n" +
                        "\n" +
                        "Take penicillin V for the entire length of time prescribed by your doctor. Your symptoms may get better before the infection is completely treated. Penicillin V will not treat a viral infection such as the common cold or flu. Do not give this medicine to another person, even if they have the same symptoms you do.\n" +
                        "\n" +
                        "Penicillin V can cause you to have unusual results with certain medical tests. Tell any doctor who treats you that you are using penicillin V.\n" +
                        "\n" +
                        "Store penicillin V tablets at room temperature away from moisture, heat, and light. Store liquid penicillin V in a refrigerator but do not allow it to freeze. Throw away any liquid that has not been used within 14 days after it was mixed at the pharmacy.");
                sideeffectdefs.setText("Get emergency medical help if you have any of these signs of an allergic reaction to penicillin V: hives; difficulty breathing; swelling of your face, lips, tongue, or throat. Call your doctor at once if you have any of these serious side effects:\n" +
                        "\n" +
                        "    diarrhea that is watery or bloody;\n" +
                        "\n" +
                        "    fever, chills, body aches, flu symptoms;\n" +
                        "\n" +
                        "    easy bruising or bleeding, unusual weakness;\n" +
                        "\n" +
                        "    urinating less than usual or not at all;\n" +
                        "\n" +
                        "    severe skin rash, itching, or peeling;\n" +
                        "\n" +
                        "    agitation, confusion, unusual thoughts or behavior; or\n" +
                        "\n" +
                        "    seizure (black-out or convulsions).\n" +
                        "\n" +
                        "Less serious penicillin V side effects are more likely to occur, such as:\n" +
                        "\n" +
                        "    nausea, vomiting, stomach pain;\n" +
                        "\n" +
                        "    vaginal itching or discharge;\n" +
                        "\n" +
                        "    headache;\n" +
                        "\n" +
                        "    swollen, black, or \"hairy\" tongue; or\n" +
                        "\n" +
                        "    thrush (white patches or inside your mouth or throat).\n");
                dosagedefs.setText("Penicillin V Potassium (oral tablet, oral powder for reconstitution)");
            }

            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Azithromycin")){
                headingdefs.setText("Azithromycin is an antibiotic that fights bacteria.\n" +
                        "\n" +
                        "Azithromycin is used to treat many different types of infections caused by bacteria, such as respiratory infections, skin infections, ear infections, and sexually transmitted diseases.\n" +
                        "\n" +
                        "Azithromycin may also be used for purposes not listed in this medication guide.");
                usesdefs.setText("Take azithromycin exactly as prescribed by your doctor. Follow all directions on your prescription label. Do not take this medicine in larger or smaller amounts or for longer than recommended. The dose and length of treatment may not be the same for every type of infection.\n" +
                        "\n" +
                        "You may take most forms of azithromycin with or without food.\n" +
                        "\n" +
                        "Take Zmax extended release liquid (oral suspension) on an empty stomach, at least 1 hour before or 2 hours after a meal.\n" +
                        "\n" +
                        "To use the oral suspension single dose packet: Open the packet and pour the medicine into 2 ounces of water. Stir this mixture and drink all of it right away. Do not save for later use. To make sure you get the entire dose, add a little more water to the same glass, swirl gently and drink right away.\n" +
                        "\n" +
                        "Throw away any mixed Zmax oral suspension that has not been used within 12 hours.\n" +
                        "\n" +
                        "Shake the oral suspension (liquid) well just before you measure a dose. Measure liquid medicine with the dosing syringe provided, or with a special dose-measuring spoon or medicine cup. If you do not have a dose-measuring device, ask your pharmacist for one.\n" +
                        "\n" +
                        "Use this medicine for the full prescribed length of time. Your symptoms may improve before the infection is completely cleared. Skipping doses may also increase your risk of further infection that is resistant to antibiotics. Azithromycin will not treat a viral infection such as the flu or a common cold.\n" +
                        "\n" +
                        "Store at room temperature away from moisture and heat. Throw away any unused liquid medicine after 10 days");
                sideeffectdefs.setText("Get emergency medical help if you have signs of an allergic reaction to azithromycin: (hives, difficult breathing, swelling in your face or throat) or a severe skin reaction (fever, sore throat, burning in your eyes, skin pain, red or purple skin rash that spreads and causes blistering and peeling).\n" +
                        "\n" +
                        "Seek medical treatment if you have a serious drug reaction that can affect many parts of your body. Symptoms may include: skin rash, fever, swollen glands, flu-like symptoms, muscle aches, severe weakness, unusual bruising, or yellowing of your skin or eyes. This reaction may occur several weeks after you began using azithromycin.\n" +
                        "\n" +
                        "Call your doctor at once if you have:\n" +
                        "\n" +
                        "    severe stomach pain, diarrhea that is watery or bloody;\n" +
                        "\n" +
                        "    fast or pounding heartbeats, fluttering in your chest, shortness of breath, and sudden dizziness (like you might pass out); or\n" +
                        "\n" +
                        "    liver problems - nausea, upper stomach pain, itching, tired feeling, loss of appetite, dark urine, clay-colored stools, jaundice (yellowing of the skin or eyes).\n" +
                        "\n" +
                        "Call your doctor right away if a baby taking azithromycin becomes irritable or vomits while eating or nursing.\n" +
                        "\n" +
                        "Older adults may be more likely to have side effects on heart rhythm, including a life-threatening fast heart rate.\n" +
                        "\n" +
                        "Common azithromycin side effects may include:\n" +
                        "\n" +
                        "    diarrhea;\n" +
                        "\n" +
                        "    nausea, vomiting, stomach pain; or\n" +
                        "\n" +
                        "    headache.\n");
                dosagedefs.setText("Azithromycin (intravenous powder for injection, oral capsule, oral powder for reconstitution, oral tablet, oral powder for reconstitution, extended release)");
            }

            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Ciprofloxacin")){
                headingdefs.setText("Ciprofloxacin is a fluoroquinolone (flor-o-KWIN-o-lone) antibiotic that fights bacteria in the body.\n" +
                        "\n" +
                        "Ciprofloxacin is used to treat different types of bacterial infections. It is also used to treat people who have been exposed to anthrax or certain types of plague.\n" +
                        "\n" +
                        "Fluoroquinolone antibiotics can cause serious or disabling side effects. Ciprofloxacin should be used only for infections that cannot be treated with a safer antibiotic.");
                usesdefs.setText("Ciprofloxacin is usually taken every 12 hours. Follow all directions on your prescription label. Do not take this medicine in larger or smaller amounts or for longer than recommended.\n" +
                        "\n" +
                        "Take with water, and drink extra fluids to keep your kidneys working properly.\n" +
                        "\n" +
                        "Ciprofloxacin may be taken with or without food, but take it at the same time each day.\n" +
                        "\n" +
                        "Shake the oral suspension (liquid) for 15 seconds just before you measure a dose. Measure liquid medicine with the dosing syringe provided, or with a special dose-measuring spoon or medicine cup. If you do not have a dose-measuring device, ask your pharmacist for one. Do not give the oral suspension through a feeding tube.\n" +
                        "\n" +
                        "Do not crush, chew, or break an extended-release tablet. Swallow it whole.\n" +
                        "\n" +
                        "Use this medicine for the full prescribed length of time. Your symptoms may improve before the infection is completely cleared. Skipping doses may also increase your risk of further infection that is resistant to antibiotics. Ciprofloxacin will not treat a viral infection such as the flu or a common cold.\n" +
                        "\n" +
                        "Do not share this medicine with another person, even if they have the same symptoms you have.\n" +
                        "\n" +
                        "Store at room temperature away from moisture and heat. Do not allow the liquid medicine to freeze. Throw away any unused liquid after 14 days.");
                sideeffectdefs.setText("Get emergency medical help if you have signs of an allergic reaction to ciprofloxacin: hives, or the first sign of a skin rash; fast heartbeat, difficult breathing; swelling of your face, lips, tongue, or throat.\n" +
                        "\n" +
                        "Ciprofloxacin may cause your tendons to swell or cause tendon rupture. It can also have serious effects on your nerves, and may cause permanent nerve damage. Stop using this medicine and call your doctor at once if you have:\n" +
                        "\n" +
                        "    signs of tendon rupture - sudden pain, swelling, bruising, tenderness, stiffness, movement problems, or a snapping or popping sound in any of your joints (rest the joint until you receive medical care or instructions); or\n" +
                        "\n" +
                        "    nerve symptoms - numbness, tingling, burning pain, or being more sensitive to temperature, light touch, or the sense of your body position.\n" +
                        "\n" +
                        "Also, stop using this medicine and call your doctor at once if you have:\n" +
                        "\n" +
                        "    severe stomach pain, diarrhea that is watery or bloody;\n" +
                        "\n" +
                        "    a headache with chest pain and severe dizziness and fast or pounding heartbeats;\n" +
                        "\n" +
                        "    the first sign of any skin rash, no matter how mild;\n" +
                        "\n" +
                        "    confusion, hallucinations, nightmares, paranoia, depression, thoughts about hurting yourself;\n" +
                        "\n" +
                        "    muscle weakness or trouble breathing;\n" +
                        "\n" +
                        "    ongoing headaches (sometimes with blurred vision);\n" +
                        "\n" +
                        "    tremors, anxiety, trouble sleeping, feeling restless or nervous;\n" +
                        "\n" +
                        "    a light-headed feeling, like you might pass out;\n" +
                        "\n" +
                        "    increased pressure inside the skull - severe headaches, ringing in your ears, dizziness, vision problems, pain behind your eyes;\n" +
                        "\n" +
                        "    liver problems - nausea, vomiting, loss of appetite, upper stomach pain, itching, fever, tiredness, dark urine, clay-colored stools, jaundice (yellowing of the skin or eyes); or\n" +
                        "\n" +
                        "    severe skin reaction - fever, sore throat, swelling in your face or tongue, burning in your eyes, skin pain, followed by a red or purple skin rash that spreads (especially in the face or upper body) and causes blistering and peeling.\n" +
                        "\n" +
                        "Common ciprofloxacin side effects may include:\n" +
                        "\n" +
                        "    nausea, vomiting, diarrhea;\n" +
                        "\n" +
                        "    rash; or\n" +
                        "\n" +
                        "    abnormal liver function tests.\n");
                dosagedefs.setText("Ciprofloxacin (oral tablet, intravenous solution, oral powder for reconstitution, oral tablet, extended release)");
            }

            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Fluconazole")){
                headingdefs.setText("Fluconazole is an antifungal medicine.\n" +
                        "\n" +
                        "Fluconazole is used to treat infections caused by fungus, which can invade any part of the body including the mouth, throat, esophagus, lungs, bladder, genital area, and the blood.\n" +
                        "\n" +
                        "Fluconazole is also used to prevent fungal infection in people who have a weak immune system caused by cancer treatment, bone marrow transplant, or diseases such as AIDS.");
                usesdefs.setText("\n" +
                        "    It is used to treat fungal infections.\n" +
                        "    It is used to prevent fungal infections.\n" +
                        "    This medicine is used to treat vaginal yeast infections.\n" +
                        "    It may be given to you for other reasons. Talk with the doctor.\n");
                sideeffectdefs.setText(" WARNING/CAUTION: Even though it may be rare, some people may have very bad and sometimes deadly side effects when taking a drug. Tell your doctor or get medical help right away if you have any of the following signs or symptoms that may be related to a very bad side effect:\n" +
                        "\n" +
                        "    Signs of an allergic reaction, like rash; hives; itching; red, swollen, blistered, or peeling skin with or without fever; wheezing; tightness in the chest or throat; trouble breathing or talking; unusual hoarseness; or swelling of the mouth, face, lips, tongue, or throat.\n" +
                        "    Signs of liver problems like dark urine, feeling tired, not hungry, upset stomach or stomach pain, light-colored stools, throwing up, or yellow skin or eyes.\n" +
                        "    A type of abnormal heartbeat (prolonged QT interval) can happen with this medicine (fluconazole tablets). Call your doctor right away if you have a fast heartbeat, a heartbeat that does not feel normal, or if you pass out.\n" +
                        "\n" +
                        "What are some other side effects of Fluconazole Tablets?\n" +
                        "\n" +
                        "All drugs may cause side effects. However, many people have no side effects or only have minor side effects. Call your doctor or get medical help if any of these side effects or any other side effects bother you or do not go away:\n" +
                        "\n" +
                        "    Headache.\n" +
                        "    Belly pain.\n" +
                        "    Upset stomach or throwing up.\n" +
                        "    Dizziness.\n" +
                        "    Change in taste.\n" +
                        "    Loose stools (diarrhea).\n");
                dosagedefs.setText("Fluconazole (intravenous solution, oral tablet, oral powder for reconstitution)");
            }

            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Tramadol")){
                headingdefs.setText("Tramadol is a narcotic-like pain reliever.\n" +
                        "\n" +
                        "Tramadol is used to treat moderate to severe pain.\n" +
                        "\n" +
                        "The extended-release form of tramadol is for around-the-clock treatment of pain. The extended-release form of tramadol is not for use on an as-needed basis for pain.");
                usesdefs.setText("Take tramadol exactly as prescribed. Follow all directions on your prescription label. Tramadol can slow or stop your breathing, especially when you start using this medicine or whenever your dose is changed. Never take this medicine in larger amounts, or for longer than prescribed. Tell your doctor if the medicine seems to stop working as well in relieving your pain.\n" +
                        "\n" +
                        "Tramadol may be habit-forming, even at regular doses. Never share this medicine with another person, especially someone with a history of drug abuse or addiction. MISUSE OF PAIN MEDICATION CAN CAUSE ADDICTION, OVERDOSE, OR DEATH, especially in a child or other person using the medicine without a prescription. Selling or giving away this medicine is against the law.\n" +
                        "\n" +
                        "Stop taking all other around-the-clock narcotic pain medications when you start taking tramadol.\n" +
                        "\n" +
                        "Tramadol can be taken with or without food, but take it the same way each time.\n" +
                        "\n" +
                        "Do not crush, break, or open an extended-release tablet or capsule (ConZip, Ultram ER). Swallow it whole to avoid exposure to a potentially fatal dose.\n" +
                        "\n" +
                        "Never crush or break a tablet inhale the powder or mix it into a liquid to inject the drug into your vein. This practice has resulted in death.\n" +
                        "\n" +
                        "If you use the tramadol extended-release tablet, the tablet shell may pass into your stools (bowel movements). This is normal and does not mean that you are not receiving enough of the medicine.\n" +
                        "\n" +
                        "Do not stop using this medicine suddenly, or you could have unpleasant withdrawal symptoms. Ask your doctor how to safely stop using this medicine.\n" +
                        "\n" +
                        "Store at room temperature away from moisture and heat. Keep track of your medicine. Tramadol is a drug of abuse and you should be aware if anyone is using your medicine improperly or without a prescription.\n" +
                        "\n" +
                        "Do not keep leftover opioid medication. Just one dose can cause death in someone using this medicine accidentally or improperly. Ask your pharmacist where to locate a drug take-back disposal program. If there is no take-back program, flush the unused medicine down the toilet.");
                sideeffectdefs.setText("Get emergency medical help if you have signs of an allergic reaction to tramadol (hives, difficult breathing, swelling in your face or throat) or a severe skin reaction (fever, sore throat, burning in your eyes, skin pain, red or purple skin rash that spreads and causes blistering and peeling).\n" +
                        "\n" +
                        "Like other narcotic medicines, tramadol can slow your breathing. Death may occur if breathing becomes too weak.\n" +
                        "\n" +
                        "A person caring for you should seek emergency medical attention if you have slow breathing with long pauses, blue colored lips, or if you are hard to wake up.\n" +
                        "\n" +
                        "Call your doctor at once if you have:\n" +
                        "\n" +
                        "    noisy breathing, sighing, shallow breathing;\n" +
                        "\n" +
                        "    a slow heart rate or weak pulse;\n" +
                        "\n" +
                        "    a light-headed feeling, like you might pass out;\n" +
                        "\n" +
                        "    seizure (convulsions);\n" +
                        "\n" +
                        "    missed menstrual periods;\n" +
                        "\n" +
                        "    impotence, sexual problems, loss of interest in sex; or\n" +
                        "\n" +
                        "    low cortisol levels - nausea, vomiting, loss of appetite, dizziness, worsening tiredness or weakness.\n" +
                        "\n" +
                        "Seek medical attention right away if you have symptoms of serotonin syndrome, such as: agitation, hallucinations, fever, sweating, shivering, fast heart rate, muscle stiffness, twitching, loss of coordination, nausea, vomiting, or diarrhea.\n" +
                        "\n" +
                        "Serious side effects may be more likely in older adults and those who are overweight, malnourished, or debilitated.\n" +
                        "\n" +
                        "Long-term use of opioid medication may affect fertility (ability to have children) in men or women. It is not known whether opioid effects on fertility are permanent.\n" +
                        "\n" +
                        "Common tramadol side effects may include:\n" +
                        "\n" +
                        "    headache, dizziness, drowsiness, tired feeling;\n" +
                        "\n" +
                        "    constipation, diarrhea, nausea, vomiting, stomach pain;\n" +
                        "\n" +
                        "    feeling nervous or anxious; or\n" +
                        "\n" +
                        "    itching, sweating, flushing (warmth, redness, or tingly feeling).\n");
                dosagedefs.setText("Tramadol (oral tablet, oral tablet, extended release, oral capsule, extended release, oral tablet, disintegrating)");
            }

            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Ketorolac")){
                headingdefs.setText("");
                usesdefs.setText("");
                sideeffectdefs.setText("");
                dosagedefs.setText("");
            }

            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Diazepam")){
                headingdefs.setText("");
                usesdefs.setText("");
                sideeffectdefs.setText("");
                dosagedefs.setText("");
            }
        }

    }
}
