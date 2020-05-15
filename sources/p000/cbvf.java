package p000;

/* renamed from: cbvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbvf implements cbve {

    /* renamed from: a */
    public static final bdyx f178331a;

    /* renamed from: b */
    public static final bdyx f178332b;

    /* renamed from: c */
    public static final bdyx f178333c;

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
        f178331a = bdyx.m91607a(bdyw, "gads:ad_loader:timeout_ms", 60000L);
        f178332b = bdyx.m91607a(bdyw, "gads:rendering:timeout_ms", 60000L);
        f178333c = bdyx.m91607a(bdyw, "gads:resolve_future:default_timeout_ms", 30000L);
    }

    /* renamed from: a */
    public final long mo75412a() {
        return ((Long) f178331a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo75413b() {
        return ((Long) f178332b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo75414c() {
        return ((Long) f178333c.mo58455c()).longValue();
    }
}
