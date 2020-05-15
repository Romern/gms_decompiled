package p000;

/* renamed from: ahqr */
final /* synthetic */ class ahqr implements Runnable {

    /* renamed from: a */
    private final ahra f67819a;

    /* renamed from: b */
    private final buut f67820b;

    /* renamed from: c */
    private final buuq f67821c;

    /* renamed from: d */
    private final ahkv f67822d;

    /* renamed from: e */
    private final String f67823e;

    public ahqr(ahra ahra, buut buut, buuq buuq, ahkv ahkv, String str) {
        this.f67819a = ahra;
        this.f67820b = buut;
        this.f67821c = buuq;
        this.f67822d = ahkv;
        this.f67823e = str;
    }

    public final void run() {
        int i;
        long j;
        ahra ahra = this.f67819a;
        buut buut = this.f67820b;
        buuq buuq = this.f67821c;
        ahkv ahkv = this.f67822d;
        String str = this.f67823e;
        ahqy a = ahra.f67855d.mo36987a(buut.f154982b);
        if (a != null) {
            boolean a2 = ahra.m56393a(buuq);
            ahis ahis = new ahis();
            ahis.mo36542b(buut.f154982b);
            if (!a2) {
                i = 3;
            } else {
                i = 1;
            }
            ahis.mo36540a(i);
            ahis.mo36543c(buut.f154984d);
            if (!a2) {
                j = buuq.f154976c + ((long) buuq.f154977d.mo73744a());
            } else {
                j = buuq.f154976c;
            }
            ahis.mo36541a(j);
            ahra.mo36991a(ahkv, str, ahis.f67256a, a2);
            if (a2) {
                a.mo36985d();
                ahkv.f67390f.mo36668b(str, buut.f154982b, bvih.SUCCESS);
                return;
            }
            ahkv.f67390f.mo36667b(str, buut.f154982b, (long) buuq.f154977d.mo73744a());
        }
    }
}
