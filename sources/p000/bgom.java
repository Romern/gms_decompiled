package p000;

/* renamed from: bgom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgom {

    /* renamed from: a */
    private final long f116935a;

    /* renamed from: b */
    private final bgoo f116936b;

    /* renamed from: c */
    private long f116937c = 0;

    public bgom(bgoo bgoo, long j) {
        this.f116936b = bgoo;
        this.f116935a = j;
    }

    /* renamed from: a */
    public final synchronized long mo63039a(long j) {
        if (j < 0) {
            return 0;
        }
        long min = Math.min(this.f116935a - this.f116937c, j);
        this.f116937c = Math.min(this.f116937c + min, this.f116935a);
        return this.f116936b.mo63056d(min);
    }
}
