package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aywg */
final /* synthetic */ class aywg implements bmxj {

    /* renamed from: a */
    private final aywd f98618a;

    public aywg(aywd aywd) {
        this.f98618a = aywd;
    }

    public final Object apply(Object obj) {
        bxtx aL;
        qwo qwo = (qwo) obj;
        aywb aywb = (aywb) this.f98618a;
        boki boki = aywb.f98598c;
        if (!(boki == null || (aL = boki.mo73639aL()) == null)) {
            bxvf bxvf = qwo.f42325i;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagi cagi = (cagi) bxvf.f164949b;
            cagi cagi2 = cagi.f173096t;
            aL.getClass();
            cagi.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            cagi.f173109l = aL;
        }
        Integer num = aywb.f98599d;
        if (num != null) {
            qwo.mo24328b(num.intValue());
        }
        if (aywb.f98602g != cagz.DEFAULT) {
            qwo.f42322f = aywb.f98602g;
        }
        Long l = aywb.f98600e;
        if (!(l == null || aywb.f98601f == null)) {
            qwo.mo24324a(l.longValue(), aywb.f98601f.longValue());
        }
        int[] iArr = aywb.f98603h;
        if (iArr != null && iArr.length > 0) {
            qwo.mo24326a(iArr);
        }
        return qwo;
    }
}
