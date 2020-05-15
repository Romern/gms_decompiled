package p000;

/* renamed from: bnno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnno {

    /* renamed from: a */
    public final Object f131866a;

    /* renamed from: b */
    int f131867b;

    /* renamed from: c */
    final /* synthetic */ bnnx f131868c;

    bnno() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (p000.bmxi.m108538a(r4.f131866a, r2.f131882a[r0]) != false) goto L_0x0022;
     */
    /* renamed from: a */
    public final int mo68118a() {
        int i = this.f131867b;
        if (i != -1) {
            bnnx bnnx = this.f131868c;
            if (i < bnnx.f131884c) {
            }
        }
        this.f131867b = this.f131868c.mo68148a(this.f131866a);
        int i2 = this.f131867b;
        if (i2 != -1) {
            return this.f131868c.f131883b[i2];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnno) {
            bnno bnno = (bnno) obj;
            return mo68118a() == bnno.mo68118a() && bmxi.m108538a(this.f131866a, bnno.f131866a);
        }
    }

    public final int hashCode() {
        Object obj = this.f131866a;
        return (obj != null ? obj.hashCode() : 0) ^ mo68118a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131866a);
        int a = mo68118a();
        if (a == 1) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(" x ");
        sb.append(a);
        return sb.toString();
    }

    public bnno(bnnx bnnx, int i) {
        this.f131868c = bnnx;
        this.f131866a = bnnx.f131882a[i];
        this.f131867b = i;
    }
}
