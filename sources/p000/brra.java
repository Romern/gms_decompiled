package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.firebase.auth.api.model.StringList;
import java.util.Arrays;
import java.util.List;

/* renamed from: brra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brra implements brpy {

    /* renamed from: a */
    public String f143203a;

    /* renamed from: b */
    public String f143204b;

    /* renamed from: c */
    public String f143205c;

    /* renamed from: d */
    public String f143206d;

    /* renamed from: e */
    public final StringList f143207e = new StringList();

    /* renamed from: f */
    public final StringList f143208f = new StringList();

    /* renamed from: g */
    public String f143209g;

    /* renamed from: h */
    public String f143210h;

    /* renamed from: i */
    private String f143211i;

    /* renamed from: b */
    public final void mo69811b(String str) {
        if (str == null) {
            this.f143208f.f152555b.add("EMAIL");
        } else {
            this.f143203a = str;
        }
    }

    /* renamed from: c */
    public final void mo69812c(String str) {
        sdo.m34977c(str);
        this.f143211i = str;
    }

    /* renamed from: d */
    public final void mo69813d(String str) {
        if (str == null) {
            this.f143208f.f152555b.add("PASSWORD");
        } else {
            this.f143204b = str;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        char c;
        bklo bklo;
        bxvd da = bkkt.f124621l.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkkt bkkt = (bkkt) da.f164949b;
        bkkt.f124623a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        bkkt.f124631i = true;
        List list = this.f143207e.f152555b;
        if (!bkkt.f124632j.mo73666a()) {
            bkkt.f124632j = bxvk.m124021a(bkkt.f124632j);
        }
        bxsy.m123078a(list, bkkt.f124632j);
        List list2 = this.f143208f.f152555b;
        bklo[] bkloArr = new bklo[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            String str = (String) list2.get(i);
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                bklo = bklo.EMAIL;
            } else if (c == 1) {
                bklo = bklo.DISPLAY_NAME;
            } else if (c == 2) {
                bklo = bklo.PASSWORD;
            } else if (c != 3) {
                bklo = bklo.USER_ATTRIBUTE_NAME_UNSPECIFIED;
            } else {
                bklo = bklo.PHOTO_URL;
            }
            bkloArr[i] = bklo;
        }
        List<bklo> asList = Arrays.asList(bkloArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkkt bkkt2 = (bkkt) da.f164949b;
        if (!bkkt2.f124630h.mo73666a()) {
            bkkt2.f124630h = bxvk.m124019a(bkkt2.f124630h);
        }
        for (bklo bklo2 : asList) {
            bkkt2.f124630h.mo74153d(bklo2.f124818h);
        }
        String str2 = this.f143211i;
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkt bkkt3 = (bkkt) da.f164949b;
            str2.getClass();
            bkkt3.f124623a = 1 | bkkt3.f124623a;
            bkkt3.f124624b = str2;
        }
        String str3 = this.f143203a;
        if (str3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkt bkkt4 = (bkkt) da.f164949b;
            str3.getClass();
            bkkt4.f124623a |= 8;
            bkkt4.f124626d = str3;
        }
        String str4 = this.f143204b;
        if (str4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkt bkkt5 = (bkkt) da.f164949b;
            str4.getClass();
            bkkt5.f124623a |= 16;
            bkkt5.f124627e = str4;
        }
        String str5 = this.f143205c;
        if (str5 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkt bkkt6 = (bkkt) da.f164949b;
            str5.getClass();
            bkkt6.f124623a |= 4;
            bkkt6.f124625c = str5;
        }
        String str6 = this.f143206d;
        if (str6 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkt bkkt7 = (bkkt) da.f164949b;
            str6.getClass();
            bkkt7.f124623a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bkkt7.f124629g = str6;
        }
        String str7 = this.f143209g;
        if (str7 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkt bkkt8 = (bkkt) da.f164949b;
            str7.getClass();
            bkkt8.f124623a |= 32;
            bkkt8.f124628f = str7;
        }
        String str8 = this.f143210h;
        if (str8 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkt bkkt9 = (bkkt) da.f164949b;
            str8.getClass();
            bkkt9.f124623a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            bkkt9.f124633k = str8;
        }
        return (bkkt) da.mo74062i();
    }

    /* renamed from: a */
    public final boolean mo69810a(String str) {
        sdo.m34977c(str);
        return this.f143208f.f152555b.contains(str);
    }
}
