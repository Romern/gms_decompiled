package p000;

import android.os.Build;
import dalvik.system.DelegateLastClassLoader;

/* renamed from: diy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class diy {
    /* renamed from: a */
    public static ClassLoader m8599a(String str, String str2, ClassLoader classLoader) {
        int i = Build.VERSION.SDK_INT;
        return new DelegateLastClassLoader(str, str2, classLoader, false);
    }
}
