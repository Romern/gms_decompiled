package p000;

import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bkok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkok implements bkon {

    /* renamed from: a */
    public int f125011a;

    /* renamed from: b */
    public long f125012b;

    /* renamed from: c */
    public long f125013c;

    /* renamed from: d */
    public bkns f125014d;

    /* renamed from: e */
    private boolean f125015e;

    /* renamed from: f */
    private final bkov f125016f;

    /* renamed from: g */
    private int f125017g;

    public bkok() {
        this.f125015e = false;
    }

    /* renamed from: a */
    private final synchronized void m106233a(bkol bkol) {
        this.f125016f.mo66176b();
        this.f125017g = 6;
        mo66169a(new bkom(bkol, 0, null, -1));
    }

    public bkok(bkoj bkoj, bkox bkox) {
        this.f125015e = false;
        this.f125017g = 1;
        this.f125011a = 0;
        this.f125012b = 0;
        this.f125013c = 0;
        bkov a = bkox.mo66134a(bkpc.m106264a(bkoj, bkoj.f125009d.mo66162a(bkog.TEST), Collections.singletonMap("VER", "8"), bkpb.GET, null));
        this.f125016f = a;
        a.mo66175a(new bkoo(this));
    }

    /* renamed from: a */
    public final synchronized void mo66166a() {
        if (this.f125017g == 1) {
            this.f125017g = 2;
            this.f125016f.mo66173a();
        } else {
            throw new IllegalStateException("Test has already been run.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo66167a(int i) {
        int i2 = this.f125017g;
        this.f125017g = i;
        if (bkop.m106244b(i2) + 1 != bkop.m106244b(i)) {
            String a = bkop.m106243a(i);
            String a2 = bkop.m106243a(i2);
            StringBuilder sb = new StringBuilder(a.length() + 81 + a2.length());
            sb.append("Out-of sequence response. Server sent response for stage ");
            sb.append(a);
            sb.append(", but actual stage was ");
            sb.append(a2);
            sb.append(".");
            mo66168a(4, new IllegalStateException(sb.toString()), -1);
        }
        if (i == 6) {
            if (this.f125013c - this.f125012b > 500) {
                m106233a(bkol.OK_STREAMING);
                return;
            }
            m106233a(bkol.OK_NO_STREAMING);
        }
    }

    /* renamed from: a */
    public final synchronized void mo66168a(int i, Exception exc, int i2) {
        this.f125016f.mo66176b();
        this.f125017g = 6;
        mo66169a(new bkom(bkol.FAIL, i, exc, i2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo66169a(bkom bkom) {
        if (!this.f125015e) {
            boolean z = true;
            this.f125015e = true;
            bkns bkns = this.f125014d;
            if (bkns != null && !bkns.f124950a.mo66147c()) {
                if (bkom.f125023a.f125022d) {
                    Logger logger = bknu.f124952a;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(bkom.f125023a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Connection test successful. Result: ");
                    sb.append(valueOf);
                    logger.logp(level, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener", "onTestComplete", sb.toString());
                    bknu bknu = bkns.f124950a;
                    if (bkom.f125023a != bkol.OK_STREAMING) {
                        z = false;
                    }
                    bknu.f124958g = z;
                    bkns.f124950a.f124956e.mo28476a(bkpk.SUCCESS, new bknq(bkns.f124950a, null));
                    return;
                }
                bknu.f124952a.logp(Level.WARNING, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener", "onTestComplete", "Connection test failed.", (Throwable) bkom.f125024b);
                bkns.f124950a.f124956e.mo28476a(bkpk.FAILURE, bkns.f124950a.f124953b);
                bknr bknr = bkns.f124950a.f124957f;
                if (bknr != null) {
                    bknr.mo66128a(bkom.f125026d, bkom.f125025c);
                }
            }
        }
    }
}
