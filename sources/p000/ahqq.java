package p000;

/* renamed from: ahqq */
final /* synthetic */ class ahqq implements Runnable {

    /* renamed from: a */
    private final ahra f67813a;

    /* renamed from: b */
    private final buut f67814b;

    /* renamed from: c */
    private final bvih f67815c;

    /* renamed from: d */
    private final long f67816d;

    /* renamed from: e */
    private final ahkv f67817e;

    /* renamed from: f */
    private final String f67818f;

    public ahqq(ahra ahra, buut buut, bvih bvih, long j, ahkv ahkv, String str) {
        this.f67813a = ahra;
        this.f67814b = buut;
        this.f67815c = bvih;
        this.f67816d = j;
        this.f67817e = ahkv;
        this.f67818f = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahra.a(ahkv, java.lang.String, com.google.android.gms.nearby.connection.PayloadTransferUpdate, boolean):void
     arg types: [ahkv, java.lang.String, com.google.android.gms.nearby.connection.PayloadTransferUpdate, int]
     candidates:
      ahra.a(java.util.List, buut, long, buum):void
      ahra.a(buuj, java.lang.String, ahkv, bvif):void
      ahnm.a(buuj, java.lang.String, ahkv, bvif):void
      ahra.a(ahkv, java.lang.String, com.google.android.gms.nearby.connection.PayloadTransferUpdate, boolean):void */
    public final void run() {
        ahra ahra = this.f67813a;
        buut buut = this.f67814b;
        bvih bvih = this.f67815c;
        long j = this.f67816d;
        ahkv ahkv = this.f67817e;
        String str = this.f67818f;
        ahqy a = ahra.f67855d.mo36987a(buut.f154982b);
        if (a != null) {
            a.mo36985d();
            ahis ahis = new ahis();
            ahis.mo36542b(buut.f154982b);
            ahis.mo36540a(ahra.m56389a(bvih));
            ahis.mo36543c(buut.f154984d);
            ahis.mo36541a(j);
            ahra.mo36991a(ahkv, str, ahis.f67256a, true);
            ahkv.f67390f.mo36668b(str, buut.f154982b, bvih);
        }
    }
}
