package p000;

import android.content.Context;
import android.util.Log;
import java.lang.Thread;

/* renamed from: vtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vtv implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f49965a;

    /* renamed from: b */
    public boolean f49966b;

    /* renamed from: c */
    private final Context f49967c;

    public vtv(Context context) {
        this.f49967c = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vup.b(boolean, int):boolean
     arg types: [int, int]
     candidates:
      vup.b(java.lang.String, boolean):void
      vup.b(boolean, int):boolean */
    public final void uncaughtException(Thread thread, Throwable th) {
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Uncaught exception: ");
        sb.append(valueOf);
        sb.toString();
        try {
            new vup(this.f49967c).mo28876b(false, vuu.FORCE.ordinal());
        } catch (Exception e) {
            try {
                Log.e("CAR.DRIVINGMODE", "Crash on cleanup", e);
            } catch (Exception e2) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f49965a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
