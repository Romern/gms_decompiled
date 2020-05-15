package p000;

/* renamed from: btzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btzy extends buai {

    /* renamed from: a */
    final /* synthetic */ buad f153137a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public btzy(buad buad) {
        super(buad);
        this.f153137a = buad;
    }

    /* renamed from: a */
    public final Object mo72502a() {
        return this.f153137a.f153144b[this.f153152b.mo72577d()];
    }

    /* renamed from: a */
    public final Object mo72503a(Object obj) {
        if (obj != null) {
            Object a = mo72502a();
            this.f153137a.f153144b[this.f153152b.mo72577d()] = obj;
            return a;
        }
        throw new NullPointerException("The value must not be null.");
    }
}
