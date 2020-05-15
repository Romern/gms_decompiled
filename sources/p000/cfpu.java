package p000;

/* renamed from: cfpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfpu implements cfpt {

    /* renamed from: a */
    public static final bdyx f185412a;

    /* renamed from: b */
    public static final bdyx f185413b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.netrec"));
        f185412a = bdyx.m91610a(bdyw, "Scheduled__rapid_refresh_failure_no_reschedule", false);
        f185413b = bdyx.m91610a(bdyw, "Scheduled__rapid_refresh_failure_to_std", true);
    }

    /* renamed from: a */
    public final boolean mo82481a() {
        return ((Boolean) f185412a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82482b() {
        return ((Boolean) f185413b.mo58455c()).booleanValue();
    }
}
