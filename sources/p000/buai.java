package p000;

/* renamed from: buai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class buai extends bual implements buaf {
    /* renamed from: a */
    public abstract Object mo72502a();

    /* renamed from: a */
    public abstract Object mo72503a(Object obj);

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo72479b() {
        throw null;
    }

    /* renamed from: c */
    public final Object mo72549c() {
        return this.f153152b.next();
    }

    /* renamed from: d */
    public final Object mo72550d() {
        mo72556f();
        return mo72502a();
    }

    /* renamed from: e */
    public final Object mo72551e() {
        return this.f153152b.mo72479b();
    }

    public buai(buan buan) {
        super(buan);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        mo72556f();
        return new buah(this, mo72551e(), mo72502a());
    }
}
