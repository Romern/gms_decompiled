package p000;

/* renamed from: caws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caws extends ciqa {

    /* renamed from: a */
    final /* synthetic */ cawu f176285a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public caws(cawu cawu, ciqr ciqr) {
        super(ciqr);
        this.f176285a = cawu;
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        int i = this.f176285a.f176286a;
        if (i != 0) {
            long c = super.mo74995c(cipu, Math.min(j, (long) i));
            if (c != -1) {
                cawu cawu = this.f176285a;
                cawu.f176286a = (int) (((long) cawu.f176286a) - c);
                return c;
            }
        }
        return -1;
    }
}
