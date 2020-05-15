package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver;
import com.google.android.gms.update.control.BatteryControl$2;
import com.google.android.gms.update.control.ChimeraGcmTaskService;

/* renamed from: avmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmi {

    /* renamed from: a */
    public static final sek f93387a = avpq.m79017d("BatteryControl");

    /* renamed from: b */
    public static final avta f93388b = new avta("control.battery.passive_battery_charging_monitoring_enabled", false);

    /* renamed from: c */
    public static final avsz f93389c = new avmh();

    /* renamed from: d */
    public final Context f93390d;

    /* renamed from: e */
    public final avtn f93391e = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: f */
    private final ActiveStateTrackingBroadcastReceiver f93392f = new BatteryControl$2();

    public avmi(Context context) {
        this.f93390d = context;
    }

    /* renamed from: a */
    public final void mo51376a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        bmxy.m108588a(true);
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        this.f93392f.mo59674a(this.f93390d, intentFilter);
    }

    /* renamed from: b */
    public final void mo51377b() {
        this.f93392f.mo59673a(this.f93390d);
    }

    /* renamed from: c */
    public final void mo51378c() {
        this.f93391e.mo51605a(f93388b.mo51602b(true));
        ChimeraGcmTaskService.m93715c(this.f93390d);
    }

    /* renamed from: d */
    public final void mo51379d() {
        this.f93391e.mo51606a(f93388b);
        ChimeraGcmTaskService.m93716d(this.f93390d);
    }
}
