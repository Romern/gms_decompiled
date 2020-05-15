package p000;

/* renamed from: ayem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ayem implements bxvp {
    ORIGIN_CHANNEL_API(0),
    ORIGIN_LARGE_ASSET_API(1);
    

    /* renamed from: c */
    public final int f97330c;

    private ayem(int i) {
        this.f97330c = i;
    }

    /* renamed from: a */
    public static ayem m83888a(int i) {
        if (i == 0) {
            return ORIGIN_CHANNEL_API;
        }
        if (i != 1) {
            return null;
        }
        return ORIGIN_LARGE_ASSET_API;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f97330c;
    }

    public final String toString() {
        return Integer.toString(this.f97330c);
    }
}
