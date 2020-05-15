package p000;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* renamed from: fja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fja extends FutureTask {

    /* renamed from: a */
    final /* synthetic */ fjb f16703a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fja(fjb fjb, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f16703a = fjb;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16703a.f16704a.f16711f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(valueOf);
            Log.e("GAv4", sb.toString());
        }
        super.setException(th);
    }
}
