package p000;

import com.google.android.gms.mdns.MdnsServiceInfo;

/* renamed from: pmp */
final /* synthetic */ class pmp implements Runnable {

    /* renamed from: a */
    private final pmt f39730a;

    /* renamed from: b */
    private final MdnsServiceInfo f39731b;

    public pmp(pmt pmt, MdnsServiceInfo mdnsServiceInfo) {
        this.f39730a = pmt;
        this.f39731b = mdnsServiceInfo;
    }

    public final void run() {
        this.f39730a.mo23440c(this.f39731b);
    }
}
