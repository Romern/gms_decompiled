package p000;

/* renamed from: cggx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cggx implements cggw {

    /* renamed from: a */
    public static final bdyx f186910a;

    /* renamed from: b */
    public static final bdyx f186911b;

    /* renamed from: c */
    public static final bdyx f186912c;

    /* renamed from: d */
    public static final bdyx f186913d;

    /* renamed from: e */
    public static final bdyx f186914e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186910a = bdyx.m91607a(bdyw, "prefetched_candidate_download_radius_meters", 400L);
        f186911b = bdyx.m91607a(bdyw, "prefetching_flex_seconds", 86400L);
        f186912c = bdyx.m91607a(bdyw, "prefetching_grace_seconds", 60L);
        f186913d = bdyx.m91607a(bdyw, "prefetching_period_seconds", 1036800L);
        f186914e = bdyx.m91610a(bdyw, "should_prefetch_personal_places", false);
    }

    /* renamed from: a */
    public final long mo83766a() {
        return ((Long) f186910a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo83767b() {
        return ((Long) f186911b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo83768c() {
        return ((Long) f186912c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo83769d() {
        return ((Long) f186913d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo83770e() {
        return ((Boolean) f186914e.mo58455c()).booleanValue();
    }
}
