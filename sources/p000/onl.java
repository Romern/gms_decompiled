package p000;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.gms.car.usb.FailedConnectionDetector$1;

/* renamed from: onl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class onl implements onm {

    /* renamed from: a */
    public static final bnsn f38008a = odk.m28481a("CAR.SERVICE.FCD");

    /* renamed from: b */
    static final bnhe f38009b;

    /* renamed from: c */
    public static final bnic f38010c = bnic.m109492a("com.google.android.gms.car.VERSION_NEGOTIATION", "com.google.android.gms.car.SSL_NEGOTIATION", "com.google.android.gms.car.SDP_NEGOTIATION", "com.google.android.gms.car.AUTHORIZATION");

    /* renamed from: d */
    public static final bnic f38011d = bnpf.m110045a(oew.INVALID, oew.WIRELESS, oew.WIRELESS_BRIDGE);

    /* renamed from: e */
    final BroadcastReceiver f38012e = new FailedConnectionDetector$1(this, "car");

    /* renamed from: f */
    public final Context f38013f;

    /* renamed from: g */
    public final bmzi f38014g;

    /* renamed from: h */
    public onj f38015h = onj.START;

    /* renamed from: i */
    public boolean f38016i = false;

    /* renamed from: j */
    private final Handler f38017j;

    /* renamed from: k */
    private final Runnable f38018k = new onc(this);

    static {
        bnha bnha = new bnha();
        bnha.mo67695b(onj.USB_CONFIGURED, onk.m29225a(ofb.NO_ACCESSORY_MODE, ofb.NO_ACCESSORY_MODE_FALSE_POSITIVE, ond.f37996a, one.f37997a));
        bnha.mo67695b(onj.ACCESSORY_MODE, onk.m29225a(ofb.FIRST_ACTIVITY_NOT_LAUNCHED, ofb.FIRST_ACTIVITY_NOT_LAUNCHED_FALSE_POSITIVE, onf.f37998a, ong.f37999a));
        bnha.mo67695b(onj.FIRST_ACTIVITY_LAUNCHED, onk.m29225a(ofb.PROJECTION_NOT_STARTED, ofb.PROJECTION_NOT_STARTED_FALSE_POSITIVE, onh.f38000a, oni.f38001a));
        f38009b = bnmt.m109791a(bnha.mo67618b());
    }

    public onl(Context context, Handler handler) {
        onb onb = new onb(context);
        this.f38013f = context;
        this.f38017j = handler;
        this.f38014g = onb;
    }

    /* renamed from: a */
    private static void m29232a(Context context, onj onj, onk onk) {
        bnsi d = f38008a.mo68390d();
        d.mo68432a("onl", "a", 341, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68426a("timed out at stage %s after %d milliseconds, publishing %s (USB reset enabled: %b)", onj, Long.valueOf(onk.mo22354e()), onk.mo22316a(), Boolean.valueOf(onk.mo22355f()));
        ofd.m28611a(context, "com.google.android.gms.car.USB_ISSUE_FOUND", onk.mo22316a());
    }

    /* renamed from: b */
    public final void mo22352b() {
        mo22356a(onj.START);
        aki.m919a(this.f38013f).mo872a(this.f38012e);
        this.f38013f.unregisterReceiver(this.f38012e);
    }

    /* renamed from: a */
    public static void m29233a(String str, Object... objArr) {
        String format = String.format(str, objArr);
        if (!ccvx.f180056a.mo6606a().mo76905j()) {
            bnsi c = f38008a.mo68388c();
            c.mo68432a("onl", "a", 354, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("%s", format);
            return;
        }
        throw new RuntimeException(format);
    }

    /* renamed from: a */
    public final void mo22347a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
        bnrd a = f38010c.iterator();
        while (a.hasNext()) {
            intentFilter.addAction((String) a.next());
        }
        intentFilter.addAction("com.google.android.gms.car.FRX");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_STARTED");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_ENDED");
        aki.m919a(this.f38013f).mo873a(this.f38012e, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(UiModeManager.ACTION_ENTER_CAR_MODE);
        intentFilter2.addAction(UiModeManager.ACTION_EXIT_CAR_MODE);
        this.f38013f.registerReceiver(this.f38012e, intentFilter2);
    }

    /* renamed from: a */
    public final void mo22356a(onj onj) {
        if (onj != this.f38015h) {
            this.f38017j.removeCallbacks(this.f38018k);
            if (this.f38016i && onj.ordinal() > this.f38015h.ordinal() && f38009b.containsKey(this.f38015h)) {
                ofd.m28611a(this.f38013f, "com.google.android.gms.car.USB_ISSUE_FOUND", ((onk) f38009b.get(this.f38015h)).mo22317b());
            }
            if (f38009b.containsKey(onj)) {
                this.f38017j.postDelayed(this.f38018k, ((onk) f38009b.get(onj)).mo22354e());
            }
            this.f38015h = onj;
            this.f38016i = false;
        }
    }

    /* renamed from: a */
    public final void mo22348a(onv onv) {
        if (!onv.mo22323a()) {
            mo22356a(onj.START);
        }
    }

    /* renamed from: a */
    public final void mo22349a(onx onx) {
        if (!onx.mo22332b() || !onx.mo22331a()) {
            mo22356a(onj.START);
            return;
        }
        onj onj = onj.START;
        int ordinal = this.f38015h.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (onx.mo22334d()) {
                mo22356a(onj.ACCESSORY_MODE);
            } else {
                mo22356a(onj.USB_CONFIGURED);
            }
        } else if (!onx.mo22334d()) {
            mo22356a(onj.USB_CONFIGURED);
        }
    }
}
