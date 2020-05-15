package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.location.quake.PowerStateListener$PowerBroadcastReceiver;

/* renamed from: bgpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgpt extends bgtb {

    /* renamed from: c */
    public static final /* synthetic */ int f117243c = 0;

    /* renamed from: d */
    private static final IntentFilter f117244d = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: a */
    public Handler f117245a;

    /* renamed from: b */
    public Runnable f117246b;

    /* renamed from: e */
    private final Context f117247e;

    /* renamed from: f */
    private final HandlerThread f117248f;

    /* renamed from: h */
    private BroadcastReceiver f117249h;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public bgpt(Context context, HandlerThread handlerThread, bgsq bgsq) {
        super(bgsq);
        this.f117247e = context;
        this.f117248f = handlerThread;
    }

    /* renamed from: a */
    static int m99738a(Context context) {
        return m99739a(context.registerReceiver(null, f117244d));
    }

    /* renamed from: b */
    public final synchronized void mo63068b() {
        if (this.f117249h == null) {
            this.f117249h = new PowerStateListener$PowerBroadcastReceiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            this.f117247e.registerReceiver(this.f117249h, intentFilter);
            this.f117474g.mo63137a();
        }
        this.f117245a = new adzt(this.f117248f.getLooper());
        bgps bgps = new bgps(this);
        this.f117246b = bgps;
        this.f117245a.postDelayed(bgps, cezu.m138501v());
    }

    /* renamed from: c */
    public final synchronized void mo63069c() {
        BroadcastReceiver broadcastReceiver = this.f117249h;
        if (broadcastReceiver != null) {
            this.f117247e.unregisterReceiver(broadcastReceiver);
            this.f117249h = null;
        }
        Handler handler = this.f117245a;
        if (handler != null) {
            Runnable runnable = this.f117246b;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
                this.f117246b = null;
            }
            this.f117245a = null;
        }
    }

    /* renamed from: a */
    private static int m99739a(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", 0);
            int intExtra2 = intent.getIntExtra("scale", 0);
            if (intExtra2 != 0) {
                return (intExtra * 100) / intExtra2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo63067a() {
        int intExtra;
        Intent registerReceiver = this.f117247e.registerReceiver(null, f117244d);
        if (registerReceiver == null || (((intExtra = registerReceiver.getIntExtra("plugged", -1)) != 1 && intExtra != 2) || ((long) m99739a(registerReceiver)) < cezu.f183534a.mo6606a().seismicMinBatteryPercent())) {
            return 2;
        }
        return 3;
    }
}
