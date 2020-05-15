package p000;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.authzen.transaction.ScreenLocker$1;

/* renamed from: ike */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ike {

    /* renamed from: f */
    public static final Logger f21167f = new Logger("ScreenLocker");

    /* renamed from: a */
    public final Activity f21168a;

    /* renamed from: b */
    public final bypb f21169b;

    /* renamed from: c */
    public final Bundle f21170c;

    /* renamed from: d */
    public final long f21171d;

    /* renamed from: e */
    public boolean f21172e;

    /* renamed from: g */
    private BroadcastReceiver f21173g;

    /* renamed from: h */
    private ServiceConnection f21174h = new ikc(this, "auth_authzen");

    /* renamed from: i */
    private boolean f21175i;

    /* renamed from: j */
    private rkb f21176j;

    /* renamed from: k */
    private final ijl f21177k;

    public ike(Activity activity, bypb bypb, Bundle bundle, long j, ijl ijl) {
        this.f21168a = activity;
        this.f21169b = bypb;
        this.f21170c = bundle;
        this.f21171d = j;
        this.f21177k = ijl;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        ScreenLocker$1 screenLocker$1 = new ScreenLocker$1(this, "auth_authzen");
        this.f21173g = screenLocker$1;
        this.f21168a.registerReceiver(screenLocker$1, intentFilter);
        skh.m35531a().mo25690a(this.f21168a, new Intent().setClassName(this.f21168a, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), this.f21174h, 1);
        if (cceo.m129401b()) {
            aucb A = aula.m77249a(this.f21168a).mo24669A();
            A.mo50373a(new ijz(this));
            A.mo50372a(ika.f21162a);
            return;
        }
        rjy rjy = new rjy(this.f21168a);
        rjy.mo24779a(aula.f92018a);
        rkb b = rjy.mo24784b();
        this.f21176j = b;
        b.mo24801e();
        aurc.m77675a(this.f21176j).mo9458a(new ikb(this));
    }

    /* renamed from: a */
    public final ikz mo13078a() {
        Bundle bundle = this.f21170c;
        ikw ikw = new ikw();
        ikw.setArguments(bundle);
        return ikw;
    }

    /* renamed from: b */
    public final void mo13080b() {
        BroadcastReceiver broadcastReceiver = this.f21173g;
        if (broadcastReceiver != null) {
            this.f21168a.unregisterReceiver(broadcastReceiver);
            this.f21173g = null;
        }
        mo13081c();
        mo13082d();
    }

    /* renamed from: c */
    public final void mo13081c() {
        rkb rkb = this.f21176j;
        if (rkb != null) {
            rkb.mo24803g();
            this.f21176j = null;
        }
    }

    /* renamed from: d */
    public final void mo13082d() {
        if (this.f21174h != null) {
            skh.m35531a().mo25689a(this.f21168a, this.f21174h);
            this.f21174h = null;
        }
    }

    /* renamed from: a */
    public final void mo13079a(boolean z) {
        if (!this.f21175i) {
            this.f21175i = true;
            ijl ijl = this.f21177k;
            String str = ikw.f21259a;
            ikz a = ijl.f21114a.mo7589a();
            a.mo13114c();
            ijl.f21114a.mo13067a(str, a);
            if (z) {
                ijl.f21114a.mo13068b();
            }
            mo13080b();
        }
    }
}
