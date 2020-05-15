package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.google.android.gms.trustagent.common.trustlet.AbstractOneTimeAuthTrustletService$1;

/* renamed from: auot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class auot extends auou {

    /* renamed from: a */
    public static final aunx f92213a = new aunx("TrustAgent", "AbstractOneTimeAuthTrustletService");

    /* renamed from: b */
    public final Object f92214b = new Object();

    /* renamed from: c */
    public boolean f92215c;

    /* renamed from: d */
    public auoq f92216d;

    /* renamed from: h */
    private boolean f92217h = false;

    /* renamed from: i */
    private BroadcastReceiver f92218i;

    /* renamed from: j */
    private boolean f92219j;

    /* renamed from: k */
    private SharedPreferences f92220k;

    /* renamed from: y */
    private final String mo59567y() {
        String valueOf = String.valueOf(mo50770o());
        return valueOf.length() == 0 ? new String("auth_unlock_attempt_count_") : "auth_unlock_attempt_count_".concat(valueOf);
    }

    /* renamed from: a */
    public final void mo50745a(int i) {
        this.f92220k.edit().putInt(mo59567y(), i).apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo50746a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo50747b();

    /* access modifiers changed from: protected */
    /* renamed from: bP */
    public final boolean mo50748bP() {
        boolean z;
        synchronized (this.f92214b) {
            z = this.f92219j;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bQ */
    public final int mo50749bQ() {
        return this.f92220k.getInt(mo59567y(), mo50754g());
    }

    /* renamed from: c */
    public final void mo50750c(boolean z) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        mo50759a(bogj);
        if (z) {
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi = (bohi) bogj.f164949b;
            bohi.f133073c = 1;
            bohi.f133071a |= 2;
        } else {
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi2 = (bohi) bogj.f164949b;
            bohi2.f133073c = 2;
            bohi2.f133071a |= 2;
        }
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo50751c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo50752d() {
        super.mo50752d();
        SharedPreferences a = aupo.m77578a(this);
        auoq auoq = new auoq(this, new auor(this));
        this.f92220k = a;
        if (!a.contains(mo59567y())) {
            mo50745a(0);
        }
        this.f92216d = auoq;
        this.f92218i = new AbstractOneTimeAuthTrustletService$1(this, "trustagent");
        if (this.f92217h) {
            f92213a.mo50711a("Registering broadcast receiver more than once.", new Object[0]).mo50709d();
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.f92218i, intentFilter);
        this.f92217h = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo50753e() {
        mo50756j();
        if (!this.f92217h) {
            f92213a.mo50711a("Attempting to unregister broadcast receiver when none is registered.", new Object[0]).mo50709d();
        } else {
            unregisterReceiver(this.f92218i);
            this.f92217h = false;
        }
        this.f92218i = null;
        super.mo50753e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo50754g() {
        return 3;
    }

    /* renamed from: i */
    public final boolean mo50755i() {
        return mo50749bQ() >= mo50754g();
    }

    /* renamed from: j */
    public final void mo50756j() {
        if (mo50748bP()) {
            mo50747b();
            mo50758m(false);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        return;
     */
    /* renamed from: l */
    public void mo50757l(boolean z) {
        if (mo50755i()) {
            f92213a.mo50711a("handleUserAuthentication called when max number of unlock attempts reached.", new Object[0]).mo50709d();
            return;
        }
        synchronized (this.f92214b) {
            if (!mo50751c()) {
                if (!mo50748bP()) {
                    f92213a.mo50711a("handleUserAuthentication call unexpected (and ignored).", new Object[0]).mo50709d();
                    return;
                }
            }
            if (z) {
                mo50760a("Successfully authenticated using one time trustlet.", (String) null);
                mo50778u("obtain_one_time_trust");
                mo50750c(true);
                this.f92215c = true;
                mo50756j();
            } else {
                mo50745a(mo50749bQ() + 1);
                if (mo50755i()) {
                    aunx aunx = f92213a;
                    String o = mo50770o();
                    StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 87);
                    sb.append("Maximum number of failed unlock attempts for trustlet ");
                    sb.append(o);
                    sb.append(", disabled until device unlocked.");
                    aunx.mo50711a(sb.toString(), new Object[0]).mo50709d();
                    mo50778u("reached_maximum_failed_unlock_attempts");
                    mo50756j();
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo50758m(boolean z) {
        synchronized (this.f92214b) {
            this.f92219j = z;
        }
    }
}
