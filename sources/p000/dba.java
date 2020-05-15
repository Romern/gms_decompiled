package p000;

import android.content.Context;

/* renamed from: dba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dba implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f12722a;

    public dba(Context context) {
        this.f12722a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if ((r3.f28157a.f12816d - (java.lang.System.currentTimeMillis() / 1000)) < 3600) goto L_0x003e;
     */
    public final void run() {
        aahz aahz;
        aaia aaia;
        try {
            dav dav = dbb.f12723b;
            Context context = this.f12722a;
            if (!dav.f12712i) {
                synchronized (dav.f12711h) {
                    if (!dav.f12712i) {
                        if ((System.currentTimeMillis() / 1000) - dav.f12710g >= 3600) {
                            aaih aaih = dav.f12706c;
                            synchronized (aaih.f28170b) {
                                aahz aahz2 = aaih.f28169a;
                                if (aahz2 != null) {
                                    aaia = aahz2.f28153a;
                                } else {
                                    aaia = null;
                                }
                            }
                            if (aaia != null) {
                            }
                            dav.mo8477b();
                        }
                    }
                }
            }
            aaih aaih2 = dav.f12706c;
            synchronized (aaih2.f28170b) {
                aahz = aaih2.f28169a;
            }
            if (aahz != null) {
                long currentTimeMillis = System.currentTimeMillis();
                dav.f12707d.mo16844a(5001, System.currentTimeMillis() - currentTimeMillis, null, aahz.mo16849a(context), null);
            }
        } catch (Exception e) {
            dbb.f12725d.mo16843a(2019, -1, e);
        }
    }
}
