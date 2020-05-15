package p000;

/* renamed from: bnoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnoi extends bngx {

    /* renamed from: a */
    private final transient Object[] f131909a;

    /* renamed from: b */
    private final transient int f131910b;

    /* renamed from: c */
    private final transient int f131911c;

    public bnoi(Object[] objArr, int i, int i2) {
        this.f131909a = objArr;
        this.f131910b = i;
        this.f131911c = i2;
    }

    public final Object get(int i) {
        bmxy.m108584a(i, this.f131911c);
        return this.f131909a[i + i + this.f131910b];
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return true;
    }

    public final int size() {
        return this.f131911c;
    }
}
