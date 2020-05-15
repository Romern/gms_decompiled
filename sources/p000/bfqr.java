package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: bfqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfqr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfqs f114906a;

    /* renamed from: b */
    private final bscd f114907b;

    public bfqr(bfqs bfqs, bscd bscd) {
        this.f114906a = bfqs;
        this.f114907b = bscd;
    }

    public final void run() {
        long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
        this.f114906a.f114919d.mo70210a(nanos, this.f114907b);
        this.f114906a.mo62155b(nanos);
    }
}
