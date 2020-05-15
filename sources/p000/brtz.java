package p000;

/* renamed from: brtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum brtz implements bxvp {
    DEFAULT_CACHE_OK_IF_VALID(0),
    CACHE_OK_IF_AVAILABLE(1),
    SKIP_CACHE(2),
    CACHE_ONLY(3),
    VALID_CACHE_ONLY(4);
    

    /* renamed from: f */
    private final int f143376f;

    private brtz(int i) {
        this.f143376f = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f143376f;
    }

    public final String toString() {
        return Integer.toString(this.f143376f);
    }
}
