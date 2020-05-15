package p000;

import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.google.android.gms.appinvite.sms.SendSmsOperation;

/* renamed from: fvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvu extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ TelephonyManager f17380a;

    /* renamed from: b */
    final /* synthetic */ Context f17381b;

    /* renamed from: c */
    final /* synthetic */ Intent f17382c;

    /* renamed from: d */
    private boolean f17383d = false;

    public fvu(TelephonyManager telephonyManager, Context context, Intent intent) {
        this.f17380a = telephonyManager;
        this.f17381b = context;
        this.f17382c = intent;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        if (serviceState.getState() == 0 && !this.f17383d) {
            this.f17380a.listen(this, 0);
            SendSmsOperation.m6195a(this.f17381b, this.f17382c);
            this.f17383d = true;
        }
    }
}
