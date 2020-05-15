package com.google.android.gms.trustlet.face.internal;

import android.app.admin.DevicePolicyManager;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.internal.ClientContext;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FaceUnlockTrustletChimeraService extends auot implements Handler.Callback {

    /* renamed from: m */
    public static final /* synthetic */ int f109217m = 0;

    /* renamed from: h */
    public bjx f109218h;

    /* renamed from: i */
    public blf f109219i;

    /* renamed from: j */
    public final Object f109220j = new Object();

    /* renamed from: k */
    public Handler f109221k;

    /* renamed from: l */
    public int f109222l = 0;

    /* renamed from: n */
    private boolean f109223n;

    /* renamed from: o */
    private aumr f109224o;

    /* renamed from: p */
    private aumq f109225p;

    /* renamed from: q */
    private boolean f109226q;

    /* renamed from: r */
    private int f109227r = 0;

    /* renamed from: s */
    private boolean f109228s;

    /* renamed from: t */
    private ServiceConnection f109229t = new auul(this, "trustlet_face");

    /* renamed from: u */
    private final bjv f109230u = new bjv(this);

    /* renamed from: v */
    private final bld f109231v = new bld(this);

    public FaceUnlockTrustletChimeraService() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        return;
     */
    /* renamed from: C */
    private final void m93503C() {
        synchronized (this.f109220j) {
            this.f109221k.removeMessages(0);
            int i = this.f109227r;
            if (i != 0) {
                if (i == 2) {
                    try {
                        if (this.f109222l != 2) {
                            this.f109219i.mo3221b(this.f109231v);
                        } else {
                            this.f109218h.mo3212b(this.f109230u);
                        }
                    } catch (RemoteException e) {
                        String valueOf = String.valueOf(e.toString());
                        Log.w("Coffee-FULTrustlet", valueOf.length() == 0 ? new String("Caught exception unregistering callback: ") : "Caught exception unregistering callback: ".concat(valueOf));
                    }
                }
                skh.m35531a().mo25689a(rpr.m34216b(), this.f109229t);
                this.f109218h = null;
                this.f109219i = null;
                this.f109227r = 0;
                if (this.f109223n) {
                    mo50757l(false);
                }
            }
        }
    }

    /* renamed from: A */
    public final void mo59573A() {
        boolean z = m93505z();
        mo50763a(z, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50762a(String str, JSONObject jSONObject) {
        if (cgzt.m147783h()) {
            mo50761a("FaceUnlock", str, jSONObject, this.f109228s, m93504y(), m93502B(), m93505z(), Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50747b() {
        m93503C();
        this.f109228s = false;
        mo50778u("face_unlock_stops_authenticating_user");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo59574c(String str) {
        Intent intent = new Intent();
        intent.setClassName("com.android.facelock", str.length() == 0 ? new String("com.android.facelock.") : "com.android.facelock.".concat(str));
        if (skh.m35531a().mo25690a(rpr.m34216b(), intent, this.f109229t, 1)) {
            return true;
        }
        Log.w("Coffee-FULTrustlet", str.length() == 0 ? new String("Could not bind to service with class name ") : "Could not bind to service with class name ".concat(str));
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50752d() {
        super.mo50752d();
        this.f109221k = new adzt(Looper.getMainLooper(), this);
        this.f109224o = aumr.m77322a(rpr.m34216b());
        auuk auuk = new auuk(this);
        this.f109225p = auuk;
        try {
            this.f109224o.mo50677a(aumk.class, auuk);
        } catch (aumn e) {
            Log.e("Coffee-FULTrustlet", "ModelNotFoundException", e);
        }
        mo59573A();
        mo50778u("trustlet_created");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo50753e() {
        super.mo50753e();
        try {
            this.f109224o.mo50678b(aumk.class, this.f109225p);
        } catch (aumn e) {
            Log.e("Coffee-FULTrustlet", "ModelNotFoundException", e);
        }
        mo50778u("trustlet_destroyed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        r0 = java.lang.String.valueOf(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        if (r0.length() == 0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
        r0 = new java.lang.String("Caught exception starting Face Unlock: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        r0 = "Caught exception starting Face Unlock: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        android.util.Log.e("Coffee-FULTrustlet", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f109220j) {
                if (this.f109227r == 0) {
                    this.f109218h = null;
                    this.f109219i = null;
                } else {
                    this.f109227r = 2;
                    mo50762a("service_connected_and_try_to_register_callback", aumv.m77339a("interface_being_used", String.valueOf(this.f109222l)));
                    try {
                        if (this.f109222l != 2) {
                            this.f109219i.mo3220a(this.f109231v);
                        } else {
                            this.f109218h.mo3211a(this.f109230u);
                        }
                        if (this.f109222l != 2) {
                            this.f109219i.mo3219a();
                        } else {
                            this.f109218h.mo3210a();
                        }
                    } catch (RemoteException e) {
                        String valueOf = String.valueOf(e.toString());
                        Log.e("Coffee-FULTrustlet", valueOf.length() == 0 ? new String("Caught exception registering callback: ") : "Caught exception registering callback: ".concat(valueOf));
                    }
                }
            }
        } else if (i == 1) {
            Log.e("Coffee-FULTrustlet", "handleServiceDisconnected()");
            synchronized (this.f109220j) {
                this.f109218h = null;
                this.f109219i = null;
                this.f109227r = 0;
                mo50762a("service_disconnected", aumv.m77339a("interface_being_used", String.valueOf(this.f109222l)));
            }
        } else if (i == 2) {
            this.f109226q = true;
            this.f109223n = false;
            m93503C();
            mo50757l(true);
        } else if (i != 3) {
            if (i == 4) {
                mo50757l(false);
            } else if (i != 5) {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unhandled message: ");
                sb.append(i2);
                Log.e("Coffee-FULTrustlet", sb.toString());
                return false;
            } else {
                this.f109223n = true;
            }
        } else if (!this.f109226q) {
            m93503C();
        }
        return true;
    }

    /* renamed from: o */
    public final String mo50770o() {
        return "Face Unlock";
    }

    /* renamed from: p */
    public final boolean mo50771p() {
        return m93502B();
    }

    /* renamed from: q */
    public final boolean mo50772q() {
        return m93504y();
    }

    /* renamed from: r */
    public final Bundle mo50773r() {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "Face");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        bundle.putBoolean("key_trustlet_is_suppored", m93504y());
        bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", m93502B());
        bundle.putString("key_trustlet_pref_key", "auth_trust_agent_pref_face_unlock_key");
        bundle.putString("key_trustlet_pref_title", getString(C0126R.string.auth_trust_agent_pref_face_unlock_title));
        if (!m93502B()) {
            str = getString(C0126R.string.auth_trust_agent_dpm_disabled);
        } else if (m93505z()) {
            str = getString(C0126R.string.auth_trust_agent_pref_face_unlock_enabled_summary);
        } else {
            str = getString(C0126R.string.auth_trust_agent_pref_face_unlock_disabled_summary);
        }
        bundle.putString("key_trustlet_pref_summary", str);
        bundle.putInt("key_trustlet_icon_res_id", C0126R.C0127drawable.auth_ic_scope_icon_facl);
        bundle.putString("key_trustlet_settings_activity_intent_action", "com.google.android.gms.trustlet.face.ui.FaceUnlockSettingsActivity.START");
        bundle.putString("key_trustlet_settings_activity_package_name", "com.google.android.gms");
        return bundle;
    }

    /* renamed from: x */
    public final int mo50781x() {
        return 4;
    }

    /* renamed from: B */
    private static boolean m93502B() {
        rpr b = rpr.m34216b();
        if (aupq.m77579a().f92276b) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) b.getSystemService("device_policy");
            if (devicePolicyManager.getPasswordQuality(null) > 32768 || devicePolicyManager.getCameraDisabled(null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m93504y() {
        rpr b = rpr.m34216b();
        PackageManager packageManager = b.getPackageManager();
        try {
            packageManager.getPackageInfo("com.android.facelock", 1);
            int i = Build.VERSION.SDK_INT;
            int i2 = spn.m35897i(b, "com.android.facelock");
            if (i2 == -1) {
                Log.e("Coffee-FULTrustlet", "Could not get uid");
                return false;
            }
            ClientContext clientContext = new ClientContext();
            clientContext.f30212b = i2;
            clientContext.f30215e = "com.android.facelock";
            if (sfr.m35174a(b, clientContext).mo25481a("com.google.android.gms.auth.permission.FACE_UNLOCK") != 0) {
                Log.e("Coffee-FULTrustlet", "Face Unlock not usable - com.android.facelock exists but does not have the appropriate permission");
                Log.e("Coffee-FULTrustlet", "This could mean an app is trying to take the place of Face Unlock!");
                return false;
            } else if (!packageManager.hasSystemFeature("android.hardware.camera.front") || !cgzw.f188158a.mo6606a().mo84841a()) {
                return false;
            } else {
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: z */
    public static boolean m93505z() {
        try {
            return ((Boolean) ((aumk) aumr.m77322a(rpr.m34216b()).mo50673a(aumk.class)).mo50671a(aumk.f92084c)).booleanValue();
        } catch (aumn e) {
            Log.e("Coffee-FULTrustlet", "ModelNotFoundException", e);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo50764b(bogj bogj) {
        bohf bohf = ((bohi) bogj.f164949b).f133089s;
        if (bohf == null) {
            bohf = bohf.f133058h;
        }
        bxvd bxvd = (bxvd) bohf.mo74142c(5);
        bxvd.mo73625a((bxvk) bohf);
        boolean k = mo50766k();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bohf bohf2 = (bohf) bxvd.f164949b;
        bohf2.f133060a |= 16;
        bohf2.f133065f = k;
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohf bohf3 = (bohf) bxvd.mo74062i();
        bohi bohi2 = bohi.f133070z;
        bohf3.getClass();
        bohi.f133089s = bohf3;
        bohi.f133071a |= 8192;
    }

    protected FaceUnlockTrustletChimeraService(bjx bjx, blf blf) {
        this.f109218h = bjx;
        this.f109219i = blf;
        this.f109221k = new adzt(Looper.getMainLooper(), this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo50746a() {
        if (!m93504y() || !m93502B() || !m93505z()) {
            mo50778u("face_unlock_should_not_run_because_it_is_not_supported_or_disabled_by_user");
            return false;
        }
        this.f109226q = false;
        this.f109223n = false;
        this.f109228s = true;
        mo50778u("face_unlock_starts_authenticating_user");
        synchronized (this.f109220j) {
            if (this.f109227r == 0) {
                int i = Build.VERSION.SDK_INT;
                if (mo59574c("TrustedFaceService")) {
                    this.f109222l = 2;
                } else if (!mo59574c("FaceLockService")) {
                    Log.e("Coffee-FULTrustlet", "Could not bind to new or old interface");
                } else {
                    this.f109222l = 1;
                }
                this.f109227r = 1;
            } else {
                Log.w("Coffee-FULTrustlet", "Attempt to bind to Face Unlock when already bound (or binding)");
            }
        }
        return true;
    }
}
