package p000;

/* renamed from: ahtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahtj extends ahth {

    /* renamed from: a */
    public final Throwable f67996a;

    /* renamed from: b */
    private final bvjc f67997b;

    /* renamed from: c */
    private final long f67998c;

    /* renamed from: d */
    private final int f67999d;

    /* renamed from: e */
    private final int f68000e;

    public ahtj(bvjc bvjc, long j, Throwable th, int i, int i2) {
        this.f67997b = bvjc;
        this.f67998c = j;
        this.f67996a = th;
        this.f67999d = i;
        this.f68000e = i2;
    }

    /* renamed from: a */
    public final bvjc mo37116a() {
        return this.f67997b;
    }

    /* renamed from: b */
    public final long mo37117b() {
        return this.f67998c;
    }

    /* renamed from: c */
    public final Throwable mo37118c() {
        return this.f67996a;
    }

    /* renamed from: d */
    public final int mo37119d() {
        return this.f67999d;
    }

    /* renamed from: e */
    public final int mo37120e() {
        return this.f68000e;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahth) {
            ahth ahth = (ahth) obj;
            return this.f67997b.equals(ahth.mo37116a()) && this.f67998c == ahth.mo37117b() && ((th = this.f67996a) == null ? ahth.mo37118c() == null : th.equals(ahth.mo37118c())) && this.f67999d == ahth.mo37119d() && this.f68000e == ahth.mo37120e();
        }
    }

    public final int hashCode() {
        int hashCode = this.f67997b.hashCode();
        long j = this.f67998c;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Throwable th = this.f67996a;
        return ((((i ^ (th != null ? th.hashCode() : 0)) * 1000003) ^ this.f67999d) * 1000003) ^ this.f68000e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f67997b);
        long j = this.f67998c;
        String valueOf2 = String.valueOf(this.f67996a);
        int i = this.f67999d;
        int i2 = this.f68000e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 149 + String.valueOf(valueOf2).length());
        sb.append("FastPairEvent{eventCode=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", throwable=");
        sb.append(valueOf2);
        sb.append(", numberAccountKeysOnProvider=");
        sb.append(i);
        sb.append(", numberDevicesOnFootprints=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
