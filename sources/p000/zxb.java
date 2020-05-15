package p000;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: zxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxb {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static Object m46626a(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
