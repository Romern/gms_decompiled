package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.car.usb.UsbIssueDetector$ConnectionTypeReceiver;

/* renamed from: onq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class onq implements onm {

    /* renamed from: a */
    public static final bnsn f38022a = odk.m28481a("CAR.SERVICE.UsbIssueDetector");

    /* renamed from: b */
    private final BroadcastReceiver f38023b = new UsbIssueDetector$ConnectionTypeReceiver(this);

    /* renamed from: c */
    private final Context f38024c;

    /* renamed from: d */
    private final onm f38025d;

    /* renamed from: e */
    private boolean f38026e = false;

    public onq(Context context, onm onm) {
        this.f38024c = context;
        this.f38025d = onm;
    }

    /* renamed from: a */
    public final void mo22347a() {
        bmxy.m108600b(!this.f38026e);
        mo22361c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_STARTED");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_ENDED");
        aki.m919a(this.f38024c).mo873a(this.f38023b, intentFilter);
    }

    /* renamed from: b */
    public final void mo22352b() {
        aki.m919a(this.f38024c).mo872a(this.f38023b);
        mo22362d();
    }

    /* renamed from: c */
    public final void mo22361c() {
        if (!this.f38026e) {
            this.f38025d.mo22347a();
            this.f38026e = true;
        }
    }

    /* renamed from: d */
    public final void mo22362d() {
        if (this.f38026e) {
            this.f38025d.mo22352b();
            this.f38026e = false;
        }
    }

    /* renamed from: a */
    public final void mo22348a(onv onv) {
        if (this.f38026e) {
            this.f38025d.mo22348a(onv);
        }
    }

    /* renamed from: a */
    public final void mo22349a(onx onx) {
        if (this.f38026e) {
            this.f38025d.mo22349a(onx);
        }
    }
}
