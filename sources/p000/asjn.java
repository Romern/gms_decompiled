package p000;

import android.content.Context;

/* renamed from: asjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjn {

    /* renamed from: a */
    private final ggk f89075a;

    /* renamed from: b */
    private final Context f89076b;

    public asjn(Context context) {
        this.f89075a = ggh.m13102a(context.getApplicationContext());
        this.f89076b = context;
    }

    /* renamed from: a */
    public final byte[] mo49198a(String str, String str2, bsrf bsrf, bssm bssm) {
        bxvd da = bsqx.f146703c.mo74144da();
        ByteString a = ByteString.m123261a(ggj.m13107a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqx bsqx = (bsqx) da.f164949b;
        a.getClass();
        bsqx.f146705a |= 1;
        bsqx.f146706b = a;
        byte[] k = ((bsqx) da.mo74062i()).serializeToBytes();
        bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw = (bsqw) bsqv.f164949b;
        bssm.getClass();
        bsqw.f146702f = bssm;
        int i = bsqw.f146697a | 8;
        bsqw.f146697a = i;
        bsrf.getClass();
        bsqw.f146701e = bsrf;
        bsqw.f146697a = i | 4;
        String hexString = Long.toHexString(spn.getAndroidId(this.f89076b));
        bxvd da2 = bsra.f146725c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsra bsra = (bsra) da2.f164949b;
        hexString.getClass();
        bsra.f146727a |= 1;
        bsra.f146728b = hexString;
        bsra bsra2 = (bsra) da2.mo74062i();
        bxvd da3 = bsrc.f146733d.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrc bsrc = (bsrc) da3.f164949b;
        bsra2.getClass();
        bsrc.f146737c = bsra2;
        bsrc.f146735a |= 2;
        if (str != null) {
            bxvd da4 = bsrb.f146729c.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsrb bsrb = (bsrb) da4.f164949b;
            str.getClass();
            bsrb.f146731a |= 1;
            bsrb.f146732b = str;
            bsrb bsrb2 = (bsrb) da4.mo74062i();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bsrc bsrc2 = (bsrc) da3.f164949b;
            bsrb2.getClass();
            bsrc2.f146736b = bsrb2;
            bsrc2.f146735a |= 1;
        }
        bxvd da5 = bsre.f146739d.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsre bsre = (bsre) da5.f164949b;
        bsre.f146742b = 1;
        bsre.f146741a |= 1;
        bsrc bsrc3 = (bsrc) da3.mo74062i();
        bsrc3.getClass();
        bsre.f146743c = bsrc3;
        bsre.f146741a |= 2;
        bsqv.mo70707a(da5);
        bxvd da6 = bsre.f146739d.mo74144da();
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsre bsre2 = (bsre) da6.f164949b;
        bsre2.f146742b = 2;
        bsre2.f146741a |= 1;
        bsrc bsrc4 = (bsrc) da3.mo74062i();
        bsrc4.getClass();
        bsre2.f146743c = bsrc4;
        bsre2.f146741a |= 2;
        bsqv.mo70707a(da6);
        ggp ggp = new ggp();
        ggp.f18144c = str2;
        ggp.f18145d = k;
        ggp.f18143b = 17;
        ggp.mo11800a(((bsqw) bsqv.mo74062i()).serializeToBytes());
        ggp.f18142a = 2;
        this.f89075a.mo11796a(ggp.mo11799a());
        return k;
    }

    /* renamed from: b */
    public final void mo49200b(boolean z, String str, String str2, bssm bssm) {
        int i;
        bxvd da = bsrj.f146768c.mo74144da();
        bxvd da2 = bssl.f146873c.mo74144da();
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bssl bssl = (bssl) da2.f164949b;
        bssl.f146876b = i - 1;
        bssl.f146875a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrj bsrj = (bsrj) da.f164949b;
        bssl bssl2 = (bssl) da2.mo74062i();
        bssl2.getClass();
        bsrj.f146771b = bssl2;
        bsrj.f146770a |= 1;
        bsrj bsrj2 = (bsrj) da.mo74062i();
        bxvd da3 = bsrf.f146744d.mo74144da();
        bsmz bsmz = bsmz.GOOGLE_PAY_SETTING_CHANGE;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrf bsrf = (bsrf) da3.f164949b;
        bsrf.f146747b = bsmz.f146213dO;
        bsrf.f146746a |= 1;
        bxvd da4 = bsrg.f146749m.mo74144da();
        bxvd da5 = bsru.f146799c.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsru bsru = (bsru) da5.f164949b;
        bsrj2.getClass();
        bsru.f146802b = bsrj2;
        bsru.f146801a = 4;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsrg bsrg = (bsrg) da4.f164949b;
        bsru bsru2 = (bsru) da5.mo74062i();
        bsru2.getClass();
        bsrg.f146759i = bsru2;
        bsrg.f146751a |= 134217728;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrf bsrf2 = (bsrf) da3.f164949b;
        bsrg bsrg2 = (bsrg) da4.mo74062i();
        bsrg2.getClass();
        bsrf2.f146748c = bsrg2;
        bsrf2.f146746a |= 2;
        mo49198a(str, str2, (bsrf) da3.mo74062i(), bssm);
    }

    /* renamed from: a */
    public final byte[] mo49199a(boolean z, String str, String str2, bssm bssm) {
        int i;
        bxvd da = bsrm.f146776c.mo74144da();
        bxvd da2 = bssl.f146873c.mo74144da();
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bssl bssl = (bssl) da2.f164949b;
        bssl.f146876b = i - 1;
        bssl.f146875a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrm bsrm = (bsrm) da.f164949b;
        bssl bssl2 = (bssl) da2.mo74062i();
        bssl2.getClass();
        bsrm.f146779b = bssl2;
        bsrm.f146778a |= 1;
        bsrm bsrm2 = (bsrm) da.mo74062i();
        bxvd da3 = bsrf.f146744d.mo74144da();
        bsmz bsmz = bsmz.GOOGLE_PAY_SETTING_CHANGE;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrf bsrf = (bsrf) da3.f164949b;
        bsrf.f146747b = bsmz.f146213dO;
        bsrf.f146746a |= 1;
        bxvd da4 = bsrg.f146749m.mo74144da();
        bxvd da5 = bsru.f146799c.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsru bsru = (bsru) da5.f164949b;
        bsrm2.getClass();
        bsru.f146802b = bsrm2;
        bsru.f146801a = 2;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsrg bsrg = (bsrg) da4.f164949b;
        bsru bsru2 = (bsru) da5.mo74062i();
        bsru2.getClass();
        bsrg.f146759i = bsru2;
        bsrg.f146751a |= 134217728;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsrf bsrf2 = (bsrf) da3.f164949b;
        bsrg bsrg2 = (bsrg) da4.mo74062i();
        bsrg2.getClass();
        bsrf2.f146748c = bsrg2;
        bsrf2.f146746a |= 2;
        return mo49198a(str, str2, (bsrf) da3.mo74062i(), bssm);
    }
}
