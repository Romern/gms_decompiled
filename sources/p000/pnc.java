package p000;

import java.io.IOException;
import java.net.InetSocketAddress;

/* renamed from: pnc */
final /* synthetic */ class pnc implements Runnable {

    /* renamed from: a */
    private final pnf f39784a;

    /* renamed from: b */
    private final InetSocketAddress f39785b;

    /* renamed from: c */
    private final IOException f39786c;

    public pnc(pnf pnf, InetSocketAddress inetSocketAddress, IOException iOException) {
        this.f39784a = pnf;
        this.f39785b = inetSocketAddress;
        this.f39786c = iOException;
    }

    public final void run() {
        pnf pnf = this.f39784a;
        pnf.f39797i.mo23473a(this.f39785b, 2, this.f39786c.toString(), pnf.f39803o, pnf.f39808t);
    }
}
