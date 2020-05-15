package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.location.fused.bluepixel.BluePixelSettingsManager$WifiSettingReceiver;

/* renamed from: bfts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfts {

    /* renamed from: a */
    public final Context f115254a;

    /* renamed from: b */
    public final aeri f115255b;

    /* renamed from: c */
    public boolean f115256c = false;

    /* renamed from: d */
    public final aerc f115257d;

    /* renamed from: e */
    public final aerh f115258e;

    /* renamed from: f */
    public final bftr f115259f;

    /* renamed from: g */
    public final BluePixelSettingsManager$WifiSettingReceiver f115260g;

    /* renamed from: h */
    private final adzt f115261h;

    /* renamed from: i */
    private final bftm f115262i;

    /* renamed from: j */
    private final WifiManager f115263j;

    /* renamed from: k */
    private boolean f115264k = false;

    public bfts(Context context, adzt adzt, bftm bftm) {
        aeri e = aeri.m52441e(context);
        this.f115254a = context;
        this.f115261h = adzt;
        this.f115262i = bftm;
        this.f115255b = e;
        this.f115263j = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f115257d = new bftp(this);
        this.f115258e = new bftq(this);
        this.f115260g = new BluePixelSettingsManager$WifiSettingReceiver(this);
        this.f115259f = new bftr(this, "location", "BluePixelWifiScanningObserver", adzt);
    }

    /* renamed from: a */
    public final void mo62260a() {
        boolean z;
        if (cest.m138205k()) {
            this.f115264k = false;
            if (aeri.m52437b(this.f115254a)) {
                boolean isWifiEnabled = this.f115263j.isWifiEnabled();
                int i = Build.VERSION.SDK_INT;
                if ((isWifiEnabled || aeri.m52440d(this.f115254a)) && aeri.m52434a(this.f115254a)) {
                    z = true;
                } else {
                    z = false;
                }
                bftm bftm = this.f115262i;
                boolean a = this.f115255b.mo34487a("gps");
                bxvd da = budo.f153492e.mo74144da();
                bxvd da2 = budh.f153466e.mo74144da();
                bxvd da3 = bucx.f153418d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bucx bucx = (bucx) da3.f164949b;
                bucx.f153420a |= 1;
                bucx.f153421b = a;
                bucx bucx2 = (bucx) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                budh budh = (budh) da2.f164949b;
                bucx2.getClass();
                budh.f153470c = bucx2;
                budh.f153468a |= 2;
                bxvd da4 = budr.f153505d.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                budr budr = (budr) da4.f164949b;
                budr.f153507a |= 1;
                budr.f153508b = z;
                budr budr2 = (budr) da4.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                budh budh2 = (budh) da2.f164949b;
                budr2.getClass();
                budh2.f153471d = budr2;
                budh2.f153468a |= 4;
                budh budh3 = (budh) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                budo budo = (budo) da.f164949b;
                budh3.getClass();
                budo.f153496c = budh3;
                budo.f153495b = 6;
                bftm.mo62248a((budo) da.mo74062i(), 1);
                this.f115262i.mo62249d();
                return;
            }
            this.f115262i.mo62252f();
        } else if (!this.f115264k) {
            this.f115262i.mo62252f();
            this.f115264k = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo62261b() {
        if (!this.f115256c) {
            this.f115256c = true;
            this.f115255b.mo34479a(this.f115257d, this.f115261h.getLooper());
            this.f115255b.mo34485a(this.f115258e, this.f115261h.getLooper());
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            this.f115254a.registerReceiver(this.f115260g, intentFilter, null, this.f115261h);
            int i = Build.VERSION.SDK_INT;
            this.f115254a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("wifi_scan_always_enabled"), false, this.f115259f);
        }
    }
}
