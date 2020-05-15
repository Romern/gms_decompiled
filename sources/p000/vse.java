package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: vse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vse {
    /* renamed from: a */
    public static void m41148a(Context context, boolean z) {
        vuk.m41322a();
        vsi f = vuk.m41327f(context);
        if (f.mo28796l()) {
            vuk.m41322a();
            boolean b = vuk.m41325d(context.getApplicationContext()).mo28757b();
            boolean z2 = true;
            if (!f.mo28790f() || (!f.mo28791g() && !b)) {
                z2 = false;
            }
            if (!vui.m41309b(context) && !z2) {
                Log.i("CAR.DRIVINGMODE", "Driving Mode ActivityTransition conditions not met. Skip registration.");
            } else {
                Log.i("CAR.DRIVINGMODE", "Driving Mode ActivityTransition client registered.");
                vuk.m41322a();
                vuk.m41321a(context.getApplicationContext()).mo28738a();
            }
            if (z) {
                f.mo28785b(vuu.FORCE);
            }
            f.mo28798n();
        }
    }
}
