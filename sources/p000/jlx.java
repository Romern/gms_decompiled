package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: jlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jlx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ jma f22777a;

    public jlx(jma jma) {
        this.f22777a = jma;
    }

    public final void run() {
        synchronized (this.f22777a.f22789c) {
            if (this.f22777a.f22801o + TimeUnit.SECONDS.toMillis((long) this.f22777a.f22795i) < SystemClock.elapsedRealtime()) {
                jma.m16892a(this.f22777a);
            }
            if (this.f22777a.f22802p == 2) {
                jma.m16893i();
                this.f22777a.mo13827g();
            }
        }
    }
}
