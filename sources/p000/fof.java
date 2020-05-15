package p000;

/* renamed from: fof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fof {

    /* renamed from: a */
    private final sqv f17006a;

    /* renamed from: b */
    private long f17007b;

    public fof(sqv sqv) {
        sdo.m34959a(sqv);
        this.f17006a = sqv;
    }

    /* renamed from: a */
    public final void mo11059a() {
        this.f17007b = this.f17006a.mo20506b();
    }

    /* renamed from: b */
    public final void mo11061b() {
        this.f17007b = 0;
    }

    public fof(sqv sqv, long j) {
        sdo.m34959a(sqv);
        this.f17006a = sqv;
        this.f17007b = j;
    }

    /* renamed from: a */
    public final boolean mo11060a(long j) {
        return this.f17007b == 0 || this.f17006a.mo20506b() - this.f17007b > j;
    }
}
