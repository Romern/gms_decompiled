package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;

/* renamed from: aboh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aboh {

    /* renamed from: a */
    public final Context f57788a;

    public aboh(Context context) {
        this.f57788a = context;
    }

    /* renamed from: a */
    public static TelephonyManager m47994a(TelephonyManager telephonyManager) {
        int i = Build.VERSION.SDK_INT;
        if (abmm.m47915b() >= 0) {
            return telephonyManager.createForSubscriptionId(abmm.m47915b());
        }
        int i2 = Build.VERSION.SDK_INT;
        return SubscriptionManager.getDefaultDataSubscriptionId() >= 0 ? telephonyManager.createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId()) : telephonyManager;
    }
}
