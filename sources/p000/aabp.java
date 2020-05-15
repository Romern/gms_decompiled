package p000;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aabp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aabp {

    /* renamed from: a */
    final adzu f27890a;

    /* renamed from: b */
    final Object f27891b = new Object();

    /* renamed from: c */
    volatile bliy f27892c;

    /* renamed from: d */
    Future f27893d;

    /* renamed from: e */
    private final ScheduledExecutorService f27894e;

    public aabp(adzu adzu) {
        this.f27890a = adzu;
        this.f27894e = snp.m35703a(1, 10);
    }

    /* renamed from: a */
    public final blji mo16700a() {
        bliy bliy = this.f27892c;
        if (bliy == null) {
            synchronized (this.f27891b) {
                bliy bliy2 = this.f27892c;
                if (bliy2 == null) {
                    blji b = this.f27890a.mo16696b("session");
                    bliy a = blkh.m107280a(blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                    this.f27892c = a;
                    this.f27893d = ((sny) this.f27894e).schedule(new aabo(this, a), cdoz.f181455a.mo6606a().mo78094G(), TimeUnit.SECONDS);
                    return b;
                }
                blkh.m107287a(bliy2, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                return bliy2;
            }
        }
        blkh.m107287a(bliy, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        return bliy;
    }
}
