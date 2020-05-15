package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: cics */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cics implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cict f189783a;

    public cics(cict cict) {
        this.f189783a = cict;
    }

    public final void run() {
        chvb chvb;
        cict cict = this.f189783a;
        cict.f189792i.f189837l.mo85705b();
        if (cict.f189788e != null) {
            if (!cict.f189790g) {
                cict.f189790g = true;
            } else if (cict.f189792i.f189803A && (chvb = cict.f189791h) != null) {
                chvb.mo85700a();
                cict.f189791h = null;
            } else {
                return;
            }
            if (!cict.f189792i.f189803A) {
                cict.f189791h = cict.f189792i.f189837l.mo85702a(new cibq(new cicq(cict)), 5, TimeUnit.SECONDS, cict.f189792i.f189833h.mo85714a());
            } else {
                cict.f189788e.mo85898a(cicv.f189800d);
            }
        } else {
            cict.f189790g = true;
        }
    }
}
