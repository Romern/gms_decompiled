package p000;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;

/* renamed from: szj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class szj extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ TelephonyManager f45501a;

    /* renamed from: b */
    final /* synthetic */ ServiceState f45502b;

    /* renamed from: c */
    final /* synthetic */ int f45503c;

    /* renamed from: d */
    final /* synthetic */ szm f45504d;

    public szj(szm szm, TelephonyManager telephonyManager, ServiceState serviceState, int i) {
        this.f45504d = szm;
        this.f45501a = telephonyManager;
        this.f45502b = serviceState;
        this.f45503c = i;
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f45501a.listen(this, 0);
        snp.m35702a(10).execute(new szi(this, this.f45502b, this.f45503c, signalStrength));
    }
}
