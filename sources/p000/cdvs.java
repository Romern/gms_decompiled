package p000;

/* renamed from: cdvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdvs implements cdvr {

    /* renamed from: a */
    public static final bdyx f181815a;

    /* renamed from: b */
    public static final bdyx f181816b;

    /* renamed from: c */
    public static final bdyx f181817c;

    /* renamed from: d */
    public static final bdyx f181818d;

    /* renamed from: e */
    public static final bdyx f181819e;

    /* renamed from: f */
    public static final bdyx f181820f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.fido"));
        f181815a = bdyx.m91610a(bdyw, "EnableAutoEnrollmentV2__create_credential_identifier_for_cable", true);
        f181816b = bdyx.m91610a(bdyw, "EnableAutoEnrollmentV2__enable_v2_enrollment_from_account_change_intent_operation", true);
        f181817c = bdyx.m91610a(bdyw, "EnableAutoEnrollmentV2__enable_v2_keyhandle_size_and_rpid_check", true);
        f181818d = bdyx.m91610a(bdyw, "EnableAutoEnrollmentV2__enable_v2_software_through_intent_operation", false);
        f181819e = bdyx.m91610a(bdyw, "EnableAutoEnrollmentV2__enroll_strong_auth_keys", false);
        f181820f = bdyx.m91610a(bdyw, "EnableAutoEnrollmentV2__enroll_v2_strongbox_keys", false);
    }

    /* renamed from: a */
    public final boolean mo78375a() {
        return ((Boolean) f181815a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78376b() {
        return ((Boolean) f181816b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78377c() {
        return ((Boolean) f181817c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78378d() {
        return ((Boolean) f181818d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo78379e() {
        return ((Boolean) f181819e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo78380f() {
        return ((Boolean) f181820f.mo58455c()).booleanValue();
    }
}
