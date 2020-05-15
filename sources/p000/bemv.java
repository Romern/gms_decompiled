package p000;

/* renamed from: bemv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bemv {

    /* renamed from: a */
    final /* synthetic */ bend f111843a;

    public bemv(bend bend) {
        this.f111843a = bend;
    }

    /* renamed from: a */
    public final void mo60805a() {
        boolean z;
        synchronized (this.f111843a.f111857k) {
            int i = this.f111843a.f111860n;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108602b(z, "Refcount went negative!", i);
            bend bend = this.f111843a;
            bend.f111860n--;
            bend.mo60808b();
        }
    }
}
