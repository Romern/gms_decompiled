package p000;

/* renamed from: bdib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdib {

    /* renamed from: a */
    public bqgk f105682a;

    /* renamed from: b */
    public Integer f105683b;

    /* renamed from: c */
    public Integer f105684c;

    /* renamed from: d */
    public Integer f105685d;

    /* renamed from: e */
    public Boolean f105686e;

    /* renamed from: f */
    public bdhz f105687f;

    /* renamed from: a */
    public final bdic mo58064a() {
        String str = this.f105683b == null ? " primesInitializationPriority" : "";
        if (this.f105684c == null) {
            str = str.concat(" primesMetricExecutorPriority");
        }
        if (this.f105685d == null) {
            str = String.valueOf(str).concat(" primesMetricExecutorPoolSize");
        }
        if (this.f105686e == null) {
            str = String.valueOf(str).concat(" enableEarlyTimers");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        bdfh bdfh = new bdfh(this.f105682a, this.f105683b.intValue(), this.f105684c.intValue(), this.f105685d.intValue(), this.f105687f, this.f105686e.booleanValue());
        int i = bdfh.f105453a;
        boolean z = false;
        if (i > 0 && i <= 2) {
            z = true;
        }
        bmxy.m108602b(z, "Thread pool size must be less than or equal to %s", 2);
        return bdfh;
    }
}
