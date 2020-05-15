package p000;

import com.google.android.gms.auth.TokenData;

/* renamed from: gmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gmu extends gmg {

    /* renamed from: a */
    public static final gmt f18630a = new gmf("accountId");

    /* renamed from: b */
    public static final gmt f18631b = new gmf("Email");

    /* renamed from: c */
    public static final gmt f18632c = new gmf("Token");

    /* renamed from: d */
    public static final gmt f18633d = new gmb("storeConsentRemotely");

    /* renamed from: e */
    public static final gmt f18634e = new gmc("services");

    /* renamed from: f */
    public static final gmt f18635f = new gmf("num_contacted_devices");

    /* renamed from: g */
    public static final gmt f18636g = new gmf("Rdg");

    /* renamed from: h */
    public static final gmt f18637h = new gme("ExpiresInDurationSec");

    /* renamed from: i */
    public static final gmt f18638i = new gml();

    /* renamed from: j */
    public static final gmt f18639j = new gmm();

    /* renamed from: k */
    public static final gmt f18640k = new C1025gms();

    /* renamed from: l */
    public static final gmt f18641l = new gmn();

    /* renamed from: m */
    public static final gmt f18642m = new gmo();

    /* renamed from: n */
    public static final gmt f18643n = new gmp();

    /* renamed from: o */
    public static final gmt f18644o = new gmq();

    /* renamed from: s */
    private static final Logger f18645s = ght.m13171a("GetToken", "GetTokenResponse");

    /* renamed from: p */
    public final TokenData f18646p;

    /* renamed from: q */
    public final izj f18647q;

    /* renamed from: t */
    private final String f18648t;

    /* renamed from: u */
    private final boolean f18649u;

    public gmu(String str, String str2, boolean z) {
        super(str);
        TokenData tokenData;
        izj izj;
        sdo.m34977c(str2);
        this.f18648t = str2;
        this.f18649u = z;
        String str3 = ("SID".equals(str2) || "LSID".equals(this.f18648t)) ? this.f18648t : "Auth";
        if (this.f18627r.containsKey(str3)) {
            giq giq = new giq();
            giq.f18307a = (String) this.f18627r.get(str3);
            giq.f18309c = false;
            boolean equals = "1".equals(this.f18627r.get("isTokenSnowballed"));
            String str4 = (String) this.f18627r.get("grantedScopes");
            String str5 = (String) this.f18627r.get("Expiry");
            String str6 = (String) this.f18627r.get("scopeData");
            if (str5 != null) {
                giq.f18308b = Long.valueOf(str5);
            }
            if (equals && str4 != null) {
                giq.f18310d = true;
            }
            if (str4 != null) {
                giq.f18311e = bnkn.m109663a(bmyx.m108640a(' ').mo66918a((CharSequence) str4));
            }
            if (str6 != null) {
                giq.f18312f = str6;
            }
            tokenData = giq.mo11915a();
        } else {
            tokenData = null;
        }
        this.f18646p = tokenData;
        String str7 = (String) this.f18627r.get("issueAdvice");
        if ("consent".equals(str7)) {
            izj = izj.NEED_PERMISSION;
        } else if ("remote_consent".equals(str7)) {
            izj = izj.NEED_REMOTE_CONSENT;
        } else if (tokenData != null || mo12067a()) {
            izj = (str7 == null && !this.f18649u) ? izj.NEED_PERMISSION : izj.SUCCESS;
        } else {
            String str8 = (String) this.f18627r.get("Error");
            if (str8 == null) {
                izj = izj.SERVICE_UNAVAILABLE;
            } else if ("badauth".equals(str8)) {
                izj = izj.BAD_AUTHENTICATION;
            } else {
                izj c = izj.m16369c(str8);
                if (c == null) {
                    f18645s.mo25416d("error status: %s", str8);
                    izj = izj.UNKNOWN;
                } else {
                    izj = (c != izj.BAD_AUTHENTICATION || !izj.NEEDS_2F.f22000ac.equals((String) this.f18627r.get("Info"))) ? c : izj.NEEDS_2F;
                }
            }
        }
        this.f18647q = izj;
    }

    /* renamed from: a */
    public final boolean mo12067a() {
        return this.f18627r.containsKey("it");
    }
}
