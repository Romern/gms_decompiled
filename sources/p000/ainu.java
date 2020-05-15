package p000;

import android.net.wifi.WifiManager;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ainu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ainu extends airo {

    /* renamed from: a */
    public aint f69291a;

    /* renamed from: b */
    private final WifiManager f69292b;

    /* renamed from: c */
    private final bqgy f69293c;

    /* renamed from: d */
    private final WifiManager.LocalOnlyHotspotCallback f69294d;

    /* renamed from: e */
    private WifiManager.LocalOnlyHotspotReservation f69295e;

    public ainu(WifiManager wifiManager, bqgy bqgy, WifiManager.LocalOnlyHotspotCallback localOnlyHotspotCallback) {
        super(62);
        this.f69292b = wifiManager;
        this.f69293c = bqgy;
        this.f69294d = localOnlyHotspotCallback;
    }

    /* renamed from: a */
    public final void mo37566a() {
        WifiManager.LocalOnlyHotspotReservation localOnlyHotspotReservation = this.f69295e;
        if (localOnlyHotspotReservation != null) {
            localOnlyHotspotReservation.close();
            this.f69295e = null;
        }
    }

    /* renamed from: b */
    public final int mo37568b() {
        this.f69292b.startLocalOnlyHotspot(this.f69294d, null);
        try {
            this.f69295e = (WifiManager.LocalOnlyHotspotReservation) this.f69293c.get(cfnv.m140771ag(), TimeUnit.SECONDS);
            this.f69291a = new aint(this.f69295e.getWifiConfiguration().SSID, this.f69295e.getWifiConfiguration().preSharedKey, aiof.m57538a(this.f69292b));
            return 2;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("ainu", "b", 1755, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Interrupted while waiting to enable local only hotspot.");
            return 3;
        } catch (ExecutionException e2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("ainu", "b", 1757, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to start local only hotspot.");
            return 3;
        } catch (TimeoutException e3) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("ainu", "b", 1759, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Timed out waiting for local only hotspot to start.");
            return 3;
        } catch (IOException e4) {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68437a(e4);
            bnsl4.mo68432a("ainu", "b", 1761, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Failed to start a local only hotspot because we couldn't get the IP address.");
            return 3;
        }
    }
}
