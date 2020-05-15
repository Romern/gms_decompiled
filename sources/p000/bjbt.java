package p000;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: bjbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbt {
    /* renamed from: a */
    public static boolean m103168a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
