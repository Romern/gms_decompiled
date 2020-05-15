package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.nearby.mediums.WifiRadio$1;
import com.google.android.gms.nearby.mediums.WifiRadio$2;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aioz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aioz {

    /* renamed from: a */
    public final bqgj f69400a;

    /* renamed from: b */
    private final Context f69401b;

    /* renamed from: c */
    private final airs f69402c;

    /* renamed from: d */
    private final WifiManager f69403d;

    /* renamed from: e */
    private final AtomicBoolean f69404e;

    /* renamed from: f */
    private airo f69405f;

    /* renamed from: g */
    private final BroadcastReceiver f69406g = new WifiRadio$1(this, "nearby");

    public aioz(Context context, airs airs) {
        bqgj b = ahhr.m55806b();
        Context applicationContext = context.getApplicationContext();
        this.f69401b = applicationContext;
        this.f69402c = airs;
        this.f69400a = b;
        WifiManager wifiManager = (WifiManager) applicationContext.getSystemService("wifi");
        this.f69403d = wifiManager;
        if (wifiManager != null) {
            if (!m57611b(1)) {
                m57614g();
            } else if (!m57613f()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aioz", "<init>", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s Failed to take register radio state upon initialization.", "[WIFI_RADIO]");
                this.f69404e = null;
                return;
            }
            this.f69404e = new AtomicBoolean(this.f69403d.isWifiEnabled());
            srn srn = ailf.f69111a;
            this.f69403d.isWifiEnabled();
            m57615h();
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
        bnsl2.mo68432a("aioz", "<init>", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Failed to retrieve WifiManager, Wifi is unsupported.");
        this.f69404e = null;
    }

    /* renamed from: a */
    private final boolean m57610a(int i) {
        boolean z;
        if (m57611b(i)) {
            return true;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        WifiRadio$2 wifiRadio$2 = new WifiRadio$2("nearby", i, countDownLatch);
        this.f69401b.registerReceiver(wifiRadio$2, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        m57616i();
        try {
            WifiManager wifiManager = this.f69403d;
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            wifiManager.setWifiEnabled(z);
            if (!countDownLatch.await(cfnv.m140777am(), TimeUnit.SECONDS)) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aioz", "a", 520, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s timed out while waiting for latch to signal Wifi state change completion.", "[WIFI_RADIO]");
            } else {
                srn srn = ailf.f69111a;
            }
            ahhd.m55766a(this.f69401b, wifiRadio$2);
            m57615h();
            if (m57611b(i)) {
                return true;
            }
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aioz", "a", 540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68423a("Failed to set Wifi state to %s after waiting %d seconds, bailing.", aild.m57410a(i), cfnv.m140777am());
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68432a("aioz", "a", 526, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Interrupted while waiting to set Wifi state to %s", aild.m57410a(i));
            ahhd.m55766a(this.f69401b, wifiRadio$2);
            m57615h();
            return false;
        } catch (Throwable th) {
            ahhd.m55766a(this.f69401b, wifiRadio$2);
            m57615h();
            throw th;
        }
    }

    /* renamed from: b */
    private final boolean m57611b(int i) {
        return this.f69403d.getWifiState() == i;
    }

    /* renamed from: e */
    private final boolean m57612e() {
        return (this.f69403d == null || this.f69404e == null) ? false : true;
    }

    /* renamed from: f */
    private final boolean m57613f() {
        if (m57618k()) {
            srn srn = ailf.f69111a;
            return true;
        }
        airo airo = new airo(11);
        if (this.f69402c.mo37908b(airo) != airr.SUCCESS) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aioz", "f", 423, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Failed to mark Wifi as disabled because we were unable to register the MediumOperation.", "[WIFI_RADIO]");
            return false;
        }
        this.f69405f = airo;
        srn srn2 = ailf.f69111a;
        return true;
    }

    /* renamed from: g */
    private final void m57614g() {
        if (!m57618k()) {
            srn srn = ailf.f69111a;
            return;
        }
        this.f69402c.mo37910c(this.f69405f);
        this.f69405f = null;
        srn srn2 = ailf.f69111a;
    }

    /* renamed from: h */
    private final void m57615h() {
        this.f69401b.registerReceiver(this.f69406g, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        m57617j();
    }

    /* renamed from: i */
    private final void m57616i() {
        ahhd.m55766a(this.f69401b, this.f69406g);
        m57617j();
    }

    /* renamed from: j */
    private final void m57617j() {
        if (m57611b(3)) {
            m57614g();
        } else {
            m57613f();
        }
    }

    /* renamed from: k */
    private final boolean m57618k() {
        return this.f69405f != null;
    }

    /* renamed from: c */
    public final synchronized void mo37791c() {
        airs airs;
        if (!cfnv.m140739A()) {
            int i = Build.VERSION.SDK_INT;
            srn srn = ailf.f69111a;
        } else if (!m57612e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aioz", "c", 274, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Unable to toggle Wifi Radio since it was never initialized.", "[WIFI_RADIO]");
        } else {
            airo airo = new airo(12);
            if (airr.SUCCESS != this.f69402c.mo37908b(airo)) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aioz", "c", 281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("%s Unable to toggle because we were unable to register the MediumOperation.", "[WIFI_RADIO]");
                return;
            }
            try {
                if (!m57610a(1)) {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl3.mo68432a("aioz", "c", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("%s Failed to turn Wifi off while toggling state.", "[WIFI_RADIO]");
                }
                Thread.sleep(cfnv.f184625a.mo6606a().mo81807bM());
                if (!m57610a(3)) {
                    bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl4.mo68432a("aioz", "c", 302, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68420a("%s Failed to enable Wifi at the end of a toggle attempt, Wifi-related operations may not work correctly here onwards!", "[WIFI_RADIO]");
                }
                airs = this.f69402c;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                bnsl5.mo68437a(e);
                bnsl5.mo68432a("aioz", "c", 296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68420a("%s Interrupted while waiting in between a Wifi toggle.", "[WIFI_RADIO]");
                airs = this.f69402c;
            } catch (Throwable th) {
                this.f69402c.mo37910c(airo);
                throw th;
            }
            airs.mo37910c(airo);
        }
    }

    /* renamed from: d */
    public final synchronized void mo37792d() {
        int i;
        if (!m57612e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aioz", "d", 316, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Unable to revert Wifi Radio since it was never initialized.", "[WIFI_RADIO]");
            return;
        }
        srn srn = ailf.f69111a;
        this.f69404e.get();
        try {
            if (!this.f69404e.get()) {
                i = 1;
            } else {
                i = 3;
            }
            if (!m57610a(i)) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                bnsl2.mo68432a("aioz", "d", 329, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("%s Failed to revert Wifi back to its most recent manually-set state.", "[WIFI_RADIO]");
            }
        } finally {
            m57616i();
            ahhr.m55805a(this.f69400a, "WifiRadio.singleThreadOffloader");
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo37790b() {
        if (!m57612e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aioz", "b", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Unable to disable Wifi Radio since it was never initialized.", "[WIFI_RADIO]");
            return false;
        } else if (m57611b(1)) {
            srn srn = ailf.f69111a;
            return m57613f();
        } else if (!cfnv.m140739A()) {
            int i = Build.VERSION.SDK_INT;
            srn srn2 = ailf.f69111a;
            m57614g();
            return false;
        } else if (!m57613f()) {
            srn srn3 = ailf.f69111a;
            return false;
        } else if (!m57610a(1)) {
            srn srn4 = ailf.f69111a;
            m57614g();
            return false;
        } else {
            srn srn5 = ailf.f69111a;
            return true;
        }
    }

    aioz(Context context, airs airs, bqgj bqgj) {
        Context applicationContext = context.getApplicationContext();
        this.f69401b = applicationContext;
        this.f69402c = airs;
        this.f69400a = bqgj;
        WifiManager wifiManager = (WifiManager) applicationContext.getSystemService("wifi");
        this.f69403d = wifiManager;
        if (wifiManager != null) {
            if (!m57611b(1)) {
                m57614g();
            } else if (!m57613f()) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aioz", "<init>", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s Failed to take register radio state upon initialization.", "[WIFI_RADIO]");
                this.f69404e = null;
                return;
            }
            this.f69404e = new AtomicBoolean(this.f69403d.isWifiEnabled());
            srn srn = ailf.f69111a;
            this.f69403d.isWifiEnabled();
            m57615h();
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
        bnsl2.mo68432a("aioz", "<init>", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Failed to retrieve WifiManager, Wifi is unsupported.");
        this.f69404e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (m57618k() != false) goto L_0x0053;
     */
    /* renamed from: a */
    public final synchronized void mo37788a(Intent intent) {
        if (!m57612e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aioz", "a", 350, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Unable to process manual radio state change since Wifi Radio was never initialized.", "[WIFI_RADIO]");
        } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("wifi_state", 4);
            srn srn = ailf.f69111a;
            aild.m57410a(intExtra);
            if (intExtra == 3 || intExtra == 1) {
                if (intExtra != 3) {
                    if (!m57618k()) {
                    }
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl2.mo68432a("aioz", "a", 371, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("%s Received spurious broadcast for Wifi Radio state change.", "[WIFI_RADIO]");
                    return;
                }
                if (intExtra == 1) {
                    m57613f();
                } else {
                    m57614g();
                }
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                bnsl3.mo68432a("aioz", "a", 388, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("%s State was changed outside of our control. Updating the snapshot to match current radio state.", "[WIFI_RADIO]");
                this.f69404e.getAndSet(this.f69403d.isWifiEnabled());
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37789a() {
        if (!m57612e()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aioz", "a", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s Unable to enable Wifi Radio since it was never initialized.", "[WIFI_RADIO]");
            return false;
        } else if (m57611b(3)) {
            srn srn = ailf.f69111a;
            m57614g();
            return true;
        } else if (!cfnv.m140739A()) {
            int i = Build.VERSION.SDK_INT;
            srn srn2 = ailf.f69111a;
            m57613f();
            return false;
        } else if (!m57610a(3)) {
            srn srn3 = ailf.f69111a;
            m57613f();
            return false;
        } else {
            m57614g();
            srn srn4 = ailf.f69111a;
            return true;
        }
    }
}
