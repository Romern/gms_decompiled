package p000;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.BoundService;
import com.google.android.gms.trustagent.common.trustlet.AbstractTrustletService$1;
import org.json.JSONObject;

/* renamed from: auou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class auou extends BoundService {

    /* renamed from: e */
    public static final aunx f92221e = new aunx("TrustAgent", "AbstractTrustletService");

    /* renamed from: a */
    private final BroadcastReceiver f92222a = new AbstractTrustletService$1(this, "trustagent");

    /* renamed from: b */
    private boolean f92223b;

    /* renamed from: c */
    private boolean f92224c;

    /* renamed from: d */
    private boolean f92225d;

    /* renamed from: f */
    public final Object f92226f = new Object();

    /* renamed from: g */
    public auqq f92227g;

    /* renamed from: h */
    private boolean f92228h;

    /* renamed from: i */
    private boolean f92229i;

    /* renamed from: j */
    private boolean f92230j;

    public auou() {
        synchronized (this.f92226f) {
            this.f92229i = mo50772q();
            this.f92230j = mo50771p();
            f92221e.mo50711a("constructor. isSupported: %s, devicePolicy: %s", Boolean.valueOf(this.f92229i), Boolean.valueOf(this.f92230j));
        }
    }

    /* renamed from: a */
    private final void mo50746a() {
        IntentFilter intentFilter = new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED");
        synchronized (this.f92226f) {
            registerReceiver(this.f92222a, intentFilter);
        }
    }

    /* renamed from: b */
    private final boolean mo50747b() {
        boolean z;
        synchronized (this.f92226f) {
            z = this.f92227g != null;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50762a(String str, JSONObject jSONObject);

    /* renamed from: b */
    public abstract void mo50764b(bogj bogj);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo50752d() {
        f92221e.mo50711a("initializeTrustlet: %s", mo50770o()).mo50707b();
        synchronized (this.f92226f) {
            this.f92228h = true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auou.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo50753e() {
        f92221e.mo50711a("destroyTrustlet: %s", mo50770o()).mo50707b();
        synchronized (this.f92226f) {
            this.f92228h = false;
            String valueOf = String.valueOf(mo50770o());
            m77499a(false, valueOf.length() == 0 ? new String("destroy trustlet ") : "destroy trustlet ".concat(valueOf), null);
            mo50763a(false, false);
        }
    }

    /* renamed from: k */
    public final boolean mo50766k() {
        boolean z;
        synchronized (this.f92226f) {
            z = this.f92224c;
        }
        return z;
    }

    /* renamed from: l */
    public final boolean mo50767l() {
        boolean z;
        synchronized (this.f92226f) {
            z = this.f92225d;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo50768m() {
        boolean z;
        synchronized (this.f92226f) {
            z = this.f92223b;
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo50769n() {
        auqq auqq;
        synchronized (this.f92226f) {
            if (mo50747b()) {
                auqq = this.f92227g;
            } else {
                auqq = null;
            }
        }
        if (auqq == null) {
            return false;
        }
        try {
            return auqq.mo50811a();
        } catch (RemoteException e) {
            m77498a(e);
            return false;
        }
    }

    /* renamed from: o */
    public abstract String mo50770o();

    public final IBinder onBind(Intent intent) {
        f92221e.mo50711a("onBind: %s", mo50770o());
        mo50746a();
        return new auqm(this);
    }

    public void onRebind(Intent intent) {
        f92221e.mo50711a("onRebind", new Object[0]);
        mo50746a();
    }

    public boolean onUnbind(Intent intent) {
        f92221e.mo50711a("onUnbind: %s", mo50770o()).mo50707b();
        if (mo50774s()) {
            mo50753e();
        }
        synchronized (this.f92226f) {
            this.f92227g = null;
        }
        synchronized (this.f92226f) {
            unregisterReceiver(this.f92222a);
        }
        return true;
    }

    /* renamed from: p */
    public abstract boolean mo50771p();

    /* renamed from: q */
    public abstract boolean mo50772q();

    /* renamed from: r */
    public abstract Bundle mo50773r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo50774s() {
        boolean z;
        synchronized (this.f92226f) {
            z = this.f92228h;
        }
        return z;
    }

    /* renamed from: t */
    public void mo50775t() {
        f92221e.mo50711a("onGservicesChanged", new Object[0]);
        boolean q = mo50772q();
        synchronized (this.f92226f) {
            if (this.f92229i != q) {
                aunx aunx = f92221e;
                Boolean valueOf = Boolean.valueOf(q);
                aunx.mo50711a("isSupported changed to %s", valueOf);
                this.f92229i = q;
                mo50765b(String.format("isSupported changed to %s", valueOf), null);
                mo50780w();
            }
        }
    }

    /* renamed from: u */
    public void mo50777u() {
        f92221e.mo50711a("onDevicePolicyChanged", new Object[0]);
        boolean p = mo50771p();
        synchronized (this.f92226f) {
            if (this.f92230j != p) {
                aunx aunx = f92221e;
                Boolean valueOf = Boolean.valueOf(p);
                aunx.mo50711a("isEnabledByDevicePolicy changed to %s", valueOf);
                this.f92230j = p;
                mo50765b(String.format("DevicePolicy changed to %s", valueOf), null);
                mo50780w();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo50779v() {
        return mo50747b() && mo50772q() && mo50771p();
    }

    /* renamed from: w */
    public final void mo50780w() {
        f92221e.mo50711a("validateTrustlet", new Object[0]);
        if (mo50779v()) {
            if (!mo50774s()) {
                mo50752d();
            }
        } else if (mo50774s()) {
            mo50753e();
        }
    }

    /* renamed from: x */
    public abstract int mo50781x();

    /* renamed from: a */
    private static void m77498a(RemoteException remoteException) {
        f92221e.mo50710a("RemoteException", remoteException, new Object[0]).mo50706a();
    }

    /* renamed from: b */
    public final void mo50765b(String str, String str2) {
        f92221e.mo50711a("notifyTrustletStateChanged. reason: %s, extra: %s", str, str2);
        try {
            synchronized (this.f92226f) {
                if (mo50747b()) {
                    this.f92227g.mo50810a(this.f92224c, this.f92225d, this.f92223b, str, str2);
                }
            }
        } catch (RemoteException e) {
            m77498a(e);
        }
    }

    /* renamed from: a */
    private final void m77499a(boolean z, String str, String str2) {
        synchronized (this.f92226f) {
            f92221e.mo50711a("%s set trust state: %s mCanProvideTrust: %s", mo50770o(), Boolean.valueOf(z), Boolean.valueOf(this.f92225d));
            if (!this.f92225d) {
                f92221e.mo50711a("Trustlet %s attempted to change trust state when canProvideTrust state is false (ignored).", mo50770o()).mo50709d();
            } else if (this.f92223b == z) {
                f92221e.mo50711a("Ignoring trustlet %s's attempt to change its trust state to the current state which is %s.", mo50770o(), Boolean.valueOf(this.f92223b)).mo50709d();
            } else {
                this.f92223b = z;
                mo50765b(str, str2);
            }
        }
    }

    /* renamed from: t */
    public void mo50776t(String str) {
        m77499a(false, str, null);
    }

    /* renamed from: u */
    public final void mo50778u(String str) {
        mo50762a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo50759a(bogj bogj) {
        int x = mo50781x();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        int i = x - 1;
        bohi bohi2 = bohi.f133070z;
        if (x != 0) {
            bohi.f133072b = i;
            bohi.f133071a |= 1;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50760a(String str, String str2) {
        m77499a(true, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50761a(String str, String str2, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4, Long l) {
        String str3;
        if (cgzt.m147783h()) {
            String l2 = l.toString();
            Bundle bundle = new Bundle();
            bundle.putString("key_trustlet_status_model_id", l2);
            bundle.putString("key_trustlet_status_model_name", str);
            bundle.putBoolean("key_trustlet_is_trusted", mo50768m());
            bundle.putString("key_trustlet_status_trigger", str2);
            if (jSONObject != null) {
                str3 = jSONObject.toString();
            } else {
                str3 = null;
            }
            bundle.putString("key_trustlet_extra_trigger_info", str3);
            bundle.putBoolean("key_trustlet_is_auth_started", z);
            bundle.putBoolean("key_trustlet_is_configured", mo50766k());
            bundle.putBoolean("key_trustlet_can_provide_truste", mo50767l());
            bundle.putBoolean("key_trustlet_is_suppored", z2);
            bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", z3);
            bundle.putBoolean("key_trustlet_is_enabled_by_shared_preference", z4);
            bundle.putLong("key_trustlet_timestamp", l.longValue());
            synchronized (this.f92226f) {
                try {
                    if (mo50747b()) {
                        this.f92227g.mo50809a(bundle);
                    }
                } catch (RemoteException e) {
                    m77498a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50763a(boolean z, boolean z2) {
        String str;
        boolean z3 = false;
        if (!z && z2) {
            z2 = false;
        }
        synchronized (this.f92226f) {
            boolean z4 = true;
            if (this.f92224c != z) {
                this.f92224c = z;
                str = "isConfigured changed";
                z3 = true;
            } else {
                str = null;
            }
            if (this.f92225d == z2) {
                z4 = z3;
            } else {
                if (!z2 && this.f92223b) {
                    mo50776t(null);
                }
                this.f92225d = z2;
                str = "canProvideTrust changed";
            }
            if (z4) {
                mo50765b(str, null);
            }
        }
    }
}
