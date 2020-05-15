package p000;

import com.google.android.gms.mdns.MdnsServiceInfo;

/* renamed from: pmo */
final /* synthetic */ class pmo implements Runnable {

    /* renamed from: a */
    private final pmt f39728a;

    /* renamed from: b */
    private final MdnsServiceInfo f39729b;

    public pmo(pmt pmt, MdnsServiceInfo mdnsServiceInfo) {
        this.f39728a = pmt;
        this.f39729b = mdnsServiceInfo;
    }

    public final void run() {
        this.f39728a.mo23440c(this.f39729b);
    }
}
