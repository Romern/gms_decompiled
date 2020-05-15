package p000;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: azox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azox {

    /* renamed from: a */
    public static final Executor f99803a = new azow();

    /* renamed from: a */
    public static void m85981a() {
        bmxy.m108600b(m85983c());
    }

    /* renamed from: b */
    public static void m85982b() {
        bmxy.m108600b(!m85983c());
    }

    /* renamed from: c */
    public static boolean m85983c() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
