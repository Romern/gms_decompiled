package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: beel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beel {

    /* renamed from: a */
    private static Thread f107029a;

    /* renamed from: b */
    private static volatile Handler f107030b;

    /* renamed from: a */
    public static void m91852a(Runnable runnable) {
        m91857d().post(runnable);
    }

    /* renamed from: b */
    public static void m91855b() {
        if (!m91854a()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    /* renamed from: c */
    public static void m91856c() {
        if (m91854a()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    /* renamed from: d */
    public static Handler m91857d() {
        if (f107030b == null) {
            f107030b = new Handler(Looper.getMainLooper());
        }
        return f107030b;
    }

    /* renamed from: a */
    public static void m91853a(Runnable runnable, long j) {
        m91857d().postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static boolean m91854a() {
        if (f107029a == null) {
            f107029a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f107029a;
    }
}
