package p000;

import java.util.function.Function;

/* renamed from: kma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kma {

    /* renamed from: a */
    private static final bngx f24449a = bngx.m109363a(kpb.OTP_1, kpb.OTP_2, kpb.OTP_3, kpb.OTP_4, kpb.OTP_5, kpb.OTP_6, kpb.OTP_7, kpb.OTP_8);

    /* renamed from: b */
    private static final bngx f24450b = bngx.m109363a("one", "two", "three", "four", "five", "six", "seven", "eight");

    /* renamed from: c */
    private static kpd f24451c = null;

    /* renamed from: d */
    private static kkp f24452d = null;

    /* renamed from: a */
    private static koy m18146a(String str, int i) {
        bxvd da = koy.f24646c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        koy koy = (koy) da.f164949b;
        str.getClass();
        koy.f24649b = str;
        koy.f24648a = i;
        return (koy) da.mo74062i();
    }

    /* renamed from: b */
    private static koz m18152b(String str, int i) {
        bxvd da = koz.f24650c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        koz koz = (koz) da.f164949b;
        str.getClass();
        koz.f24653b = str;
        koz.f24652a = i;
        return (koz) da.mo74062i();
    }

    /* renamed from: c */
    private static kpf m18154c(String str, int i) {
        bxvd da = kpf.f24737c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kpf kpf = (kpf) da.f164949b;
        str.getClass();
        kpf.f24740b = str;
        kpf.f24739a = i;
        return (kpf) da.mo74062i();
    }

    /* renamed from: d */
    private static kpg m18155d(String str, int i) {
        bxvd da = kpg.f24741c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kpg kpg = (kpg) da.f164949b;
        str.getClass();
        kpg.f24744b = str;
        kpg.f24743a = i;
        return (kpg) da.mo74062i();
    }

    /* renamed from: e */
    private static kox m18156e(String str, int i) {
        bxvd da = kox.f24642c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kox kox = (kox) da.f164949b;
        str.getClass();
        kox.f24645b = str;
        kox.f24644a = i;
        return (kox) da.mo74062i();
    }

    /* renamed from: a */
    private static kpa m18147a(int i, int i2) {
        bxvd da = kpa.f24655c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kpa kpa = (kpa) da.f164949b;
        kpa.f24658b = i;
        kpa.f24657a = i2;
        return (kpa) da.mo74062i();
    }

    /* renamed from: b */
    public static kpd m18153b(kkp kkp) {
        bxvd da = kpd.f24723c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kpd) da.f164949b).f24726b = 10;
        if (kkp.mo14594m()) {
            m18151a(da, kkp);
        }
        return (kpd) da.mo74062i();
    }

    /* renamed from: a */
    private static kpc m18148a(int i, int i2, int i3) {
        bxvd da = kpc.f24718d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kpc kpc = (kpc) da.f164949b;
        kpc.f24721b = i;
        kpc.f24722c = i2;
        kpc.f24720a = i3;
        return (kpc) da.mo74062i();
    }

    /* renamed from: a */
    public static kpd m18149a(kkp kkp) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        bxvd bxvd;
        kpe kpe;
        bxvd bxvd2;
        if (kkp.mo14596o()) {
            str9 = "search|^q$|query|qry|suche.*|搜索|探す|検索|recherch.*|busca|جستجو|искать|найти|поиск";
            str8 = "verification|card.?identification|(security|card|cc).?code|security.?number|card.?pin|c-v-v|(cvn|cvv|cvc|csc|cvd|cid|ccv)(field)?|\\bcid\\b|security.?value";
            str7 = "e.?mail|courriel|メールアドレス|Электронной.?Почты|邮件|邮箱|電郵地址|(?:이메일|전자.?우편|[Ee]-?mail)(.?주소)?|correo.*electr(o|ó)nico|ایمیل|پست.*الکترونیک";
            str6 = "^name|full.?name|your.?name|customer.?name|bill.?name|ship.?name|name.*first.*last|firstandlastname|nombre.*y.*apellidos|^nom|お名前|氏名|^nome|姓名|성명|نام.*نام.*خانوادگی";
            str5 = "first.*name|initials|fname|first$|given.*name|vorname|nombre|forename|prénom|prenom|名|nome|Имя|이름|نام";
            str4 = "last.*name|lname|surname|last$|secondname|family.*name|nachname|apellido|famille|^nom|cognome|姓|morada|apelidos|surename|sobrenome|Фамилия|\\b성(?:[^명]|\\b)|نام.*خانوادگی";
            str3 = "(?<!united )state|county|region|province|\\bland\\b|county|principality|都道府県|estado|provincia|область|省|地區|^시[·・]?도|استان";
            str2 = "country|countries|país|pais|国|国家|국가|나라|کشور";
            str = "year|^yy$|^yyyy$|ablaufdatum|gueltig|gültig|jahr|fecha|scadenza|有効期限|validade|Срок действия карты|年|有效期|date.*exp";
        } else {
            str = "year|^yy$|^yyyy$|ablaufdatum|gueltig|gültig|jahr|fecha|scadenza|有効期限|validade|Срок действия карты|年|有效期";
            str2 = "country|countries|país|pais|国|国家|국가|나라";
            str3 = "(?<!united )state|county|region|province|\\bland\\b|county|principality|都道府県|estado|provincia|область|省|地區|^시[·・]?도";
            str4 = "last.*name|lname|surname|last$|secondname|family.*name|nachname|apellido|famille|^nom|cognome|姓|morada|apelidos|surename|sobrenome|Фамилия|\\b성(?:[^명]|\\b)";
            str5 = "first.*name|initials|fname|first$|given.*name|vorname|nombre|forename|prénom|prenom|名|nome|Имя|이름";
            str6 = "^name|full.?name|your.?name|customer.?name|bill.?name|ship.?name|name.*first.*last|firstandlastname|nombre.*y.*apellidos|^nom|お名前|氏名|^nome|姓名|성명";
            str7 = "e.?mail|courriel|メールアドレス|Электронной.?Почты|邮件|邮箱|電郵地址|(?:이메일|전자.?우편|[Ee]-?mail)(.?주소)?";
            str8 = "verification|card.?identification|(security|card|cc).?code|security.?number|card.?pin|c-v-v|(cvn|cvv|cvc|csc|cvd|cid|ccv)(field)?|\\bcid\\b";
            str9 = "search";
        }
        bxvd da = kpe.f24727i.mo74144da();
        kpb kpb = kpb.USERNAME;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kpe) da.f164949b).f24729a = kpb.mo3214a();
        da.mo74005a(m18146a("(user|sign.?in|log.?in|log.?on).?(name|id)|^user$", 10));
        da.mo74006a(m18152b("(user|sign.?in|log.?in|log.?on).?(name|id)|^user$", 10));
        da.mo74010a(m18154c("(user|sign.?in|log.?in|log.?on).?(name|id)|^user$", 10));
        da.mo74005a(m18146a("^to($|[^a-z])|recipient|participant", -10000));
        da.mo74006a(m18152b("^to($|[^a-z])|recipient|participant", -10000));
        da.mo74010a(m18154c("^to($|[^a-z])|recipient|participant", -10000));
        da.mo74005a(m18146a(str9, -10000));
        da.mo74006a(m18152b(str9, -10000));
        da.mo74010a(m18154c(str9, -10000));
        if (kkp.mo14590i()) {
            da.mo74005a(m18146a("^(John|Jane|Richard)$", -10000));
        }
        if (kkp.mo14576D()) {
            da.mo74011a(m18155d("search", -10000));
        }
        bxvd da2 = kpe.f24727i.mo74144da();
        kpb kpb2 = kpb.PASSWORD;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((kpe) da2.f164949b).f24729a = kpb2.mo3214a();
        da2.mo74005a(m18146a("pass.?word", 10));
        da2.mo74006a(m18152b("pass.?word", 10));
        da2.mo74010a(m18154c("pass.?word", 10));
        da2.mo74011a(m18155d("password", 10));
        da2.mo74007a(m18147a(129, 10));
        da2.mo74007a(m18147a(225, 10));
        da2.mo74005a(m18146a(str8, -10000));
        da2.mo74006a(m18152b(str8, -10000));
        da2.mo74010a(m18154c(str8, -10000));
        if (kkp.mo14587g()) {
            da2.mo74006a(m18152b("login.*(pw|psw|pass)", 5));
            da2.mo74004a(m18156e("log.?in|sign.?in|sign.?up", 5));
            da2.mo74007a(m18147a(18, 5));
        } else {
            da2.mo74007a(m18147a(18, 10));
        }
        if (kkp.mo14590i()) {
            da2.mo74005a(m18146a("^([*●x])\\1{7,15}$", 5));
        }
        if (kkp.mo14592k()) {
            da2.mo74005a(m18146a("(choose|confirm|create|new|pick|repeat|re.?enter|re.?type|set).*(password)|(confirm|nouveau).*(mot de passe)|password.*[0-9] char", -10000));
            da2.mo74006a(m18152b("(change|confirm|choose|create|new|pick|re.?enter|repeat|sign.?up|verify)(?!.*current|.*old|.*original).*(pass|pwd|psw)|(pass|pwd|psw).*(change|confirm|choose|create|new|pick|repeat|signup)", -10000));
        }
        if (kkp.mo14574B()) {
            str10 = str;
            bxvd = da;
            da2.mo74008a(m18148a(0, 3, -10000));
        } else {
            str10 = str;
            bxvd = da;
        }
        bxvd da3 = kpe.f24727i.mo74144da();
        kpb kpb3 = kpb.NEW_PASSWORD;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((kpe) da3.f164949b).f24729a = kpb3.mo3214a();
        da3.mo74005a(m18146a("(choose|confirm|create|new|pick|repeat|re.?enter|re.?type|set).*(password)|(confirm|nouveau).*(mot de passe)|password.*[0-9] char", 10));
        da3.mo74006a(m18152b("(change|confirm|choose|create|new|pick|re.?enter|repeat|sign.?up|verify)(?!.*current|.*old|.*original).*(pass|pwd|psw)|(pass|pwd|psw).*(change|confirm|choose|create|new|pick|repeat|signup)", 10));
        da3.mo74010a(m18154c("(change|confirm|choose|create|new|pick|re.?enter|repeat|sign.?up|verify)(?!.*current|.*old|.*original).*(pass|pwd|psw)|(pass|pwd|psw).*(change|confirm|choose|create|new|pick|repeat|signup)", 10));
        kpe kpe2 = (kpe) da3.mo74062i();
        bxvd da4 = kpe.f24727i.mo74144da();
        kpb kpb4 = kpb.EMAIL_ADDRESS;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        ((kpe) da4.f164949b).f24729a = kpb4.mo3214a();
        da4.mo74005a(m18146a(str7, 10));
        da4.mo74006a(m18152b(str7, 10));
        da4.mo74010a(m18154c(str7, 10));
        da4.mo74005a(m18146a("^to($|[^a-z])|recipient|participant", -10000));
        da4.mo74006a(m18152b("^to($|[^a-z])|recipient|participant", -10000));
        da4.mo74010a(m18154c("^to($|[^a-z])|recipient|participant", -10000));
        da4.mo74005a(m18146a(str9, -10000));
        da4.mo74006a(m18152b(str9, -10000));
        da4.mo74010a(m18154c(str9, -10000));
        if (kkp.mo14590i()) {
            da4.mo74005a(m18146a("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$", 10));
        }
        if (kkp.mo14576D()) {
            da4.mo74011a(m18155d("email", 5));
            da4.mo74011a(m18155d("search", -10000));
        }
        bxvd da5 = kpe.f24727i.mo74144da();
        kpb kpb5 = kpb.PHONE_NUMBER;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        ((kpe) da5.f164949b).f24729a = kpb5.mo3214a();
        da5.mo74005a(m18146a("phone|mobile|contact.?number|telefonnummer|telefono|teléfono|telfixe|電話|telefone|telemovel|телефон|电话|(?:전화|핸드폰|휴대폰|휴대전화)(?:.?번호)?", 10));
        da5.mo74006a(m18152b("phone|mobile|contact.?number|telefonnummer|telefono|teléfono|telfixe|電話|telefone|telemovel|телефон|电话|(?:전화|핸드폰|휴대폰|휴대전화)(?:.?번호)?", 10));
        da5.mo74010a(m18154c("phone|mobile|contact.?number|telefonnummer|telefono|teléfono|telfixe|電話|telefone|telemovel|телефон|电话|(?:전화|핸드폰|휴대폰|휴대전화)(?:.?번호)?", 10));
        da5.mo74005a(m18146a("^to($|[^a-z])|recipient|participant", -10000));
        da5.mo74006a(m18152b("^to($|[^a-z])|recipient|participant", -10000));
        da5.mo74010a(m18154c("^to($|[^a-z])|recipient|participant", -10000));
        da5.mo74005a(m18146a(str9, -10000));
        da5.mo74006a(m18152b(str9, -10000));
        da5.mo74010a(m18154c(str9, -10000));
        da5.mo74010a(m18154c("quantity", -10000));
        if (kkp.mo14590i()) {
            da5.mo74005a(m18146a("(^| )(\\+\\d{1,3}\\s)\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]\\d{4}($| )|(^| )(\\+\\d{1,3}\\s)\\(?([_x#])\\6{2}\\)?[\\s.-]?\\6{3}[\\s.-]\\6{4}($| )", 10));
        }
        if (kkp.mo14576D()) {
            da5.mo74011a(m18155d("tel", 3));
            da5.mo74011a(m18155d("search", -10000));
            if (kkp.mo14574B()) {
                kpe = kpe2;
                da5.mo74008a(m18148a(1, 5, -10000));
                da5.mo74008a(m18148a(11, 15, 3));
            } else {
                kpe = kpe2;
            }
        } else {
            kpe = kpe2;
        }
        bxvd da6 = kpe.f24727i.mo74144da();
        kpb kpb6 = kpb.PHONE_NATIONAL;
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        ((kpe) da6.f164949b).f24729a = kpb6.mo3214a();
        da6.mo74005a(m18146a("phone|mobile|contact.?number|telefonnummer|telefono|teléfono|telfixe|電話|telefone|telemovel|телефон|电话|(?:전화|핸드폰|휴대폰|휴대전화)(?:.?번호)?", 10));
        da6.mo74006a(m18152b("phone|mobile|contact.?number|telefonnummer|telefono|teléfono|telfixe|電話|telefone|telemovel|телефон|电话|(?:전화|핸드폰|휴대폰|휴대전화)(?:.?번호)?", 10));
        da6.mo74010a(m18154c("phone|mobile|contact.?number|telefonnummer|telefono|teléfono|telfixe|電話|telefone|telemovel|телефон|电话|(?:전화|핸드폰|휴대폰|휴대전화)(?:.?번호)?", 10));
        da6.mo74005a(m18146a("^to($|[^a-z])|recipient|participant", -10000));
        da6.mo74006a(m18152b("^to($|[^a-z])|recipient|participant", -10000));
        da6.mo74010a(m18154c("^to($|[^a-z])|recipient|participant", -10000));
        da6.mo74005a(m18146a(str9, -10000));
        da6.mo74006a(m18152b(str9, -10000));
        da6.mo74010a(m18154c(str9, -10000));
        da6.mo74010a(m18154c("quantity", -10000));
        if (kkp.mo14590i()) {
            da6.mo74005a(m18146a("(^| )\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]\\d{4}($| )|(^| )\\(?([_x#])\\4{2}\\)?[\\s.-]?\\4{3}[\\s.-]\\4{4}($| )", 10));
            da6.mo74005a(m18146a("(^| )(\\+\\d{1,3}\\s)\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]\\d{4}($| )|(^| )(\\+\\d{1,3}\\s)\\(?([_x#])\\6{2}\\)?[\\s.-]?\\6{3}[\\s.-]\\6{4}($| )", -10000));
        }
        if (kkp.mo14576D()) {
            da6.mo74011a(m18155d("tel", 3));
            da6.mo74011a(m18155d("search", -10000));
            if (kkp.mo14574B()) {
                da6.mo74008a(m18148a(1, 5, -10000));
                da6.mo74008a(m18148a(10, 10, 3));
            }
        }
        bxvd da7 = kpe.f24727i.mo74144da();
        kpb kpb7 = kpb.PHONE_COUNTRY_CODE;
        if (da7.f164950c) {
            da7.mo74035c();
            da7.f164950c = false;
        }
        ((kpe) da7.f164949b).f24729a = kpb7.mo3214a();
        if (kkp.mo14590i()) {
            da7.mo74005a(m18146a("^\\+\\d{1,3}$", 10));
        }
        if (kkp.mo14576D()) {
            da7.mo74011a(m18155d("search", -10000));
            if (kkp.mo14574B()) {
                bxvd2 = da6;
                da7.mo74008a(m18148a(4, 15, -10000));
            } else {
                bxvd2 = da6;
            }
        } else {
            bxvd2 = da6;
        }
        bxvd da8 = kpe.f24727i.mo74144da();
        kpb kpb8 = kpb.PERSON_NAME;
        if (da8.f164950c) {
            da8.mo74035c();
            da8.f164950c = false;
        }
        ((kpe) da8.f164949b).f24729a = kpb8.mo3214a();
        da8.mo74005a(m18146a(str6, 10));
        da8.mo74006a(m18152b(str6, 10));
        da8.mo74010a(m18154c(str6, 10));
        da8.mo74005a(m18146a("user.?name|user.?id|nickname|maiden name|title|prefix|suffix|vollständiger.?name|用户名|(?:사용자.?)?아이디|사용자.?ID", -10000));
        da8.mo74006a(m18152b("user.?name|user.?id|nickname|maiden name|title|prefix|suffix|vollständiger.?name|用户名|(?:사용자.?)?아이디|사용자.?ID", -10000));
        da8.mo74010a(m18154c("user.?name|user.?id|nickname|maiden name|title|prefix|suffix|vollständiger.?name|用户名|(?:사용자.?)?아이디|사용자.?ID", -10000));
        da8.mo74005a(m18146a("^to($|[^a-z])|recipient|participant", -10000));
        da8.mo74006a(m18152b("^to($|[^a-z])|recipient|participant", -10000));
        da8.mo74010a(m18154c("^to($|[^a-z])|recipient|participant", -10000));
        da8.mo74005a(m18146a(str9, -10000));
        da8.mo74006a(m18152b(str9, -10000));
        da8.mo74010a(m18154c(str9, -10000));
        if (kkp.mo14588h()) {
            da8.mo74005a(m18146a("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$", -10000));
        }
        if (kkp.mo14590i()) {
            da8.mo74005a(m18146a("^(John Doe|Jane Doe|John Appleseed|Richard Roe|Jane Roe|Lando Calrissian|Turanga Leela)$", 10));
        }
        if (kkp.mo14576D()) {
            da8.mo74011a(m18155d("search", -10000));
        }
        bxvd da9 = kpe.f24727i.mo74144da();
        kpb kpb9 = kpb.PERSON_NAME_GIVEN;
        if (da9.f164950c) {
            da9.mo74035c();
            da9.f164950c = false;
        }
        ((kpe) da9.f164949b).f24729a = kpb9.mo3214a();
        da9.mo74005a(m18146a(str5, 10));
        da9.mo74006a(m18152b(str5, 10));
        da9.mo74010a(m18154c(str5, 10));
        if (kkp.mo14590i()) {
            da9.mo74005a(m18146a("^(John|Jane|Richard)$", 10));
            da9.mo74005a(m18146a("^(John Doe|Jane Doe|John Appleseed|Richard Roe|Jane Roe|Lando Calrissian|Turanga Leela)$", -10000));
        }
        bxvd da10 = kpe.f24727i.mo74144da();
        kpb kpb10 = kpb.PERSON_NAME_MIDDLE;
        if (da10.f164950c) {
            da10.mo74035c();
            da10.f164950c = false;
        }
        ((kpe) da10.f164949b).f24729a = kpb10.mo3214a();
        da10.mo74005a(m18146a("middle.*name|mname|middle$|apellido.?materno|lastlastname", 10));
        da10.mo74006a(m18152b("middle.*name|mname|middle$|apellido.?materno|lastlastname", 10));
        da10.mo74010a(m18154c("middle.*name|mname|middle$|apellido.?materno|lastlastname", 10));
        kpe kpe3 = (kpe) da10.mo74062i();
        bxvd da11 = kpe.f24727i.mo74144da();
        kpb kpb11 = kpb.PERSON_NAME_MIDDLE_INITAL;
        if (da11.f164950c) {
            da11.mo74035c();
            da11.f164950c = false;
        }
        ((kpe) da11.f164949b).f24729a = kpb11.mo3214a();
        da11.mo74005a(m18146a("middle.*initial|m\\.i\\.|mi$|\\bmi\\b", 10));
        da11.mo74006a(m18152b("middle.*initial|m\\.i\\.|mi$|\\bmi\\b", 10));
        da11.mo74010a(m18154c("middle.*initial|m\\.i\\.|mi$|\\bmi\\b", 10));
        kpe kpe4 = (kpe) da11.mo74062i();
        bxvd da12 = kpe.f24727i.mo74144da();
        kpb kpb12 = kpb.PERSON_NAME_FAMILY;
        if (da12.f164950c) {
            da12.mo74035c();
            da12.f164950c = false;
        }
        ((kpe) da12.f164949b).f24729a = kpb12.mo3214a();
        da12.mo74005a(m18146a(str4, 10));
        da12.mo74006a(m18152b(str4, 10));
        da12.mo74010a(m18154c(str4, 10));
        if (kkp.mo14590i()) {
            da12.mo74005a(m18146a("^(Doe|Appleseed|Roe)$", 10));
            da12.mo74005a(m18146a("^(John Doe|Jane Doe|John Appleseed|Richard Roe|Jane Roe|Lando Calrissian|Turanga Leela)$", -10000));
        }
        int i = !kkp.mo14588h() ? 10 : 9;
        bxvd da13 = kpe.f24727i.mo74144da();
        kpb kpb13 = kpb.POSTAL_ADDRESS_STREET_ADDRESS;
        if (da13.f164950c) {
            da13.mo74035c();
            da13.f164950c = false;
        }
        ((kpe) da13.f164949b).f24729a = kpb13.mo3214a();
        da13.mo74005a(m18146a("address$|address.?line.?(1|one)|address1|addr1|street|(?:shipping|billing)address$|strasse|straße|hausnummer|housenumber|house.?name|direccion|dirección|adresse|indirizzo|^住所$|住所1|morada|endereço|Адрес|地址|^주소.?$|주소.?1", i));
        da13.mo74006a(m18152b("address$|address.?line.?(1|one)|address1|addr1|street|(?:shipping|billing)address$|strasse|straße|hausnummer|housenumber|house.?name|direccion|dirección|adresse|indirizzo|^住所$|住所1|morada|endereço|Адрес|地址|^주소.?$|주소.?1", i));
        da13.mo74010a(m18154c("address$|address.?line.?(1|one)|address1|addr1|street|(?:shipping|billing)address$|strasse|straße|hausnummer|housenumber|house.?name|direccion|dirección|adresse|indirizzo|^住所$|住所1|morada|endereço|Адрес|地址|^주소.?$|주소.?1", i));
        da13.mo74005a(m18146a("address.?line.?(2|two)|address2|addr2|street2|suite|unit|adresszusatz|ergänzende.?angaben|direccion2|colonia|adicional|addresssuppl|complementnom|appartement|indirizzo2|住所2|complemento|addrcomplement|Улица|地址2|주소.?2", -10000));
        da13.mo74006a(m18152b("address.?line.?(2|two)|address2|addr2|street2|suite|unit|adresszusatz|ergänzende.?angaben|direccion2|colonia|adicional|addresssuppl|complementnom|appartement|indirizzo2|住所2|complemento|addrcomplement|Улица|地址2|주소.?2", -10000));
        da13.mo74010a(m18154c("address.?line.?(2|two)|address2|addr2|street2|suite|unit|adresszusatz|ergänzende.?angaben|direccion2|colonia|adicional|addresssuppl|complementnom|appartement|indirizzo2|住所2|complemento|addrcomplement|Улица|地址2|주소.?2", -10000));
        bxvd da14 = kpe.f24727i.mo74144da();
        kpb kpb14 = kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS;
        kpe kpe5 = (kpe) da13.mo74062i();
        if (da14.f164950c) {
            da14.mo74035c();
            da14.f164950c = false;
        }
        ((kpe) da14.f164949b).f24729a = kpb14.mo3214a();
        da14.mo74005a(m18146a("address.?line.?(2|two)|address2|addr2|street2|suite|unit|adresszusatz|ergänzende.?angaben|direccion2|colonia|adicional|addresssuppl|complementnom|appartement|indirizzo2|住所2|complemento|addrcomplement|Улица|地址2|주소.?2", 10));
        da14.mo74006a(m18152b("address.?line.?(2|two)|address2|addr2|street2|suite|unit|adresszusatz|ergänzende.?angaben|direccion2|colonia|adicional|addresssuppl|complementnom|appartement|indirizzo2|住所2|complemento|addrcomplement|Улица|地址2|주소.?2", 10));
        da14.mo74010a(m18154c("address.?line.?(2|two)|address2|addr2|street2|suite|unit|adresszusatz|ergänzende.?angaben|direccion2|colonia|adicional|addresssuppl|complementnom|appartement|indirizzo2|住所2|complemento|addrcomplement|Улица|地址2|주소.?2", 10));
        kpe kpe6 = (kpe) da14.mo74062i();
        bxvd da15 = kpe.f24727i.mo74144da();
        kpb kpb15 = kpb.POSTAL_ADDRESS_LOCALITY;
        if (da15.f164950c) {
            da15.mo74035c();
            da15.f164950c = false;
        }
        ((kpe) da15.f164949b).f24729a = kpb15.mo3214a();
        kpe kpe7 = kpe6;
        da15.mo74005a(m18146a("city|town|\\bort\\b|stadt|suburb|ciudad|provincia|localidad|poblacion|ville|commune|localita|市区町村|cidade|Город|市|分區|^시[^도·・]|시[·・]?군[·・]?구", 10));
        da15.mo74006a(m18152b("city|town|\\bort\\b|stadt|suburb|ciudad|provincia|localidad|poblacion|ville|commune|localita|市区町村|cidade|Город|市|分區|^시[^도·・]|시[·・]?군[·・]?구", 10));
        da15.mo74010a(m18154c("city|town|\\bort\\b|stadt|suburb|ciudad|provincia|localidad|poblacion|ville|commune|localita|市区町村|cidade|Город|市|分區|^시[^도·・]|시[·・]?군[·・]?구", 10));
        kpe kpe8 = (kpe) da15.mo74062i();
        bxvd da16 = kpe.f24727i.mo74144da();
        kpb kpb16 = kpb.POSTAL_ADDRESS_REGION;
        if (da16.f164950c) {
            da16.mo74035c();
            da16.f164950c = false;
        }
        ((kpe) da16.f164949b).f24729a = kpb16.mo3214a();
        da16.mo74005a(m18146a(str3, 10));
        da16.mo74006a(m18152b(str3, 10));
        da16.mo74010a(m18154c(str3, 10));
        kpe kpe9 = (kpe) da16.mo74062i();
        bxvd da17 = kpe.f24727i.mo74144da();
        kpb kpb17 = kpb.POSTAL_ADDRESS_POSTAL_CODE;
        if (da17.f164950c) {
            da17.mo74035c();
            da17.f164950c = false;
        }
        ((kpe) da17.f164949b).f24729a = kpb17.mo3214a();
        kpe kpe10 = kpe9;
        da17.mo74005a(m18146a("zip|postal|post.*code|pcode|pin.?code|postleitzahl|\\bcp\\b|\\bcdp\\b|\\bcap\\b|郵便番号|codigo|codpos|\\bcep\\b|Почтовый.?Индекс|邮政编码|邮编|郵遞區號|우편.?번호", 10));
        da17.mo74006a(m18152b("zip|postal|post.*code|pcode|pin.?code|postleitzahl|\\bcp\\b|\\bcdp\\b|\\bcap\\b|郵便番号|codigo|codpos|\\bcep\\b|Почтовый.?Индекс|邮政编码|邮编|郵遞區號|우편.?번호", 10));
        da17.mo74010a(m18154c("zip|postal|post.*code|pcode|pin.?code|postleitzahl|\\bcp\\b|\\bcdp\\b|\\bcap\\b|郵便番号|codigo|codpos|\\bcep\\b|Почтовый.?Индекс|邮政编码|邮编|郵遞區號|우편.?번호", 10));
        kpe kpe11 = (kpe) da17.mo74062i();
        bxvd da18 = kpe.f24727i.mo74144da();
        kpb kpb18 = kpb.POSTAL_ADDRESS_COUNTRY;
        if (da18.f164950c) {
            da18.mo74035c();
            da18.f164950c = false;
        }
        ((kpe) da18.f164949b).f24729a = kpb18.mo3214a();
        da18.mo74005a(m18146a(str2, 10));
        da18.mo74006a(m18152b(str2, 10));
        da18.mo74010a(m18154c(str2, 10));
        kpe kpe12 = (kpe) da18.mo74062i();
        bxvd da19 = kpe.f24727i.mo74144da();
        kpb kpb19 = kpb.PAYMENT_CARD_NUMBER;
        if (da19.f164950c) {
            da19.mo74035c();
            da19.f164950c = false;
        }
        ((kpe) da19.f164949b).f24729a = kpb19.mo3214a();
        kpe kpe13 = kpe11;
        da19.mo74005a(m18146a("(add)?(?:card|cc|acct).?(?:number|#|no|num|field)|nummer|credito|numero|número|numéro|カード番号|Номер.*карты|信用卡号|信用卡号码|信用卡卡號|카드", 10));
        da19.mo74006a(m18152b("(add)?(?:card|cc|acct).?(?:number|#|no|num|field)|nummer|credito|numero|número|numéro|カード番号|Номер.*карты|信用卡号|信用卡号码|信用卡卡號|카드", 10));
        da19.mo74010a(m18154c("(add)?(?:card|cc|acct).?(?:number|#|no|num|field)|nummer|credito|numero|número|numéro|カード番号|Номер.*карты|信用卡号|信用卡号码|信用卡卡號|카드", 10));
        if (kkp.mo14590i()) {
            da19.mo74005a(m18146a("^\\d{4}[\\s-]\\d{4,6}?[\\s-]\\d{4,5}[\\s-]?(\\d{0}|\\d{4})$|^[x]{4}[\\s-][x]{4,6}?[\\s-][x]{4,5}[\\s-]?([x]{0}|[x]{4})$", 10));
        }
        bxvd da20 = kpe.f24727i.mo74144da();
        kpb kpb20 = kpb.PAYMENT_CARD_HOLDER_NAME;
        if (da20.f164950c) {
            da20.mo74035c();
            da20.f164950c = false;
        }
        ((kpe) da20.f164949b).f24729a = kpb20.mo3214a();
        bxvd bxvd3 = da19;
        da20.mo74005a(m18146a("card.?(?:holder|owner)|name.*(\\b)?on(\\b)?.*card|(?:card|cc).?name|cc.?full.?name|karteninhaber|nombre.*tarjeta|nom.*carte|nome.*cart|名前|Имя.*карты|信用卡开户名|开户名|持卡人姓名|持卡人姓名", 10));
        da20.mo74006a(m18152b("card.?(?:holder|owner)|name.*(\\b)?on(\\b)?.*card|(?:card|cc).?name|cc.?full.?name|karteninhaber|nombre.*tarjeta|nom.*carte|nome.*cart|名前|Имя.*карты|信用卡开户名|开户名|持卡人姓名|持卡人姓名", 10));
        da20.mo74010a(m18154c("card.?(?:holder|owner)|name.*(\\b)?on(\\b)?.*card|(?:card|cc).?name|cc.?full.?name|karteninhaber|nombre.*tarjeta|nom.*carte|nome.*cart|名前|Имя.*карты|信用卡开户名|开户名|持卡人姓名|持卡人姓名", 10));
        kpe kpe14 = (kpe) da20.mo74062i();
        bxvd da21 = kpe.f24727i.mo74144da();
        kpb kpb21 = kpb.PAYMENT_CARD_CVN;
        if (da21.f164950c) {
            da21.mo74035c();
            da21.f164950c = false;
        }
        ((kpe) da21.f164949b).f24729a = kpb21.mo3214a();
        da21.mo74005a(m18146a(str8, 10));
        da21.mo74006a(m18152b(str8, 10));
        da21.mo74010a(m18154c(str8, 10));
        if (kkp.mo14590i()) {
            da21.mo74005a(m18146a("^\\d{3}$|^([*x_])\\1{2}$", 4));
        }
        if (kkp.mo14574B()) {
            da21.mo74008a(m18148a(7, 10, -10000));
        }
        if (kkp.mo14575C()) {
            da21.mo74005a(m18146a("otp|((^|\\D)\\d\\D+digit|sms|verif)(?!.*pin).*code|Nhập mã xác", -10000));
        }
        bxvd da22 = kpe.f24727i.mo74144da();
        kpb kpb22 = kpb.PAYMENT_CARD_EXPIRATION_MONTH;
        if (da22.f164950c) {
            da22.mo74035c();
            da22.f164950c = false;
        }
        ((kpe) da22.f164949b).f24729a = kpb22.mo3214a();
        bxvd bxvd4 = da21;
        da22.mo74005a(m18146a("exp.*mo|month|^mm$|gueltig|gültig|monat|fecha|date.*exp|scadenza|有効期限|validade|Срок действия карты|月", 10));
        da22.mo74006a(m18152b("exp.*mo|month|^mm$|gueltig|gültig|monat|fecha|date.*exp|scadenza|有効期限|validade|Срок действия карты|月", 10));
        da22.mo74010a(m18154c("exp.*mo|month|^mm$|gueltig|gültig|monat|fecha|date.*exp|scadenza|有効期限|validade|Срок действия карты|月", 10));
        kpe kpe15 = (kpe) da22.mo74062i();
        bxvd da23 = kpe.f24727i.mo74144da();
        kpb kpb23 = kpb.PAYMENT_CARD_EXPIRATION_YEAR;
        if (da23.f164950c) {
            da23.mo74035c();
            da23.f164950c = false;
        }
        ((kpe) da23.f164949b).f24729a = kpb23.mo3214a();
        kpe kpe16 = kpe15;
        da23.mo74005a(m18146a(str10, 10));
        da23.mo74006a(m18152b(str10, 10));
        da23.mo74010a(m18154c(str10, 10));
        kpe kpe17 = (kpe) da23.mo74062i();
        bxvd da24 = kpe.f24727i.mo74144da();
        kpb kpb24 = kpb.PAYMENT_CARD_EXPIRATION_DATE;
        if (da24.f164950c) {
            da24.mo74035c();
            da24.f164950c = false;
        }
        ((kpe) da24.f164949b).f24729a = kpb24.mo3214a();
        da24.mo74005a(m18146a("expir|exp.*date|^expfield$|gueltig|gültig|fecha|date.*exp|scadenza|有効期限|validade|Срок действия карты", 10));
        da24.mo74006a(m18152b("expir|exp.*date|^expfield$|gueltig|gültig|fecha|date.*exp|scadenza|有効期限|validade|Срок действия карты", 10));
        da24.mo74010a(m18154c("expir|exp.*date|^expfield$|gueltig|gültig|fecha|date.*exp|scadenza|有効期限|validade|Срок действия карты", 10));
        if (kkp.mo14590i()) {
            da24.mo74005a(m18146a("(^| )mm.?(yy|yyyy)($| )", 10));
        }
        int i2 = !kkp.mo14588h() ? 10 : 8;
        bxvd da25 = kpd.f24723c.mo74144da();
        int i3 = i2;
        da25.mo74042d(bxvd);
        da25.mo74042d(da2);
        da25.mo74042d(da4);
        da25.mo74042d(da5);
        da25.mo74042d(bxvd2);
        da25.mo74042d(da7);
        da25.mo74042d(da8);
        da25.mo74042d(da9);
        da25.mo74009a(kpe3);
        da25.mo74009a(kpe4);
        da25.mo74042d(da9);
        da25.mo74042d(da12);
        da25.mo74009a(kpe5);
        da25.mo74009a(kpe7);
        da25.mo74009a(kpe8);
        da25.mo74009a(kpe10);
        da25.mo74009a(kpe12);
        da25.mo74009a(kpe13);
        da25.mo74042d(bxvd3);
        da25.mo74009a(kpe14);
        da25.mo74042d(bxvd4);
        da25.mo74009a(kpe16);
        da25.mo74009a(kpe17);
        da25.mo74042d(da24);
        if (da25.f164950c) {
            da25.mo74035c();
            da25.f164950c = false;
        }
        ((kpd) da25.f164949b).f24726b = i3;
        if (kkp.mo14592k()) {
            da25.mo74009a(kpe);
        }
        if (kkp.mo14594m()) {
            m18151a(da25, kkp);
        }
        return (kpd) da25.mo74062i();
    }

    /* renamed from: a */
    public static kpd m18150a(kkp kkp, boolean z) {
        Function function;
        kpd a = kkp.mo14580a();
        if (!a.f24725a.isEmpty()) {
            return a;
        }
        if (!z) {
            function = klz.f24448a;
        } else {
            function = kly.f24447a;
        }
        if (kkp.mo14598q()) {
            if (!kkp.equals(f24452d) || f24451c == null) {
                f24451c = (kpd) function.apply(kkp);
            }
            f24452d = kkp;
            return f24451c;
        }
        f24452d = null;
        f24451c = null;
        return (kpd) function.apply(kkp);
    }

    /* renamed from: a */
    private static void m18151a(bxvd bxvd, kkp kkp) {
        bxvd da = kpe.f24727i.mo74144da();
        kpb kpb = kpb.OTP_FULL;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((kpe) da.f164949b).f24729a = kpb.mo3214a();
        da.mo74005a(m18146a("otp|((^|\\D)\\d\\D+digit|sms|verif)(?!.*pin).*code|Nhập mã xác", 10));
        da.mo74006a(m18152b("(?<!forg)otp(?!.*anel|.*one|.*two|.*three|.*four|.*five|.*six|.*seven|.*eight|.*\\d)|(sms|verif).*code", 10));
        da.mo74010a(m18154c("(?<!forg)otp(?!.*anel|.*one|.*two|.*three|.*four|.*five|.*six|.*seven|.*eight|.*\\d)|(sms|verif).*code", 10));
        da.mo74004a(m18156e("mail", -10000));
        if (kkp.mo14574B()) {
            da.mo74008a(m18148a(2, 10, 2));
            da.mo74008a(m18148a(1, 1, -10000));
        }
        if (kkp.mo14575C()) {
            da.mo74005a(m18146a("enter.?code", 5));
            da.mo74010a(m18154c("enter.?code", 5));
        }
        bngs j = bngx.m109377j();
        int i = 0;
        while (i < f24449a.size()) {
            bxvd da2 = kpe.f24727i.mo74144da();
            kpb kpb2 = (kpb) f24449a.get(i);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((kpe) da2.f164949b).f24729a = kpb2.mo3214a();
            i++;
            da2.mo74006a(m18152b(String.format("(otp|auth|pass).*((\\D%d(\\D|$))|%s)", Integer.valueOf(i), f24450b.get(i - 1)), 10));
            if (kkp.mo14574B()) {
                da2.mo74008a(m18148a(1, 1, 10));
                da2.mo74008a(m18148a(2, Integer.MAX_VALUE, -10000));
            }
            j.mo67668c((kpe) da2.mo74062i());
        }
        bxvd.mo74042d(da);
        bngx a = j.mo67664a();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        kpd kpd = (kpd) bxvd.f164949b;
        kpd kpd2 = kpd.f24723c;
        kpd.mo14761a();
        bxsy.m123078a(a, kpd.f24725a);
    }
}
