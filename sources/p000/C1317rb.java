package p000;

/* renamed from: rb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1317rb {

    /* renamed from: a */
    public int f26885a;

    /* renamed from: b */
    public int f26886b;

    /* renamed from: c */
    public float f26887c;

    /* renamed from: d */
    public float f26888d;

    /* renamed from: e */
    public long f26889e = Long.MIN_VALUE;

    /* renamed from: f */
    public long f26890f = 0;

    /* renamed from: g */
    public int f26891g = 0;

    /* renamed from: h */
    public int f26892h = 0;

    /* renamed from: i */
    public long f26893i = -1;

    /* renamed from: j */
    public float f26894j;

    /* renamed from: k */
    public int f26895k;

    /* renamed from: a */
    public final float mo15800a(long j) {
        long j2 = this.f26889e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f26893i;
        if (j3 < 0 || j < j3) {
            return C1319rd.m20059a(((float) (j - j2)) / ((float) this.f26885a), 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f26894j;
        return (1.0f - f) + (f * C1319rd.m20059a(((float) (j - j3)) / ((float) this.f26895k), 0.0f, 1.0f));
    }
}
