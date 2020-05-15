package p000;

/* renamed from: yhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yhd {

    /* renamed from: a */
    public long f53812a;

    /* renamed from: b */
    public long f53813b;

    /* renamed from: c */
    public int f53814c = -1;

    /* renamed from: d */
    public int f53815d = 0;

    /* renamed from: e */
    private boolean f53816e;

    /* renamed from: f */
    private boolean f53817f;

    /* renamed from: a */
    public final yhe mo30490a() {
        bmxy.m108601b(this.f53816e, "Start time must be set.");
        bmxy.m108601b(this.f53817f, "End time must be set.");
        return new yhe(this);
    }

    /* renamed from: a */
    public final void mo30491a(long j) {
        this.f53817f = true;
        this.f53813b = j;
    }

    /* renamed from: b */
    public final void mo30492b(long j) {
        this.f53816e = true;
        this.f53812a = j;
    }
}
