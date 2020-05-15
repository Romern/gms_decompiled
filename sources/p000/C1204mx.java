package p000;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: mx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1204mx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Callable f26703a;

    /* renamed from: b */
    final /* synthetic */ Handler f26704b;

    /* renamed from: c */
    final /* synthetic */ C1206mz f26705c;

    public C1204mx(Callable callable, Handler handler, C1206mz mzVar) {
        this.f26703a = callable;
        this.f26704b = handler;
        this.f26705c = mzVar;
    }

    public final void run() {
        C1200mt mtVar;
        try {
            mtVar = ((C1194mn) this.f26703a).call();
        } catch (Exception e) {
            mtVar = null;
        }
        this.f26704b.post(new C1203mw(this, mtVar));
    }
}
