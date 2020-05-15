package p000;

/* renamed from: ciar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciar implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cibi f189679a;

    public ciar(cibi cibi) {
        this.f189679a = cibi;
    }

    public final void run() {
        if (this.f189679a.f189723n.f189033a == chrg.IDLE) {
            this.f189679a.f189713d.mo85552a(2, "CONNECTING as requested");
            this.f189679a.mo85896a(chrg.CONNECTING);
            this.f189679a.mo85900c();
        }
    }
}
