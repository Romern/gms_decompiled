package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: bidk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidk {
    /* renamed from: a */
    public static final void m102023a(Context context, Intent intent, PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        intent.setPackage(pendingIntent.getCreatorPackage());
        int i2 = Build.VERSION.SDK_INT;
        spx.m35925a(context).mo25960c("android:fine_location", pendingIntent.getCreatorUid(), pendingIntent.getCreatorPackage());
        int i3 = Build.VERSION.SDK_INT;
        pendingIntent.send(context, 0, intent, null, null, "android.permission.ACCESS_FINE_LOCATION");
    }
}
