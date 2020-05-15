package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: zpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zpa {
    /* renamed from: a */
    public static void m45929a(Context context, String str, String str2, ResultReceiver resultReceiver, int i, Bundle bundle) {
        if (m45930a(context)) {
            Intent intent = new Intent("com.google.android.gms.fitness.SYNC_PROGRESS");
            intent.setPackage("com.google.android.apps.fitness");
            intent.putExtra("Account", str);
            intent.putExtra("SyncStatus", str2);
            intent.putExtra("SyncSource", i);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            if (resultReceiver != null) {
                intent.putExtra("ResultReceiver", resultReceiver);
            }
            context.sendBroadcast(intent);
        } else if (resultReceiver != null) {
            resultReceiver.send(1, new Bundle());
        }
    }

    /* renamed from: a */
    public static boolean m45930a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.google.android.apps.fitness", 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
