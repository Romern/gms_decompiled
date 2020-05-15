package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.aware.WifiAwareManager;
import android.net.wifi.aware.WifiAwareSession;
import com.google.android.gms.nearby.mediums.wifiaware.WifiAwareImpl$LazyWifiAwareSession$1;
import java.security.SecureRandom;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiuw {

    /* renamed from: a */
    public final WifiAwareManager f69821a;

    /* renamed from: b */
    public final bqgj f69822b = ahhr.m55806b();

    /* renamed from: c */
    public byte[] f69823c;

    /* renamed from: d */
    private final Context f69824d;

    /* renamed from: e */
    private WifiAwareSession f69825e;

    /* renamed from: f */
    private final BroadcastReceiver f69826f = new WifiAwareImpl$LazyWifiAwareSession$1(this, "nearby");

    public aiuw(WifiAwareManager wifiAwareManager, Context context) {
        this.f69821a = wifiAwareManager;
        this.f69824d = context;
        this.f69823c = m57973c();
    }

    /* renamed from: c */
    private static byte[] m57973c() {
        byte[] bArr = new byte[2];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        return r0;
     */
    /* renamed from: a */
    public final synchronized WifiAwareSession mo38073a() {
        WifiAwareSession wifiAwareSession = this.f69825e;
        if (wifiAwareSession == null) {
            WifiAwareManager wifiAwareManager = this.f69821a;
            if (wifiAwareManager == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aiuw", "a", 1074, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unable to acquire WiFi Aware session. wifiAwareManager is null.");
                return null;
            } else if (!wifiAwareManager.isAvailable()) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68432a("aiuw", "a", 1079, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Unable to acquire WiFi Aware session. WiFi is not currently available.");
                return null;
            } else {
                this.f69824d.registerReceiver(this.f69826f, new IntentFilter("android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED"));
                bqgy c = bqgy.m112818c();
                this.f69821a.attach(new aiuu(c), new aiuv(), null);
                try {
                    this.f69825e = (WifiAwareSession) c.get(cfnv.f184625a.mo6606a().mo81811bc(), TimeUnit.SECONDS);
                    this.f69823c = m57973c();
                    wifiAwareSession = this.f69825e;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl3.mo68432a("aiuw", "a", 1125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Interrupted while waiting to attach WiFi Aware session");
                    ahhd.m55766a(this.f69824d, this.f69826f);
                    return null;
                } catch (ExecutionException e2) {
                    bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl4.mo68437a(e2);
                    bnsl4.mo68432a("aiuw", "a", 1127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Failed to attach WiFi Aware session");
                    ahhd.m55766a(this.f69824d, this.f69826f);
                    return null;
                } catch (TimeoutException e3) {
                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl5.mo68437a(e3);
                    bnsl5.mo68432a("aiuw", "a", 1129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("Timed out waiting to attach WiFi Aware session");
                    ahhd.m55766a(this.f69824d, this.f69826f);
                    return null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo38074b() {
        if (this.f69825e != null) {
            ahhd.m55766a(this.f69824d, this.f69826f);
            this.f69825e.close();
            this.f69825e = null;
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiuw", "b", 1148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Released WiFi Aware session.");
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aiuw", "b", 1139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Can't release the WiFi Aware session because none was acquired.");
    }
}
