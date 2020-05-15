package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Pair;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.session.CastNearbySessionManager$CastNearbyPinAvailableReceiver;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pzd {

    /* renamed from: a */
    public static final String f40716a;

    /* renamed from: b */
    public static final String f40717b;

    /* renamed from: c */
    public static final int f40718c = ((int) ccxy.f180226a.mo6606a().mo77047i());

    /* renamed from: d */
    public static final boolean f40719d = ccxy.f180226a.mo6606a().mo77044f();

    /* renamed from: e */
    public final qav f40720e;

    /* renamed from: f */
    public final Handler f40721f;

    /* renamed from: g */
    public final ScheduledExecutorService f40722g;

    /* renamed from: h */
    public final WifiManager f40723h;

    /* renamed from: i */
    public final Context f40724i;

    /* renamed from: j */
    public final pnl f40725j;

    /* renamed from: k */
    public final ArrayList f40726k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f40727l = new ArrayList();

    /* renamed from: m */
    private final CastNearbySessionManager$CastNearbyPinAvailableReceiver f40728m = new CastNearbySessionManager$CastNearbyPinAvailableReceiver(this);

    static {
        String m = ccxy.f180226a.mo6606a().mo77051m();
        f40716a = m;
        f40717b = String.valueOf(m).concat("/session/create");
    }

    public pzd(Context context, Handler handler, pnl pnl, ScheduledExecutorService scheduledExecutorService) {
        this.f40724i = context;
        this.f40721f = handler;
        this.f40722g = scheduledExecutorService;
        this.f40725j = pnl;
        this.f40720e = new qav("CastNearbySessionManager");
        this.f40723h = (WifiManager) context.getSystemService("wifi");
        if (cdbt.m132500b()) {
            try {
                this.f40723h.startScan();
            } catch (NullPointerException e) {
                this.f40720e.mo23676c(e, "Failed to start WiFi scan.", new Object[0]);
            }
        } else {
            this.f40723h.startScan();
        }
        this.f40720e.mo23670a("starting a wifi scan request", new Object[0]);
    }

    /* renamed from: a */
    public final void mo23815a(CastDevice castDevice, pky pky, pit pit, String str) {
        pnq a;
        this.f40720e.mo23857a("addToPending: %s %s", castDevice, str);
        synchronized (this.f40726k) {
            pzc pzc = new pzc();
            pzc.f40713b = castDevice;
            pzc.f40715d = pit;
            pzc.f40712a = pky;
            pzc.f40714c = str;
            this.f40726k.add(pzc);
            this.f40720e.mo23856a("# of pending sessions: %d", Integer.valueOf(this.f40726k.size()));
            ArrayList arrayList = new ArrayList();
            synchronized (this.f40725j) {
                pnm pnm = this.f40725j.mo23495e().f39873b;
                if (!(pnm == null || (a = pnm.mo23497a()) == null)) {
                    arrayList.addAll(a.f39865a);
                    if (ccxg.m131999b()) {
                        for (Pair pair : a.f39866b.values()) {
                            this.f40727l.add((String) pair.first);
                        }
                    }
                }
            }
            this.f40720e.mo23857a("showCastNearbyPinActivity - launching PIN dialog - number of bssids=%d, number of bleTokens=%d", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f40727l.size()));
            Intent intent = new Intent("com.google.android.gms.cast.session.CAST_NEARBY_PIN_REQUEST");
            intent.addFlags(268500992);
            intent.setClassName(this.f40724i, "com.google.android.gms.cast.activity.CastNearbyPinActivity");
            intent.putStringArrayListExtra("BSSID_LIST", arrayList);
            intent.putStringArrayListExtra("BLE_TOKENS", this.f40727l);
            this.f40724i.startActivity(intent);
            this.f40724i.registerReceiver(this.f40728m, new IntentFilter("com.google.android.gms.cast.session.CAST_NEARBY_PIN_RESPONSE"));
        }
    }
}
