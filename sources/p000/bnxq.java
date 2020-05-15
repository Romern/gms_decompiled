package p000;

/* renamed from: bnxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnxq {

    /* renamed from: a */
    public final int f132342a;

    /* renamed from: b */
    public final int f132343b;

    /* renamed from: c */
    public final int f132344c;

    /* renamed from: d */
    public final double f132345d;

    /* renamed from: e */
    public final double f132346e;

    /* renamed from: f */
    public final double f132347f;

    /* renamed from: g */
    public final double f132348g;

    /* renamed from: h */
    public final bnwk f132349h;

    /* renamed from: i */
    public final bnwk f132350i;

    public bnxq(int i, int i2, bnwk bnwk, bnwk bnwk2, bnvl bnvl, bnvl bnvl2) {
        this.f132342a = i;
        this.f132343b = i2;
        this.f132345d = bnvl.f132224a;
        this.f132346e = bnvl.f132225b;
        this.f132347f = bnvl2.f132224a;
        this.f132348g = bnvl2.f132225b;
        this.f132349h = bnwk;
        this.f132350i = bnwk2;
        this.f132344c = bnym.m110785a(bnwk, bnwk2);
    }

    public final String toString() {
        int i = this.f132342a;
        int i2 = this.f132343b;
        StringBuilder sb = new StringBuilder(34);
        sb.append("shape ");
        sb.append(i);
        sb.append(" edge ");
        sb.append(i2);
        return sb.toString();
    }
}
