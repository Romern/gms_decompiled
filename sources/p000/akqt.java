package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: akqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ akrj f72467a;

    public akqt(akrj akrj) {
        this.f72467a = akrj;
    }

    public final void run() {
        akrj akrj = this.f72467a;
        if (akrj.f72502r != 0) {
            akrj.f72492h.mo39790s();
            this.f72467a.mo39726b(0);
            bmza b = bmza.m108659b(bmvy.f131119a);
            this.f72467a.f72497m.setPreviewCallbackWithBuffer(null);
            this.f72467a.f72497m.setPreviewCallback(null);
            this.f72467a.f72497m.release();
            akrj akrj2 = this.f72467a;
            akrj2.f72497m = null;
            akrj2.f72498n = null;
            akrj2.f72500p = new akrf();
            this.f72467a.f72501q = new akre();
            new Object[1][0] = Long.valueOf(b.mo66928a(TimeUnit.MILLISECONDS));
            this.f72467a.mo39728c(0);
            this.f72467a.f72492h.mo39791t();
        }
    }
}
