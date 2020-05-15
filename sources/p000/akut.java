package p000;

import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: akut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akut {

    /* renamed from: a */
    public static final List f72915a = Arrays.asList("armeabi", "armeabi-v7a", "arm64-v8a", "x86", "mips");

    /* renamed from: b */
    public final int f72916b;

    /* renamed from: c */
    public final PackageManager f72917c;

    public akut(int i, PackageManager packageManager) {
        this.f72916b = i;
        this.f72917c = packageManager;
    }

    /* renamed from: a */
    public static void m60519a(RuntimeException runtimeException) {
        if (!runtimeException.getClass().equals(RuntimeException.class) && !runtimeException.getClass().equals(NullPointerException.class)) {
            throw runtimeException;
        }
    }
}
