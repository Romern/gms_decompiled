package com.google.android.gms.carsetup;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarWifiSetup$1 extends TracingBroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C1585otp f29635a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarWifiSetup$1(C1585otp otp, String str) {
        super(str);
        this.f29635a = otp;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.DISCONNECTED) {
            C1585otp otp = this.f29635a;
            bnsn bnsn = C1585otp.f38420a;
            otp.f38424e.mo17418b(bpdn.PROTOCOL_IO_ERROR, bpdo.WIFI_NETWORK_DISCONNECTED, "Wifi network no longer connected");
            this.f29635a.f38422c.mo22619a(2, null, null, 304, null);
        }
    }
}
