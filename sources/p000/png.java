package p000;

import java.net.InetSocketAddress;

/* renamed from: png */
final /* synthetic */ class png implements Runnable {

    /* renamed from: a */
    private final pnh f39813a;

    /* renamed from: b */
    private final InetSocketAddress f39814b;

    /* renamed from: c */
    private final bpfn f39815c;

    /* renamed from: d */
    private final boolean f39816d;

    public png(pnh pnh, InetSocketAddress inetSocketAddress, bpfn bpfn, boolean z) {
        this.f39813a = pnh;
        this.f39814b = inetSocketAddress;
        this.f39815c = bpfn;
        this.f39816d = z;
    }

    public final void run() {
        pnh pnh = this.f39813a;
        pnh.f39817a.mo23467a(this.f39814b, this.f39815c, this.f39816d);
    }
}
