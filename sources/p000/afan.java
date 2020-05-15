package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.magictether.host.ApStateChangeIntentOperation;
import com.google.android.gms.magictether.host.HotspotEnabler$1;
import com.google.android.gms.magictether.logging.MetricTaskDurationTimerIntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: afan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afan {

    /* renamed from: a */
    public static final long f64089a = TimeUnit.SECONDS.toMillis(90);

    /* renamed from: b */
    public static final long f64090b = TimeUnit.SECONDS.toMillis(cfcj.f183615a.mo6606a().mo80829c());

    /* renamed from: e */
    public static asfb f64091e;

    /* renamed from: c */
    public final Context f64092c;

    /* renamed from: d */
    public final afby f64093d;

    /* renamed from: f */
    private final afca f64094f;

    /* renamed from: g */
    private final ScheduledExecutorService f64095g = snp.m35703a(1, 9);

    public afan(Context context) {
        this.f64092c = context;
        afby a = afbv.m52820a(context);
        this.f64093d = a;
        this.f64094f = afbz.m52827a(a);
    }

    /* renamed from: b */
    public static void m52786b() {
        asfb asfb = f64091e;
        if (asfb != null && asfb.mo49124e()) {
            f64091e.mo49122c("Starting tethering");
            f64091e = null;
        }
    }

    /* renamed from: a */
    public final void mo34712a() {
        if (this.f64094f.mo34735a()) {
            afby afby = this.f64093d;
            afby.m52821e();
            afby.f64163a.stopTethering(0);
            return;
        }
        Context context = this.f64092c;
        context.startService(IntentOperation.getStartIntent(context, ApStateChangeIntentOperation.class, "com.google.android.gms.magictether.MAGICTETHER_HOST_DISABLED"));
    }

    /* renamed from: a */
    public final void mo34713a(ResultReceiver resultReceiver, int i, Bundle bundle) {
        resultReceiver.send(i, bundle);
        m52786b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo34714a(boolean z, ResultReceiver resultReceiver) {
        int i;
        MetricTaskDurationTimerIntentOperation.m67148a(this.f64092c, "magictether_performance_provisioning_check_duration");
        HotspotEnabler$1 hotspotEnabler$1 = new HotspotEnabler$1(this, new adzt(Looper.getMainLooper()), resultReceiver);
        try {
            int i2 = 5;
            if (cfcp.f183631a.mo6606a().mo80842b()) {
                if (z) {
                    int i3 = Build.VERSION.SDK_INT;
                    int i4 = Build.VERSION.SDK_INT;
                    bmxy.m108600b(true);
                    afba a = afaz.m52798a();
                    bqgy c = bqgy.m112818c();
                    afbx afbx = new afbx(c, a);
                    afby afby = this.f64093d;
                    bqgj b = snp.m35704b(9);
                    int i5 = Build.VERSION.SDK_INT;
                    sdo.m34971a(true, (Object) "Cannot call getLatestTetheringEntitlementValue on pre-Q devices.");
                    afby.f64163a.getLatestTetheringEntitlementResult(0, true, b, new afbu(afbx));
                    try {
                        if (((Integer) bqga.m112773a(c, cfcp.f183631a.mo6606a().mo80841a(), TimeUnit.SECONDS, this.f64095g).get()).intValue() == 0) {
                            z = false;
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        a.mo34726d(4);
                    } catch (ExecutionException e2) {
                        if (!(e2.getCause() instanceof TimeoutException)) {
                            i2 = 6;
                        }
                        a.mo34726d(i2);
                    }
                    MetricTaskDurationTimerIntentOperation.m67151b(this.f64092c, "magictether_performance_provisioning_check_duration");
                    mo34713a(resultReceiver, 1, null);
                    return;
                }
            }
            afca afca = this.f64094f;
            WifiConfiguration a2 = afca.f64165a.mo34730a();
            afca.f64166b.mo34691a("com.google.android.gms.magictether.SSID", a2.SSID);
            afca.f64166b.mo34691a("com.google.android.gms.magictether.PASSWORD", a2.preSharedKey);
            aezv aezv = afca.f64166b;
            if (!a2.allowedKeyManagement.get(4)) {
                i = 0;
            } else {
                i = 4;
            }
            aezv.mo34690a("com.google.android.gms.magictether.AUTH_TYPE", i);
            String valueOf = String.valueOf(afca.m52828c().substring(0, 5));
            String str = valueOf.length() == 0 ? new String("Instant Tethering ") : "Instant Tethering ".concat(valueOf);
            String c2 = afca.m52828c();
            a2.SSID = str;
            a2.allowedKeyManagement.clear();
            a2.allowedKeyManagement.set(4);
            a2.preSharedKey = c2;
            afca.f64166b.mo34691a("com.google.android.gms.magictether.GENERATED_SSID", str);
            afca.f64166b.mo34691a("com.google.android.gms.magictether.GENERATED_PASSWORD", c2);
            new Object[1][0] = str;
            afca.f64165a.mo34731a(a2);
            afby afby2 = this.f64093d;
            ConnectivityManager.OnStartTetheringCallback onStartTetheringCallback = new afbt(new afbs(hotspotEnabler$1)).f64158a;
            adzt adzt = new adzt(Looper.getMainLooper());
            afby.m52821e();
            new afbw(afby2.f64163a).f64160a.startTethering(0, z, onStartTetheringCallback, adzt);
        } catch (SecurityException e3) {
            hotspotEnabler$1.send(1, null);
        }
    }
}
