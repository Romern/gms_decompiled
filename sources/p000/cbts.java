package p000;

/* renamed from: cbts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbts implements cbtr {

    /* renamed from: a */
    public static final bdyx f178277a;

    /* renamed from: b */
    public static final bdyx f178278b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178277a = bdyx.m91610a(bdyw, "gads:js_flags:mf", false);
        f178278b = bdyx.m91607a(bdyw, "gads:js_flags:update_interval", 43200000L);
    }

    /* renamed from: a */
    public final boolean mo75371a() {
        return ((Boolean) f178277a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo75372b() {
        return ((Long) f178278b.mo58455c()).longValue();
    }
}
