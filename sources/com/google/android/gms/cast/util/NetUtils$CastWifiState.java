package com.google.android.gms.cast.util;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetUtils$CastWifiState extends aacn {

    /* renamed from: a */
    public String f29927a;

    /* renamed from: b */
    public String f29928b;

    /* renamed from: c */
    public Integer f29929c;

    /* renamed from: d */
    private final qav f29930d = new qav("CastWifiState");

    /* renamed from: e */
    private final Context f29931e;

    public NetUtils$CastWifiState(Context context) {
        super("cast");
        this.f29931e = context;
        mo17609a();
    }

    /* renamed from: a */
    public final void mo17609a() {
        WifiInfo wifiInfo;
        String str;
        String str2;
        synchronized (this) {
            WifiManager wifiManager = (WifiManager) this.f29931e.getSystemService("wifi");
            Integer num = null;
            if (wifiManager == null || !wifiManager.isWifiEnabled() || wifiManager.getConnectionInfo() == null) {
                wifiInfo = null;
            } else {
                wifiInfo = wifiManager.getConnectionInfo();
            }
            if (wifiInfo != null) {
                str = wifiInfo.getSSID();
            } else {
                str = null;
            }
            this.f29927a = str;
            if (wifiInfo != null) {
                str2 = wifiInfo.getBSSID();
            } else {
                str2 = null;
            }
            this.f29928b = str2;
            int ipAddress = wifiInfo != null ? wifiInfo.getIpAddress() : 0;
            if (ipAddress != 0) {
                num = Integer.valueOf(ipAddress);
            }
            this.f29929c = num;
        }
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        this.f29930d.mo23861b("doReceive Wifi state changed");
        mo17609a();
    }
}
