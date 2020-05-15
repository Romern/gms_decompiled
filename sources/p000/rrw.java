package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: rrw */
final /* synthetic */ class rrw implements Executor {

    /* renamed from: a */
    static final Executor f43564a = new rrw();

    private rrw() {
    }

    public final void execute(Runnable runnable) {
        (cdoz.f181455a.mo6606a().mo78111d() ? new Handler(Looper.getMainLooper()) : new adzt(Looper.getMainLooper())).post(runnable);
    }
}
