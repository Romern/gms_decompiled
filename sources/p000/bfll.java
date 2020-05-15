package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import com.google.android.location.contexthub.SettingsHelperNyc$2;

/* renamed from: bfll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfll extends bflh implements bugl {

    /* renamed from: a */
    public final bugn f114343a;

    /* renamed from: b */
    public final long f114344b;

    /* renamed from: c */
    public final Handler f114345c;

    /* renamed from: d */
    public boolean f114346d = false;

    /* renamed from: e */
    public final bugo f114347e = new bfli(this);

    /* renamed from: f */
    public final bxvd f114348f;

    /* renamed from: g */
    private final Context f114349g;

    /* renamed from: h */
    private final adzx f114350h;

    /* renamed from: i */
    private final WifiManager f114351i;

    /* renamed from: j */
    private boolean f114352j = false;

    /* renamed from: k */
    private final BroadcastReceiver f114353k = new SettingsHelperNyc$2(this, "location");

    public bfll(Context context, Handler handler) {
        bugn a = new bgcb().mo62634a(context);
        this.f114349g = context;
        this.f114345c = handler;
        this.f114343a = a;
        this.f114344b = 5147455389092024324L;
        this.f114351i = (WifiManager) context.getSystemService("wifi");
        this.f114348f = bugf.f153773g.mo74144da();
        this.f114350h = new bflk(this, "location", "SettingsHelperWifiObserver", handler);
    }

    /* renamed from: h */
    private final boolean m97183h() {
        WifiManager wifiManager = this.f114351i;
        return wifiManager != null && (wifiManager.isWifiEnabled() || this.f114351i.isScanAlwaysAvailable());
    }

    /* renamed from: a */
    public final void mo61880a(int i) {
    }

    /* renamed from: b */
    public final void mo61883b() {
        boolean h = m97183h();
        bxvd bxvd = this.f114348f;
        if (((bugf) bxvd.f164949b).f153777c != h) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bugf bugf = (bugf) bxvd.f164949b;
            bugf bugf2 = bugf.f153773g;
            bugf.f153775a |= 2;
            bugf.f153777c = h;
            mo61881a(3, this.f114348f);
        }
    }

    /* renamed from: b */
    public final void mo61884b(int i) {
    }

    /* renamed from: c */
    public final void mo61885c() {
        if (!this.f114346d) {
            this.f114346d = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.location.MODE_CHANGED");
            if (ceue.f183435a.mo6606a().bugfixCatchLatestSettings()) {
                intentFilter.addAction("android.location.PROVIDERS_CHANGED");
                this.f114349g.getContentResolver().registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, this.f114350h);
                this.f114352j = true;
            }
            this.f114349g.registerReceiver(this.f114353k, intentFilter, null, this.f114345c);
        }
    }

    /* renamed from: cr */
    public final void mo61886cr() {
        mo61882a(this.f114348f);
        mo61881a(3, this.f114348f);
    }

    /* renamed from: d */
    public final void mo61887d() {
        if (this.f114346d) {
            this.f114346d = false;
            this.f114349g.unregisterReceiver(this.f114353k);
            if (this.f114352j) {
                this.f114352j = false;
                this.f114349g.getContentResolver().unregisterContentObserver(this.f114350h);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo61888e() {
        return Settings.System.getInt(this.f114349g.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    /* renamed from: f */
    public final boolean mo61889f() {
        return Settings.Secure.isLocationProviderEnabled(this.f114349g.getContentResolver(), "gps");
    }

    /* renamed from: g */
    public final boolean mo61890g() {
        return Settings.Secure.isLocationProviderEnabled(this.f114349g.getContentResolver(), "network");
    }

    /* renamed from: a */
    public final void mo61881a(int i, bxvd bxvd) {
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bugf bugf = (bugf) bxvd.f164949b;
        bugf bugf2 = bugf.f153773g;
        bugf.f153776b = i - 1;
        bugf.f153775a |= 1;
        bugr a = this.f114343a.mo72627a(this.f114344b);
        if (a != null) {
            bugu a2 = a.mo72640a(49, 0, (bugf) bxvd.clone().mo74062i());
            if (a2 == null) {
                Log.e("SettingsHelperNyc", "Unable to post notification to nanoapp.");
            } else {
                a2.mo72638a(new bflj());
            }
        }
    }

    /* renamed from: a */
    public final void mo61882a(bxvd bxvd) {
        boolean h = m97183h();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bugf bugf = (bugf) bxvd.f164949b;
        bugf bugf2 = bugf.f153773g;
        bugf.f153775a |= 2;
        bugf.f153777c = h;
        boolean z = !mo61888e();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bugf bugf3 = (bugf) bxvd.f164949b;
        bugf3.f153775a |= 4;
        bugf3.f153778d = z;
        boolean f = mo61889f();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bugf bugf4 = (bugf) bxvd.f164949b;
        bugf4.f153775a |= 8;
        bugf4.f153779e = f;
        boolean g = mo61890g();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bugf bugf5 = (bugf) bxvd.f164949b;
        bugf5.f153775a |= 16;
        bugf5.f153780f = g;
    }
}
