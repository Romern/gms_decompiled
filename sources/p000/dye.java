package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: dye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dye extends dyg implements Runnable {

    /* renamed from: b */
    private int f14394b = 0;

    /* renamed from: k */
    private final String f14395k;

    public dye(Context context, doh doh, dxr dxr, String str, dqb dqb) {
        super(context, doh, dxr, str, dqb);
        this.f14395k = str;
    }

    /* renamed from: l */
    private final void m9805l() {
        mo9864j();
        this.f13883a.mo9433a(this);
        long k = mo9865k();
        if (k <= 0) {
            this.f13883a.mo9435a(this, dqy.m9123a(this.f14395k));
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dye", "l", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("[BatteryOKPeriodicProducer] Execution time delay is %s", k);
            return;
        }
        this.f13883a.mo9434a(this, k, dqy.m9123a(this.f14395k));
    }

    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        String action = intent.getAction();
        if (!action.equals("android.intent.action.BATTERY_LOW") && !action.equals("android.intent.action.BATTERY_OKAY")) {
            return;
        }
        if (action.equals("android.intent.action.BATTERY_LOW") && this.f14394b == 1) {
            this.f14394b = 0;
            this.f13883a.mo9433a(this);
        } else if (action.equals("android.intent.action.BATTERY_OKAY") && this.f14394b == 0) {
            this.f14394b = 1;
            m9805l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        return intentFilter;
    }

    /* renamed from: e */
    public final boolean mo9859e() {
        if (!super.mo9859e()) {
            return false;
        }
        Intent registerReceiver = this.f14388d.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver.getIntExtra("plugged", -1) <= 0) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                this.f14394b = 0;
                run();
                return true;
            }
            double d = (double) intExtra;
            double d2 = (double) intExtra2;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double ap = (double) ((int) cdgp.f180782a.mo6606a().mo77571ap());
            Double.isNaN(ap);
            if (d3 <= ap / 100.0d) {
                this.f14394b = 0;
                run();
                return true;
            }
        }
        this.f14394b = 1;
        run();
        return true;
    }

    /* renamed from: f */
    public final void mo9860f() {
        this.f13883a.mo9433a(this);
        this.f14394b = 0;
        super.mo9860f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo9864j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract long mo9865k();

    public final void run() {
        if (this.f14394b != 0) {
            m9805l();
        }
    }
}
