package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;

/* renamed from: rpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rpj extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Log.i("DirectBootExitBR", "Killing process on exit from direct boot mode.");
            Process.killProcess(Process.myPid());
        }
    }
}
