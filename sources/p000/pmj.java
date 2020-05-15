package p000;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: pmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pmj extends plz {

    /* renamed from: a */
    public static final boolean f39696a = cczq.f180312a.mo6606a().mo77117l();

    /* renamed from: d */
    private static final long f39697d = cczq.f180312a.mo6606a().mo77118m();

    /* renamed from: b */
    final qat f39698b;

    /* renamed from: c */
    ScheduledFuture f39699c;

    /* renamed from: e */
    private final qav f39700e = new qav("GaiaDiscoveryProbingWorker");

    public pmj(pma pma, qat qat) {
        super(pma);
        this.f39698b = qat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23373a() {
        ScheduledFuture scheduledFuture = this.f39699c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f39699c = pes.m30266a().schedule(new pmi(this), f39697d, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23374b() {
        ScheduledFuture scheduledFuture = this.f39699c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f39699c = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pnh.a(java.net.InetSocketAddress, bpfn, boolean, boolean):void
     arg types: [java.net.InetSocketAddress, bpfn, int, int]
     candidates:
      pnh.a(pnm, bpfn, boolean, boolean):void
      pnh.a(java.net.InetSocketAddress, bpfn, boolean, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23415a(ppc ppc) {
        InetAddress inetAddress;
        int i = ppc.f40013i;
        int i2 = i & 255;
        if (i2 != 0 && i2 != 255) {
            try {
                byte[] c = this.f39698b.mo23851c();
                if (c != null) {
                    inetAddress = InetAddress.getByAddress(new byte[]{c[0], c[1], (byte) ((i >> 8) & 255), (byte) i2});
                } else {
                    inetAddress = null;
                }
                if (inetAddress != null) {
                    this.f39646g.f39651e.mo23476a(new InetSocketAddress(inetAddress, 8009), bpfn.TCP_PROBER_GAIA_DISCOVERY, false, false);
                }
            } catch (SecurityException | UnknownHostException e) {
                this.f39700e.mo23677d("Failed to create InetAddress for %s", ppc.f40008d);
            }
        }
    }
}
