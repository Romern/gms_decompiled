package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: cibe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibe implements Runnable {

    /* renamed from: a */
    final /* synthetic */ chuv f189703a;

    /* renamed from: b */
    final /* synthetic */ cibg f189704b;

    public cibe(cibg cibg, chuv chuv) {
        this.f189704b = cibg;
        this.f189703a = chuv;
    }

    public final void run() {
        boolean z;
        if (this.f189704b.f189708c.f189723n.f189033a != chrg.SHUTDOWN) {
            cidb cidb = this.f189704b.f189708c.f189722m;
            cibg cibg = this.f189704b;
            chyc chyc = cibg.f189706a;
            if (cidb == chyc) {
                cibg.f189708c.f189722m = null;
                this.f189704b.f189708c.f189715f.mo85886a();
                this.f189704b.f189708c.mo85896a(chrg.IDLE);
                return;
            }
            cibi cibi = cibg.f189708c;
            if (cibi.f189721l == chyc) {
                boolean z2 = false;
                if (cibi.f189723n.f189033a == chrg.CONNECTING) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108605b(z, "Expected state is CONNECTING, actual state is %s", this.f189704b.f189708c.f189723n.f189033a);
                cibc cibc = this.f189704b.f189708c.f189715f;
                int i = cibc.f189701c + 1;
                cibc.f189701c = i;
                if (i >= ((chrq) cibc.f189699a.get(cibc.f189700b)).f189052b.size()) {
                    cibc.f189700b++;
                    cibc.f189701c = 0;
                }
                cibc cibc2 = this.f189704b.f189708c.f189715f;
                if (cibc2.f189700b >= cibc2.f189699a.size()) {
                    this.f189704b.f189708c.f189721l = null;
                    this.f189704b.f189708c.f189715f.mo85886a();
                    cibi cibi2 = this.f189704b.f189708c;
                    chuv chuv = this.f189703a;
                    cibi2.f189714e.mo85705b();
                    bmxy.m108589a(!chuv.mo85689a(), "The error status must not be OK");
                    cibi2.mo85897a(new chrh(chrg.TRANSIENT_FAILURE, chuv));
                    if (cibi2.f189725p == null) {
                        cibi2.f189725p = chzp.m149850a();
                    }
                    long a = cibi2.f189725p.mo85845a() - cibi2.f189717h.mo66928a(TimeUnit.NANOSECONDS);
                    cibi2.f189713d.mo85553a(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", cibi.m149957b(chuv), Long.valueOf(a));
                    if (cibi2.f189718i == null) {
                        z2 = true;
                    }
                    bmxy.m108601b(z2, "previous reconnectTask is not done");
                    cibi2.f189718i = cibi2.f189714e.mo85702a(new ciaq(cibi2), a, TimeUnit.NANOSECONDS, cibi2.f189711b);
                    return;
                }
                this.f189704b.f189708c.mo85900c();
            }
        }
    }
}
