package p000;

import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: wdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wdz extends ModuleManager.FeatureRequestProgressListener {

    /* renamed from: a */
    private static final Logger f50568a = weh.m41831a("FeatureRequestListener");

    /* renamed from: b */
    private final wee f50569b;

    /* renamed from: c */
    private final qws f50570c;

    /* renamed from: d */
    private final long f50571d;

    /* renamed from: e */
    private boolean f50572e = false;

    /* renamed from: f */
    private final wef f50573f;

    public wdz(wee wee, wef wef, qws qws) {
        this.f50569b = wee;
        this.f50573f = wef;
        this.f50570c = qws;
        this.f50571d = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private final void m41823a(int i) {
        if (this.f50570c != null) {
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
            bxun a = bxzr.m124575a(SystemClock.elapsedRealtime() - this.f50571d);
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
            this.f50570c.mo24335a(((cimg) da.mo74062i()).serializeToBytes()).mo24327b();
        }
    }

    public final synchronized void onRequestComplete() {
        if (this.f50573f.mo29058a()) {
            onRequestComplete(0);
        } else {
            onRequestComplete(2);
        }
    }

    public final synchronized void onRequestComplete(int i) {
        if (!this.f50572e) {
            this.f50572e = true;
            if (i == -1) {
                f50568a.mo25414c("Module request timeout.", new Object[0]);
                m41823a(3);
            } else if (i != 0) {
                Logger Logger = f50568a;
                StringBuilder sb = new StringBuilder(51);
                sb.append("Module download/install failed. Result: ");
                sb.append(i);
                Logger.mo25418e(sb.toString(), new Object[0]);
                m41823a(4);
            } else {
                f50568a.mo25414c("Module download success.", new Object[0]);
                m41823a(2);
            }
            this.f50569b.mo18386a();
        }
    }
}
