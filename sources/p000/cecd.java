package p000;

/* renamed from: cecd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cecd implements cecc {

    /* renamed from: a */
    public static final bdyx f182246a;

    /* renamed from: b */
    public static final bdyx f182247b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gcm"));
        f182246a = bdyx.m91610a(bdyw, "gcm_check_for_different_iid_in_token", true);
        f182247b = bdyx.m91610a(bdyw, "nts.enable_tracing", true);
    }

    /* renamed from: a */
    public final boolean mo78749a() {
        return ((Boolean) f182246a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78750b() {
        return ((Boolean) f182247b.mo58455c()).booleanValue();
    }
}
