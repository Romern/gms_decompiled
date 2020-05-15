package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.trustlet.onbody.internal.PhonePositionTrustletChimeraService;
import java.lang.ref.WeakReference;

/* renamed from: auva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auva implements aumh {

    /* renamed from: a */
    public static final aunx f92566a = new aunx("TrustAgent", "OnbodyPromotionManager");

    /* renamed from: g */
    private static WeakReference f92567g = new WeakReference(null);

    /* renamed from: b */
    public final Object f92568b = new Object();

    /* renamed from: c */
    public boolean f92569c;

    /* renamed from: d */
    public boolean f92570d;

    /* renamed from: e */
    public SharedPreferences f92571e;

    /* renamed from: f */
    public KeyguardManager f92572f;

    /* renamed from: h */
    private final bmzi f92573h = bmzn.m108681a(auux.f92563a);

    /* renamed from: i */
    private final Context f92574i = rpr.m34216b();

    /* renamed from: j */
    private boolean f92575j;

    /* renamed from: k */
    private boolean f92576k;

    /* renamed from: l */
    private SharedPreferences.OnSharedPreferenceChangeListener f92577l;

    /* renamed from: d */
    public static synchronized auva m77911d() {
        auva auva;
        synchronized (auva.class) {
            if (f92567g.get() == null) {
                auva auva2 = new auva();
                f92566a.mo50711a("start", new Object[0]);
                auva2.f92571e = aupo.m77578a(auva2.f92574i);
                auva2.f92577l = new auuz();
                synchronized (auva2.f92568b) {
                    auva2.f92575j = cgzz.m147840b();
                    auva2.f92576k = chac.m147846c();
                    auva2.f92569c = PhonePositionTrustletChimeraService.m93538a(auva2.f92571e);
                    KeyguardManager keyguardManager = (KeyguardManager) auva2.f92574i.getSystemService("keyguard");
                    auva2.f92572f = keyguardManager;
                    auva2.f92570d = aupi.m77556a(keyguardManager);
                }
                auva2.f92571e.registerOnSharedPreferenceChangeListener(auva2.f92577l);
                auva2.mo50965f();
                f92567g = new WeakReference(auva2);
            }
            auva = (auva) f92567g.get();
        }
        return auva;
    }

    /* renamed from: a */
    public final String mo50622a() {
        return "com.google.android.gms.trustagent.discovery.OnbodyPromotionActivity";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r6.f92575j == false) goto L_0x002b;
     */
    /* renamed from: b */
    public final bqgg mo50623b() {
        synchronized (this.f92568b) {
            aupq.m77579a().mo50792b();
            boolean z = false;
            if (!this.f92569c) {
                synchronized (this.f92568b) {
                    this.f92575j = cgzz.m147840b();
                    this.f92576k = chac.m147846c();
                    if (aupi.m77556a(this.f92572f)) {
                    }
                    if (aupi.m77556a(this.f92572f)) {
                        if (this.f92576k) {
                            f92566a.mo50711a("is enabled by gservice", new Object[0]);
                            if (PhonePositionTrustletChimeraService.m93537a(this.f92574i) && !sre.m36085e(this.f92574i)) {
                                z = true;
                            }
                        }
                    }
                    f92566a.mo50711a("is disabled by gservice", new Object[0]);
                }
            }
            if (!((Boolean) this.f92573h.mo6606a()).booleanValue()) {
                bqgg a = bqdx.m112673a(auwo.m77991c(this.f92574i), new auuw(z), bqfb.INSTANCE);
                return a;
            }
            bqgg a2 = bqdx.m112673a(auwo.m77992d(this.f92574i), new auuv(z), bqfb.INSTANCE);
            return a2;
        }
    }

    /* renamed from: c */
    public final boolean mo50624c() {
        return !aupi.m77556a(this.f92572f);
    }

    /* renamed from: e */
    public final void mo50964e() {
        f92566a.mo50711a("onTrustAgentChanged", new Object[0]);
        mo50965f();
    }

    /* renamed from: f */
    public final void mo50965f() {
        synchronized (this.f92568b) {
            boolean z = true;
            if (spn.m35876d(this.f92574i, "com.google.android.gms.trustagent.discovery.OnbodyPromotionActivity") != 1) {
                z = false;
            }
            bqga.m112781a(mo50623b(), new auuy(this, z), bqfb.INSTANCE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50963a(boolean z) {
        spn.m35856a(this.f92574i, "com.google.android.gms.trustagent.discovery.OnbodyPromotionActivity", z);
    }
}
