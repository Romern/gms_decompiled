package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.google.android.gms.common.util.WifiConnectionMonitor$ConnectionChangeReceiver;

/* renamed from: stw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stw {

    /* renamed from: a */
    public final WifiManager f45141a;

    /* renamed from: b */
    public final Object f45142b = new Object();

    /* renamed from: c */
    public stv f45143c;

    /* renamed from: d */
    public boolean f45144d;

    /* renamed from: e */
    public String f45145e;

    /* renamed from: f */
    private final Context f45146f;

    /* renamed from: g */
    private final BroadcastReceiver f45147g;

    public stw(Context context) {
        this.f45146f = context;
        this.f45147g = new WifiConnectionMonitor$ConnectionChangeReceiver(this);
        this.f45141a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: a */
    public final void mo26078a() {
        synchronized (this.f45142b) {
            if (this.f45143c != null) {
                this.f45146f.unregisterReceiver(this.f45147g);
            }
            this.f45143c = null;
            this.f45144d = false;
            this.f45145e = "";
        }
    }

    /* renamed from: a */
    public final void mo26079a(stv stv) {
        synchronized (this.f45142b) {
            int i = spn.f44932a;
            if (this.f45143c == null) {
                this.f45146f.registerReceiver(this.f45147g, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            }
            this.f45143c = stv;
        }
    }
}
