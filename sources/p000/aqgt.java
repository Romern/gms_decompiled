package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;

/* renamed from: aqgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgt {

    /* renamed from: a */
    private final ConnectivityManager f86083a;

    /* renamed from: b */
    private boolean f86084b;

    /* renamed from: c */
    private boolean f86085c;

    /* renamed from: d */
    private boolean f86086d;

    public aqgt() {
        this.f86083a = null;
    }

    /* renamed from: c */
    private final void m71590c() {
        NetworkInfo activeNetworkInfo = this.f86083a.getActiveNetworkInfo();
        boolean z = false;
        if (activeNetworkInfo != null) {
            this.f86084b = activeNetworkInfo.isConnected();
            int i = Build.VERSION.SDK_INT;
            NetworkInfo activeNetworkInfo2 = this.f86083a.getActiveNetworkInfo();
            if (activeNetworkInfo2 != null && activeNetworkInfo2.isConnected()) {
                z = true;
            }
            this.f86085c = z;
            this.f86086d = C1185me.m19630a(this.f86083a);
            return;
        }
        this.f86084b = false;
    }

    /* renamed from: a */
    public final synchronized void mo47876a(Context context) {
        boolean b = mo47878b();
        m71590c();
        if (!b && mo47878b()) {
            InternalApkUploadChimeraService.m92444a(context, 0);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo47877a() {
        return this.f86084b && !this.f86086d;
    }

    /* renamed from: b */
    public final synchronized boolean mo47878b() {
        return this.f86084b && this.f86085c && !this.f86086d;
    }

    public aqgt(ConnectivityManager connectivityManager) {
        this.f86083a = connectivityManager;
        m71590c();
    }
}
