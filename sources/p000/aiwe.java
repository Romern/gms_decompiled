package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import java.util.concurrent.TimeUnit;

/* renamed from: aiwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwe {

    /* renamed from: a */
    private final Context f69927a;

    /* renamed from: b */
    private final WifiManager f69928b;

    public aiwe(Context context, WifiManager wifiManager) {
        this.f69927a = context;
        this.f69928b = wifiManager;
    }

    /* renamed from: d */
    private final SharedPreferences m58058d() {
        return this.f69927a.getSharedPreferences("nearbymediums:wifilan:blacklist", 0);
    }

    /* renamed from: a */
    public final synchronized void mo38147a() {
        m58058d().edit().putLong(this.f69928b.getConnectionInfo().getBSSID(), System.currentTimeMillis()).apply();
    }

    /* renamed from: b */
    public final synchronized void mo38148b() {
        m58058d().edit().remove(this.f69928b.getConnectionInfo().getBSSID()).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        return false;
     */
    /* renamed from: c */
    public final synchronized boolean mo38149c() {
        if (cfnv.f184625a.mo6606a().mo81745aD()) {
            String bssid = this.f69928b.getConnectionInfo().getBSSID();
            SharedPreferences d = m58058d();
            long j = d.getLong(bssid, -1);
            if (j != -1) {
                if (TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - j) >= cfnv.m140774aj()) {
                    d.edit().remove(bssid).apply();
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                    bnsl.mo68432a("aiwe", "c", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68423a("BSSID %s failed more than %s hrs ago, try again this time.", bssid, cfnv.m140774aj());
                    return false;
                }
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aiwe", "c", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("BSSID %s has failed in the past, ignored this time.", bssid);
                return true;
            }
        }
    }
}
