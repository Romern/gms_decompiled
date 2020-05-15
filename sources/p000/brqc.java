package p000;

import com.google.firebase.auth.EmailAuthCredential;

/* renamed from: brqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqc implements brpy {

    /* renamed from: a */
    private final String f143152a;

    /* renamed from: b */
    private final String f143153b;

    /* renamed from: c */
    private final String f143154c;

    static {
        new Logger("EmailLinkSignInRequest", new String[0]);
    }

    public brqc(EmailAuthCredential emailAuthCredential, String str) {
        String str2 = emailAuthCredential.f152396a;
        sdo.m34977c(str2);
        this.f143152a = str2;
        String str3 = emailAuthCredential.f152398c;
        sdo.m34977c(str3);
        this.f143153b = str3;
        this.f143154c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo69786a() {
        String str;
        bxvd da = bkkd.f124509f.mo74144da();
        String str2 = this.f143152a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkkd bkkd = (bkkd) da.f164949b;
        str2.getClass();
        bkkd.f124511a |= 2;
        bkkd.f124513c = str2;
        brji a = brji.m114103a(this.f143153b);
        String str3 = null;
        if (a != null) {
            str = a.f142895a;
        } else {
            str = null;
        }
        if (a != null) {
            str3 = a.f142896b;
        }
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkd bkkd2 = (bkkd) da.f164949b;
            str.getClass();
            bkkd2.f124511a |= 1;
            bkkd2.f124512b = str;
        }
        if (str3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkd bkkd3 = (bkkd) da.f164949b;
            str3.getClass();
            bkkd3.f124511a |= 8;
            bkkd3.f124515e = str3;
        }
        String str4 = this.f143154c;
        if (str4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkkd bkkd4 = (bkkd) da.f164949b;
            str4.getClass();
            bkkd4.f124511a |= 4;
            bkkd4.f124514d = str4;
        }
        return (bkkd) da.mo74062i();
    }
}
