package p000;

/* renamed from: bajq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bajq extends cazu {

    /* renamed from: b */
    private final cazn f101069b;

    public bajq(cijl cijl, cijl cijl2, cazn cazn) {
        super(cijl2, cbag.m127657a(bajq.class), cijl);
        this.f101069b = cbac.m127643a(cazn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return this.f101069b.mo75201b();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        bngx bngx;
        bafh bafh = (bafh) obj;
        banx a = bafh.mo55653a().mo55798a();
        try {
            if (bafh.mo55659g()) {
                bngx = bngx.m109368a(bafh.mo55658f());
            } else {
                bngx = bngx.m109376e();
            }
            a.close();
            return bqga.m112775a((Object) bngx);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
