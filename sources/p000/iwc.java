package p000;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.enterprise.internal.ZeroTouchFlowResult;

/* renamed from: iwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iwc extends ModuleManager.FeatureRequestProgressListener implements aubw, aubt, aubn {

    /* renamed from: a */
    private final ivx f21907a;

    /* renamed from: b */
    private final wdt f21908b;

    /* renamed from: c */
    private final qws f21909c;

    /* renamed from: d */
    private final long f21910d;

    /* renamed from: e */
    private boolean f21911e = false;

    /* renamed from: f */
    private final ivv f21912f;

    public iwc(wdt wdt, ivx ivx, ivv ivv, qws qws) {
        this.f21908b = wdt;
        this.f21907a = ivx;
        this.f21912f = ivv;
        this.f21909c = qws;
        this.f21910d = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private final void m16237a(int i) {
        if (this.f21909c != null) {
            bxvd da = cimg.f190708g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimg cimg = (cimg) da.f164949b;
            cimg.f190711b = 3;
            int i2 = cimg.f190710a | 1;
            cimg.f190710a = i2;
            cimg.f190712c = 1;
            int i3 = i2 | 2;
            cimg.f190710a = i3;
            cimg.f190713d = 1;
            cimg.f190710a = i3 | 4;
            bxvd da2 = cimf.f190703d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cimf cimf = (cimf) da2.f164949b;
            cimf.f190706b = i - 1;
            cimf.f190705a |= 1;
            bxun a = bxzr.m124575a(SystemClock.elapsedRealtime() - this.f21910d);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cimf cimf2 = (cimf) da2.f164949b;
            a.getClass();
            cimf2.f190707c = a;
            cimf2.f190705a |= 4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimg cimg2 = (cimg) da.f164949b;
            cimf cimf3 = (cimf) da2.mo74062i();
            cimf3.getClass();
            cimg2.f190715f = cimf3;
            cimg2.f190710a |= 64;
            this.f21909c.mo24335a(((cimg) da.mo74062i()).serializeToBytes()).mo24327b();
        }
    }

    /* renamed from: b */
    public final void mo13386b() {
        Log.e("AuthZeroTouch", "API call canceled.");
        this.f21907a.mo7875a(null);
    }

    public final synchronized void onRequestComplete() {
        if (this.f21912f.mo13378a()) {
            onRequestComplete(0);
        } else {
            onRequestComplete(2);
        }
    }

    public final synchronized void onRequestComplete(int i) {
        if (!this.f21911e) {
            this.f21911e = true;
            if (i == 0) {
                Log.i("AuthZeroTouch", "Module download success.");
                m16237a(2);
                wdt wdt = this.f21908b;
                roz b = rpa.m34196b();
                b.f43473b = new Feature[]{wdp.f50561a};
                b.f43472a = new wdu();
                b.mo24979b();
                aucb a = ((rjx) wdt).mo24701a(b.mo24977a());
                a.mo50373a((aubw) this);
                a.mo50372a((aubt) this);
                a.mo50370a((aubn) this);
                return;
            }
            StringBuilder sb = new StringBuilder(51);
            sb.append("Module download/install failed. Result: ");
            sb.append(i);
            Log.e("AuthZeroTouch", sb.toString());
            if (i == -1) {
                m16237a(3);
            } else {
                m16237a(4);
            }
            this.f21907a.mo7875a(null);
        }
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        String valueOf = String.valueOf(Log.getStackTraceString(exc));
        Log.e("AuthZeroTouch", valueOf.length() == 0 ? new String("API call failed with exception: ") : "API call failed with exception: ".concat(valueOf));
        this.f21907a.mo7875a(null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        ZeroTouchFlowResult zeroTouchFlowResult = (ZeroTouchFlowResult) obj;
        Log.i("AuthZeroTouch", "API call succeeded.");
        this.f21907a.mo7875a(zeroTouchFlowResult != null ? zeroTouchFlowResult.f31264b : null);
    }
}
