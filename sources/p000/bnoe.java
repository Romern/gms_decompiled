package p000;

/* renamed from: bnoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnoe extends bngx {

    /* renamed from: a */
    static final bngx f131899a = new bnoe(new Object[0], 0);

    /* renamed from: b */
    final transient Object[] f131900b;

    /* renamed from: c */
    private final transient int f131901c;

    public bnoe(Object[] objArr, int i) {
        this.f131900b = objArr;
        this.f131901c = i;
    }

    /* renamed from: a */
    public final int mo67630a(Object[] objArr, int i) {
        System.arraycopy(this.f131900b, 0, objArr, i, this.f131901c);
        return i + this.f131901c;
    }

    /* renamed from: b */
    public final Object[] mo67634b() {
        return this.f131900b;
    }

    /* renamed from: c */
    public final int mo67635c() {
        return 0;
    }

    /* renamed from: f */
    public final int mo67638f() {
        return this.f131901c;
    }

    public final Object get(int i) {
        bmxy.m108584a(i, this.f131901c);
        return this.f131900b[i];
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return false;
    }

    public final int size() {
        return this.f131901c;
    }
}
