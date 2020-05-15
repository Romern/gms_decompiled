package p000;

import android.util.Log;
import java.lang.Thread;

/* renamed from: ayfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayfo implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ ayfq f97490a;

    public ayfo(ayfq ayfq) {
        this.f97490a = ayfq;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str = this.f97490a.f97491a;
        String valueOf = String.valueOf(thread);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Uncaught exception in thread: ");
        sb.append(valueOf);
        Log.e(str, sb.toString(), th);
    }
}
