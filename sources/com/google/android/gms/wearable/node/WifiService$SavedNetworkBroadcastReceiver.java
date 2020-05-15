package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.os.Build;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WifiService$SavedNetworkBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ aybd f110987a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiService$SavedNetworkBroadcastReceiver(aybd aybd) {
        super("wearable");
        this.f110987a = aybd;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String str;
        if ("android.net.wifi.CONFIGURED_NETWORKS_CHANGE".equals(intent.getAction()) && !this.f110987a.f97012d) {
            int intExtra = intent.getIntExtra("changeReason", 0);
            if (intExtra == 0) {
                str = "ADDED";
            } else if (intExtra == 2) {
                str = "CHANGED";
            } else if (Log.isLoggable("Wear_WifiService", 3)) {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Not syncing credentials for change reason: ");
                sb.append(intExtra);
                Log.d("Wear_WifiService", sb.toString());
                return;
            } else {
                return;
            }
            if (Log.isLoggable("Wear_WifiService", 3)) {
                StringBuilder sb2 = new StringBuilder(str.length() + 29);
                sb2.append("Wifi credentials ");
                sb2.append(str);
                sb2.append(", syncing...");
                Log.d("Wear_WifiService", sb2.toString());
            }
            WifiConfiguration wifiConfiguration = (WifiConfiguration) intent.getParcelableExtra("wifiConfiguration");
            int i = Build.VERSION.SDK_INT;
            if (wifiConfiguration == null || !wifiConfiguration.isEphemeral()) {
                int i2 = Build.VERSION.SDK_INT;
                this.f110987a.mo53857b();
            } else if (Log.isLoggable("Wear_WifiService", 3)) {
                String valueOf = String.valueOf(wifiConfiguration.SSID);
                Log.d("Wear_WifiService", valueOf.length() == 0 ? new String("Not syncing change to ephemeral credential: ") : "Not syncing change to ephemeral credential: ".concat(valueOf));
            }
        }
    }
}
