package p000;

import android.os.Build;
import android.os.Process;

/* renamed from: aykg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykg {
    /* renamed from: a */
    public static boolean m84157a() {
        int i = Build.VERSION.SDK_INT;
        return !Process.myUserHandle().isOwner();
    }
}
