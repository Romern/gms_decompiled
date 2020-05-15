package p000;

/* renamed from: swj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum swj {
    CACHE(false, false),
    FETCH_THROTTLED(false, true),
    FETCH_NOT_THROTTLED(true, false),
    FETCH_ANOTHER_TASK_INFLIGHT(false, false);
    

    /* renamed from: e */
    public final boolean f45281e;

    /* renamed from: f */
    public final boolean f45282f;

    /* renamed from: g */
    public long f45283g = -1;

    private swj(boolean z, boolean z2) {
        this.f45281e = z;
        this.f45282f = z2;
    }
}
