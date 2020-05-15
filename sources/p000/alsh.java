package p000;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: alsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alsh {
    /* renamed from: b */
    public static boolean m61647b(Context context) {
        return ((long) ((ActivityManager) context.getSystemService("activity")).getMemoryClass()) >= cgbe.f186279a.mo6606a().mo83391cO();
    }

    /* renamed from: a */
    public static final int m61646a(Context context) {
        if (((long) ((ActivityManager) context.getSystemService("activity")).getMemoryClass()) >= cgbe.f186279a.mo6606a().mo83307ak()) {
            return (int) cgbe.f186279a.mo6606a().mo83405cc();
        }
        return (int) cgbe.f186279a.mo6606a().mo83406cd();
    }
}
