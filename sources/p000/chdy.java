package p000;

/* renamed from: chdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chdy implements chdx {

    /* renamed from: a */
    public static final bdyx f188508a;

    /* renamed from: b */
    public static final bdyx f188509b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.usagereporting")).mo58445a("gms:usagereporting:");
        f188508a = bdyx.m91610a(a, "call_canLog_in_upload", false);
        f188509b = bdyx.m91610a(a, "set_user_count", false);
    }

    /* renamed from: a */
    public final boolean mo85154a() {
        return ((Boolean) f188508a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo85155b() {
        return ((Boolean) f188509b.mo58455c()).booleanValue();
    }
}
