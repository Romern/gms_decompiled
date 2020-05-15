package p000;

/* renamed from: klu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class klu {

    /* renamed from: a */
    public final bngx f24439a;

    /* renamed from: b */
    public final bngx f24440b;

    /* renamed from: c */
    public final kjx f24441c;

    /* renamed from: d */
    public final bnhe f24442d;

    public klu(bngx bngx, bngx bngx2, kjx kjx, bnhe bnhe) {
        this.f24439a = bngx;
        this.f24440b = bngx2;
        this.f24441c = kjx;
        this.f24442d = bnhe;
    }

    /* renamed from: a */
    public static klt m18134a() {
        return new klt();
    }

    /* renamed from: b */
    public final boolean mo14690b(int i) {
        return this.f24442d.containsKey(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final bmxv mo14688a(int i) {
        return bmxv.m108567c((kkb) this.f24442d.get(Integer.valueOf(i)));
    }

    /* renamed from: a */
    public final klu mo14689a(Iterable iterable) {
        return new klu(bngx.m109355a(iterable), this.f24440b, this.f24441c, this.f24442d);
    }
}
