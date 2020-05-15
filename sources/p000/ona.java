package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.gms.car.usb.ChargeOnlyDetector$ChargeOnlyReceiver;

/* renamed from: ona */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ona implements onm {

    /* renamed from: a */
    public static final bnsn f37985a = odk.m28481a("CAR.SERVICE");

    /* renamed from: b */
    public final Context f37986b;

    /* renamed from: c */
    final Runnable f37987c = new omz(this);

    /* renamed from: d */
    BroadcastReceiver f37988d = null;

    /* renamed from: e */
    public boolean f37989e = false;

    /* renamed from: f */
    public boolean f37990f = false;

    /* renamed from: g */
    private final Handler f37991g;

    /* renamed from: h */
    private final long f37992h;

    /* renamed from: i */
    private boolean f37993i = false;

    public ona(Context context, Handler handler, long j) {
        this.f37986b = context;
        this.f37991g = handler;
        this.f37992h = j;
    }

    /* renamed from: c */
    private final void m29209c() {
        this.f37991g.postDelayed(this.f37987c, this.f37992h);
    }

    /* renamed from: d */
    private final void m29210d() {
        this.f37991g.removeCallbacks(this.f37987c);
        if (this.f37989e && this.f37990f) {
            ofd.m28611a(this.f37986b, "com.google.android.gms.car.USB_ISSUE_FOUND", ofb.CHARGE_ONLY_OVER);
        }
        this.f37989e = false;
    }

    /* renamed from: e */
    private final void m29211e() {
        if (!this.f37993i || this.f37990f) {
            m29210d();
        } else {
            m29209c();
        }
    }

    /* renamed from: a */
    public final void mo22347a() {
        Intent registerReceiver = this.f37986b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null && mo22351a(registerReceiver)) {
            z = true;
        }
        this.f37993i = z;
        if (z) {
            m29209c();
        }
        this.f37988d = new ChargeOnlyDetector$ChargeOnlyReceiver(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        this.f37986b.registerReceiver(this.f37988d, intentFilter);
    }

    /* renamed from: b */
    public final void mo22352b() {
        m29210d();
        BroadcastReceiver broadcastReceiver = this.f37988d;
        if (broadcastReceiver != null) {
            this.f37986b.unregisterReceiver(broadcastReceiver);
            this.f37988d = null;
        }
        this.f37993i = false;
        this.f37990f = false;
    }

    /* renamed from: a */
    public final void mo22348a(onv onv) {
        mo22350a(onv.mo22323a());
    }

    /* renamed from: a */
    public final void mo22349a(onx onx) {
        if (this.f37990f != onx.mo22331a()) {
            this.f37990f = onx.mo22331a();
            m29211e();
        }
    }

    /* renamed from: a */
    public final void mo22350a(boolean z) {
        if (this.f37993i != z) {
            this.f37993i = z;
            m29211e();
        }
    }

    /* renamed from: a */
    public final boolean mo22351a(Intent intent) {
        return (intent.getIntExtra("plugged", 0) & 3) != 0;
    }
}
