package p000;

/* renamed from: ccil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccil implements ccik {

    /* renamed from: a */
    public static final bdyx f179061a;

    /* renamed from: b */
    public static final bdyx f179062b;

    /* renamed from: c */
    public static final bdyx f179063c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.autofill"));
        f179061a = bdyx.m91610a(bdyw, "AgeDateAndGenderFieldTypes__is_age_enabled", false);
        f179062b = bdyx.m91610a(bdyw, "AgeDateAndGenderFieldTypes__is_birthdate_individual_enabled", false);
        f179063c = bdyx.m91610a(bdyw, "AgeDateAndGenderFieldTypes__is_gender_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo76023a() {
        return ((Boolean) f179061a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76024b() {
        return ((Boolean) f179062b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76025c() {
        return ((Boolean) f179063c.mo58455c()).booleanValue();
    }
}
