package p000;

/* renamed from: zgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zgu {

    /* renamed from: a */
    public final int f55040a;

    /* renamed from: b */
    public final boolean f55041b;

    /* renamed from: c */
    private final int f55042c;

    public zgu(int i, boolean z, int i2) {
        this.f55040a = i;
        this.f55041b = z;
        this.f55042c = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zgu mo31098a(int i) {
        return new zgu(i, this.f55041b, this.f55042c + 1);
    }

    /* renamed from: a */
    public final boolean mo31100a(zgu zgu) {
        return this.f55042c == zgu.f55042c && this.f55040a == zgu.f55040a && this.f55041b == zgu.f55041b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zgu mo31099a(boolean z) {
        return new zgu(this.f55040a, z, this.f55042c + 1);
    }
}
