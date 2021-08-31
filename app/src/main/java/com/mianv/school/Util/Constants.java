package com.mianv.school.Util;

import com.mianv.school.Activity.MainActivity;
import com.mianv.school.Activity.QuizActivity;
import com.mianv.school.Database.QuestionAppDatabase;
import com.mianv.school.Model.Question;
import com.mianv.school.R;

import java.util.ArrayList;

public class Constants {

    public static ArrayList<Question> allQuestions = new ArrayList<>();


    public static final Question question001 = new Question(1, R.drawable.image_001, 3 ,
            "Նշաններից որն է կոչվում արգելքի շրջանցումը ձախից" ,
            "1",
            "2",
            "3",
            "4",
            "5");


    public static final Question question002 = new Question(2, R.drawable.image_002, 2 ,
            "Թույլատրվու՞մ է արդյոք ավտոբուսի վարորդին մուտք գործել խաչմերուկ\n" + "տվյալ իրադրությունում:" ,
            "Թույլատրվում է:",
            "Արգելվում է:",
            "Թույլատրվում է, եթե ավտոբուսը երթևեկում է սահմանված երթուղով:");


    public static final Question question003 = new Question(3, R.drawable.image_003, 2 ,
            "Նշված դեպքում ո՞ր գոտուց պետք է կատարվի աջ շրջադարձը:" ,
            "Միայն երկրորդ գոտուց",
            "Միայն «A» գծանշումով նշված աջ եզրային գոտուց:");


    public static final Question question004 = new Question(4, 3 ,
            "Խաչմերուկում կազմակերպված է շրջանաձև երթևեկություն: Երթևեկելի\n" + "մասը, որով մոտենում եք խաչմերուկին, ունի երթևեկության երկու գոտի:\n" + "Խաչմերուկ մուտք գործելիս` շրջադարձ կատարելու համար ո՞ր գոտին\n" + "եք պարտավոր զբաղեցնել՝\n" ,
            "Աջ գոտին",
            "Ձախ գոտին",
            "Կա՛մ աջ, կա՛մ ձախ գոտին:");


    public static final Question question005 = new Question(5, R.drawable.image_004, 1 ,
            "Թույլատրվու՞մ է արդյոք մուտք գործել բակ նշված տեղից:" ,
            "Թույլատրվում է",
            "Արգելվում է");


    public static final Question question006 = new Question(6,   2 ,
            "Երկկողմ երթևեկությամբ գծանշված ճանապարհներին, երեք գոտու\n" + "առկայության դեպքում (բացառությամբ երթևեկության դարձափոխային\n" + "կարգավորմամբ ճանապարհների), որոնցից միջինն օգտագործվում է\n" + "երկու ուղղություններով երթևեկության համար, ձախ եզրային գոտի\n" + "մուտք գործելը՝" ,
            "Թույլատրվում է՝ միայն վազանցի, շրջանցման, ձախ շրջադարձի կամ\n" + "հետադարձի համար:",
            "Թույլատրվում է",
            "Արգելվում է");


    public static final Question question007 = new Question(7, R.drawable.image_005, 3 ,
            "Ո՞ր պատասխանում է ճիշտ նշված երթևեկության թույլատրելի\n" + "ուղղությունը:" ,
            "Միայն հետադարձ",
            " Ուղիղ և հետադարձ:, ",
            "Միայն ուղիղ");


    public static final Question question008 = new Question(8, R.drawable.image_006, 1 ,
            "Ո՞ր ուղղությամբ է արգելվում երթևեկությունը՝" , " Դեպի ձախ և դեպի աջ",
            "Ուղիղ և հակառակ ուղղությամբ",
            " Միայն ուղիղ",
            " Բոլոր ուղղություններով");


    public static final Question question009 = new Question(9, 5 ,
            "Հետադարձն արգելվում է՝" ,
            "Հետիոտնային անցումների վրա:",
            "Թունելներում", "Կամուրջների, ուղեկամուրջների, էստակադների վրա և դրանց տակ",
            "Երկաթուղային գծանցներում",
            " Թվարկած բոլոր դեպքերում");


    public static final Question question010 = new Question(10, R.drawable.image_007, 2 ,
            "Թույլատրվու՞մ է արդյոք դեղին ավտոբուսի վարորդին մուտք գործել\n" + "խաչմերուկ:" ,
            "Թույլատրվում է",
            "Արգելվում է",
            "Թույլատրվում է, եթե ավտոբուսը երթևեկում է սահմանված երթուղով");


    public static final Question question011 = new Question(11, R.drawable.image_008, 2 ,
            "Ո՞ր պատասխանում է ճիշտ նշված երթևեկության թույլատրելի\n" + "ուղղությունը:" ,
            "Ուղիղ և դեպի ձախ` մուտք գործելով բակ",
            "Միայն ուղիղ",
            "Միայն հետադարձ",
            "Ուղիղ և հետադարձ");


    public static final Question question012 = new Question(12, 1 ,
            "Հետադարձն արգելվում է, եթե ճանապարհի թեկուզ և մեկ ուղղությամբ\n" + "տեսանելիությունը պակաս է՝\n" ,
            "100 մ-ից",
            "150 մ-ից",
            "300 մ-ից");


    public static final Question question013 = new Question(13, 4,
            "Դուք երթևեկում եք երեք գոտի ունեցող երկկողմ երթևեկությամբ\n" + "ճանապարհով: Ո՞ր դեպքում է թույլատրվում մուտք գործել միջին գոտի:",
            "Միայն շրջանցման դեպքում",
            "Միայն ձախ շրջադարձի կամ հետադարձի դեպքում" ,
            "Թվարկած բոլոր դեպքերում");


    public static final Question question014 = new Question(14, R.drawable.image_009, 2 ,
            "Ո՞ր ուղղությամբ է թույլատրվում բեռնատար ավտոմոբիլի\n" + "երթևեկությունը:" ,
            "Միայն դեպի աջ",
            "Դեպի աջ, դեպի ձախ և հակառակ ուղղությամբ",
            "Միայն դեպի ձախ");


    public static final Question question015 = new Question(15, R.drawable.image_010, 1 ,
            "Ո՞ր նկարում է վարորդը ճիշտ կատարում մանևրը:" ,
            "1",
            "2",
            "3");


    public static final Question question016 = new Question(16, R.drawable.image_011, 2 ,
            "Ո՞ր տրանսպորտային միջոցի վարորդն է ճիշտ կատարում հետադարձը:" ,
            "Կապույտ ավտոմոբիլի վարորդը",
            "Կարմիր ավտոմոբիլի վարորդը",
            "Երկու վարորդներն էլ");


    public static final Question question017 = new Question(17,  1 ,
            "Ճանապարհային նշանների, գծանշման և բաժանարար գոտու\n" + "բացակայության դեպքում վարորդները երկկողմ երթևեկությամբ\n" + "ճանապարհների երթևեկելի մասում գտնվող ճանապարհային\n" + "կառույցների տարրերը պետք է շրջանցեն՝\n" ,
            "Միայն երկրորդ գոտուց",
            "Միայն «A» գծանշումով նշված աջ եզրային գոտուց:");



    public static final Question question018 = new Question(18, R.drawable.image_012, 2 ,
            "Ո՞ր ուղղությամբ է արգելվում երթևեկությունը:" ,
            "Միայն դեպի ձախ:",
            "Միայն դեպի աջ",
            "Ուղիղ և դեպի ձախ:",
            "Բոլոր ուղղություններով:");


    public static final Question question019  = new Question(19, R.drawable.image_013, 2 ,
            "Ո՞ր տրանսպորտային միջոցի վարորդն է խախտում կանոնները\n" +
                    "շրջադարձ կատարելիս՝ արգելակման գոտի ունեցող ճանապարհին:" ,
            "Երկու վարորդն էլ",
            "Դեղին ավտոմոբիլի վարորդը",
            "Երկու վարորդն էլ շրջադարձը կատարում են ճիշտ");


    public static final Question question020  = new Question(20, R.drawable.image_014, 2 ,
            "Թույլատրվու՞մ է արդյոք տվյալ իրադրությունում կարմիր ավտոմոբիլի\n" +
                    "վարորդին շարունակել երթևեկությունը:" ,
            "Թույլատրվում է:",
            "Արգելվում է:");


    public static final Question question021  = new Question(21,  2 ,
            "Երեք գոտի ունեցող երկկողմ երթևեկությամբ ճանապարհի վրա Ձեզ\n" +
                    "անհրաժեշտ է կատարել ձախ շրջադարձ: Ո՞ր գոտուց կկատարեք\n" +
                    "տվյալ մանևրը:" ,
            "Աջ գոտուց",
            "Միջին գոտուց",
            "Աջ կամ միջին գոտուց",
            "Միջին գոտուց, եթե զբաղեցված է աջ գոտին");


    public static final Question question022  = new Question(22, R.drawable.image_015, 1 ,
            "Թույլատրվու՞մ է արդյոք կարմիր ավտոմոբիլի վարորդին երթևեկել\n" +
                    "տրամվայի գծերով:" ,
            "Թույլատրվում է",
            "Արգելվում է");


    public static final Question question023  = new Question(23,  5 ,
            "Հետադարձն արգելվում է՝" ,
            "Հետիոտնային անցումների վրա և թունելներում:",
            "Կամուրջների, ուղեկամուրջների, էստակադների վրա և դրանց\n" +
                    "տակ",
            "Երկաթուղային գծանցներում",
            "Ճանապարհի` թեկուզ և մեկ ուղղությամբ 100 մ-ից պակաս\n" +
                    "տեսանելիության տեղերում",
            "Բոլոր թվարկած դեպքերում");


    public static final Question question024  = new Question(24, R.drawable.image_016, 2 ,
            "Ո՞ր ուղղություններով է թույլատրվում երթևեկությունը" ,
            "Միայն դեպի ձախ",
            "Ուղիղ, դեպի ձախ և հետադարձ",
            "Միայն ուղիղ");


    public static final Question question025 = new Question(25, R.drawable.image_017, 4 ,
            "Ո՞ր տրանսպորտային միջոցների վարորդներն են խախտել\n" +
                    "ճանապարհային նշանի պահանջները:" ,
            "Մոտոցիկլների վարորդները",
            "Ավտոմոբիլի և կողային կցորդով մոտոցիկլի վարորդները",
            "Միայն ավտոմոբիլի վարորդը",
            "Միայն ուղիղ");


    public static final Question question026 = new Question(26,  1 ,
            "Համընթաց ուղղությամբ երթեւեկող տրանսպորտային միջոցների\n" +
                    "միաժամանակյա վերադասավորման դեպքում ճանապարհը պետք է զիջի՝" ,
            "Ձախից ընթացող տրանսպորտային միջոցի վարորդը",
            "Աջից ընթացող տրանսպորտային միջոցի վարորդը");


    public static final Question question027 = new Question(27, R.drawable.image_018, 1 ,
            "Ո՞ր տրանսպորտային միջոցի վարորդն ունի առաջնահերթ երթևեկության\n" +
                    "իրավունք:" ,
            "Բեռնատար ավտոմոբիլի վարորդը",
            "Ավտոբուսի վարորդը");


    public static final Question question028 = new Question(28, R.drawable.image_019, 1 ,
            "Պարտավո՞ր է արդյոք սահմանված երթուղով երթևեկող ավտոբուսի\n" +
                    "վարորդը նշված իրադրությունում զիջել ճանապարհը:" ,
            "Պարտավոր է",
            "Պարտավոր չէ",
            "Պարտավոր չէ, քանի որ երթևեկում է ուղիղ");


    public static final Question question029 = new Question(29, 3 ,
            "Եթե համապատասխան նշաններով կահավորված երկայնական\n" +
                    "թեքությամբ ճանապարհահատվածներում հանդիպակաց\n" +
                    "երթևեկությունը դժվարացած է, ապա ճանապարհը պետք է զիջել՝" ,
            "Վայրէջքի ուղղությամբ ընթացող տրանսպորտային միջոցին",
            "Ընդհանուր օգտագործման տրանսպորտային միջոցին",
            "Վերելքի ուղղությամբ ընթացող տրանսպորտային միջոցին");


    public static final Question question030 = new Question(30, R.drawable.image_020, 2 ,
            "Ո՞ր տրանսպորտային միջոցի վարորդը պետք է զիջի ճանապարհը" ,
            "Տրակտորի վարորդը",
            "Ավտոբուսի վարորդը");


    public static final Question question031 = new Question(31, R.drawable.image_021, 2 ,
            "Երթևեկության առավելություն ունի՝" ,
            "Կապույտ ավտոմոբիլը, քանի որ կարմիրը փոխում է երթևեկության\n" +
                    "ուղղությունը դեպի ձախ",
            "Կարմիր ավտոմոբիլը, քանի որ միաժամանակյա վերադասավորման\n" +
                    "դեպքում գտնվում է աջ կողմում",
            "Կապույտ ավտոմոբիլը, քանի որ միաժամանակյա\n" +
                    "վերադասավորման դեպքում գտնվում է ձախ կողմում");

    public static final Question question032 = new Question(32, 1 ,
            "Պարտավո՞ր են արդյոք տրանսպորտային միջոցների վարորդները\n" +
                    "բնակավայրերում ճանապարհը զիջել կահավորված և նշված կանգառի\n" +
                    "կետերի տարածքից երթևեկությունը սկսող ընդհանուր օգտագործման\n" +
                    "տրանսպորտային միջոցներին:" ,
            "Այո",
            "Ոչ");


    public static final Question question033 = new Question(33, R.drawable.image_022, 1,
            "Ո՞ր տրանսպորտային միջոցի վարորդը պետք է զիջի ճանապարհը:" ,
            "Թեթև մարդատար ավտոմոբիլի վարորդը",
            "Բեռնատար ավտոմոբիլի վարորդը");


    public static final Question question034 = new Question(34, R.drawable.image_023, 2 ,
            "Ո՞ր տրանսպորտային միջոցի վարորդը պետք է զիջի ճանապարհը:" ,
            "Ավտոբուսի վարորդը",
            "Ավտոմոբիլի վարորդը");


    public static final Question question035 = new Question(35, R.drawable.image_024, 1 ,
            "Ո՞ր տրանսպորտային միջոցի վարորդը պետք է զիջի ճանապարհը" ,
            "Ավտոմոբիլի վարորդը",
            "Տրամվայի վարորդը");


    public static final Question question036 = new Question(36, R.drawable.image_025, 2 ,
            "Նշե՛ք խաչմերուկի անցման հերթականությունը`" ,
            "Ավտոբուսը, բեռնատար ավտոմոբիլը, լծասայլը",
            "Ավտոբուսը և լծասայլը, բեռնատար ավտոմոբիլը");


    public static final Question question037 = new Question(37, R.drawable.image_003, 2 ,
            "Հանդիպակաց երթևեկության դեպքում կտրուկ վայրէջքի վրա\n" +
                    "անհրաժեշտ է ճանապարհը զիջել՝" ,
            "Վերև բարձրացող տրանսպորտային միջոցին",
            "Ներքև իջնող տրանսպորտային միջոցին");


    public static final Question question038 = new Question(38, R.drawable.image_003, 2 ,
            "Բնակավայրերում միևնույն ուղղությամբ երթևեկության 3 և ավելի\n" +
                    "գոտիների առկայության դեպքում ձախ եզրային գոտի զբաղեցնել\n" +
                    "թույլատրվու՞մ է արդյոք ընդհանուր օգտագործման տրանսպորտային\n" +
                    "միջոցներին:" ,
            "Թույլատրվում է վազանց կատարելիս",
            "Թույլատրվում է ձախ շրջադարձ կամ հետադարձ կատարելիս",
            "Թույլատրվում է բոլոր դեպքերում");


    public static final Question question039 = new Question(39, R.drawable.image_003, 2 ,
            "Բոլոր ճանապարհներին միևնույն ուղղությամբ երթևեկության 3 և ավելի\n" +
                    "գոտիների առկայության դեպքում ձախ եզրային գոտի զբաղեցնել\n" +
                    "թույլատրվու՞մ է արդյոք ընդհանուր օգտագործման տրանսպորտային\n" +
                    "միջոցներին:" ,
            "Թույլատրվում է վազանց կատարելիս",
            "Թույլատրվում է ձախ շրջադարձ կամ հետադարձ կատարելիս",
            "Թույլատրվում է բոլոր դեպքերում");


    public static final Question question040 = new Question(40, R.drawable.image_026, 3 ,
            "Ինչպե՞ս պետք է վարվի ավտոբուսի վարորդը տվյալ իրավիճակում:" ,
            "Ճանապարհը զիջի թեթև մարդատար ավտոմոբիլին",
            "Միացնի շրջադարձի ցուցիչը, տա ձայնային ազդանշան և սկսի\n" +
                    "երթևեկությունը",
            "Սկսի երթևեկությունը` համոզված լինելով, որ թեթև մարդատար\n" +
                    "ավտոմոբիլի վարորդը զիջում է ճանապարհը");


    public static final Question question041 = new Question(41, R.drawable.image_027, 1 ,
            "Տվյալ իրադրությունում սպիտակ թեթև մարդատար ավտոմոբիլի\n" +
                    "վարորդը`" ,
            "Ճանապարհը պետք է զիջի ավտոբուսին, որը սկսում է երթևեկությունը\n" +
                    "նշված կանգառի կետից",
            "Ունի առաջնահերթ երթևեկության իրավունք, քանի որ ավտոբուսը\n" +
                    "վերադասավորվում է երկրորդ գոտի անցնելով");


    public static final Question question042 = new Question(42, R.drawable.image_028, 1 ,
            "Ո՞ր տրանսպորտային միջոցի վարորդն ունի առաջնահերթ երթևեկության\n" +
                    "իրավունք" ,
            "Թեթև մարդատար ավտոմոբիլի վարորդը",
            "Ավտոբուսի վարորդը");


    public static final Question question043 = new Question(43, R.drawable.image_029, 1 ,
            "Ո՞ր տրանսպորտային միջոցի վարորդն ունի առաջնահերթ երթևեկության\n" +
                    "իրավունք տվյալ իրավիճակում" ,
            "Ավտոբուսի վարորդը",
            "Թեթև մարդատար ավտոմոբիլի վարորդը",
            "Թեթև մարդատար ավտոմոբիլի վարորդը իրավունք չունի անցնել աջ\n" +
                    "գոտի");


    public static final Question question044 = new Question(44, R.drawable.image_030, 2 ,
            "Խաչմերուկում որտեղ կազմակերպված է շրջանաձև երթևեկություն,\n" +
                    "պարտավո՞ր է արդյոք ավտոբուսի վարորդը զիջել ճանապարհը\n" +
                    "բեռնատար ավտոմոբիլին:" ,
            "Պարտավոր է",
            "Պարտավոր չէ");


    public static final Question question045 = new Question(45, R.drawable.image_031, 1 ,
            "Երթևեկությունն ուղիղ շարունակող ավտոբուսի վարորդը պարտավո՞ր է\n" +
                    "արդյոք զիջել ճանապարհը բեռնատար ավտոմոբիլին:" ,
            "Պարտավոր է",
            "Պարտավոր չէ");


    public static final Question question046 = new Question(46, R.drawable.image_032, 1 ,
            "Եթե մտադիր եք շարունակել երթևեկությունն ուղիղ, ո՞ր\n" +
                    "տրանսպորտային միջոցին պետք է զիջեք ճանապարհը:" ,
            "Երկու տրանսպորտային միջոցներին",
            "Միայն ավտոբուսին",
            "Միայն թեթև մարդատար ավտոմոբիլին",
            "Ոչ մեկին");


    public static final Question question047 = new Question(47, R.drawable.image_033, 2 ,
            "Եթե մտադիր եք շարունակել երթևեկությունն ուղիղ, ու՞մ պետք է զիջեք\n" +
                    "ճանապարհը:" ,
            "Միայն թեթև մարդատար ավտոմոբիլին",
            "Միայն ավտոբուսին և թեթև մարդատար ավտոմոբիլին",
            "Բոլոր տրանսպորտային միջոցներին",
            "Միայն մոտոցիկլին");


    public static final Question question048 = new Question(48, R.drawable.image_034, 2 ,
            "Տվյալ իրադրությունում պարտավո՞ր է մոտոցիկլի վարորդը զիջել\n" +
                    "ճանապարհը:" ,
            "Պարտավոր չէ",
            "Պարտավոր է");


    public static final Question question049 = new Question(49, R.drawable.image_035, 2 ,
            "Տվյալ իրադրությունում ունե՞ք արդյոք նշված մանևրի իրավունք:" ,
            "Այո",
            "Ոչ");


    public static final Question question050 = new Question(50, R.drawable.image_036, 3 ,
            "Դուք շարունակում եք երթևեկությունն ուղիղ, ո՞ր տրանսպորտային\n" +
                    "միջոցին պետք է զիջեք ճանապարհը:" ,
            "Միայն թեթև մարդատար ավտոմոբիլին",
            "Բեռնատար ավտոմոբիլին",
            "Երկու տրանսպորտային միջոցներին",
            "Ոչ մեկին");


    public static final Question question051 = new Question(51, R.drawable.image_037, 2 ,
            "Դուք շարունակում եք երթևեկությունն ուղիղ, պարտավո՞ր եք արդյոք\n" +
                    "զիջել ճանապարհը թեթև մարդատար ավտոմոբիլին" ,
            "Պարտավոր եք",
            "Պարտավոր չեք");


    public static final Question question052 = new Question(52, R.drawable.image_038, 1 ,
            "Դուք սկսում եք երթևեկել ճամփեզրից, պարտավո՞ր եք արդյոք զիջել\n" +
                    "ճանապարհը թեթև մարդատար ավտոմոբիլին, որը կատարում է\n" +
                    "հետադարձ" ,
            "Պարտավոր եք",
            "Պարտավոր չեք");


    public static final Question question053 = new Question(53, R.drawable.image_039, 1 ,
            "Դուք շարունակում եք երթևեկությունն ուղիղ, ո՞ր տրանսպորտային\n" +
                    "միջոցին պետք է զիջեք ճանապարհը:" ,
            "Միայն թեթև մարդատար ավտոմոբիլին",
            "Ոչ մեկին",
            "Միայն թեթև մարդատար ավտոմոբիլին և մոտոցիկլին",
            "Բոլոր տրանսպորտային միջոցներին");


    public static final Question question054 = new Question(54, R.drawable.image_040, 3 ,
            "Եթե մտադիր եք կատարել ձախ շրջադարձ, ո՞ր տրանսպորտային\n" +
                    "միջոցին պետք է զիջեք ճանապարհը:" ,
            "Մոտոցիկլին",
            "Պարեկային ավտոմոբիլին",
            "Բոլոր տրանսպորտային միջոցներին");


    public static final Question question055 = new Question(55, R.drawable.image_041, 2 ,
            "Եթե մտադիր եք խաչմերուկում կատարել հետադարձ, ո՞ր\n" +
                    "տրանսպորտային միջոցին պետք է զիջեք ճանապարհը:" ,
            "Թեթև մարդատար ավտոմոբիլին",
            "Բոլոր տրանսպորտային միջոցներին",
            "Բեռնատար ավտոմոբիլին");


    public static final Question question056 = new Question(56, R.drawable.image_042, 2 ,
            "Եթե մտադիր եք խաչմերուկում կատարել ձախ շրջադարձ, ո՞ր\n" +
                    "տրանսպորտային միջոցին պետք է զիջեք ճանապարհը:" ,
            "Բեռնատար ավտոմոբիլին",
            "Բոլոր տրանսպորտային միջոցներին",
            "Ոչ մեկին");


    public static final Question question057 = new Question(57, R.drawable.image_043, 2 ,
            "Եթե մտադիր եք խաչմերուկում կատարել ձախ շրջադարձ, ո՞ր\n" +
                    "տրանսպորտային միջոցին պետք է զիջեք ճանապարհը:" ,
            "Ոչ մեկին",
            "Միայն ավտոբուսին",
            "Միայն միացված փարոսիկով բեռնատար ավտոմոբիլին",
            "Բոլոր տրանսպորտային միջոցներին");


    public static final Question question058 = new Question(58, R.drawable.image_044, 1 ,
            "Եթե մտադիր եք խաչմերուկում կատարել հետադարձ, ո՞ր\n" +
                    "տրանսպորտային միջոցին պետք է զիջեք ճանապարհը:" ,
            "Բեռնատար ավտոմոբիլին",
            "Թեթև մարդատար ավտոմոբիլին",
            "Բոլոր տրանսպորտային միջոցներին",
            "Ոչ մեկին");


    public static final Question question059 = new Question(59, R.drawable.image_045, 4 ,
            "Եթե մտադիր եք կատարել ձախ շրջադարձ, ո՞ր տրանսպորտային\n" +
                    "միջոցին պետք է զիջեք ճանապարհը:" ,
            "Ավտոբուսին",
            "Ավտոբուսին և թեթև մարդատար ավտոմոբիլին",
            "Թեթև մարդատար ավտոմոբիլին",
            "Ոչ մեկին");


    public static final Question question060 = new Question(60, R.drawable.image_046, 2,
            "Եթե մտադիր եք կատարել աջ շրջադարձ, պարտավո՞ր եք արդյոք զիջել\n" +
                    "ճանապարհը թեթև մարդատար ավտոմոբիլին:" ,
            "Պարտավոր եք",
            "Պարտավոր չեք");


    public static final Question question061 = new Question(61, R.drawable.image_047, 1 ,
            "Եթե մտադիր եք կատարել աջ շրջադարձ, ո՞ր տրանսպորտային միջոցին\n" +
                    "պետք է զիջեք ճանապարհը:" ,
            "Ոչ մեկին",
            "Թեթև մարդատար ավտոմոբիլին",
            "Մոտոցիկլին և թեթև մարդատար ավտոմոբիլին");





    public static ArrayList<Question> getAllQuestions(){

        allQuestions.clear();

        allQuestions.add(question001);
        allQuestions.add(question002);
        allQuestions.add(question003);
        allQuestions.add(question004);
        allQuestions.add(question005);
        allQuestions.add(question006);
        allQuestions.add(question007);
        allQuestions.add(question008);
        allQuestions.add(question009);
        allQuestions.add(question010);
        allQuestions.add(question011);
        allQuestions.add(question012);
        allQuestions.add(question013);
        allQuestions.add(question014);
        allQuestions.add(question015);
        allQuestions.add(question016);
        allQuestions.add(question017);
        allQuestions.add(question018);
        allQuestions.add(question019);
        allQuestions.add(question020);
        allQuestions.add(question021);
        allQuestions.add(question022);
        allQuestions.add(question023);
        allQuestions.add(question024);
        allQuestions.add(question025);
        allQuestions.add(question026);
        allQuestions.add(question027);
        allQuestions.add(question028);
        allQuestions.add(question029);
        allQuestions.add(question030);
        allQuestions.add(question031);
        allQuestions.add(question032);
        allQuestions.add(question033);
        allQuestions.add(question034);
        allQuestions.add(question035);
        allQuestions.add(question036);
        allQuestions.add(question037);
        allQuestions.add(question038);
        allQuestions.add(question039);
        allQuestions.add(question040);
        allQuestions.add(question041);
        allQuestions.add(question042);
        allQuestions.add(question043);
        allQuestions.add(question044);
        allQuestions.add(question045);
        allQuestions.add(question046);
        allQuestions.add(question047);
        allQuestions.add(question048);
        allQuestions.add(question049);
        allQuestions.add(question050);
        allQuestions.add(question051);
        allQuestions.add(question052);
        allQuestions.add(question053);
        allQuestions.add(question054);
        allQuestions.add(question055);
        allQuestions.add(question056);
        allQuestions.add(question057);
        allQuestions.add(question058);
        allQuestions.add(question059);
        allQuestions.add(question060);
        allQuestions.add(question061);

        return allQuestions;
    }

    public static ArrayList<Question> getCorrectQuestions(){

        getAllQuestions();
        ArrayList<Question> correctQuestions = new ArrayList<>();


        for (int i = 0; i < allQuestions.size(); i++){
            Question currentQuestion = allQuestions.get(i);
            if (currentQuestion.getCorrectAnswer() == currentQuestion.getUsersAnswer()){
                correctQuestions.add(currentQuestion);
            }


        }


        return correctQuestions;

    }

    public static ArrayList<Question> getWrongQuestions(){

        getAllQuestions();
        ArrayList<Question> wrongQuestions = new ArrayList<>();


        for (int i = 0; i < allQuestions.size(); i++){
            Question currentQuestion = allQuestions.get(i);
            if (currentQuestion.getUsersAnswer() != 0 && currentQuestion.getCorrectAnswer() != currentQuestion.getUsersAnswer()){
                wrongQuestions.add(currentQuestion);
            }


        }


        return wrongQuestions;

    }

    public static ArrayList<Question> getNotAnsweredQuestions(){

        getAllQuestions();
        ArrayList<Question> notAnsweredQuestions = new ArrayList<>();



        for (int i = 0; i < allQuestions.size(); i++){
            Question currentQuestion = allQuestions.get(i);
            if (currentQuestion.getUsersAnswer() == 0){
                notAnsweredQuestions.add(currentQuestion);
            }


        }


        return notAnsweredQuestions;

    }




}