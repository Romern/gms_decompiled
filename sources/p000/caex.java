package p000;

/* renamed from: caex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum caex implements bxvp {
    PACKAGE_ID_UNKNOWN(0),
    GCS(1);
    

    /* renamed from: c */
    public final int f172870c;

    private caex(int i) {
        this.f172870c = i;
    }

    /* renamed from: a */
    public static caex m126562a(int i) {
        if (i == 0) {
            return PACKAGE_ID_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return GCS;
    }

    /* renamed from: b */
    public static bxvr m126563b() {
        return caew.f172866a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f172870c;
    }

    public final String toString() {
        return Integer.toString(this.f172870c);
    }
}
