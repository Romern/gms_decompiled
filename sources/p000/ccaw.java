package p000;

/* renamed from: ccaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccaw implements ccav {

    /* renamed from: a */
    public static final bdyx f178703a;

    /* renamed from: b */
    public static final bdyx f178704b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account")).mo58443a();
        f178703a = bdyx.m91607a(a, "checkin_timeout", 10000L);
        f178704b = bdyx.m91610a(a, "remove_checkin_loader_for_pre_add_account", false);
    }

    /* renamed from: a */
    public final long mo75732a() {
        return ((Long) f178703a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo75733b() {
        return ((Boolean) f178704b.mo58455c()).booleanValue();
    }
}
