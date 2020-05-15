package p000;

import android.util.Log;
import java.util.concurrent.Executor;

/* renamed from: acek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acek implements bqfp {

    /* renamed from: a */
    final /* synthetic */ acen f59652a;

    public acek(acen acen) {
        this.f59652a = acen;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bonk bonk;
        boolean z;
        if (!((Boolean) obj).booleanValue()) {
            acen acen = this.f59652a;
            Log.e("AppsUpload", "Privacy bit setting explicitly disabled");
            synchronized (acen.f59661f) {
                acen.f59662g = false;
                acen.f59663h = null;
                acen.f59664i.mo69138b((Object) false);
                acen.f59664i = null;
            }
            return;
        }
        acen acen2 = this.f59652a;
        synchronized (acen2.f59661f) {
            try {
                bonk = acen2.f59663h;
                acen2.f59663h = null;
                z = acen2.f59665j;
            } catch (Throwable th) {
                acen2.f59663h = null;
                throw th;
            }
        }
        if (cenv.m137617c()) {
            acen2.mo32713b();
        }
        if (!z || !((Boolean) acen2.f59658c.mo32596a()).booleanValue()) {
            acen2.mo32711a(bonk);
            return;
        }
        Executor executor = acen2.f59656a;
        basb basb = acen2.f59659d;
        barz b = basa.m87474b();
        b.mo55924a(acen2.f59660e, 1);
        bqga.m112781a(bqdx.m112673a(batn.m87524a(executor, basb.mo55925a(b.mo55923a()), acen2.f59660e), new acej(acen2, bonk), acen2.f59656a), new acel(acen2, bonk), acen2.f59656a);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f59652a.mo32712a("Failed to read privacy bit", th);
    }
}
