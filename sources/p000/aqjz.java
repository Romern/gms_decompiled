package p000;

import android.os.Build;
import android.os.SystemProperties;

/* renamed from: aqjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjz {
    /* renamed from: a */
    public static boolean m71749a(String str, boolean z) {
        int i = Build.VERSION.SDK_INT;
        return SystemProperties.getBoolean(str, z);
    }
}
