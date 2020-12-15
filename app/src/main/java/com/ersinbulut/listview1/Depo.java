package com.ersinbulut.listview1;

public class Depo {

    public static String[] sehirler ={"Adana","Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin",
            "Aydın", "Balıkesir","Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale",
            "Çankırı", "Çorum","Denizli","Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum ", "Eskişehir",
            "Gaziantep", "Giresun","Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir",
            "Kars", "Kastamonu", "Kayseri","Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya ", "Malatya",
            "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya",
            "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon  ", "Tunceli", "Şanlıurfa", "Uşak",
            "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt ", "Karaman", "Kırıkkale", "Batman", "Şırnak",
            "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük ", "Kilis", "Osmaniye ", "Düzce"};

    public static String[][] ilceler =  {{"ALADAĞ","CEYHAN","ÇUKUROVA","FEKE","İMAMOĞLU","KARAİSALI","KARATAŞ","KOZAN","POZANTI","SAİMBEYLİ","SARIÇAM","SEYHAN","TUFANBEYLİ","YUMURTALIK","YÜREĞİR"},
            {"ÇELİKHAN","GERGER","GÖLBAŞI","KAHTA","MERKEZ","SAMSAT","SİNCİK","TUT"},
            {"BAYAT","BOLVADİN","ÇAY","ÇOBANLAR","DAZKIRI","DİNAR","EMİRDAĞ","EVCİLER","HOCALAR","İHSANİYE","İSCEHİSAR","KIZILÖREN","MERKEZ","SANDIKLI","SİNANPAŞA","SULTANDAĞI","ŞUHUT"},
            {"DOĞUBAYAZIT","ELEŞKİRT","HAMUR","MERKEZ","PATNOS","TAŞLIÇAY","TUTAK"},
            {"GÜMÜŞHACIKÖY","HAMAMÖZÜ","MERKEZ","MERZİFON","SULUOVA","TAŞOVA"},
            {"ALTINDAĞ","AYAŞ","BALA","BEYPAZARI","ÇAMLIDERE","ÇANKAYA","ÇUBUK","ELMADAĞ","ETİMESGUT","EVREN","GÖLBAŞI","GÜDÜL","HAYMANA","KAHRAMANKAZAN","KALECİK","KEÇİÖREN","KIZILCAHAMAM","MAMAK","NALLIHAN","POLATLI","PURSAKLAR","SİNCAN","ŞEREFLİKOÇHİSAR","YENİMAHALLE"},
            {"AKSU","ALANYA","DEMRE","DÖŞEMEALTI","ELMALI","FİNİKE","GAZİPAŞA","GÜNDOĞMUŞ","İBRADI","KAŞ","KEMER","KEPEZ","KONYAALTI","KORKUTELİ","KUMLUCA","MANAVGAT","MURATPAŞA","SERİK"},
            {"ARHAVİ","BORÇKA","HOPA","KEMALPAŞA","MERKEZ","MURGUL","ŞAVŞAT","YUSUFELİ"},
            {"BUHARKENT","ÇİNE","DİDİM","EFELER","GERMENCİK","İNCİRLİOVA","KARACASU","KARPUZLU","KOÇARLI","KÖŞK","KUŞADASI","KUYUCAK","NAZİLLİ","SÖKE","SULTANHİSAR","YENİPAZAR"},
            {"AYVALIK","BALYA","BANDIRMA","BİGADİÇ","BURHANİYE","DURSUNBEY","EDREMİT","ERDEK","GÖMEÇ","GÖNEN","HAVRAN","İVRİNDİ","KARESİ","KEPSUT","MANYAS","MARMARA","SAVAŞTEPE","SINDIRGI","SUSURLUK"},
            {"GÖLPAZARI","İNHİSAR","MERKEZ","OSMANELİ","PAZARYERİ","SÖĞÜT","YENİPAZAR"},
            {"GENÇ","KARLIOVA","KİĞI","MERKEZ","SOLHAN","YAYLADERE","YEDİSU"},
            {"AHLAT","GÜROYMAK","HİZAN","MERKEZ","MUTKİ","TATVAN"},
            {"GEREDE","GÖYNÜK","KIBRISCIK","MENGEN","MERKEZ","MUDURNU","SEBEN","YENİÇAĞA"},
            {"ALTINYAYLA","BUCAK","ÇAVDIR","ÇELTİKÇİ","GÖLHİSAR","KARAMANLI","KEMER","MERKEZ","TEFENNİ","YEŞİLOVA"},
            {"GEMLİK","GÜRSU","HARMANCIK","İNEGÖL","İZNİK","KARACABEY","KELES","KESTEL","MUDANYA","MUSTAFAKEMALPAŞA","NİLÜFER","ORHANELİ","ORHANGAZİ","OSMANGAZİ","YENİŞEHİR","YILDIRIM"},
            {"BAYRAMİÇ","BİGA","BOZCAADA","ÇAN","ECEABAT","EZİNE","GELİBOLU","GÖKÇEADA","LAPSEKİ","MERKEZ","YENİCE"},
            {"BAYRAMÖREN","ÇERKEŞ","ELDİVAN","ILGAZ","KIZILIRMAK","KORGUN","KURŞUNLU","MERKEZ","ORTA","ŞABANÖZÜ","YAPRAKLI"},
            {"BAYAT","BOĞAZKALE","DODURGA","İSKİLİP","KARGI","LAÇİN","MECİTÖZÜ","MERKEZ","OĞUZLAR","ORTAKÖY","OSMANCIK","SUNGURLU","UĞURLUDAĞ"},
            {"BABADAĞ","BAKLAN","BEKİLLİ","BEYAĞAÇ","BOZKURT","BULDAN","ÇAL","ÇAMELİ","ÇARDAK","ÇİVRİL","GÜNEY","HONAZ","KALE","MERKEZEFENDİ","PAMUKKALE","SARAYKÖY","SERİNHİSAR","TAVAS"},
            {"BİSMİL","ÇERMİK","ÇINAR","ÇÜNGÜŞ","DİCLE","EĞİL","ERGANİ","HANİ","HAZRO","KAYAPINAR","KOCAKÖY","KULP","LİCE","SİLVAN","SUR","YENİŞEHİR"},
            {"HAVSA","İPSALA","KEŞAN","LALAPAŞA","MERİÇ","MERKEZ","SÜLOĞLU","UZUNKÖPRÜ"},
            {"ALACAKAYA","ARICAK","BASKİL","KARAKOÇAN","KEBAN","KOVANCILAR","MADEN","MERKEZ","PALU","SİVRİCE"},
            {"İLİÇ","KEMAH","KEMALİYE","MERKEZ","OTLUKBELİ","REFAHİYE","TERCAN","ÜZÜMLÜ"},
            {"AZİZİYE","ÇAT","HINIS","HORASAN","İSPİR","KARAÇOBAN","KARAYAZI","KÖPRÜKÖY","NARMAN","OLTU","OLUR","PALANDÖKEN","PASİNLER","PAZARYOLU","ŞENKAYA","TEKMAN","TORTUM","UZUNDERE","YAKUTİYE"},
            {"BEYLİKOVA","ÇİFTELER","GÜNYÜZÜ","HAN","İNÖNÜ","MAHMUDİYE","MİHALGAZİ","MİHALIÇÇIK","ODUNPAZARI","SARICAKAYA","SEYİTGAZİ","SİVRİHİSAR","TEPEBAŞI"},
            {"İSLAHİYE","KARKAMIŞ","NİZİP","NURDAĞI","OĞUZELİ","ŞAHİNBEY","ŞEHİTKAMİL","YAVUZELİ"},
            {"BULANCAK","ÇAMOLUK","ÇANAKÇI","DERELİ","DOĞANKENT","ESPİYE","EYNESİL","GÖRELE","GÜCE","KEŞAP","MERKEZ","PİRAZİZ","ŞEBİNKARAHİSAR","TİREBOLU","YAĞLIDERE"},
            {"KÖSE","KÜRTÜN","MERKEZ","ŞİRAN","TORUL"},
            {"DERECİK","MERKEZ","ŞEMDİNLİ","YÜKSEKOVA"},
            {"ANTAKYA","ARSUZ","BELEN","DEFNE","DÖRTYOL","ERZİN","HASSA","İSKENDERUN","KIRIKHAN","KUMLU","PAYAS","REYHANLI","SAMANDAĞ","YAYLADAĞI"},
            {"ATABEY","EĞİRDİR","GELENDOST","GÖNEN","KEÇİBORLU","MERKEZ","SENİRKENT","SÜTÇÜLER","ŞARKİKARAAĞAÇ","ULUBORLU","YALVAÇ","YENİŞARBADEMLİ"},
            {"ANAMUR","AYDINCIK","BOZYAZI","ÇAMLIYAYLA","ERDEMLİ","GÜLNAR","MEZİTLİ","MUT","SİLİFKE","TARSUS","TOROSLAR","YENİŞEHİR"},
            {"ADALAR", "AVCILAR", "BARYAMPAŞA","BEŞİKTAŞ","BEYKOZ","BEYLİKDÜZÜ","BEYOĞLU","BÜYÜKÇEKMECE","ÇATALCA","ÇEKMEKÖY","ESENLER","ESENYURT","EYÜPSULTAN","FATİH","GAZİOSMANPAŞA","GÜNGÖREN","KADIKÖY","KAĞITHANE","KARTAL","KÜÇÜKÇEKMECE","MALTEPE","PENDİK","SANCAKTEPE","SARIYER","SİLİVRİ","SULTANBEYLİ","SULTANGAZİ","ŞİLE","ŞİŞLİ","TUZLA","ÜMRANİYE","ÜSKÜDAR","ZEYTİNBURNU"},
            {"BALÇOVA","BAYINDIR","BAYRAKLI","BERGAMA","BEYDAĞ","BORNOVA","BUCA","ÇEŞME","ÇİĞLİ","DİKİLİ","FOÇA","GAZİEMİR","GÜZELBAHÇE","KARABAĞLAR","KARABURUN","KARŞIYAKA","KEMALPAŞA","KINIK","KİRAZ","KONAK","MENDERES","MENEMEN","NARLIDERE","ÖDEMİŞ","SEFERİHİSAR","SELÇUK","TİRE","TORBALI","URLA"},
            {"ARPAÇAY","DİGOR","KAĞIZMAN","MERKEZ","SARIKAMIŞ","SELİM","SUSUZ"},
            {"AĞLI","ARAÇ","AZDAVAY","BOZKURT","CİDE","ÇATALZEYTİN","DADAY","DEVREKANİ","DOĞANYURT","HANÖNÜ","İHSANGAZİ","İNEBOLU","KÜRE","MERKEZ","PINARBAŞI","SEYDİLER","ŞENPAZAR","TAŞKÖPRÜ","TOSYA"},
            {"BÜNYAN","DEVELİ","FELAHİYE","HACILAR","İNCESU","KOCASİNAN","MELİKGAZİ","ÖZVATAN","PINARBAŞI","SARIOĞLAN","SARIZ","TALAS","TOMARZA","YAHYALI","YEŞİLHİSAR"},
            {"DEMİRKÖY","KOFÇAZ","LÜLEBURGAZ","MERKEZ","PEHLİVANKÖY","PINARHİSAR","VİZE"},
            {"AKPINAR","BOZTEPE","ÇİÇEKDAĞI","KAMAN","MERKEZ","MUCUR"},
            {"ÇAYIROVA","DARICA","DERİNCE","DİLOVASI","GEBZE","GÖLCÜK","İZMİT","KANDIRA","KARAMÜRSEL","KARTEPE","KÖRFEZ"},
            {"AKÖREN","AKŞEHİR","ALTINEKİN","BEYŞEHİR","BOZKIR","CİHANBEYLİ","ÇELTİK","ÇUMRA","DERBENT","DEREBUCAK","DOĞANHİSAR","EMİRGAZİ","EREĞLİ","GÜNEYSINIR","HADİM","HALKAPINAR","HÜYÜK","ILGIN","KADINHANI","KARAPINAR","KARATAY","KULU","MERAM","SARAYÖNÜ","SELÇUKLU","SEYDİŞEHİR","TAŞKENT","TUZLUKÇU","YALIHÜYÜK","YUNAK"},
            {"ASLANAPA","ÇAVDARHİSAR","DOMANİÇ","DUMLUPINAR","EMET","GEDİZ","HİSARCIK","MERKEZ","PAZARLAR","SİMAV","ŞAPHANE","TAVŞANLI"},
            {"ARAPGİR","ARGUVAN","BATTALGAZİ","DARENDE","DOĞANŞEHİR","DOĞANYOL","HEKİMHAN","KALE","KULUNCAK","PÜTÜRGE","YAZIHAN","YEŞİLYURT"},
            {"AKHİSAR","ALAŞEHİR","DEMİRCİ","GÖLMARMARA","GÖRDES","KIRKAĞAÇ","KÖPRÜBAŞI","KULA","SALİHLİ","SARIGÖL","SARUHANLI","SELENDİ","SOMA","ŞEHZADELER","TURGUTLU","YUNUSEMRE"},
            {"ANDIRIN","ÇAĞLAYANCERİT","DULKADİROĞLU","EKİNÖZÜ","ELBİSTAN","GÖKSUN","NURHAK","ONİKİŞUBAT","PAZARCIK","TÜRKOĞLU"},
            {"DARGEÇİT","DERİK","KIZILTEPE","MAZIDAĞI","MİDYAT","NUSAYBİN","ÖMERLİ","SAVUR","YEŞİLLİ"},
            {"DALAMAN","DATÇA","FETHİYE","KAVAKLIDERE","KÖYCEĞİZ","MARMARİS","MENTEŞE","MİLAS","ORTACA","SEYDİKEMER","ULA","YATAĞAN"},
            {"HASKÖY","KORKUT","MALAZGİRT","MERKEZ","VARTO"},
            {"AVANOS","DERİNKUYU","GÜLŞEHİR","HACIBEKTAŞ","KOZAKLI","MERKEZ","ÜRGÜP"},
            {"BOR","ÇAMARDI","ÇİFTLİK","MERKEZ","ULUKIŞLA"},
            {"ALTINORDU","AYBASTI","ÇAMAŞ","ÇATALPINAR","ÇAYBAŞI","FATSA","GÖLKÖY","GÜLYALI","GÜRGENTEPE","İKİZCE","KABADÜZ","KABATAŞ","KORGAN","KUMRU","MESUDİYE","PERŞEMBE","ULUBEY","ÜNYE"},
            {"ÇAMLIHEMŞİN","ÇAYELİ","DEREPAZARI","FINDIKLI","GÜNEYSU","HEMŞİN","İKİZDERE","İYİDERE","KALKANDERE","MERKEZ","PAZAR"},
            {"AKYAZI","ARİFİYE","ERENLER","FERİZLİ","GEYVE","HENDEK","KARAPÜRÇEK","KARASU","KAYNARCA","KOCAALİ","PAMUKOVA","SAPANCA","SERDİVAN","SÖĞÜTLÜ","TARAKLI"},
            {"ASARCIK","ATAKUM","AYVACIK","BAFRA","CANİK","ÇARŞAMBA","HAVZA","İLKADIM","KAVAK","LADİK","SALIPAZARI","TEKKEKÖY","TERME","VEZİRKÖPRÜ","YAKAKENT","19 MAYIS"},
            {"ERUH","KURTALAN","MERKEZ","PERVARİ","ŞİRVAN","TİLLO"},
            {"BOYABAT","DİKMEN","DURAĞAN","ERFELEK","GERZE","MERKEZ","SARAYDÜZÜ","TÜRKELİ"},
            {"ALTINYAYLA","DİVRİĞİ","DOĞANŞAR","GEMEREK","GÖLOVA","GÜRÜN","HAFİK","İMRANLI","KANGAL","KOYULHİSAR","MERKEZ","SUŞEHRİ","ŞARKIŞLA","ULAŞ","YILDIZELİ","ZARA"},
            {"ÇORLU","ERGENE","HAYRABOLU","KAPAKLI","MALKARA","MARMARAEREĞLİSİ","MURATLI","SARAY","SÜLEYMANPAŞA","ŞARKÖY"},
            {"ARTOVA","BAŞÇİFTLİK","ERBAA","MERKEZ","NİKSAR","PAZAR","REŞADİYE","SULUSARAY","TURHAL","YEŞİLYURT","ZİLE"},
            {"ARAKLI","ARSİN","BEŞİKDÜZÜ","ÇARŞIBAŞI","ÇAYKARA","DERNEKPAZARI","DÜZKÖY","HAYRAT","KÖPRÜBAŞI","MAÇKA","OF","ORTAHİSAR","SÜRMENE","ŞALPAZARI","TONYA","VAKFIKEBİR","YOMRA"},
            {"HOZAT","MAZGİRT","MERKEZ","NAZIMİYE","OVACIK","PERTEK","PÜLÜMÜR"},
            {"BİRECİK","BOZOVA","CEYLANPINAR","EYYÜBİYE","HALFETİ","HALİLİYE","HARRAN","HİLVAN","KARAKÖPRÜ","SİVEREK","SURUÇ","VİRANŞEHİR"},
            {"EŞME","KARAHALLI","MERKEZ","SİVASLI","ULUBEY"},
            {"BAŞKALE","ÇALDIRAN","ÇATAK","EDREMİT","ERCİŞ","GEVAŞ","GÜRPINAR","İPEKYOLU","MURADİYE","ÖZALP","SARAY","TUŞBA"},
            {"AYDINCIK","BOĞAZLIYAN","ÇANDIR","ÇAYIRALAN","ÇEKEREK","KADIŞEHRİ","MERKEZ","SARAYKENT","SARIKAYA","SORGUN","ŞEFAATLİ","YENİFAKILI","YERKÖY"},
            {"ÇAYCUMA","DEVREK","EREĞLİ","GÖKÇEBEY","KİLİMLİ","KOZLU","MERKEZ"},
            {"ESKİL","GÜLAĞAÇ","GÜZELYURT","MERKEZ","ORTAKÖY","SARIYAHŞİ","SULTANHANI"},
            {"DEMİRÖZÜ","MERKEZ"},
            {"BAŞYAYLA","ERMENEK","KAZIMKARABEKİR","MERKEZ","SARIVELİLER"},
            {"BALIŞEYH","ÇELEBİ","DELİCE","KARAKEÇİLİ","KESKİN","MERKEZ","SULAKYURT","YAHŞİHAN"},
            {"GERCÜŞ","HASANKEYF","KOZLUK","MERKEZ","SASON"},
            {"CİZRE","GÜÇLÜKONAK","İDİL","MERKEZ","SİLOPİ","ULUDERE"},
            {"KURUCAŞİLE","MERKEZ","ULUS"},
            {"DAMAL","GÖLE","HANAK","MERKEZ","POSOF"},
            {"KARAKOYUNLU","MERKEZ","TUZLUCA"},
            {"ARMUTLU","ÇINARCIK","ÇİFTLİKKÖY","MERKEZ","TERMAL"},
            {"ESKİPAZAR","MERKEZ","OVACIK","SAFRANBOLU","YENİCE"},
            {"MERKEZ","MUSABEYLİ","POLATELİ"},
            {"DÜZİÇİ","HASANBEYLİ","KADİRLİ","MERKEZ","SUMBAS","TOPRAKKALE"}};

}