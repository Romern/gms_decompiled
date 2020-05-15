package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.ref.WeakReference;

/* renamed from: tdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdi {

    /* renamed from: a */
    public static final Logger f45692a = tea.m36798a("connectivity_manager");

    /* renamed from: c */
    private static WeakReference f45693c = new WeakReference(null);

    /* renamed from: b */
    public final tds f45694b;

    public tdi(Context context) {
        this.f45694b = tds.m36774a(context);
    }

    /* renamed from: a */
    public static synchronized tdi m36751a(Context context) {
        tdi tdi;
        synchronized (tdi.class) {
            tdi = (tdi) f45693c.get();
            if (tdi == null) {
                tdi = new tdi(context);
                f45693c = new WeakReference(tdi);
            }
        }
        return tdi;
    }

    /* renamed from: b */
    public static final boolean m36752b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
