package p000;

/* renamed from: cdzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdzl implements cdzk {

    /* renamed from: a */
    public static final bdyx f182079a;

    /* renamed from: b */
    public static final bdyx f182080b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.fitness")).mo58445a("fitness.");
        f182079a = bdyx.m91610a(a, "restrict_only_gms_sources", false);
        f182080b = bdyx.m91609a(a, "restricted_data_type_whitelist", "com.google.location.sample=");
    }

    /* renamed from: a */
    public final boolean mo78606a() {
        return ((Boolean) f182079a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo78607b() {
        return (String) f182080b.mo58455c();
    }
}
