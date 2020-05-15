package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pli */
final /* synthetic */ class pli implements Runnable {

    /* renamed from: a */
    private final plj f39588a;

    public pli(plj plj) {
        this.f39588a = plj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pnh.a(pnm, bpfn, boolean, boolean):void
     arg types: [pnm, bpfn, boolean, int]
     candidates:
      pnh.a(java.net.InetSocketAddress, bpfn, boolean, boolean):void
      pnh.a(pnm, bpfn, boolean, boolean):void */
    public final void run() {
        plj plj = this.f39588a;
        pnl pnl = plj.f39646g.f39648b;
        synchronized (pnl) {
            if (ccyz.m132249b()) {
                if (!plj.f39646g.mo23398a()) {
                    return;
                }
            } else if (plj.f39646g.f39652f == null) {
                return;
            }
            plj.f39593d.mo23861b("Triggered Adaptive Discovery");
            String a = plj.f39594e.mo23848a();
            if (a == null) {
                plj.f39593d.mo23675c("Exiting Adaptive Discovery. Current HOTSPOT_BSSID is NULL.", new Object[0]);
                return;
            }
            poe a2 = pnl.mo23484a(a);
            if (a2 == null) {
                plj.f39593d.mo23675c("Exiting Adaptive Discovery. Current NetworkInfo is NULL.", new Object[0]);
                return;
            }
            Collection<pnm> a3 = a2.mo23516a();
            if (!a3.isEmpty()) {
                plj.f39593d.mo23856a("%d Cast devices.", Integer.valueOf(a3.size()));
                for (pnm pnm : a3) {
                    pes pes = pes.f38974a;
                    boolean a4 = pnm.mo23500a(System.currentTimeMillis(), plj.f39589a);
                    plj.f39593d.mo23859a("%s supported(%s) notSupported(%s) expired(%b)", pnm.f39844a, pnm.f39845b, pnm.f39851h, Boolean.valueOf(a4));
                    if (a4) {
                        plj.f39646g.f39651e.mo23477a(pnm, bpfn.TCP_PROBER_DEVICE_EXPIRED, plj.f39591c, false);
                    } else {
                        Set set = pnm.f39845b;
                        Set set2 = pnm.f39851h;
                        Set<String> set3 = plj.f39646g.f39652f;
                        HashSet hashSet = new HashSet();
                        for (String str : set3) {
                            if (!ptk.m31238b(str) && !set.contains(str) && !set2.contains(str)) {
                                hashSet.add(str);
                            }
                        }
                        if (!hashSet.isEmpty()) {
                            plj.f39646g.f39651e.mo23477a(pnm, bpfn.TCP_PROBER_SUBTYPE_MDNS_MISSING, plj.f39591c, false);
                        }
                    }
                }
                return;
            }
            plj.f39593d.mo23861b("Exiting Adaptive Discovery. CastDeviceInfo list is EMPTY");
        }
    }
}
