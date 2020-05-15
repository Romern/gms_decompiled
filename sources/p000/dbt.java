package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: dbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dbt extends BroadcastReceiver {

    /* renamed from: a */
    public boolean f12748a = true;

    public dbt(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            z = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            z = false;
        } else {
            return;
        }
        this.f12748a = z;
    }
}
