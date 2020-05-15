package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: anbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbv {

    /* renamed from: a */
    public static final anbv f76601a = new anbv();

    /* renamed from: b */
    public static final IntentFilter f76602b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: a */
    public final anbu mo41674a(Context context) {
        anbu anbu = anbu.f76598a;
        try {
            Intent registerReceiver = context.registerReceiver(null, f76602b);
            if (registerReceiver == null) {
                return anbu;
            }
            int i = -1;
            int intExtra = registerReceiver.getIntExtra("status", -1);
            boolean z = true;
            if (!(intExtra == 2 || intExtra == 5)) {
                z = false;
            }
            int intExtra2 = registerReceiver.getIntExtra("level", -1);
            int intExtra3 = registerReceiver.getIntExtra("scale", 0);
            if (intExtra2 >= 0) {
                if (intExtra3 > 0) {
                    i = (intExtra2 * 100) / intExtra3;
                }
            }
            return new anbu(z, i);
        } catch (Exception e) {
            Log.w("PeopleBU", "Unable to get battery status", e);
            return anbu;
        }
    }
}
