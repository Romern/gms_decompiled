package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.internal.ClientIdentity;

/* renamed from: bhby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhby {

    /* renamed from: a */
    private static ClientIdentity f118278a;

    /* renamed from: a */
    public static synchronized ClientIdentity m100614a(Context context) {
        ClientIdentity clientIdentity;
        synchronized (bhby.class) {
            if (f118278a == null) {
                int i = Build.VERSION.SDK_INT;
                try {
                    f118278a = new ClientIdentity(svr.m36484b(context).mo26172a("com.google.android.location.services", 0).uid, "com.google.android.location.services");
                } catch (PackageManager.NameNotFoundException e) {
                }
                if (f118278a == null) {
                    f118278a = new ClientIdentity(context.getApplicationInfo().uid, context.getPackageName());
                }
            }
            clientIdentity = f118278a;
        }
        return clientIdentity;
    }
}
