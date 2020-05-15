package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* renamed from: bffd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bffd extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ bffe f113629a;

    protected bffd(bffe bffe) {
        this.f113629a = bffe;
    }

    public final void onReceive(Context context, Intent intent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bhdb bhdb = this.f113629a.f113804g;
        new Object[1][0] = intent;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f113629a.mo61574a(3, elapsedRealtime);
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.f113629a.mo61574a(2, elapsedRealtime);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f113629a.mo61574a(1, elapsedRealtime);
        } else if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                int intExtra2 = intent.getIntExtra("plugged", -1);
                if (intExtra2 == 2) {
                    this.f113629a.mo61574a(5, elapsedRealtime);
                } else if (intExtra2 != 1) {
                    this.f113629a.mo61574a(7, elapsedRealtime);
                } else {
                    this.f113629a.mo61574a(6, elapsedRealtime);
                }
            } else if (intExtra == 3 || intExtra == 4) {
                this.f113629a.mo61574a(4, elapsedRealtime);
            } else {
                bhdb bhdb2 = this.f113629a.f113804g;
                StringBuilder sb = new StringBuilder(43);
                sb.append("Ignore unknown charging status: ");
                sb.append(intExtra);
                sb.toString();
            }
        } else {
            bhdb bhdb3 = this.f113629a.f113804g;
            String action = intent.getAction();
            StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 31);
            sb2.append("Received unknown event ");
            sb2.append(action);
            sb2.append(", ignore");
            sb2.toString();
        }
    }
}
