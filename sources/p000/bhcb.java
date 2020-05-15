package p000;

import android.app.PendingIntent;
import android.os.Build;

/* renamed from: bhcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcb {
    /* renamed from: a */
    public static String m100621a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorPackage();
    }
}
