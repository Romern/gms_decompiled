package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;

/* renamed from: axty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axty {

    /* renamed from: a */
    public static axty f96348a;

    /* renamed from: b */
    public final axtw f96349b;

    /* renamed from: c */
    final qxm f96350c = this.f96351d.mo24387e("connection-connected");

    /* renamed from: d */
    public final qxq f96351d;

    /* renamed from: e */
    private final qws f96352e;

    public axty(Context context, boolean z) {
        this.f96352e = qws.m33019a(context, "CW");
        qxq qxq = new qxq(this.f96352e, "CW_COUNTERS", (int) chnj.f188812a.mo6606a().mo85408ag());
        this.f96351d = qxq;
        qxq.mo24374a();
        this.f96351d.f42392o = new axtx(this);
        axtw axtw = new axtw(context, z);
        this.f96349b = axtw;
        axtw.mo53538a();
    }

    /* renamed from: a */
    public static void m83201a(int i) {
        if (chnj.f188812a.mo6606a().mo85381G()) {
            bxvd da = boks.f133448f.mo74144da();
            bxvd da2 = bokr.f133444c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bokr bokr = (bokr) da2.f164949b;
            bokr.f133447b = i - 1;
            bokr.f133446a |= 1;
            bokr bokr2 = (bokr) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boks boks = (boks) da.f164949b;
            bokr2.getClass();
            boks.f133452c = bokr2;
            boks.f133450a |= 2;
            f96348a.mo53546a((boks) da.mo74062i());
        }
    }

    /* renamed from: b */
    public static void m83205b(int i, String str) {
        if (chnj.f188812a.mo6606a().mo85401a()) {
            bxvd da = boks.f133448f.mo74144da();
            bxvd da2 = bokk.f133422d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bokk bokk = (bokk) da2.f164949b;
            bokk.f133425b = i - 1;
            int i2 = bokk.f133424a | 1;
            bokk.f133424a = i2;
            str.getClass();
            bokk.f133424a = i2 | 2;
            bokk.f133426c = str;
            bokk bokk2 = (bokk) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boks boks = (boks) da.f164949b;
            bokk2.getClass();
            boks.f133451b = bokk2;
            boks.f133450a |= 1;
            f96348a.mo53546a((boks) da.mo74062i());
        }
    }

    /* renamed from: a */
    public static void m83202a(int i, long j, int i2, int i3) {
        if (chnj.f188812a.mo6606a().mo85437n()) {
            bxvd da = boks.f133448f.mo74144da();
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            long currentTimeMillis = System.currentTimeMillis();
            bxvd da2 = bokp.f133435g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bokp bokp = (bokp) da2.f164949b;
            bokp.f133438b = i - 1;
            int i4 = bokp.f133437a | 1;
            bokp.f133437a = i4;
            int i5 = i4 | 4;
            bokp.f133437a = i5;
            bokp.f133440d = elapsedRealtime;
            int i6 = i5 | 2;
            bokp.f133437a = i6;
            bokp.f133439c = currentTimeMillis - elapsedRealtime;
            bokp.f133442f = i2;
            int i7 = i6 | 16;
            bokp.f133437a = i7;
            bokp.f133437a = i7 | 8;
            bokp.f133441e = i3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boks boks = (boks) da.f164949b;
            bokp bokp2 = (bokp) da2.mo74062i();
            bokp2.getClass();
            boks.f133454e = bokp2;
            boks.f133450a |= 16;
            f96348a.mo53546a((boks) da.mo74062i());
        }
    }

    /* renamed from: a */
    public static void m83203a(int i, String str) {
        if (chnj.f188812a.mo6606a().mo85436m()) {
            bxvd da = boks.f133448f.mo74144da();
            bxvd da2 = bokm.f133428d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bokm bokm = (bokm) da2.f164949b;
            bokm.f133431b = i - 1;
            int i2 = bokm.f133430a | 1;
            bokm.f133430a = i2;
            if (str != null) {
                str.getClass();
                bokm.f133430a = i2 | 2;
                bokm.f133432c = str;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boks boks = (boks) da.f164949b;
            bokm bokm2 = (bokm) da2.mo74062i();
            bokm2.getClass();
            boks.f133453d = bokm2;
            boks.f133450a |= 8;
            f96348a.mo53546a((boks) da.mo74062i());
        }
    }

    /* renamed from: a */
    public static void m83204a(int i, boolean z, boolean z2) {
        long j;
        if (chml.f188783a.mo6606a().mo85354a()) {
            long j2 = 2;
            if (!z) {
                j = 2;
            } else {
                j = 1;
            }
            if (z2) {
                j2 = 1;
            }
            f96348a.f96350c.mo24368a((j2 << 8) | j | ((long) ((i - 1) << 16)));
        }
    }

    /* renamed from: a */
    public final qxh mo53544a(String str) {
        return this.f96351d.mo24383c(str);
    }

    /* renamed from: a */
    public final qxm mo53545a(String str, qxf qxf) {
        return this.f96351d.mo24380b(str, qxf);
    }

    /* renamed from: a */
    public final void mo53546a(boks boks) {
        axtw axtw = this.f96349b;
        if (axtw.f96341a && axtw.mo53541b() && chnj.m149027c()) {
            if (Log.isLoggable("WearableLogger", 3)) {
                String valueOf = String.valueOf(boks);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
                sb.append("logEvent: ");
                sb.append(valueOf);
                Log.d("WearableLogger", sb.toString());
            }
            this.f96352e.mo24335a(boks.serializeToBytes()).mo24327b();
        }
    }
}
