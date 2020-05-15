package p000;

/* renamed from: bfnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnp {

    /* renamed from: a */
    public final double f114498a;

    /* renamed from: b */
    public final int f114499b;

    public bfnp(int i, double d) {
        this.f114499b = i;
        this.f114498a = d;
    }

    public final String toString() {
        int i = this.f114499b;
        String str = i != 1 ? i != 2 ? "UNKNOWN" : "MOVING" : "STATIONARY";
        double d = this.f114498a;
        StringBuilder sb = new StringBuilder(str.length() + 66);
        sb.append("TravelDetectionResult [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(d);
        sb.append("]");
        return sb.toString();
    }
}
