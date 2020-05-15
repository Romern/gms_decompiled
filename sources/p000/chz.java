package p000;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;

/* renamed from: chz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chz extends Thread {

    /* renamed from: a */
    final /* synthetic */ cia f6894a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chz(cia cia, Runnable runnable, String str) {
        super(runnable, str);
        this.f6894a = cia;
    }

    public final void run() {
        Process.setThreadPriority(9);
        if (this.f6894a.f6898b) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (Throwable th) {
            cic cic = this.f6894a.f6897a;
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}
