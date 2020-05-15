package p000;

import android.os.Build;

/* renamed from: akke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akke {
    /* renamed from: a */
    public static boolean m59908a() {
        String str = Build.TAGS;
        return str != null && (str.contains("dev-keys") || str.contains("test-keys"));
    }
}
