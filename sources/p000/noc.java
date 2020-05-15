package p000;

import android.view.MotionEvent;

/* renamed from: noc */
final /* synthetic */ class noc implements Runnable {

    /* renamed from: a */
    private final noe f36133a;

    /* renamed from: b */
    private final MotionEvent f36134b;

    public noc(noe noe, MotionEvent motionEvent) {
        this.f36133a = noe;
        this.f36134b = motionEvent;
    }

    public final void run() {
        noe noe = this.f36133a;
        MotionEvent motionEvent = this.f36134b;
        noj noj = noe.f36144e;
        bnsn bnsn = noj.f36155b;
        noj.f36159D.mo22053c();
        nip g = noe.f36144e.mo21194g();
        if (g != null) {
            g.mo20819b(motionEvent);
        }
    }
}
