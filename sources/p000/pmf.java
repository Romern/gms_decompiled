package p000;

import java.net.InetSocketAddress;

/* renamed from: pmf */
final /* synthetic */ class pmf implements Runnable {

    /* renamed from: a */
    private final pmh f39668a;

    /* renamed from: b */
    private final InetSocketAddress f39669b;

    public pmf(pmh pmh, InetSocketAddress inetSocketAddress) {
        this.f39668a = pmh;
        this.f39669b = inetSocketAddress;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pnh.a(java.net.InetSocketAddress, bpfn, boolean, boolean):void
     arg types: [java.net.InetSocketAddress, bpfn, int, int]
     candidates:
      pnh.a(pnm, bpfn, boolean, boolean):void
      pnh.a(java.net.InetSocketAddress, bpfn, boolean, boolean):void */
    public final void run() {
        pmh pmh = this.f39668a;
        pmh.f39680h.f39651e.mo23476a(this.f39669b, bpfn.TCP_PROBER_APP_HINT, true, false);
    }
}
