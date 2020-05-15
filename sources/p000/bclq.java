package p000;

/* renamed from: bclq */
final /* synthetic */ class bclq implements bmxj {

    /* renamed from: a */
    private final bcoh f104440a;

    /* renamed from: b */
    private final String f104441b;

    /* renamed from: c */
    private final bcnt f104442c;

    public bclq(bcoh bcoh, String str, bcnt bcnt) {
        this.f104440a = bcoh;
        this.f104441b = str;
        this.f104442c = bcnt;
    }

    public final Object apply(Object obj) {
        int i;
        cbge cbge;
        bcoh bcoh = this.f104440a;
        String str = this.f104441b;
        bcnt bcnt = this.f104442c;
        cbgg cbgg = (cbgg) obj;
        bcul bcul = bcul.UNKNOWN;
        bcug bcug = bcug.UNKNOWN;
        int i2 = cbgg.f177031c;
        if (i2 != 0) {
            i = i2 != 1 ? i2 != 2 ? 0 : 4 : 3;
        } else {
            i = 2;
        }
        if (i == 0) {
            i = 1;
        }
        int i3 = i - 2;
        if (i3 == 1) {
            if (cbgg.f177029a == 2) {
                cbge = (cbge) cbgg.f177030b;
            } else {
                cbge = cbge.f177021b;
            }
            return bcqm.m89633a(cbge.f177023a);
        } else if (i3 == 2) {
            return bcqi.f104675a;
        } else {
            bcnr q = bcns.m89409q();
            q.mo57011b(24);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57013b(str);
            q.mo57003a(115);
            bcnt.mo56753a(q.mo57002a());
            return bcqk.f104677a;
        }
    }
}
