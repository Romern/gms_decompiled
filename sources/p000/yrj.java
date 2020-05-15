package p000;

/* renamed from: yrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yrj {
    /* renamed from: a */
    public static caaa m44664a(cadn cadn) {
        bxvd da = caaa.f172305j.mo74144da();
        bxwc bxwc = cadn.f172704d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caaa caaa = (caaa) da.f164949b;
        if (!caaa.f172312f.mo73666a()) {
            caaa.f172312f = GeneratedMessageLite.m124021a(caaa.f172312f);
        }
        bxsy.m123078a(bxwc, caaa.f172312f);
        long j = cadn.f172703c;
        if (j <= 0) {
            j = cadn.f172702b;
        }
        if (j != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caaa caaa2 = (caaa) da.f164949b;
            caaa2.f172307a |= 1;
            caaa2.f172308b = j;
        }
        long j2 = cadn.f172702b;
        if (j2 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caaa caaa3 = (caaa) da.f164949b;
            caaa3.f172307a |= 2;
            caaa3.f172309c = j2;
        }
        long j3 = cadn.f172708h;
        if (j3 > 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caaa caaa4 = (caaa) da.f164949b;
            caaa4.f172307a |= 16;
            caaa4.f172313g = j3;
        }
        long j4 = cadn.f172707g;
        if (j4 > 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caaa caaa5 = (caaa) da.f164949b;
            caaa5.f172307a |= 32;
            caaa5.f172314h = j4;
        }
        if ((cadn.f172701a & 64) != 0) {
            ByteString bxtx = cadn.f172709i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caaa caaa6 = (caaa) da.f164949b;
            bxtx.getClass();
            caaa6.f172307a |= 128;
            caaa6.f172315i = bxtx;
        }
        if ((cadn.f172701a & 8) != 0) {
            caae caae = cadn.f172706f;
            if (caae == null) {
                caae = caae.f172323i;
            }
            String str = caae.f172326b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caaa caaa7 = (caaa) da.f164949b;
            str.getClass();
            caaa7.f172307a |= 8;
            caaa7.f172311e = str;
        }
        return (caaa) da.mo74062i();
    }
}
