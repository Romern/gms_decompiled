package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: jly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jly implements Runnable {

    /* renamed from: a */
    final /* synthetic */ jma f22778a;

    public jly(jma jma) {
        this.f22778a = jma;
    }

    public final void run() {
        rpr b = rpr.m34216b();
        jma jma = this.f22778a;
        jll.m16883a(b, jma.f22793g, jma.f22792f, jma.f22791e);
        synchronized (this.f22778a.f22789c) {
            if (this.f22778a.f22801o + TimeUnit.SECONDS.toMillis((long) this.f22778a.f22795i) < SystemClock.elapsedRealtime()) {
                jma.m16892a(this.f22778a);
            }
            if (this.f22778a.f22802p == 2) {
                jma.m16893i();
                this.f22778a.mo13827g();
            }
        }
    }
}
