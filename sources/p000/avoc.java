package p000;

import android.content.Context;
import java.util.List;

/* renamed from: avoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avoc {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* renamed from: a */
    public static bohp m78906a(Context context, avqd avqd) {
        boolean a;
        int i;
        bxvd da = bohp.f133122e.mo74144da();
        bmxv a2 = avqd.mo51494a();
        synchronized (avqd.f93767c) {
            a = avqd.f93769e.mo66813a();
        }
        if (!a || !a2.mo66813a()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bohp bohp = (bohp) da.f164949b;
            int i2 = bohp.f133124a | 1;
            bohp.f133124a = i2;
            bohp.f133125b = 3;
            bohp.f133124a = i2 | 2;
            bohp.f133127d = true;
        } else {
            if (avqd instanceof avqf) {
                avqf avqf = (avqf) avqd;
                if (!avqf.f93776g.get()) {
                    i = avqf.f93777h.get() ? 1 : 2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bohp bohp2 = (bohp) da.f164949b;
                    bohp2.f133124a = 1 | bohp2.f133124a;
                    bohp2.f133125b = i;
                    boolean b = ((avqa) a2.mo66814b()).mo51489b(context);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bohp bohp3 = (bohp) da.f164949b;
                    bohp3.f133124a |= 2;
                    bohp3.f133127d = b;
                }
            }
            i = 0;
            if (da.f164950c) {
            }
            bohp bohp22 = (bohp) da.f164949b;
            bohp22.f133124a = 1 | bohp22.f133124a;
            bohp22.f133125b = i;
            boolean b2 = ((avqa) a2.mo66814b()).mo51489b(context);
            if (da.f164950c) {
            }
            bohp bohp32 = (bohp) da.f164949b;
            bohp32.f133124a |= 2;
            bohp32.f133127d = b2;
        }
        List b3 = avlt.m78749b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bohp bohp4 = (bohp) da.f164949b;
        if (!bohp4.f133126c.mo73666a()) {
            bohp4.f133126c = GeneratedMessageLite.m124021a(bohp4.f133126c);
        }
        bxsy.m123078a(b3, bohp4.f133126c);
        return (bohp) da.mo74062i();
    }
}
