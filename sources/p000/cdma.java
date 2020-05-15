package p000;

/* renamed from: cdma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdma implements cdlz {

    /* renamed from: a */
    public static final bdyx f181217a;

    /* renamed from: b */
    public static final bdyx f181218b;

    /* renamed from: c */
    public static final bdyx f181219c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58443a();
        f181217a = bdyx.m91609a(a, "Notifications__blocked_modules", "");
        f181218b = bdyx.m91610a(a, "Notifications__counters_enabled", false);
        f181219c = bdyx.m91610a(a, "Notifications__manager_enabled", true);
    }

    /* renamed from: a */
    public final String mo77875a() {
        return (String) f181217a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo77876b() {
        return ((Boolean) f181218b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77877c() {
        return ((Boolean) f181219c.mo58455c()).booleanValue();
    }
}
