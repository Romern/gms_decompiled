package p000;

import android.os.Build;
import android.os.Trace;

@Deprecated
/* renamed from: ml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1192ml {
    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m19642a() {
        int i = Build.VERSION.SDK_INT;
        Trace.endSection();
    }

    /* renamed from: a */
    public static void m19643a(String str) {
        int i = Build.VERSION.SDK_INT;
        Trace.beginSection(str);
    }
}
