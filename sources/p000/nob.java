package p000;

import android.view.MotionEvent;

/* renamed from: nob */
final /* synthetic */ class nob implements Runnable {

    /* renamed from: a */
    private final noe f36131a;

    /* renamed from: b */
    private final MotionEvent f36132b;

    public nob(noe noe, MotionEvent motionEvent) {
        this.f36131a = noe;
        this.f36132b = motionEvent;
    }

    public final void run() {
        noe noe = this.f36131a;
        MotionEvent motionEvent = this.f36132b;
        noj noj = noe.f36144e;
        bnsn bnsn = noj.f36155b;
        noj.f36159D.mo22052b();
        nip g = noe.f36144e.mo21194g();
        if (g != null) {
            g.mo20803a(motionEvent);
        }
    }
}
