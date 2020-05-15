package p000;

/* renamed from: gqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqd {

    /* renamed from: a */
    public static final gnz f18807a = new gqg();

    /* renamed from: b */
    public static final gnz f18808b = new gqc("parent_aid");

    /* renamed from: c */
    public static final gnz f18809c = new gqi("GoogleUserId");

    /* renamed from: d */
    public static final gnz f18810d = new gqi("DeviceManagementStatus");

    /* renamed from: e */
    public static final gnz f18811e = new gqf("com.google.android.gms.auth.email_check_time");

    /* renamed from: f */
    public static final gnz f18812f = new gqh("services");

    /* renamed from: g */
    public static final gnz f18813g = new gqi("firstName");

    /* renamed from: h */
    public static final gnz f18814h = new gqi("lastName");

    /* renamed from: i */
    public static final gnz f18815i = new gqe("oauthAccessToken");

    /* renamed from: j */
    public static final gnz f18816j = new gqi("com.google.android.gms.auth.confirm.CredentialsState");

    /* renamed from: k */
    public static final gnz f18817k = new gqa("com.google.android.gms.auth.visibilityWhitelist");

    /* renamed from: l */
    public static final gqf f18818l = new gqf("lastDroidguardPeriodicRun");

    /* renamed from: m */
    public static final gqf f18819m = new gqf("runDroidGuard");

    /* renamed from: n */
    public static final gnz f18820n = new gqi("lstBindingKeyAlias");

    /* renamed from: o */
    public static final gqf f18821o = new gqf("hideDmNotificationsUntil");

    /* renamed from: p */
    public static final gnz[] f18822p = {f18807a, f18808b, f18809c, f18810d, f18811e, f18812f, f18813g, f18814h, f18815i, f18816j, f18817k, f18818l, f18819m, f18820n};

    /* renamed from: q */
    public static final bnhe f18823q;

    static {
        String str;
        bnha bnha = new bnha();
        gnz[] gnzArr = f18822p;
        int length = gnzArr.length;
        for (int i = 0; i < 14; i++) {
            gnz gnz = gnzArr[i];
            if (gnz instanceof gqk) {
                str = ((gqk) gnz).f18824a;
            } else if (gnz instanceof gqg) {
                gqg gqg = (gqg) gnz;
                str = "password";
            } else {
                str = null;
            }
            sdo.m34977c(str);
            bnha.mo67695b(str, gnz);
        }
        f18823q = bnha.mo67618b();
    }
}
