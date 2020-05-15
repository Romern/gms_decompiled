package p000;

/* renamed from: bumj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bumj extends buai {

    /* renamed from: a */
    final /* synthetic */ bumn f154244a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bumj(bumn bumn) {
        super(bumn);
        this.f154244a = bumn;
    }

    /* renamed from: h */
    public final byte[] mo72502a() {
        return this.f154244a.f154251b[this.f153152b.mo72577d()];
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72503a(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            byte[] h = mo72502a();
            this.f154244a.f154251b[this.f153152b.mo72577d()] = bArr;
            return h;
        }
        throw new NullPointerException("The value must not be null.");
    }
}
