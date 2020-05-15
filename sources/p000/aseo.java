package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: aseo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aseo extends C1146ku {
    /* renamed from: b */
    public static void m73884b(Context context, Intent intent) {
        if (intent != null) {
            if (context == null) {
                String valueOf = String.valueOf(intent.toUri(0));
                Log.w("GCoreWakefulBR", valueOf.length() == 0 ? new String("context shouldn't be null. intent: ") : "context shouldn't be null. intent: ".concat(valueOf));
            } else {
                slw.f44710a.mo25722a(context, intent);
            }
            C1146ku.m18579a(intent);
        }
    }

    /* renamed from: c */
    public static void m73885c(Context context, Intent intent) {
        intent.putExtra("WAKE_LOCK_KEY", slp.m35591a(context, intent));
        ComponentName a = C1146ku.m18578a(context, intent);
        if (a != null) {
            slw slw = slw.f44710a;
            String valueOf = String.valueOf(a.flattenToShortString());
            slw.mo25723a(context, intent, valueOf.length() == 0 ? new String("wake:") : "wake:".concat(valueOf), intent.getAction(), "com.google.android.gms");
        }
    }
}
