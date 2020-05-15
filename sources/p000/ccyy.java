package p000;

/* renamed from: ccyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccyy implements ccyx {

    /* renamed from: a */
    public static final bdyx f180287a;

    /* renamed from: b */
    public static final bdyx f180288b;

    /* renamed from: c */
    public static final bdyx f180289c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        bdyx.m91610a(a, "DeviceAuthConfigs__enabled_attestation_authentication", true);
        f180287a = bdyx.m91610a(a, "device_auth:enforce_sender_nonce", false);
        f180288b = bdyx.m91610a(a, "device_auth:is_crl_revocation_enabled", false);
        f180289c = bdyx.m91610a(a, "DeviceAuthConfigs__trust_gotham_root_cert", true);
    }

    /* renamed from: a */
    public final boolean mo77087a() {
        return ((Boolean) f180287a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77088b() {
        return ((Boolean) f180288b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77089c() {
        return ((Boolean) f180289c.mo58455c()).booleanValue();
    }
}
