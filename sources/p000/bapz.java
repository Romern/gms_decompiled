package p000;

/* renamed from: bapz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bapz {

    /* renamed from: a */
    public bnhe f101550a;

    /* renamed from: b */
    private Long f101551b;

    /* renamed from: c */
    private Long f101552c;

    public bapz() {
    }

    /* renamed from: a */
    public final baqa mo55881a() {
        String str = this.f101551b == null ? " read" : "";
        if (this.f101552c == null) {
            str = str.concat(" write");
        }
        if (this.f101550a == null) {
            str = String.valueOf(str).concat(" triggers");
        }
        if (str.isEmpty()) {
            return new baov(this.f101551b.longValue(), this.f101552c.longValue(), this.f101550a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo55884b(long j) {
        this.f101552c = Long.valueOf(j);
    }

    public bapz(baqa baqa) {
        baov baov = (baov) baqa;
        this.f101551b = Long.valueOf(baov.f101442a);
        this.f101552c = Long.valueOf(baov.f101443b);
        this.f101550a = baov.f101444c;
    }

    /* renamed from: a */
    public final void mo55882a(long j) {
        this.f101551b = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo55883a(bnhe bnhe) {
        if (bnhe != null) {
            this.f101550a = bnhe;
            return;
        }
        throw new NullPointerException("Null triggers");
    }
}
