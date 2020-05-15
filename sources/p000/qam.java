package p000;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;

/* renamed from: qam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qam {

    /* renamed from: a */
    private static final boolean f40806a = ccxv.f180201a.mo6606a().mo77037w();

    /* renamed from: b */
    private final Context f40807b;

    /* renamed from: c */
    private final WifiManager.WifiLock f40808c;

    public qam(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("callerTag cannot be null or empty");
        } else if (context != null) {
            this.f40807b = context;
            new qav(String.format("%s-%s", "CastWifiLock", str));
            WifiManager.WifiLock createWifiLock = ((WifiManager) context.getSystemService("wifi")).createWifiLock(1, str);
            this.f40808c = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        } else {
            throw new IllegalArgumentException("context cannot be null");
        }
    }

    /* renamed from: a */
    public final synchronized void mo23842a() {
        if (f40806a) {
            if (qay.m31781a(this.f40807b)) {
                this.f40808c.acquire();
                return;
            }
        }
        Object[] objArr = {"acquireWifiLock: Not acquiring wifi lock. isConnectionWifi: %b flag: %b", Boolean.valueOf(qay.m31781a(this.f40807b)), Boolean.valueOf(f40806a)};
    }

    /* renamed from: b */
    public final synchronized void mo23843b() {
        if (this.f40808c.isHeld()) {
            this.f40808c.release();
        }
    }
}
