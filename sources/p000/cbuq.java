package p000;

/* renamed from: cbuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbuq implements cbup {

    /* renamed from: a */
    public static final bdyx f178307a;

    /* renamed from: b */
    public static final bdyx f178308b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178307a = bdyx.m91609a(bdyw, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
        f178308b = bdyx.m91610a(bdyw, "gads:safe_browsing:debug", false);
    }

    /* renamed from: a */
    public final String mo75393a() {
        return (String) f178307a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo75394b() {
        return ((Boolean) f178308b.mo58455c()).booleanValue();
    }
}
