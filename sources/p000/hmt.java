package p000;

import android.net.Uri;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: hmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hmt {
    /* renamed from: a */
    public static Credential m14617a(qun qun) {
        gvl gvl = new gvl(qun.f42170e);
        if (!bmxx.m108577a(qun.f42176k)) {
            gvl.f19077a = qun.f42176k;
        }
        if (!bmxx.m108577a(qun.f42178m)) {
            gvl.f19081e = qun.f42178m;
        } else if (!bmxx.m108577a(qun.f42172g)) {
            gvl.f19080d = qun.f42172g;
        }
        if (!bmxx.m108577a(qun.f42177l)) {
            gvl.f19078b = Uri.parse(qun.f42177l);
        }
        return gvl.mo12267a();
    }

    /* renamed from: a */
    public static qun m14618a(Credential credential, String str) {
        bxvd da = qun.f42164n.mo74144da();
        String str2 = credential.f10092a;
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
        qun.f42166a = i2 | 2;
        qun.f42167b = str;
        String b = bmxx.m108578b(credential.f10093b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qun qun2 = (qun) da.f164949b;
        b.getClass();
        qun2.f42166a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        qun2.f42176k = b;
        String b2 = bmxx.m108578b(credential.f10096e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qun qun3 = (qun) da.f164949b;
        b2.getClass();
        qun3.f42166a |= 128;
        qun3.f42172g = b2;
        String b3 = bmxx.m108578b(credential.f10097f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qun qun4 = (qun) da.f164949b;
        b3.getClass();
        int i3 = qun4.f42166a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        qun4.f42166a = i3;
        qun4.f42178m = b3;
        int i4 = i3 | 2048;
        qun4.f42166a = i4;
        qun4.f42175j = false;
        Uri uri = credential.f10094c;
        if (uri == null) {
            "".getClass();
            qun4.f42166a = i4 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            qun4.f42177l = "";
        } else {
            String uri2 = uri.toString();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qun qun5 = (qun) da.f164949b;
            uri2.getClass();
            qun5.f42166a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            qun5.f42177l = uri2;
        }
        return (qun) da.mo74062i();
    }

    /* renamed from: a */
    public static qun m14619a(String str) {
        bxvd da = qun.f42164n.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qun qun = (qun) da.f164949b;
        str.getClass();
        int i = qun.f42166a | 2;
        qun.f42166a = i;
        qun.f42167b = str;
        str.getClass();
        int i2 = i | 4;
        qun.f42166a = i2;
        qun.f42168c = str;
        qun.f42166a = i2 | 2048;
        qun.f42175j = true;
        return (qun) da.mo74062i();
    }
}
