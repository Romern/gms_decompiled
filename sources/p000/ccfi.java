package p000;

/* renamed from: ccfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccfi implements ccfh {

    /* renamed from: a */
    public static final bdyx f178860a;

    /* renamed from: b */
    public static final bdyx f178861b;

    /* renamed from: c */
    public static final bdyx f178862c;

    /* renamed from: d */
    public static final bdyx f178863d;

    /* renamed from: e */
    public static final bdyx f178864e;

    /* renamed from: f */
    public static final bdyx f178865f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_cryptauth"));
        f178860a = bdyx.m91610a(bdyw, "EnableFidoAutoenrollment__enable_biometric_availability_check", true);
        f178861b = bdyx.m91610a(bdyw, "EnableFidoAutoenrollment__enable_create_fido_metadata_when_incrementing_counter", true);
        f178862c = bdyx.m91610a(bdyw, "EnableFidoAutoenrollment__enable_droidguard_response", true);
        f178863d = bdyx.m91610a(bdyw, "EnableFidoAutoenrollment__enable_fido_metadata", false);
        f178864e = bdyx.m91610a(bdyw, "EnableFidoAutoenrollment__enable_have_key_keystore_validity_check", false);
        f178865f = bdyx.m91610a(bdyw, "EnableFidoAutoenrollment__enable_strongbox_keys", true);
    }

    /* renamed from: a */
    public final boolean mo75849a() {
        return ((Boolean) f178860a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75850b() {
        return ((Boolean) f178861b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75851c() {
        return ((Boolean) f178862c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo75852d() {
        return ((Boolean) f178863d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo75853e() {
        return ((Boolean) f178864e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo75854f() {
        return ((Boolean) f178865f.mo58455c()).booleanValue();
    }
}
