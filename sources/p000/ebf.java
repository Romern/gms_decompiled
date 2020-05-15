package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.Set;

/* renamed from: ebf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebf extends dyg {

    /* renamed from: b */
    public static final dxr f14586b = new dxr(new ebe(), "WifiConnectionStateProducer", new int[]{91}, null);

    /* renamed from: k */
    protected final WifiManager f14587k;

    /* renamed from: l */
    private bxnv f14588l;

    /* renamed from: m */
    private final Set f14589m = bnic.m109490a("android.net.conn.CONNECTIVITY_CHANGE", "android.net.wifi.STATE_CHANGE");

    public ebf(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14586b, str, dqb);
        mo9851a(91);
        this.f14587k = (WifiManager) this.f14388d.getSystemService("wifi");
    }

    /* renamed from: a */
    private final void m10037a(bxnv bxnv, long j) {
        this.f14588l = bxnv;
        tip tip = new tip(7, 91, 1);
        tip.mo26574a(tka.m37119b(j));
        tip.mo26572a(bxnv.f164097d, this.f14588l);
        mo9857d(tip.mo26570a());
    }

    /* renamed from: j */
    private final bxnv m10038j() {
        WifiInfo connectionInfo;
        bxvd da = bxnv.f164096c.mo74144da();
        WifiManager wifiManager = this.f14587k;
        if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null && !TextUtils.isEmpty(connectionInfo.getBSSID()) && !TextUtils.isEmpty(connectionInfo.getSSID())) {
            String replaceAll = connectionInfo.getSSID().replaceAll("^\"(.*)\"$", "$1");
            if (replaceAll.equals("<unknown ssid>")) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
                bnsl.mo68432a("ebf", "j", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[WifiConnectionStateProducer] Got <unknown ssid>. Dropping state.");
                return null;
            } else if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                bxvd da2 = bxnu.f164091d.mo74144da();
                String bssid = connectionInfo.getBSSID();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bxnu bxnu = (bxnu) da2.f164949b;
                bssid.getClass();
                int i = bxnu.f164093a | 1;
                bxnu.f164093a = i;
                bxnu.f164094b = bssid;
                replaceAll.getClass();
                bxnu.f164093a = i | 2;
                bxnu.f164095c = replaceAll;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxnv bxnv = (bxnv) da.f164949b;
                bxnu bxnu2 = (bxnu) da2.mo74062i();
                bxnu2.getClass();
                bxnv.f164100b = bxnu2;
                bxnv.f164099a |= 1;
            }
        }
        return (bxnv) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        mo9846a(dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        m10037a(m10038j(), dwq.m9665i().mo20505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9846a(long j) {
        super.mo9846a(j);
        this.f14588l = null;
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        bxnv j;
        if (this.f14589m.contains(intent.getAction()) && (j = m10038j()) != null) {
            if (!mo9861g()) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
                bnsl.mo68432a("ebf", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[WifiConnectionStateProducer] No ongoing data. Inserting new context.");
                m10037a(j, dwq.m9665i().mo20505a());
                return;
            }
            bxnv bxnv = this.f14588l;
            if (bxnv != null) {
                bxnu bxnu = j.f164100b;
                if (bxnu == null) {
                    bxnu = bxnu.f164091d;
                }
                String str = bxnu.f164094b;
                bxnu bxnu2 = bxnv.f164100b;
                if (bxnu2 == null) {
                    bxnu2 = bxnu.f164091d;
                }
                if (str.equals(bxnu2.f164094b)) {
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68390d();
                    bnsl2.mo68432a("ebf", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("[WifiConnectionStateProducer] No state change for wifi state context");
                    return;
                }
            }
            long a = dwq.m9665i().mo20505a();
            mo9846a(a);
            m10037a(j, a + 1);
        }
    }
}
