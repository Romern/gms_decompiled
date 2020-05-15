package p000;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import com.google.android.gms.update.control.NetworkControl$2;

/* renamed from: avnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avnb {

    /* renamed from: a */
    public static final Logger f93486a = avpq.m79017d("NetworkControl");

    /* renamed from: b */
    public static final avta f93487b = new avta("control.network.passive_wifi_reconnection_monitoring_enabled", false);

    /* renamed from: c */
    public static final avsz f93488c = new avna();

    /* renamed from: d */
    public final Context f93489d;

    /* renamed from: e */
    public final avtn f93490e = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: f */
    private final ActiveStateTrackingBroadcastReceiver f93491f = new NetworkControl$2();

    public avnb(Context context) {
        this.f93489d = context;
    }

    /* renamed from: a */
    public final void mo51424a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        this.f93491f.mo59674a(this.f93489d, intentFilter);
    }

    /* renamed from: b */
    public final void mo51425b() {
        this.f93491f.mo59673a(this.f93489d);
    }

    /* renamed from: c */
    public final void mo51426c() {
        this.f93490e.mo51605a(f93487b.mo51602b(true));
        ChimeraGcmTaskService.m93717e(this.f93489d);
    }

    /* renamed from: d */
    public final void mo51427d() {
        this.f93490e.mo51606a(f93487b);
        ChimeraGcmTaskService.m93718f(this.f93489d);
    }
}
