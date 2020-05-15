package p000;

/* renamed from: bkoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkoz {

    /* renamed from: a */
    public int f125039a;

    /* renamed from: b */
    public final StringBuilder f125040b = new StringBuilder();

    /* renamed from: c */
    public bknc f125041c;

    /* renamed from: d */
    private boolean f125042d;

    /* renamed from: e */
    private final bkov f125043e;

    public bkoz(bkov bkov) {
        if (((bkor) bkov).f125030b == 3) {
            this.f125043e = bkov;
            bkov.mo66175a(new bkoy(this));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final synchronized void mo66184a() {
        if (!this.f125042d) {
            this.f125042d = true;
            this.f125043e.mo66173a();
        } else {
            throw new IllegalArgumentException("Request has already been sent.");
        }
    }
}
