package p000;

import android.content.Context;
import android.os.Process;

/* renamed from: asce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asce {
    /* renamed from: a */
    public static boolean m73770a(Context context) {
        return context.checkPermission("android.permission.READ_WIFI_CREDENTIAL", Process.myPid(), Process.myUid()) == 0;
    }
}
