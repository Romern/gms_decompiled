package p000;

/* renamed from: ylo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ylo {

    /* renamed from: a */
    public final bngs f54041a = bngx.m109377j();

    /* renamed from: b */
    public long f54042b;

    /* renamed from: c */
    private final bngx f54043c;

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public ylo(Iterable r5) {
        bngs j = bngx.m109377j();
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            j.mo67668c(bnjr.m109626h(((Iterable) r5.get(i)).iterator()));
        }
        this.f54043c = j.mo67664a();
    }

    /* renamed from: a */
    public final void mo30599a(int i, long j, long j2) {
        if (j < j2 && i < this.f54043c.size()) {
            bnjq bnjq = (bnjq) this.f54043c.get(i);
            while (bnjq.hasNext()) {
                yhu yhu = (yhu) bnjq.mo67862a();
                if (yhu.mo30385a() >= j2) {
                    break;
                } else if (yhu.mo30387b() <= j) {
                    bnjq.next();
                } else {
                    if (yhu.mo30387b() <= j2) {
                        bnjq.next();
                    }
                    yjc yjc = new yjc(yfv.m44005a(Math.max(j, yhu.mo30385a()), Math.min(j2, yhu.mo30387b())), yhu);
                    mo30599a(i + 1, this.f54042b, ((yfw) yjc.f53915b).f53737a);
                    this.f54042b = ((yfw) yjc.f53915b).f53738b;
                    this.f54041a.mo67668c(yjc);
                    if (yhu.mo30387b() > j2) {
                        break;
                    }
                }
            }
            mo30599a(i + 1, this.f54042b, j2);
        }
    }
}
