package p000;

import java.net.InetSocketAddress;
import java.util.Locale;

/* renamed from: pnd */
final /* synthetic */ class pnd implements Runnable {

    /* renamed from: a */
    private final pnf f39787a;

    public pnd(pnf pnf) {
        this.f39787a = pnf;
    }

    public final void run() {
        pnf pnf = this.f39787a;
        pnf.f39790b.mo23677d("TcpProberDeviceController %s timed out.", Integer.valueOf(pnf.f39792d));
        InetSocketAddress a = pnf.mo23474a(false);
        if (a == null) {
            pnf.f39790b.mo23673b("TcpProberDeviceController has already been deactivated", new Object[0]);
            return;
        }
        pnf.f39797i.mo23473a(a, 3, String.format(Locale.ROOT, "TcpProberDeviceController %s timed out.", Integer.valueOf(pnf.f39792d)), pnf.f39803o, pnf.f39808t);
    }
}
