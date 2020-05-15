package p000;

/* renamed from: azdn */
final /* synthetic */ class azdn implements Runnable {

    /* renamed from: a */
    private final azdq f99096a;

    /* renamed from: b */
    private final boolean f99097b;

    public azdn(azdq azdq, boolean z) {
        this.f99096a = azdq;
        this.f99097b = z;
    }

    public final void run() {
        azdq azdq = this.f99096a;
        boolean z = this.f99097b;
        azdo azdo = (azdo) azdq.f99103b.get();
        if (azdo != null) {
            azdo.mo54806a(azdq.f99102a, z);
        }
    }
}
