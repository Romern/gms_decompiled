package p000;

/* renamed from: bcyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyp extends bczf {

    /* renamed from: a */
    private final int f105133a;

    /* renamed from: b */
    private final float f105134b;

    public bcyp(int i, float f) {
        this.f105133a = i;
        this.f105134b = f;
    }

    /* renamed from: a */
    public final int mo57710a() {
        return this.f105133a;
    }

    /* renamed from: b */
    public final float mo57711b() {
        return this.f105134b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczf) {
            bczf bczf = (bczf) obj;
            return this.f105133a == bczf.mo57710a() && Float.floatToIntBits(this.f105134b) == Float.floatToIntBits(bczf.mo57711b());
        }
    }

    public final int hashCode() {
        return ((this.f105133a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f105134b);
    }

    public final String toString() {
        int i = this.f105133a;
        float f = this.f105134b;
        StringBuilder sb = new StringBuilder(64);
        sb.append("HorizontalLine{lineColor=");
        sb.append(i);
        sb.append(", lineWidth=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
