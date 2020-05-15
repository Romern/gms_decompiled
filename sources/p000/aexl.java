package p000;

import android.content.Context;

/* renamed from: aexl */
public final /* synthetic */ class aexl implements aubg {

    /* renamed from: a */
    private final bsqv f63984a;

    /* renamed from: b */
    private final String f63985b;

    /* renamed from: c */
    private final bsqx f63986c;

    /* renamed from: d */
    private final Context f63987d;

    public aexl(bsqv bsqv, String str, bsqx bsqx, Context context) {
        this.f63984a = bsqv;
        this.f63985b = str;
        this.f63986c = bsqx;
        this.f63987d = context;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        bsqv bsqv = this.f63984a;
        String str = this.f63985b;
        bsqx bsqx = this.f63986c;
        Context context = this.f63987d;
        String str2 = (String) aucb.mo50386d();
        bxvd da = bsrc.f146733d.mo74144da();
        if (str2 != null) {
            bxvd da2 = bsrb.f146729c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrb bsrb = (bsrb) da2.f164949b;
            str2.getClass();
            bsrb.f146731a |= 1;
            bsrb.f146732b = str2;
            bsrb bsrb2 = (bsrb) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrc bsrc = (bsrc) da.f164949b;
            bsrb2.getClass();
            bsrc.f146736b = bsrb2;
            bsrc.f146735a |= 1;
        }
        bxvd da3 = bsre.f146739d.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bsre bsre = (bsre) da3.f164949b;
        bsre.f146742b = 1;
        bsre.f146741a |= 1;
        bsrc bsrc2 = (bsrc) da.mo74062i();
        bsrc2.getClass();
        bsre.f146743c = bsrc2;
        bsre.f146741a |= 2;
        bsqv.mo70707a(da3);
        bxvd da4 = bsre.f146739d.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsre bsre2 = (bsre) da4.f164949b;
        bsre2.f146742b = 2;
        bsre2.f146741a = 1 | bsre2.f146741a;
        bsrc bsrc3 = (bsrc) da.mo74062i();
        bsrc3.getClass();
        bsre2.f146743c = bsrc3;
        bsre2.f146741a |= 2;
        bsqv.mo70707a(da4);
        ggp ggp = new ggp();
        ggp.f18144c = str;
        ggp.f18143b = 30;
        ggp.f18142a = 2;
        ggp.mo11800a(((bsqw) bsqv.mo74062i()).mo73642k());
        ggp.f18145d = bsqx.mo73642k();
        return ggh.m13102a(context).mo11796a(ggp.mo11799a());
    }
}
