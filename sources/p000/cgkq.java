package p000;

/* renamed from: cgkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgkq implements cgkp {

    /* renamed from: a */
    public static final bdyx f187175a;

    /* renamed from: b */
    public static final bdyx f187176b;

    /* renamed from: c */
    public static final bdyx f187177c;

    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.security"));
        f187175a = bdyx.m91609a(bdyw, "device_name_base_url", "https://android.googleapis.com");
        bdyx.m91609a(bdyw, "mdm_device_admin_state_url", "");
        f187176b = bdyx.m91609a(bdyw, "mdm_remote_payload_response_url", "https://android.googleapis.com/nova/remote_payload");
        f187177c = bdyx.m91609a(bdyw, "mdm_sitrep_url", "https://android.googleapis.com/nova/sitrep");
    }

    /* renamed from: a */
    public final String mo83993a() {
        return (String) f187175a.mo58455c();
    }

    /* renamed from: b */
    public final String mo83994b() {
        return (String) f187176b.mo58455c();
    }

    /* renamed from: c */
    public final String mo83995c() {
        return (String) f187177c.mo58455c();
    }
}
