package p000;

import android.telephony.PhoneStateListener;

/* renamed from: abmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmt extends PhoneStateListener {
    public final void onActiveDataSubscriptionIdChanged(int i) {
        StringBuilder sb = new StringBuilder(38);
        sb.append("Active data subscriptionid=");
        sb.append(i);
        sb.toString();
        int i2 = eoa.f15378a;
        abmm.m47911a("activeDataSubscriptionId", i);
    }
}
