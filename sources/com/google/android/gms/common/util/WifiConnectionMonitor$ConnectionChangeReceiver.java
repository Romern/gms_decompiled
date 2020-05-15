package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiConnectionMonitor$ConnectionChangeReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ stw f30407a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiConnectionMonitor$ConnectionChangeReceiver(stw stw) {
        super("common-base");
        this.f30407a = stw;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        boolean z;
        String str;
        if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            boolean z2 = false;
            if (networkInfo == null || !networkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            String str2 = null;
            if (z) {
                WifiInfo connectionInfo = this.f30407a.f45141a.getConnectionInfo();
                if (connectionInfo != null) {
                    str = connectionInfo.getBSSID();
                } else {
                    str = null;
                }
                if (str != null) {
                    z2 = z;
                }
            } else {
                z2 = z;
                str = null;
            }
            stw stw = this.f30407a;
            if (stw.f45144d != z2 || (z2 && !str.equals(stw.f45145e))) {
                stw stw2 = this.f30407a;
                stw2.f45144d = z2;
                if (z2) {
                    str2 = str;
                }
                stw2.f45145e = str2;
                synchronized (stw2.f45142b) {
                    stw stw3 = this.f30407a;
                    stv stv = stw3.f45143c;
                    if (stv != null) {
                        stv.mo26077a(stw3.f45144d, stw3.f45145e);
                    }
                }
            }
        }
    }
}
