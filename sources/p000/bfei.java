package p000;

import android.os.SystemClock;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* renamed from: bfei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfei extends bfgs {

    /* renamed from: a */
    public final TelephonyManager f113564a;

    /* renamed from: b */
    public volatile int f113565b = -9999;

    /* renamed from: c */
    private final PhoneStateListener f113566c = new bfeg(this);

    /* renamed from: d */
    private final Runnable f113567d = new bfeh(this);

    public bfei(TelephonyManager telephonyManager, bfev bfev, bfew bfew, bhdb bhdb) {
        super(bfev, bfew, bhdb);
        bmxy.m108581a(telephonyManager);
        this.f113564a = telephonyManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61527a() {
        this.f113805h.postDelayed(this.f113567d, 500);
        this.f113564a.listen(this.f113566c, 273);
        bfew bfew = this.f113806i;
        if (bfew != null) {
            bfew.mo61497c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61529b() {
        this.f113564a.listen(this.f113566c, 0);
        this.f113805h.removeCallbacks(this.f113567d);
        bfew bfew = this.f113806i;
        if (bfew != null) {
            bfew.mo61496b();
        }
    }

    /* renamed from: a */
    public final void mo61535a(CellLocation cellLocation) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bfev bfev = this.f113805h;
        bfev.post(new bfeo(bfev, this.f113564a.getNetworkType(), this.f113564a.getNetworkOperator(), cellLocation, this.f113565b, elapsedRealtime));
        mo61672a(bfgt.f113812b, elapsedRealtime, null);
    }
}
