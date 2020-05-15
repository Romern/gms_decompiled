package p000;

/* renamed from: bqwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqwp extends bqxo {

    /* renamed from: a */
    private final int f141751a;

    /* renamed from: b */
    private final bqxn f141752b;

    /* renamed from: c */
    private final int f141753c;

    public bqwp(int i, bqxn bqxn, int i2) {
        this.f141751a = i;
        this.f141752b = bqxn;
        this.f141753c = i2;
    }

    /* renamed from: a */
    public final int mo69372a() {
        return this.f141751a;
    }

    /* renamed from: b */
    public final bqxn mo69373b() {
        return this.f141752b;
    }

    /* renamed from: c */
    public final int mo69374c() {
        return this.f141753c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqxo) {
            bqxo bqxo = (bqxo) obj;
            return this.f141751a == bqxo.mo69372a() && this.f141752b.equals(bqxo.mo69373b()) && this.f141753c == bqxo.mo69374c();
        }
    }

    public final int hashCode() {
        return ((((this.f141751a ^ 1000003) * 1000003) ^ this.f141752b.hashCode()) * 1000003) ^ this.f141753c;
    }
}
