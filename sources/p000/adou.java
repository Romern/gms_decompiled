package p000;

import java.util.concurrent.Executor;

/* renamed from: adou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adou implements bqeh {

    /* renamed from: a */
    final /* synthetic */ adqr f62302a;

    /* renamed from: b */
    final /* synthetic */ adrn f62303b;

    /* renamed from: c */
    final /* synthetic */ adqt f62304c;

    /* renamed from: d */
    final /* synthetic */ adrf f62305d;

    /* renamed from: e */
    final /* synthetic */ Executor f62306e;

    public adou(adqr adqr, adrn adrn, adqt adqt, adrf adrf, Executor executor) {
        this.f62302a = adqr;
        this.f62303b = adrn;
        this.f62304c = adqt;
        this.f62305d = adrf;
        this.f62306e = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo6375a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            this.f62302a.mo33719a(0);
        }
        adru a = ((adrk) this.f62303b).mo33742a(0L, null);
        if (a == null) {
            try {
                adqt adqt = this.f62304c;
                adqt.mo33727b();
                adqt.mo33733e(4);
                return bqga.m112775a(new adov(false, null));
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            bqgg a2 = bqdx.m112673a(this.f62305d.mo33737a(a, this.f62304c), new adot((adsf) a.mo33754d()), this.f62306e);
            a.close();
            return a2;
        }
        throw th;
    }
}
