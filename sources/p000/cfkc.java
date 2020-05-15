package p000;

/* renamed from: cfkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfkc implements cfkb {

    /* renamed from: a */
    public static final bdyx f184225a;

    /* renamed from: b */
    public static final bdyx f184226b;

    /* renamed from: c */
    public static final bdyx f184227c;

    /* renamed from: d */
    public static final bdyx f184228d;

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
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.measurement"));
        f184225a = bdyx.m91610a(bdyw, "measurement.sdk.collection.enable_extend_user_property_size", true);
        f184226b = bdyx.m91610a(bdyw, "measurement.sdk.collection.last_deep_link_referrer2", true);
        f184227c = bdyx.m91610a(bdyw, "measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f184228d = bdyx.m91610a(bdyw, "measurement.sdk.collection.last_gclid_from_referrer2", false);
        bdyx.m91607a(bdyw, "measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    /* renamed from: a */
    public final boolean mo81352a() {
        return ((Boolean) f184225a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81353b() {
        return ((Boolean) f184226b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81354c() {
        return ((Boolean) f184227c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo81355d() {
        return ((Boolean) f184228d.mo58455c()).booleanValue();
    }
}
