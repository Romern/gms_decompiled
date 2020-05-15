package p000;

/* renamed from: aqye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqye implements arhf {

    /* renamed from: a */
    final /* synthetic */ aqyf f87071a;

    public aqye(aqyf aqyf) {
        this.f87071a = aqyf;
    }

    /* renamed from: a */
    public final void mo48221a(Exception exc) {
        aqyf.f87072a.mo25417e("packet processing error", exc, new Object[0]);
        this.f87071a.mo48244a(10556, "packet processing error");
    }

    /* renamed from: a */
    public final void mo48222a(byte[] bArr) {
        aqyf.f87072a.mo25409a("Fully decoded packet message", new Object[0]);
        this.f87071a.mo48256c(bArr);
    }
}
