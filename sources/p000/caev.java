package p000;

/* renamed from: caev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum caev implements bxvp {
    UNKNOWN_ACCESS_POINT_METRICS(0),
    QUALITY_SCORE_CURVE(1),
    THROUGHPUT_CURVE(2);
    

    /* renamed from: d */
    public final int f172865d;

    private caev(int i) {
        this.f172865d = i;
    }

    /* renamed from: a */
    public static caev m126558a(int i) {
        if (i == 0) {
            return UNKNOWN_ACCESS_POINT_METRICS;
        }
        if (i == 1) {
            return QUALITY_SCORE_CURVE;
        }
        if (i != 2) {
            return null;
        }
        return THROUGHPUT_CURVE;
    }

    /* renamed from: b */
    public static bxvr m126559b() {
        return caeu.f172860a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f172865d;
    }

    public final String toString() {
        return Integer.toString(this.f172865d);
    }
}
