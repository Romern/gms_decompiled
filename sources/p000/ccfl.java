package p000;

/* renamed from: ccfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccfl implements ccfk {

    /* renamed from: a */
    public static final bdyx f178868a;

    /* renamed from: b */
    public static final bdyx f178869b;

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
        f178868a = bdyx.m91610a(bdyw, "FixSqliteDbException__enabled", false);
        f178869b = bdyx.m91610a(bdyw, "FixSqliteDbException__sqlite_exception_keydb", true);
    }

    /* renamed from: a */
    public final boolean mo75856a() {
        return ((Boolean) f178868a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75857b() {
        return ((Boolean) f178869b.mo58455c()).booleanValue();
    }
}
