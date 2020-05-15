package p000;

import java.util.List;

/* renamed from: azek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azek implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f99165a;

    /* renamed from: b */
    final /* synthetic */ azet f99166b;

    public azek(azet azet, List list) {
        this.f99166b = azet;
        this.f99165a = list;
    }

    public final void run() {
        synchronized (this.f99166b.f99185a) {
            azet azet = this.f99166b;
            ciiv ciiv = azet.f99201q;
            if (ciiv != null) {
                List list = this.f99165a;
                new Object[1][0] = list;
                bxvd da = cbjt.f177365c.mo74144da();
                bxvd da2 = cbjn.f177345c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cbjn cbjn = (cbjn) da2.f164949b;
                if (!cbjn.f177348b.mo73666a()) {
                    cbjn.f177348b = GeneratedMessageLite.m124021a(cbjn.f177348b);
                }
                bxsy.m123078a(list, cbjn.f177348b);
                cbjp g = azet.mo54851g();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                g.getClass();
                ((cbjn) da2.f164949b).f177347a = g;
                cbjn cbjn2 = (cbjn) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbjt cbjt = (cbjt) da.f164949b;
                cbjn2.getClass();
                cbjt.f177368b = cbjn2;
                cbjt.f177367a = 8;
                ciiv.mo25549a((cbjt) da.mo74062i());
            } else {
                new Object[1][0] = this.f99165a;
            }
        }
    }
}
