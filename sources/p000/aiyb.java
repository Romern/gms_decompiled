package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: aiyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyb {
    /* renamed from: a */
    public static void m58178a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.nearby.messages.service.NearbyMessagesService");
        intent.setAction("com.google.android.gms.nearby.messages.service.START_SERVICE_PERSISTENT");
        context.startService(intent);
    }

    /* renamed from: b */
    public static Intent m58179b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        return intent;
    }
}
