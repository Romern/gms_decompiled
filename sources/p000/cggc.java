package p000;

/* renamed from: cggc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cggc implements cggb {

    /* renamed from: a */
    public static final bdyx f186806a;

    /* renamed from: b */
    public static final bdyx f186807b;

    /* renamed from: c */
    public static final bdyx f186808c;

    /* renamed from: d */
    public static final bdyx f186809d;

    /* renamed from: e */
    public static final bdyx f186810e;

    /* renamed from: f */
    public static final bdyx f186811f;

    /* renamed from: g */
    public static final bdyx f186812g;

    /* renamed from: h */
    public static final bdyx f186813h;

    /* renamed from: i */
    public static final bdyx f186814i;

    /* renamed from: j */
    public static final bdyx f186815j;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.places"));
        f186806a = bdyx.m91610a(bdyw, "fencing_apis_require_background_permission", false);
        f186807b = bdyx.m91610a(bdyw, "placefencing_allow_personalized_placefences", true);
        f186808c = bdyx.m91607a(bdyw, "placefencing_max_rank_balanced_recall_precision", 5L);
        f186809d = bdyx.m91607a(bdyw, "placefencing_max_rank_high_precision", 3L);
        f186810e = bdyx.m91607a(bdyw, "placefencing_max_rank_high_recall", 20L);
        f186811f = bdyx.m91607a(bdyw, "placefencing_max_rank_highest_precision", 1L);
        f186812g = bdyx.m91605a(bdyw, "placefencing_minimum_likelihood_balanced_recall_precision", 0.05d);
        f186813h = bdyx.m91605a(bdyw, "placefencing_minimum_likelihood_high_precision", 0.2d);
        f186814i = bdyx.m91605a(bdyw, "placefencing_minimum_likelihood_high_recall", 0.01d);
        f186815j = bdyx.m91605a(bdyw, "placefencing_minimum_likelihood_highest_precision", 0.5d);
    }

    /* renamed from: a */
    public final boolean mo83669a() {
        return ((Boolean) f186806a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83670b() {
        return ((Boolean) f186807b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo83671c() {
        return ((Long) f186808c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo83672d() {
        return ((Long) f186809d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo83673e() {
        return ((Long) f186810e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo83674f() {
        return ((Long) f186811f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final double mo83675g() {
        return ((Double) f186812g.mo58455c()).doubleValue();
    }

    /* renamed from: h */
    public final double mo83676h() {
        return ((Double) f186813h.mo58455c()).doubleValue();
    }

    /* renamed from: i */
    public final double mo83677i() {
        return ((Double) f186814i.mo58455c()).doubleValue();
    }

    /* renamed from: j */
    public final double mo83678j() {
        return ((Double) f186815j.mo58455c()).doubleValue();
    }
}
