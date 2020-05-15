package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;

/* renamed from: afby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afby {

    /* renamed from: a */
    public final ConnectivityManager f64163a;

    /* renamed from: b */
    private final WifiManager f64164b;

    public afby(Context context) {
        this.f64164b = (WifiManager) context.getSystemService("wifi");
        this.f64163a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public final WifiConfiguration mo34730a() {
        m52821e();
        return this.f64164b.getWifiApConfiguration();
    }

    /* renamed from: b */
    public final boolean mo34732b() {
        m52821e();
        return this.f64164b.isWifiApEnabled();
    }

    /* renamed from: c */
    public final int mo34733c() {
        m52821e();
        return this.f64164b.getWifiApState();
    }

    /* renamed from: d */
    public final boolean mo34734d() {
        m52821e();
        return this.f64163a.isTetheringSupported();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: e */
    public static final void m52821e() {
        int i = Build.VERSION.SDK_INT;
        sdo.m34971a(true, (Object) "Cannot call Tether API functions on pre-N devices.");
    }

    /* renamed from: a */
    public final void mo34731a(WifiConfiguration wifiConfiguration) {
        m52821e();
        this.f64164b.setWifiApConfiguration(wifiConfiguration);
    }
}
