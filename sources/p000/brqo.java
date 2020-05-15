package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.firebase.auth.ActionCodeSettings;

/* renamed from: brqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqo implements brpy {

    /* renamed from: a */
    public String f143191a;

    /* renamed from: b */
    public String f143192b;

    /* renamed from: c */
    public ActionCodeSettings f143193c;

    /* renamed from: d */
    public String f143194d;

    /* renamed from: e */
    private final String f143195e;

    /* renamed from: f */
    private String f143196f;

    public brqo(bsmm bsmm) {
        this.f143195e = m114473a(bsmm);
    }

    /* renamed from: a */
    private static final String m114473a(bsmm bsmm) {
        bsmm bsmm2 = bsmm.OOB_REQ_TYPE_UNSPECIFIED;
        int ordinal = bsmm.ordinal();
        if (ordinal == 1) {
            return "PASSWORD_RESET";
        }
        if (ordinal == 4) {
            return "VERIFY_EMAIL";
        }
        if (ordinal != 6) {
            return ordinal != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_BEFORE_UPDATE_EMAIL";
        }
        return "EMAIL_SIGNIN";
    }

    public brqo(bsmm bsmm, ActionCodeSettings actionCodeSettings, String str, String str2) {
        sdo.m34959a(bsmm);
        this.f143195e = m114473a(bsmm);
        sdo.m34959a(actionCodeSettings);
        this.f143193c = actionCodeSettings;
        this.f143191a = null;
        this.f143196f = str;
        this.f143192b = str2;
        this.f143194d = null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        char c;
        bsmm bsmm;
        int i;
        bxvd da = bkkl.f124568o.mo74144da();
        String str = this.f143195e;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1288726400:
                if (str.equals("VERIFY_BEFORE_UPDATE_EMAIL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
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
            bsmm = bsmm.PASSWORD_RESET;
        } else if (c == 1) {
            bsmm = bsmm.VERIFY_EMAIL;
        } else if (c == 2) {
            bsmm = bsmm.EMAIL_SIGNIN;
        } else if (c != 3) {
            bsmm = bsmm.OOB_REQ_TYPE_UNSPECIFIED;
        } else {
            bsmm = bsmm.VERIFY_AND_CHANGE_EMAIL;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkkl bkkl = (bkkl) da.f164949b;
        bkkl.f124571b = bsmm.f145053j;
        int i2 = bkkl.f124570a | 1;
        bkkl.f124570a = i2;
        String str2 = this.f143191a;
        if (str2 != null) {
            str2.getClass();
            i2 |= 2;
            bkkl.f124570a = i2;
            bkkl.f124572c = str2;
        }
        String str3 = this.f143196f;
        if (str3 != null) {
            str3.getClass();
            i2 |= 32;
            bkkl.f124570a = i2;
            bkkl.f124573d = str3;
        }
        String str4 = this.f143192b;
        if (str4 != null) {
            str4.getClass();
            i2 |= 64;
            bkkl.f124570a = i2;
            bkkl.f124574e = str4;
        }
        ActionCodeSettings actionCodeSettings = this.f143193c;
        if (actionCodeSettings != null) {
            boolean z = actionCodeSettings.f152383e;
            int i3 = i | 2048;
            bkkl.f124570a = i3;
            bkkl.f124579j = z;
            boolean z2 = actionCodeSettings.f152385g;
            i = i3 | 8192;
            bkkl.f124570a = i;
            bkkl.f124581l = z2;
            String str5 = actionCodeSettings.f152379a;
            if (str5 != null) {
                str5.getClass();
                i |= 128;
                bkkl.f124570a = i;
                bkkl.f124575f = str5;
            }
            String str6 = actionCodeSettings.f152380b;
            if (str6 != null) {
                str6.getClass();
                i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bkkl.f124570a = i;
                bkkl.f124576g = str6;
            }
            String str7 = actionCodeSettings.f152381c;
            if (str7 != null) {
                str7.getClass();
                i |= 512;
                bkkl.f124570a = i;
                bkkl.f124577h = str7;
            }
            String str8 = actionCodeSettings.f152382d;
            if (str8 != null) {
                str8.getClass();
                i |= 1024;
                bkkl.f124570a = i;
                bkkl.f124578i = str8;
            }
            String str9 = actionCodeSettings.f152384f;
            if (str9 != null) {
                str9.getClass();
                i |= 4096;
                bkkl.f124570a = i;
                bkkl.f124580k = str9;
            }
            String str10 = actionCodeSettings.f152388j;
            if (str10 != null) {
                str10.getClass();
                i |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                bkkl.f124570a = i;
                bkkl.f124583n = str10;
            }
        }
        String str11 = this.f143194d;
        if (str11 != null) {
            str11.getClass();
            bkkl.f124570a = i | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bkkl.f124582m = str11;
        }
        return (bkkl) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo69797a(ActionCodeSettings actionCodeSettings) {
        sdo.m34959a(actionCodeSettings);
        this.f143193c = actionCodeSettings;
    }
}
