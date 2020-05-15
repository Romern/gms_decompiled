package p000;

/* renamed from: beuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beuw implements Comparable {

    /* renamed from: a */
    public final Comparable f112566a;

    /* renamed from: b */
    public final float f112567b;

    public beuw(Comparable comparable, float f) {
        if (Float.floatToIntBits(f) < 0 || ((double) f) > 1.0d || Float.isNaN(f)) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("confidence ");
            sb.append(f);
            sb.append(" outside range 0..1");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f112566a = comparable;
        this.f112567b = f;
    }

    /* renamed from: a */
    public final int mo61165a() {
        return Math.round(this.f112567b * 100.0f);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        beuw beuw = (beuw) obj;
        int compare = Float.compare(this.f112567b, beuw.f112567b);
        return compare == 0 ? this.f112566a.compareTo(beuw.f112566a) : -compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof beuw) {
            beuw beuw = (beuw) obj;
            return Float.compare(beuw.f112567b, this.f112567b) == 0 && this.f112566a.equals(beuw.f112566a);
        }
    }

    public final int hashCode() {
        return (this.f112566a.hashCode() * 31) + Float.floatToIntBits(this.f112567b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f112566a);
        int a = mo61165a();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("ClassAndConfidence{class=");
        sb.append(valueOf);
        sb.append(", confidence=");
        sb.append(a);
        sb.append('}');
        return sb.toString();
    }
}
