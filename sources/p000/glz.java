package p000;

import android.text.TextUtils;

/* renamed from: glz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glz extends gmg {

    /* renamed from: a */
    public static final gly f18597a = new gmf("accountId");

    /* renamed from: b */
    public static final gly f18598b = new gmf("CaptchaToken");

    /* renamed from: c */
    public static final gly f18599c = new gmf("CaptchaUrl");

    /* renamed from: d */
    public static final gly f18600d = new gmf("DmStatus");

    /* renamed from: e */
    public static final gly f18601e = new gmf("Email");

    /* renamed from: f */
    public static final gly f18602f = new gmf("ErrorDetail");

    /* renamed from: g */
    public static final gly f18603g = new gmf("firstName");

    /* renamed from: h */
    public static final gly f18604h = new gmf("lastName");

    /* renamed from: i */
    public static final gly f18605i = new gmf("Token");

    /* renamed from: j */
    public static final gly f18606j = new gmf("PicasaUser");

    /* renamed from: k */
    public static final gly f18607k = new gmf("RopRevision");

    /* renamed from: l */
    public static final gly f18608l = new gmf("RopText");

    /* renamed from: m */
    public static final gly f18609m = new gmf("Url");

    /* renamed from: n */
    public static final gly f18610n = new gmb("GooglePlusUpgrade");

    /* renamed from: o */
    public static final gly f18611o = new gmc("services");

    /* renamed from: p */
    public static final gly f18612p = new glx();

    /* renamed from: q */
    public final izj f18613q;

    public glz(String str) {
        super(str);
        izj izj;
        if (!TextUtils.isEmpty((String) this.f18627r.get("Token"))) {
            izj = izj.SUCCESS;
        } else {
            String str2 = (String) this.f18627r.get("Error");
            if (str2 == null) {
                izj = izj.SERVICE_UNAVAILABLE;
            } else if ("badauth".equals(str2)) {
                izj = izj.BAD_AUTHENTICATION;
            } else {
                izj = izj.m16369c(str2);
                if (izj != null) {
                    String str3 = (String) this.f18627r.get("Info");
                    if (izj == izj.BAD_AUTHENTICATION && izj.NEEDS_2F.f22000ac.equals(str3)) {
                        izj = izj.NEEDS_2F;
                    }
                } else {
                    izj = izj.UNKNOWN;
                }
            }
        }
        this.f18613q = izj;
    }
}
