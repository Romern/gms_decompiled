package p000;

import com.google.android.gms.autofill.fill.FillField;

/* renamed from: lbk */
final /* synthetic */ class lbk implements bqeg {

    /* renamed from: a */
    private final lbm f25728a;

    /* renamed from: b */
    private final bqgg f25729b;

    /* renamed from: c */
    private final bqgg f25730c;

    /* renamed from: d */
    private final lcf f25731d;

    /* renamed from: e */
    private final FillField f25732e;

    /* renamed from: f */
    private final bqgg f25733f;

    public lbk(lbm lbm, bqgg bqgg, bqgg bqgg2, lcf lcf, FillField fillField, bqgg bqgg3) {
        this.f25728a = lbm;
        this.f25729b = bqgg;
        this.f25730c = bqgg2;
        this.f25731d = lcf;
        this.f25732e = fillField;
        this.f25733f = bqgg3;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        lbm lbm = this.f25728a;
        bqgg bqgg = this.f25729b;
        bqgg bqgg2 = this.f25730c;
        lcf lcf = this.f25731d;
        FillField fillField = this.f25732e;
        bqgg bqgg3 = this.f25733f;
        kek kek = (kek) bqgg.get();
        if (!((Boolean) bqgg2.get()).booleanValue()) {
            return bqga.m112775a(bmvz.f131120a);
        }
        kcv kcv = lcf.f25778b.f11643c;
        bnrd a = kek.f23936a.iterator();
        while (a.hasNext()) {
            Object a2 = ((kct) a.next()).mo14368a();
            if ((a2 instanceof kcp) && ((kcp) a2).f23828a.equals(kcv)) {
                return bqga.m112775a(bmxv.m108566b(new lcg(null, bmvz.f131120a, bmvz.f131120a, laz.CREDENTIAL, false, true)));
            }
        }
        if (fillField == null) {
            return bqgg3;
        }
        String str = kcv.f23841b;
        if (!str.endsWith("/")) {
            String valueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
            sb.append(valueOf);
            sb.append('/');
            str = sb.toString();
        }
        gwh a3 = gvq.m14020a(lbm.f25736b, hid.m14370a(adbv.m50143a()).mo12481a());
        roz b = rpa.m34196b();
        b.f43472a = new gvr(str);
        a3.mo24732b(b.mo24977a()).mo50372a(lbl.f25734a);
        return bqgg3;
    }
}
