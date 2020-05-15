package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: astb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class astb {

    /* renamed from: a */
    public static final srn f89620a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public static volatile long f89621b;

    /* renamed from: c */
    public static volatile long f89622c;

    /* renamed from: h */
    private static volatile long f89623h;

    /* renamed from: i */
    private static volatile long f89624i;

    /* renamed from: j */
    private static volatile int f89625j;

    /* renamed from: k */
    private static volatile long f89626k;

    /* renamed from: d */
    public final boolean f89627d;

    /* renamed from: e */
    public final boolean f89628e;

    /* renamed from: f */
    public final boolean f89629f;

    /* renamed from: g */
    public final boolean f89630g;

    public astb(Context context, long j) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        this.f89627d = !srf.m36095d(context);
        sre.m36089i(context);
        if (cgwn.m147265o()) {
            if ((j >= f89623h || ((long) f89625j) < cgxr.f187985a.mo6606a().mo84708t()) && j >= f89621b && j >= f89622c) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f89628e = z2;
            bnsl a = f89620a.mo26019b(aske.m74275a());
            a.mo68432a("astb", "<init>", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68420a("FastChecks: isThrottled: %b", Boolean.valueOf(this.f89628e));
        } else {
            this.f89628e = j < f89623h;
        }
        if (!spn.m35859a()) {
            z = asjk.m74229c(context);
        } else {
            z = true;
        }
        this.f89629f = z;
        this.f89630g = (!cgwn.m147255e() || j >= f89626k) ? false : z3;
    }

    @Deprecated
    /* renamed from: a */
    public static void m74736a(long j) {
        f89624i = j;
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68415a("setPayOnWearEnabledRealtime: %d", f89624i);
    }

    /* renamed from: b */
    public static void m74738b() {
        f89621b = 0;
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "b", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68405a("notifyPaymentComplete");
    }

    /* renamed from: c */
    public static void m74741c() {
        f89622c = 0;
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "c", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68405a("notifyCdcvmCleared");
    }

    /* renamed from: d */
    public static synchronized void m74743d(long j) {
        synchronized (astb.class) {
            if (f89623h < j) {
                f89625j = 0;
            }
            f89623h = j + cgxr.f187985a.mo6606a().mo84709u();
            f89625j++;
            bnsl a = f89620a.mo26019b(aske.m74275a());
            a.mo68432a("astb", "d", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a.mo68409a("notifyPaymentSuccess: %d", f89625j);
        }
    }

    /* renamed from: e */
    public static void m74744e(long j) {
        f89621b = j + cgxr.f187985a.mo6606a().mo84707s();
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "e", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68415a("notifyPaymentInProgress: %d", f89621b);
    }

    /* renamed from: f */
    public static void m74745f(long j) {
        f89622c = j + cgxr.f187985a.mo6606a().mo84706r();
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "f", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68415a("notifyCdcvmRequiredFailure: %d", f89622c);
    }

    /* renamed from: a */
    public static boolean m74737a(long j, long j2) {
        boolean z = j < f89626k;
        f89626k = j + j2;
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68415a("blockPaymentCards: %d", f89626k);
        return z;
    }

    @Deprecated
    /* renamed from: b */
    public static void m74739b(long j) {
        f89623h = j;
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "b", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68415a("setThrottleTimeoutRealtime: %d", f89623h);
    }

    /* renamed from: c */
    public static boolean m74742c(long j) {
        boolean z = j < f89626k;
        f89626k = 0;
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "c", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68405a("unblockPaymentCards");
        return z;
    }

    /* renamed from: b */
    public static void m74740b(long j, long j2) {
        f89624i = j + j2;
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "b", 130, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68415a("enablePayOnWear: %d", f89624i);
    }

    /* renamed from: a */
    public final boolean mo49452a() {
        boolean z = true;
        if (!this.f89627d && !this.f89628e && this.f89629f && !this.f89630g) {
            z = false;
        }
        bnsl a = f89620a.mo26019b(aske.m74275a());
        a.mo68432a("astb", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("isPaymentPrevented: %b", Boolean.valueOf(z));
        return z;
    }
}
