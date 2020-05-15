package p000;

/* renamed from: bmey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmey implements bxvp {
    UNKNOWN(0),
    IMAGE_PNG(1),
    IMAGE_JPEG(2);
    

    /* renamed from: d */
    public final int f129049d;

    private bmey(int i) {
        this.f129049d = i;
    }

    /* renamed from: a */
    public static bmey m107962a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return IMAGE_PNG;
        }
        if (i != 2) {
            return null;
        }
        return IMAGE_JPEG;
    }

    /* renamed from: b */
    public static bxvr m107963b() {
        return bmex.f129044a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f129049d;
    }

    public final String toString() {
        return Integer.toString(this.f129049d);
    }
}
