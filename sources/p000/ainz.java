package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.google.android.gms.nearby.mediums.WifiHotspot$SoftApHotspotOperation$1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ainz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ainz extends airo {

    /* renamed from: a */
    public final WifiManager f69301a;

    /* renamed from: b */
    public aint f69302b;

    /* renamed from: c */
    private final Context f69303c;

    /* renamed from: d */
    private final ConnectivityManager f69304d;

    /* renamed from: e */
    private WifiConfiguration f69305e;

    /* renamed from: f */
    private final ahfk f69306f;

    public ainz(Context context, WifiManager wifiManager, ConnectivityManager connectivityManager, ahfk ahfk) {
        super(63, ahfk);
        this.f69303c = context;
        this.f69301a = wifiManager;
        this.f69304d = connectivityManager;
        this.f69306f = ahfk;
    }

    /* renamed from: a */
    private final boolean m57525a(WifiConfiguration wifiConfiguration) {
        this.f69305e = this.f69301a.getWifiApConfiguration();
        if (!this.f69301a.setWifiApConfiguration(wifiConfiguration)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("ainz", "a", 1183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to set Wifi AP configuration for SSID %s before starting tethering", wifiConfiguration.SSID);
            return false;
        }
        this.f69304d.startTethering(0, false, new ainy());
        return true;
    }

    /* renamed from: b */
    private final void m57526b(WifiConfiguration wifiConfiguration) {
        this.f69304d.stopTethering(0);
        if (!this.f69301a.setWifiApConfiguration(this.f69305e)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("ainz", "b", 1210, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Failed to restore prior Wifi AP configuration for SSID %s after stopping tethering for SSID %s", this.f69305e.SSID, wifiConfiguration.SSID);
        }
        this.f69305e = null;
    }

    /* renamed from: d */
    private final boolean m57527d(int i) {
        return this.f69301a.getWifiApState() == i;
    }

    /* renamed from: b */
    public final int mo37568b() {
        ainw ainw = new ainw(this, ails.m57437a(28), ails.m57437a(12));
        butj butj = new butj(cfnv.m140772ah());
        butj.f154849a = this.f69306f.mo36402c();
        return !butl.m120434a(ainw, "StartWifiAp", butj.mo73110a()) ? 3 : 2;
    }

    /* renamed from: a */
    public final void mo37566a() {
        aint aint = this.f69302b;
        ainx ainx = new ainx(this, aiof.m57536a(aint.f69286a, aint.f69287b, false));
        butj butj = new butj(cfnv.m140772ah());
        butj.f154849a = this.f69306f.mo36402c();
        butl.m120434a(ainx, "StopWifiAp", butj.mo73110a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7 A[Catch:{ InterruptedException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb A[RETURN] */
    /* renamed from: a */
    public final boolean mo37732a(WifiConfiguration wifiConfiguration, int i) {
        Context context;
        if (m57527d(i)) {
            return true;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        WifiHotspot$SoftApHotspotOperation$1 wifiHotspot$SoftApHotspotOperation$1 = new WifiHotspot$SoftApHotspotOperation$1("nearby", i, countDownLatch);
        this.f69303c.registerReceiver(wifiHotspot$SoftApHotspotOperation$1, new IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED"));
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i == 13) {
                this.f69305e = this.f69301a.getWifiApConfiguration();
                if (!this.f69301a.setWifiApConfiguration(wifiConfiguration)) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                    bnsl.mo68432a("ainz", "a", 1183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to set Wifi AP configuration for SSID %s before starting tethering", wifiConfiguration.SSID);
                    context = this.f69303c;
                } else {
                    this.f69304d.startTethering(0, false, new ainy());
                    try {
                        if (!countDownLatch.await(cfnv.m140771ag(), TimeUnit.SECONDS)) {
                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                            bnsl2.mo68432a("ainz", "a", 1144, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Timed out while waiting on latch to signal successful Wifi AP state change.");
                        }
                        ahhd.m55766a(this.f69303c, wifiHotspot$SoftApHotspotOperation$1);
                        if (!m57527d(i)) {
                            return true;
                        }
                        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl3.mo68432a("ainz", "a", 1158, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68412a("Couldn't set Wifi AP state to %d in %d seconds", i, cfnv.m140771ag());
                        return false;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl4.mo68432a("ainz", "a", 1149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68409a("Interrupted while waiting to set Wifi AP state to %d", i);
                        context = this.f69303c;
                    }
                }
            } else {
                if (i == 11) {
                    this.f69304d.stopTethering(0);
                    if (!this.f69301a.setWifiApConfiguration(this.f69305e)) {
                        bnsl bnsl5 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl5.mo68432a("ainz", "b", 1210, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68424a("Failed to restore prior Wifi AP configuration for SSID %s after stopping tethering for SSID %s", this.f69305e.SSID, wifiConfiguration.SSID);
                    }
                    this.f69305e = null;
                }
                if (!countDownLatch.await(cfnv.m140771ag(), TimeUnit.SECONDS)) {
                }
                ahhd.m55766a(this.f69303c, wifiHotspot$SoftApHotspotOperation$1);
                if (!m57527d(i)) {
                }
            }
        } catch (Exception e2) {
            bnsl bnsl6 = (bnsl) ailf.f69111a.mo68387b();
            bnsl6.mo68437a(e2);
            bnsl6.mo68432a("ainz", "a", 1125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Failed to invoke tethering-related @SystemApi method, have OEMs removed it?");
            context = this.f69303c;
        } catch (Throwable th) {
            ahhd.m55766a(this.f69303c, wifiHotspot$SoftApHotspotOperation$1);
            throw th;
        }
        ahhd.m55766a(context, wifiHotspot$SoftApHotspotOperation$1);
        return false;
    }
}
