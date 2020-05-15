package p000;

/* renamed from: ccio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccio implements ccin {

    /* renamed from: a */
    public static final bdyx f179066a;

    /* renamed from: b */
    public static final bdyx f179067b;

    /* renamed from: c */
    public static final bdyx f179068c;

    /* renamed from: d */
    public static final bdyx f179069d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.autofill"));
        f179066a = bdyx.m91607a(bdyw, "AppExclusionList__disable_autofill_duration_hrs", 10L);
        f179067b = bdyx.m91609a(bdyw, "AppExclusionList__exclusion_list", "com.android.contacts|com.android.mms|com.android.email|com.android.calendar|com.android.settings|com.android.calculator2|com.android.bbkcalculator|com.android.dialer|com.samsung.android.contacts");
        f179068c = bdyx.m91610a(bdyw, "AppExclusionList__is_disable_autofill_enabled", false);
        f179069d = bdyx.m91610a(bdyw, "AppExclusionList__is_enabled", true);
        bdyx.m91610a(bdyw, "AppExclusionList__is_prediction_data_exclusion_enabled", false);
    }

    /* renamed from: a */
    public final long mo76027a() {
        return ((Long) f179066a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final String mo76028b() {
        return (String) f179067b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo76029c() {
        return ((Boolean) f179068c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76030d() {
        return ((Boolean) f179069d.mo58455c()).booleanValue();
    }
}
