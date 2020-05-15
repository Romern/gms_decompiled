package p000;

/* renamed from: aqyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqyb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f87067a;

    /* renamed from: b */
    final /* synthetic */ aqyf f87068b;

    public aqyb(aqyf aqyf, byte[] bArr) {
        this.f87068b = aqyf;
        this.f87067a = bArr;
    }

    public final void run() {
        arhh arhh;
        aqyf aqyf = this.f87068b;
        if (!aqyf.f87076e || (arhh = aqyf.f87078g) == null) {
            aqyf.mo48256c(this.f87067a);
        } else {
            arhh.mo48539b(this.f87067a);
        }
    }
}
