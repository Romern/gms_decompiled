package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;

/* renamed from: avvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvm {
    /* renamed from: a */
    public static void m79433a(Context context, boolean z) {
        long serialNumberForUser = ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle());
        Intent className = new Intent("com.google.android.gms.usagereporting.update_optin.ACTION").setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver");
        className.putExtra("SOURCE_SERIAL_ID", serialNumberForUser);
        className.putExtra("SOURCE_USER", UserHandle.myUserId());
        className.putExtra("OPT_VALUE", z);
        int i = Build.VERSION.SDK_INT;
        context.sendBroadcastAsUser(className, UserHandle.of(0));
    }

    /* renamed from: a */
    public static boolean m79434a() {
        int i = Build.VERSION.SDK_INT;
        return Process.myUserHandle().isOwner();
    }

    /* renamed from: a */
    public static boolean m79435a(Context context) {
        try {
            if (!chdz.m148557d()) {
                return Settings.Global.getInt(context.getContentResolver(), "multi_cb") == 1;
            }
            int c = avvn.m79436a().mo51648c();
            return c != 0 && Settings.Global.getInt(context.getContentResolver(), "multi_cb") == c;
        } catch (Settings.SettingNotFoundException e) {
            return false;
        }
    }
}
