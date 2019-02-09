package com.sulavswastha.sulavswastha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Toolbar mToolbar;
    TextView headingdef,symptomsdef,diagnosisdef,preventiondef,treatmentsdef,riskfactordef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mToolbar = (Toolbar) findViewById(R.id.toolbar_adisease);

            headingdef= (TextView) findViewById(R.id.tvheadingdef);
            symptomsdef= (TextView) findViewById(R.id.tvsymptomsdef);
            diagnosisdef= (TextView) findViewById(R.id.tvdiagnosisdef);
            preventiondef= (TextView) findViewById(R.id.tvpreventiondef);
            treatmentsdef= (TextView) findViewById(R.id.tvtreatmentsdef);
            riskfactordef= (TextView) findViewById(R.id.tvriskfactorsdef);

            Bundle bundle=getIntent().getExtras();
            if(bundle !=null){
               mToolbar.setTitle(bundle.getString("DiseaseName"));
                if(mToolbar.getTitle().toString().equalsIgnoreCase("Anthrax")){
                    headingdef.setText("Anthrax is a serious infectious disease caused by gram-positive, rod-shaped bacteria known as Bacillus anthracis. Anthrax can be found naturally in soil and commonly affects domestic and wild animals around the world. Contact with anthrax can cause severe illness in both humans and animals. Anthrax is not contagious, which means you can’t catch it like the cold or flu. \n" +
                            "People get infected with anthrax when spores get into the body. When anthrax spores get inside the body, they can be “activated.” When they become active, the bacteria can multiply, spread out in the body, produce toxins (poisons) and cause severe illnesss.This can happen when people breathe in spores, eat food or drink water that is contaminated with spores, or get spores in a cut or scrape in the skin");
                    symptomsdef.setText("Localized: A painless skin sore (ulcer) with a black center that appears after the small blisters or bumps. Most often the sore will be on the face, neck, arms, or hands\n" +
                            "\n" +"Generalized: \n"+ "Fever and chills \nSwollen neck glands \nChest Discomfort \nShortness of breath \nConfusion or dizziness \nCough \nHoarseness\nNausea, vomiting, or stomach pains \nHeadache\nSweats (often drenching) \nExtreme tiredness and body aches \nSwelling of abdomen" );
                    diagnosisdef.setText("To measure antibodies or toxin in blood\nTo test directly for Bacillus anthracis in a sample blood \nskin lesion swab \nspinal fluid \nrespiratory secretions \nSamples must be taken before the patient begins taking antibiotics for treatment. \nXray");
                    preventiondef.setText("Use of respirators\nprotective clothing\nthe anthrax vaccine by people at risk");
                    treatmentsdef.setText("All types of anthrax can be prevented and treated. The treatment should be seek as early as possible\n \nAntibiotics \nAntitoxins");
                    riskfactordef.setText("People Who Handle Animal Products\nVeterinarians\nLivestock producers\nTraveler \nLaboratory Professionals \nMail handlers, military personnel, and response workers who may be exposed during a bioterror event involving anthrax spores");
                }
                else if(mToolbar.getTitle().toString().equalsIgnoreCase("Cushing Syndrome")){
                    headingdef.setText("When adrenal glands produce excessive amounts of corticosteroids in the body, it leads to Cushing’s syndrome. Cushing's syndrome is a collection of signs and symptoms due to prolonged exposure to corticosteroids.");
                    symptomsdef.setText("The following are the most common symptoms of Cushing's syndrome. However, each individual may experience symptoms differently. Symptoms may include: \nWeight gain \nBuffalo hump: fat deposit between shoulders \nRound face: fat deposition in face \nStriae on the skins \nThinning arms and legs \nFragile and thin skin \nBone and muscle weakness \nSevere fatigue \nHigh blood pressure \nHigh blood sugar \nIrritability and anxiety \nExcess facial and body hair growth in women \nIrregular menstrual cycles in women\nReduced sex drive and fertility and Erectile dysfunction in men");
                    diagnosisdef.setText("In addition to a complete medical history and medical examination, diagnostic procedures for Cushing's syndrome may include: \nUrine and blood tests: for level of hormone in urine and blood \nSpecialized blood tests: Dexamethasone suppression test, CRH stimulation tests etc. \nImaging: CT, MRI to detect anomalies in pituitary and adrenal glands");
                    preventiondef.setText("If you are currently taking corticosteroid medications it’s important to recognize the signs of Cushing’s syndrome in order to prevent it. Speak to your doctor the moment you begin to notice any symptoms associated with Cushing’s syndrome.\n Getting regular check-ups \n Eating a balanced diet \n Monitor your mental health \n Soothe aches and pains \n Exercise your brain ");
                    treatmentsdef.setText("Treatment for Cushing's syndrome depends on its cause.\n Reducing corticosteroid use\n Surgery: may be needed to remove tumors or the adrenal glands.\n Radiation therapy\n Medications");
                    riskfactordef.setText("Obesity, type 2 diabetes and poorly regulated blood glucose levels (blood sugar and hypertension)\n" +
                            "    The taking of corticosteroid medications (long-term use)\n" +
                            "    Pituitary gland tumours\n" +
                            "    A primary adrenal gland disease or benign nodular enlargements of the adrenal glands\n" +
                            "    An ectopic ACTH-secreting tumour (a growth that forms on an organ in the body that does not normally produce ACTH, a hormone that regulates cortisol levels)");
                }
                else if(mToolbar.getTitle().toString().equalsIgnoreCase("Cystic Fibrosis")){
                    headingdef.setText("Cystic fibrosis is a genetic disorder characterized by an abnormality in the glands that produce sweat and mucus. Cystic fibrosis affects various organ systems in children and young adults, including the respiratory system, digestive system and reproductive system.\n");
                    symptomsdef.setText("Cystic fibrosis signs and symptoms vary, depending on the severity of the disease. Patients of cystic fibrosis have a higher than normal level of salt in their sweat. Parents often can taste the salt when they kiss their children.\n Salty skin\n Respiratory symptoms\n Persistent cough that produces thick sputum\n Wheezing\n Breathlessness\n Exercise intolerance\n Repeated lung infections\n Inflamed nasal passages or a stuffy nose\n\n GI symptoms\n\n Poor weight gain and growth\n Intestinal blockage, particularly in newborns (meconium ileus)\n Severe constipation\n Infertility\n\n Other medical conditions may be associated:\n\n Sinusitis\n Nasal polyps\n Pneumothorax. Collapse of the lung often due to intense coughing.\n Hemoptysis. Coughing up blood.\n Cor pulmonale. Enlargement of the right side of the heart due to increased pressure in the lungs.\n Excess gas in the intestines\n Rectal prolapse\n Liver disease\n Diabetes\n Pancreatitis \n Gallstones");
                    diagnosisdef.setText("Most cases of cystic fibrosis can now identified with newborn screening. Diagnostic procedures for cystic fibrosis include a sweat test to measure the amount of sodium chloride (salt) present. Higher than normal amounts of sodium and chloride suggests cystic fibrosis.\n");
                    preventiondef.setText("There is no cure for cystic fibrosis, but treatment can ease symptoms and reduce complications.\n\n Management of problems that cause lung obstruction, which may involve:\n\n Physical therapy\n Exercise to loosen mucus, stimulate coughing, and improve overall physical condition\n Medications to reduce mucus and help breathing\n Antibiotics to treat infections\n Anti-inflammatory medications\n\n Management of digestive problems, which may involve:\n\n Appropriate diet\n Pancreatic enzymes to aid digestion\n Vitamin supplements\n Treatments for intestinal obstruction\n");
                    treatmentsdef.setText("There is no cure for cystic fibrosis, but treatment can ease symptoms and reduce complications. Close monitoring and early, aggressive intervention is recommended. Managing cystic fibrosis is complex, so consider obtaining treatment at a center staffed by doctors and other staff trained in cystic fibrosis. Doctors may work with a multidisciplinary team of doctors and medical professionals trained in cystic fibrosis to evaluate and treat your condition.\n" +
                            "\n" +
                            "The goals of treatment include:\n" +
                            "\n" +
                            "    Preventing and controlling infections that occur in the lungs\n" +
                            "    Removing and loosening mucus from the lungs\n" +
                            "    Treating and preventing intestinal blockage\n" +
                            "    Providing adequate nutrition\n");
                    riskfactordef.setText("Cystic fibrosis is most common among Caucasians of Northern European descent. However, it’s known to occur in all ethnic groups. People who have a family history of cystic fibrosis are also at an increased risk because it’s an inherited disorder.");
                }
                else if(mToolbar.getTitle().toString().equalsIgnoreCase("ACANTHAMOEBA KERATISIS")){
                    headingdef.setText("Acanthamoeba keratitis is a rare but serious infection of the eye that can result in permanent visual impairment or blindness. This infection is caused by a microscopic, free-living ameba (single-celled living organism) called Acanthamoeba. Acanthamoeba causes Acanthamoeba keratitis when it infects the transparent outer covering of the eye called the cornea. Acanthamoeba amebas are very common in nature and can be found in bodies of water (for example, lakes and oceans), soil, and air.\n");
                    symptomsdef.setText("The symptoms of Acanthamoeba keratitis can be very similar to the symptoms of other eye infections. These symptoms, which can last for several weeks or months, may include:\n\n Eye pain\n Eye redness\n Blurred vision\n Sensitivity to light\n Sensation of something in the eye\n Excessive tearing\n\n Patients should consult with their eye doctor if they have any of the above symptoms. Acanthamoeba keratitis will eventually cause severe pain and possible vision loss or blindness if untreated.\n");
                    diagnosisdef.setText("Early diagnosis is essential for effective treatment of Acanthamoeba keratitis.\n\n The infection is usually diagnosed by an eye care provider based on symptoms, growth of the Acanthamoeba ameba from a scraping of the eye, and/or seeing the ameba by a process called confocal microscopy.\n\n The infection is treated with one or more prescription medications. An eye care provider can determine the best treatment option for each patient.\n");
                    preventiondef.setText("These guidelines should be followed by all contact lens users to help reduce the risk of eye infections, including Acanthamoeba keratitis:\n\n Visit your eye care provider for regular eye examinations.\n\n Wear and replace contact lenses according to the schedule prescribed by your eye care provider.\n\n Remove contact lenses before any activity involving contact with water, including showering, using a hot tub, or swimming.\n\n Wash hands with soap and water and dry before handling contact lenses.\n\n Clean contact lenses according to instructions from your eye care provider and the manufacturer's guidelines.\n 1. Never reuse or top off old solution. Use fresh cleaning or disinfecting solution each time lenses are cleaned and stored.\n 2. Never use saline solution or rewetting drops to disinfect lenses. Neither solution is an effective or approved disinfectant.\n 3. Be sure to clean, rub, and rinse your lenses each time you remove your lenses. Rubbing and rinsing your contact lenses will aid in removing harmful microbes and residues.\n\n Store reusable lenses in the proper storage case.\n 1. Storage cases should be rubbed and rinsed with sterile contact lens solution (never use tap water), emptied, and left open to dry after each use.\n 2. Replace storage cases at least once every three months.\n\n Contact lens users with questions regarding which solutions are best for them should consult their eye care providers. They should also consult their eye care providers if they have any of the following symptoms: eye pain or redness, blurred vision, sensitivity to light, sensation of something in the eye, or excessive tearing.");
                    treatmentsdef.setText("Early diagnosis is essential for effective treatment of Acanthamoeba keratitis. Several prescription eye medications are available for treatment. However, the infection can be difficult to treat. The best treatment regimen for each patient should be determined by an eye doctor. If you suspect your eye may be infected with Acanthamoeba, see an eye doctor immediately.\n\n Skin infections that are caused by Acanthamoeba but have not spread to the central nervous system can be successfully treated. Because this is a serious infection and the people affected typically have weakened immune systems, early diagnosis offers the best chance at cure.\n\n Most cases of brain and spinal cord infection with Acanthamoeba (Granulomatous Amebic Encephalitis) are fatal.\n");
                    riskfactordef.setText("Acanthamoeba keratitis is most common in people who wear contact lenses, but anyone can develop the infection. For people who wear contact lenses, certain practices can increase the risk of getting Acanthamoeba keratitis:\n\n Storing and handling lenses improperly\n\n Disinfecting lenses improperly (such as using tap water or homemade solutions to clean the lenses)\n\n Swimming, using a hot tub, or showering while wearing lenses \n\nComing into contact with contaminated water Having a history of trauma to the cornea\n");
                }
                else if(mToolbar.getTitle().toString().equalsIgnoreCase("ADENOVIRUS")){
                    headingdef.setText("Adenoviruses are a group of viruses that can infect the membranes (tissue linings) of the respiratory tract, eyes, intestines, urinary tract, and nervous system. They account for about 10% of fever-related illnesses and acute respiratory infections in kids and are a frequent cause of diarrhea.\n \nAdenoviral infections affect babies and young children much more often than adults. Childcare centers and schools sometimes have multiple cases of respiratory infections and diarrhea caused by adenovirus. \n\nAdenoviral infections can occur at any time of the year, but:\n respiratory tract problems caused by adenovirus are more common in late winter, spring, and early summer \n conjunctivitis (pinkeye) and pharyngoconjunctival fever caused by adenovirus tend to affect older kids, mostly in the summer \n\nAdenoviral infections can affect children of any age, but most occur in the first years of life — and most kids have had at least one before age 10. There are many different types of adenoviruses, so some kids can have repeated adenoviral infections.\n");
                    symptomsdef.setText("Adenoviruses can cause a wide range of illnesses such as\n\n Common cold\n Sore throat (pharyngitis)\n Bronchitis\n Pneumonia\n Diarrhea\n Pink eye (conjunctivitis)\n Fever\n Bladder inflammation or infection (cystitis)\n Inflammation of stomach and intestines (gastroenteritis)\n Neurologic disease\n \nAdenoviruses rarely cause serious illness or death. However, infants and people with weakened immune systems, or existing respiratory or cardiac disease, are at higher risk of developing severe illness from an adenovirus infection.");
                    diagnosisdef.setText("    Upper respiratory illness\n" +
                            "    Epidemic keratoconjunctivitis\n" +
                            "    Pneumonia\n" +
                            "    Diarrhea in young children\n" +
                            "    Infections in immunocompromised hosts");
                    preventiondef.setText("There is currently no adenovirus vaccine available to the general public.\n \nA vaccine against adenovirus types 4 and 7 was approved by the U.S. Food and Drug Administration in March 2011, for U.S. military personnel only. For more information about the vaccine, see Adenovirus Vaccine Information Statement (VIS).\n \nYou can protect yourself and others from adenoviruses and other respiratory illnesses by following a few simple steps:\n\n Wash your hands often with soap and water (see CDC’s Clean Hands Save Lives!).\n Cover your mouth and nose when coughing or sneezing.\n Avoid touching your eyes, nose, or mouth with unwashed hands.\n Avoid close contact with people who are sick.\n Stay home when you are sick.\n \nFrequent handwashing is especially important in childcare settings and healthcare facilities.\n \nAdenoviruses are resistant to many common disinfectant products and can remain infections for long periods on surfaces, objects, and in water of swimming pools and small lakes. It is important to keep adequate levels of chlorine in swimming pools to prevent outbreaks of conjunctivitis caused by adenoviruses.");
                    treatmentsdef.setText("There is no specific treatment for people with adenovirus infection. Most adenovirus infections are mild and may require only care to help relieve symptoms.\n");
                    riskfactordef.setText("");
                }
                else if(mToolbar.getTitle().toString().equalsIgnoreCase("ADHD")){
                    headingdef.setText("");
                    symptomsdef.setText("");
                    diagnosisdef.setText("");
                    preventiondef.setText("");
                    treatmentsdef.setText("");
                    riskfactordef.setText("");
                }
                else if(mToolbar.getTitle().toString().equalsIgnoreCase("ASTHMA")){
                    headingdef.setText("");
                    symptomsdef.setText("");
                    diagnosisdef.setText("");
                    preventiondef.setText("");
                    treatmentsdef.setText("");
                    riskfactordef.setText("");
                }
                else if(mToolbar.getTitle().toString().equalsIgnoreCase("AUTISM SPECTRUM DISORDER")){
                    headingdef.setText("");
                    symptomsdef.setText("");
                    diagnosisdef.setText("");
                    preventiondef.setText("");
                    treatmentsdef.setText("");
                    riskfactordef.setText("");
                }
                else if(mToolbar.getTitle().toString().equalsIgnoreCase("Achondroplasia")){
                    headingdef.setText("");
                    symptomsdef.setText("");
                    diagnosisdef.setText("");
                    preventiondef.setText("");
                    treatmentsdef.setText("");
                    riskfactordef.setText("");
                }
                else if(mToolbar.getTitle().toString().equalsIgnoreCase("Acne")){
                    headingdef.setText("");
                    symptomsdef.setText("");
                    diagnosisdef.setText("");
                    preventiondef.setText("");
                    treatmentsdef.setText("");
                    riskfactordef.setText("");
                }
            }
        }


}
