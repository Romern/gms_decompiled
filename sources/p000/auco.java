package p000;

import java.util.concurrent.Callable;

/* renamed from: auco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auco implements Runnable {

    /* renamed from: a */
    final /* synthetic */ auck f91402a;

    /* renamed from: b */
    final /* synthetic */ Callable f91403b;

    public auco(auck auck, Callable callable) {
        this.f91402a = auck;
        this.f91403b = callable;
    }

    public final void run() {
        try {
            this.f91402a.mo50398a(this.f91403b.call());
        } catch (Exception e) {
            this.f91402a.mo50397a(e);
        }
    }
}
