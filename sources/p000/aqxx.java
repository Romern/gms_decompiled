package p000;

/* renamed from: aqxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqxx implements arhf {

    /* renamed from: a */
    final /* synthetic */ aqxz f87059a;

    public aqxx(aqxz aqxz) {
        this.f87059a = aqxz;
    }

    /* renamed from: a */
    public final void mo48221a(Exception exc) {
        this.f87059a.f87060a.mo25417e("Packet processing error", exc, new Object[0]);
        this.f87059a.f87062c.mo48223a(10556);
        this.f87059a.mo48232b(10556);
    }

    /* renamed from: a */
    public final void mo48222a(byte[] bArr) {
        this.f87059a.f87060a.logVerbose("Fully decoded packet message", new Object[0]);
        this.f87059a.mo48234b(bArr);
    }
}
