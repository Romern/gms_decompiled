package p000;

/* renamed from: bexp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexp {

    /* renamed from: a */
    public final int f112967a;

    /* renamed from: b */
    public final int f112968b;

    public bexp(int i, int i2) {
        this.f112968b = i;
        this.f112967a = i2;
    }

    public final String toString() {
        String str = this.f112968b != 1 ? "TRANSITION" : "NO_OP";
        int i = this.f112967a;
        StringBuilder sb = new StringBuilder(str.length() + 38);
        sb.append("Status = ");
        sb.append(str);
        sb.append(", next activity = ");
        sb.append(i);
        return sb.toString();
    }
}
