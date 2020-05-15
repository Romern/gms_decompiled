package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* renamed from: coq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class coq implements coo {

    /* renamed from: a */
    boolean f11741a;

    /* renamed from: b */
    final ccc f11742b;

    /* renamed from: c */
    private final Context f11743c;

    /* renamed from: d */
    private boolean f11744d;

    /* renamed from: e */
    private final BroadcastReceiver f11745e = new cop(this);

    public coq(Context context, ccc ccc) {
        this.f11743c = context.getApplicationContext();
        this.f11742b = ccc;
    }

    /* renamed from: a */
    static final boolean m7222a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        crb.m7382a(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* renamed from: c */
    public final void mo3687c() {
        if (!this.f11744d) {
            this.f11741a = m7222a(this.f11743c);
            try {
                this.f11743c.registerReceiver(this.f11745e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f11744d = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo3688d() {
        if (this.f11744d) {
            this.f11743c.unregisterReceiver(this.f11745e);
            this.f11744d = false;
        }
    }

    /* renamed from: e */
    public final void mo3689e() {
    }
}
