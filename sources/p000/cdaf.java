package p000;

/* renamed from: cdaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdaf implements cdae {

    /* renamed from: a */
    public static final bdyx f180374a;

    /* renamed from: b */
    public static final bdyx f180375b;

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
        f180374a = bdyx.m91610a(a, "MessageChunking__is_enabled", false);
        f180375b = bdyx.m91610a(a, "MessageChunking__is_logging_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo77161a() {
        return ((Boolean) f180374a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77162b() {
        return ((Boolean) f180375b.mo58455c()).booleanValue();
    }
}
