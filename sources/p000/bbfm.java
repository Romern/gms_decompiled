package p000;

import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bbfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbfm implements behk {

    /* renamed from: a */
    final /* synthetic */ bbfn f102548a;

    /* renamed from: b */
    private final String f102549b;

    /* renamed from: c */
    private final String f102550c;

    /* renamed from: d */
    private final String f102551d;

    /* renamed from: e */
    private final AtomicLong f102552e = new AtomicLong();

    /* renamed from: f */
    private final AtomicLong f102553f = new AtomicLong();

    public bbfm(bbfn bbfn, String str) {
        this.f102548a = bbfn;
        this.f102549b = str;
        this.f102550c = bbfn.m87948a(str, "w");
        this.f102551d = bbfn.m87948a(str, "c");
    }

    /* renamed from: a */
    public final void mo56094a() {
        synchronized (bbfn.class) {
            bbfn bbfn = this.f102548a;
            SharedPreferences a = bbfh.m87928a(bbfn.f102554a, "gms_icing_mdd_network_usage_monitor", bbfn.f102555b);
            SharedPreferences.Editor edit = a.edit();
            if (this.f102552e.get() > 0) {
                edit.putLong(this.f102550c, a.getLong(this.f102550c, 0) + this.f102552e.getAndSet(0));
            }
            if (this.f102553f.get() > 0) {
                edit.putLong(this.f102551d, a.getLong(this.f102551d, 0) + this.f102553f.getAndSet(0));
            }
            edit.apply();
            Object[] objArr = {"NetworkUsageMonitor", this.f102549b, Long.valueOf(a.getLong(this.f102550c, -1)), Long.valueOf(a.getLong(this.f102551d, -1))};
        }
    }

    /* renamed from: a */
    public final void mo56095a(int i) {
        ConnectivityManager connectivityManager;
        String str;
        NetworkInfo networkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) this.f102548a.f102554a.getSystemService("connectivity");
        } catch (SecurityException e) {
            bbev.m87905a("%s: Couldn't retrieve ConnectivityManager.", "NetworkUsageMonitor");
            connectivityManager = null;
        }
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        }
        if (networkInfo == null) {
            bbev.m87905a("%s: Fail to get network type ", "NetworkUsageMonitor");
            str = "w";
        } else {
            if (!(networkInfo.getType() == 1 || networkInfo.getType() == 9)) {
                int i2 = Build.VERSION.SDK_INT;
                if (networkInfo.getType() != 17) {
                    str = "c";
                }
            }
            str = "w";
        }
        if ("w".equals(str)) {
            this.f102552e.getAndAdd((long) i);
        } else {
            this.f102553f.getAndAdd((long) i);
        }
        Object[] objArr = {"NetworkUsageMonitor", str, this.f102549b, Integer.valueOf(i), Long.valueOf(this.f102552e.get()), Long.valueOf(this.f102553f.get())};
    }
}
