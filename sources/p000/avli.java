package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: avli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avli {
    /* renamed from: a */
    public static void m78712a(Context context, Intent intent) {
        intent.setPackage("com.google.android.gms");
        intent.setAction("com.google.android.gms.update.START_SERVICE");
        context.startService(intent);
    }
}
