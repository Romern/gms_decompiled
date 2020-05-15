package p000;

/* renamed from: ccah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccah implements ccag {

    /* renamed from: a */
    public static final bdyx f178622a;

    /* renamed from: b */
    public static final bdyx f178623b;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account")).mo58450b();
        f178622a = bdyx.m91610a(b, "auth_do_commit_to_configurations", false);
        f178623b = bdyx.m91607a(b, "auth_pre_add_account_phenotype_timeout", 10000L);
    }

    /* renamed from: a */
    public final boolean mo75656a() {
        return ((Boolean) f178622a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo75657b() {
        return ((Long) f178623b.mo58455c()).longValue();
    }
}
