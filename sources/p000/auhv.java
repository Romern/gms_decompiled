package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;

/* renamed from: auhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhv {

    /* renamed from: a */
    public final boolean f91845a;

    /* renamed from: b */
    public final boolean f91846b;

    /* renamed from: c */
    public final boolean f91847c;

    /* renamed from: d */
    public final int f91848d;

    /* renamed from: e */
    public final boolean f91849e;

    /* renamed from: f */
    public final boolean f91850f;

    public auhv(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
        this.f91845a = z;
        this.f91846b = z2;
        this.f91847c = z3;
        this.f91848d = i;
        this.f91849e = z4;
        this.f91850f = z5;
    }

    /* renamed from: a */
    public static auhv m77087a(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        try {
            z = aeri.m52440d(context);
        } catch (SecurityException e) {
            Log.w("Thunderbird", "cannot check wifi scanning state - lost permission", e);
            z = false;
        }
        try {
            z2 = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).isWifiEnabled();
        } catch (SecurityException e2) {
            Log.w("Thunderbird", "cannot check wifi scanning state - lost permission", e2);
            z2 = false;
        }
        try {
            z3 = aeri.m52434a(context);
        } catch (SecurityException e3) {
            Log.w("Thunderbird", "cannot check nlp opt-in state - lost permission", e3);
            z3 = false;
        }
        try {
            i = aeri.m52438c(context);
        } catch (SecurityException e4) {
            Log.w("Thunderbird", "cannot check location mode state - lost permission", e4);
            i = 0;
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            z4 = ((TelephonyManager) context.getSystemService("phone")).getDataEnabled();
        } catch (SecurityException e5) {
            Log.w("Thunderbird", "cannot check data enabled state - lost permission", e5);
            z4 = false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z5 = false;
            } else {
                z5 = true;
            }
        } catch (SecurityException e6) {
            Log.w("Thunderbird", "cannot check data available state - lost permission", e6);
            z5 = false;
        }
        return new auhv(z, z2, z3, i, z4, z5);
    }

    public final String toString() {
        boolean z = this.f91845a;
        boolean z2 = this.f91846b;
        boolean z3 = this.f91847c;
        int i = this.f91848d;
        boolean z4 = this.f91849e;
        boolean z5 = this.f91850f;
        StringBuilder sb = new StringBuilder(123);
        sb.append("LocationSettingsState[WifiScanning=");
        sb.append(z);
        sb.append(", Wifi=");
        sb.append(z2);
        sb.append(", NlpOptIn=");
        sb.append(z3);
        sb.append(", LocationMode=");
        sb.append(i);
        sb.append(", Data=");
        sb.append(z4);
        sb.append(", Internet=");
        sb.append(z5);
        sb.append("]");
        return sb.toString();
    }
}
