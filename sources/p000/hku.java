package p000;

import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: hku */
final /* synthetic */ class hku implements bmxj {

    /* renamed from: a */
    private final hkw f19961a;

    public hku(hkw hkw) {
        this.f19961a = hkw;
    }

    public final Object apply(Object obj) {
        hkw hkw = this.f19961a;
        acyr acyr = (acyr) obj;
        hmc hmc = hkw.f19965c;
        SignInPassword signInPassword = hkw.f19963a;
        String str = hkw.f19964b;
        bxvd da = qun.f42164n.mo74144da();
        String str2 = signInPassword.f10255a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qun qun = (qun) da.f164949b;
        str2.getClass();
        int i = qun.f42166a | 32;
        qun.f42166a = i;
        qun.f42170e = str2;
        str.getClass();
        int i2 = i | 4;
        qun.f42166a = i2;
        qun.f42168c = str;
        str.getClass();
        int i3 = i2 | 2;
        qun.f42166a = i3;
        qun.f42167b = str;
        "".getClass();
        qun.f42166a = i3 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        qun.f42176k = "";
        String b = bmxx.m108578b(signInPassword.f10256b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qun qun2 = (qun) da.f164949b;
        b.getClass();
        int i4 = qun2.f42166a | 128;
        qun2.f42166a = i4;
        qun2.f42172g = b;
        "".getClass();
        int i5 = 65536 | i4;
        qun2.f42166a = i5;
        qun2.f42178m = "";
        "".getClass();
        int i6 = i5 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        qun2.f42166a = i6;
        qun2.f42177l = "";
        qun2.f42166a = i6 | 2048;
        qun2.f42175j = false;
        return hmc.mo12615a(acyr, (qun) da.mo74062i());
    }
}
