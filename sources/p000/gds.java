package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: gds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gds {
    /* renamed from: a */
    public static void m12998a(Context context) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.action.RESUME_HOTWORD");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.putExtra("com.google.android.googlequicksearchbox.extra.PAUSE_HOTWORD_REQUESTING_PACKAGE", context.getPackageName());
        context.sendBroadcast(intent);
    }
}
