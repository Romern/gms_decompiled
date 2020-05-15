package p000;

/* renamed from: cdxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdxj implements cdxh {

    /* renamed from: a */
    public static final bdyx f181869a;

    /* renamed from: b */
    public static final bdyx f181870b;

    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.fido"));
        f181869a = bdyx.m91609a(bdyw, "ReplaceGoogleRpIdDuringRegistration__app_id", "https://www.gstatic.com/securitykey/origins.json");
        try {
            f181870b = bdyx.m91608a(bdyw, "ReplaceGoogleRpIdDuringRegistration__whitelisted_rp_ids", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 10, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109}), cdxi.f181868a);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"ReplaceGoogleRpIdDuringRegistration__whitelisted_rp_ids\"");
        }
    }

    /* renamed from: a */
    public final String mo78414a() {
        return (String) f181869a.mo58455c();
    }

    /* renamed from: b */
    public final bydj mo78415b() {
        return (bydj) f181870b.mo58455c();
    }
}
