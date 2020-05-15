package p000;

/* renamed from: cgdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgdd implements cgdc {

    /* renamed from: a */
    public static final bdyx f186586a;

    /* renamed from: b */
    public static final bdyx f186587b;

    /* renamed from: c */
    public static final bdyx f186588c;

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
        bdyw b = new bdyw("direct_boot:com.google.android.gms.phenotype").mo58445a("gms:phenotype:").mo58450b();
        f186586a = bdyx.m91610a(b, "MultiOauth__catch_all_auth_errors", true);
        f186587b = bdyx.m91610a(b, "MultiOauth__enable_keep_account_order", true);
        bdyx.m91610a(b, "enable_multi_accounts_auth", false);
        f186588c = bdyx.m91610a(b, "MultiOauth__enable_request_batching", false);
    }

    /* renamed from: a */
    public final boolean mo83506a() {
        return ((Boolean) f186586a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83507b() {
        return ((Boolean) f186587b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83508c() {
        return ((Boolean) f186588c.mo58455c()).booleanValue();
    }
}
