package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: tdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdf {

    /* renamed from: a */
    private static final Logger f45687a = tea.m36798a("audit_recorder");

    /* renamed from: a */
    static int m36742a(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 2;
    }

    /* renamed from: a */
    public static byte[] m36743a(Context context, cbnw cbnw, int i, int i2, String str, long j, String str2, String str3, String str4, String str5, int i3, aubq aubq) {
        bxvd da = bsqu.f146684j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqu bsqu = (bsqu) da.f164949b;
        str2.getClass();
        int i4 = bsqu.f146686a | 8;
        bsqu.f146686a = i4;
        bsqu.f146690e = str2;
        str3.getClass();
        int i5 = i4 | 16;
        bsqu.f146686a = i5;
        bsqu.f146691f = str3;
        str4.getClass();
        int i6 = i5 | 64;
        bsqu.f146686a = i6;
        bsqu.f146693h = str4;
        str5.getClass();
        bsqu.f146686a = i6 | 32;
        bsqu.f146692g = str5;
        int a = m36742a(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqu bsqu2 = (bsqu) da.f164949b;
        bsqu2.f146687b = a - 1;
        int i7 = bsqu2.f146686a | 1;
        bsqu2.f146686a = i7;
        str.getClass();
        int i8 = i7 | 2;
        bsqu2.f146686a = i8;
        bsqu2.f146688c = str;
        bsqu2.f146686a = i8 | 4;
        bsqu2.f146689d = j;
        return m36744a(context, cbnw, i, (bsqu) da.mo74062i(), i3, aubq);
    }

    /* renamed from: a */
    private static byte[] m36744a(Context context, cbnw cbnw, int i, bsqu bsqu, int i2, aubq aubq) {
        int i3;
        bsmx bsmx;
        cbnw cbnw2 = cbnw.UNKNOWN_CLIENT;
        int ordinal = cbnw.ordinal();
        if (ordinal == 1) {
            i3 = bsmv.f145451o.f145463bW;
        } else if (ordinal != 2) {
            i3 = bsmv.f145336a.f145463bW;
        } else {
            i3 = bsmv.f145452p.f145463bW;
        }
        try {
            bxvd da = bsmu.f145306c.mo74144da();
            bsna bsna = (bsna) GeneratedMessageLite.m124007a(bsna.f146214c, ByteString.m123261a(ggj.m13107a()));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsmu bsmu = (bsmu) da.f164949b;
            bsna.getClass();
            bsmu.f145309b = bsna;
            bsmu.f145308a |= 1;
            bsmu bsmu2 = (bsmu) da.mo74062i();
            int i4 = 3;
            if (i == 1) {
                bsmx = bsmx.ASTERISM_ANDROID_SETUP_INVOKED;
            } else if (i == 2) {
                bsmx = bsmx.ASTERISM_ANDROID_USER_INVOKED;
            } else if (i != 3) {
                bsmx = bsmx.CONTEXT_ID_UNSPECIFIED;
            } else {
                bsmx = bsmx.ASTERISM_ANDROID_FUNCTION_INVOKED;
            }
            bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
            bxvd da2 = bssm.f146877d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bssm bssm = (bssm) da2.f164949b;
            bssm.f146880b = bsmx.f145962iC;
            bssm.f146879a |= 1;
            bxvd da3 = bssi.f146862i.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bssi bssi = (bssi) da3.f164949b;
            bsqu.getClass();
            bssi.f146869f = bsqu;
            bssi.f146864a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bssm bssm2 = (bssm) da2.f164949b;
            bssi bssi2 = (bssi) da3.mo74062i();
            bssi2.getClass();
            bssm2.f146881c = bssi2;
            bssm2.f146879a |= 8;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw = (bsqw) bsqv.f164949b;
            bssm bssm3 = (bssm) da2.mo74062i();
            bssm3.getClass();
            bsqw.f146702f = bssm3;
            bsqw.f146697a |= 8;
            bxvd da4 = bsrf.f146744d.mo74144da();
            bsmz bsmz = bsmz.ASTERISM_CLIENT_CONSENT_CHANGE;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsrf bsrf = (bsrf) da4.f164949b;
            bsrf.f146747b = bsmz.f146213dO;
            bsrf.f146746a |= 1;
            bxvd da5 = bsrg.f146749m.mo74144da();
            bxvd da6 = bsqs.f146679c.mo74144da();
            if (i2 - 2 == 1) {
                i4 = 2;
            }
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bsqs bsqs = (bsqs) da6.f164949b;
            bsqs.f146682b = i4 - 1;
            bsqs.f146681a |= 1;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bsrg bsrg = (bsrg) da5.f164949b;
            bsqs bsqs2 = (bsqs) da6.mo74062i();
            bsqs2.getClass();
            bsrg.f146756f = bsqs2;
            bsrg.f146751a |= 8;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsrf bsrf2 = (bsrf) da4.f164949b;
            bsrg bsrg2 = (bsrg) da5.mo74062i();
            bsrg2.getClass();
            bsrf2.f146748c = bsrg2;
            bsrf2.f146746a |= 2;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw2 = (bsqw) bsqv.f164949b;
            bsrf bsrf3 = (bsrf) da4.mo74062i();
            bsrf3.getClass();
            bsqw2.f146701e = bsrf3;
            bsqw2.f146697a |= 4;
            String hexString = Long.toHexString(ryv.m34682b(context, "android_id"));
            bxvd da7 = bsrc.f146733d.mo74144da();
            bxvd da8 = bsra.f146725c.mo74144da();
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            bsra bsra = (bsra) da8.f164949b;
            hexString.getClass();
            bsra.f146727a |= 1;
            bsra.f146728b = hexString;
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bsrc bsrc = (bsrc) da7.f164949b;
            bsra bsra2 = (bsra) da8.mo74062i();
            bsra2.getClass();
            bsrc.f146737c = bsra2;
            bsrc.f146735a |= 2;
            bsrc bsrc2 = (bsrc) da7.mo74062i();
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw3 = (bsqw) bsqv.f164949b;
            bsrc2.getClass();
            bsqw3.f146699c = bsrc2;
            int i5 = bsqw3.f146697a | 1;
            bsqw3.f146697a = i5;
            bsrc2.getClass();
            bsqw3.f146700d = bsrc2;
            bsqw3.f146697a = i5 | 2;
            byte[] k = ((bsqw) bsqv.mo74062i()).serializeToBytes();
            ggp ggp = new ggp();
            ggp.f18143b = i3;
            ggp.f18145d = bsmu2.serializeToBytes();
            ggp.f18142a = 1;
            ggp.mo11800a(k);
            ggh.m13102a(context).mo11796a(ggp.mo11799a()).mo50371a(aubq);
            return bsmu2.serializeToBytes();
        } catch (bxwf e) {
            f45687a.mo25418e("failed to generate audit token", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m36745a(Context context, cbnw cbnw, int i, String str, long j, int[] iArr, int i2, aubq aubq) {
        bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
        for (int i3 : iArr) {
            bsqp.mo70703a(i3);
        }
        bxvd da = bsqu.f146684j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqu bsqu = (bsqu) da.f164949b;
        bsqq bsqq = (bsqq) bsqp.mo74062i();
        bsqq.getClass();
        bsqu.f146694i = bsqq;
        bsqu.f146686a |= 128;
        int a = m36742a(2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqu bsqu2 = (bsqu) da.f164949b;
        bsqu2.f146687b = a - 1;
        int i4 = bsqu2.f146686a | 1;
        bsqu2.f146686a = i4;
        str.getClass();
        int i5 = 2 | i4;
        bsqu2.f146686a = i5;
        bsqu2.f146688c = str;
        bsqu2.f146686a = i5 | 4;
        bsqu2.f146689d = j;
        return m36744a(context, cbnw, i, (bsqu) da.mo74062i(), i2, aubq);
    }
}
