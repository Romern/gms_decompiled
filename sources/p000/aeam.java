package p000;

import com.google.android.gms.common.Feature;

/* renamed from: aeam */
final /* synthetic */ class aeam implements aie {

    /* renamed from: a */
    private final aeat f62994a;

    /* renamed from: b */
    private final int f62995b;

    /* renamed from: c */
    private final int f62996c;

    public aeam(aeat aeat, int i, int i2) {
        this.f62994a = aeat;
        this.f62995b = i;
        this.f62996c = i2;
    }

    /* renamed from: a */
    public final Object mo753a(aic aic) {
        aeat aeat = this.f62994a;
        int i = this.f62995b;
        int i2 = this.f62996c;
        apjm apjm = new apjm(aeat.f63009a);
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{aphb.f84373a};
        b.f43472a = apjk.f84538a;
        b.mo24979b();
        aucb a = apjm.mo24701a(b.mo24977a());
        a.mo50380a(aeat.f63010b, new aeaq(aeat, aic, i, i2, apjm));
        a.mo50379a(aeat.f63010b, new aeai(aeat, aic, i, i2));
        return "Scheduler client check feature available";
    }
}
