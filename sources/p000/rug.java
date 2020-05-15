package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;

/* renamed from: rug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rug extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        long a = rue.m34466a(context);
        long longExtra = intent.getLongExtra("dd_shared_prefs_id_extra", -1);
        if (a != -1 && a == longExtra) {
            return;
        }
        if (longExtra != -1) {
            Log.i("DDSharedPrefsUpdatedBR", "Killing process to force shared prefs update.");
            Process.killProcess(Process.myPid());
            return;
        }
        Log.w("DDSharedPrefsUpdatedBR", "Intent had no version set. Ignoring!");
    }
}
