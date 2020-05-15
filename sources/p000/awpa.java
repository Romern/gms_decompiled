package p000;

import android.os.Looper;

/* renamed from: awpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awpa extends Thread {

    /* renamed from: a */
    final /* synthetic */ awou f94794a;

    public awpa(awou awou) {
        this.f94794a = awou;
    }

    public final void run() {
        Looper.prepare();
        this.f94794a.f94784u = new awoz(this);
        this.f94794a.f94785v.countDown();
        Looper.loop();
    }
}
