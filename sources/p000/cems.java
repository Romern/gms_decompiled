package p000;

/* renamed from: cems */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cems implements cemr {

    /* renamed from: a */
    public static final bdyx f183004a;

    /* renamed from: b */
    public static final bdyx f183005b;

    /* renamed from: c */
    public static final bdyx f183006c;

    /* renamed from: d */
    public static final bdyx f183007d;

    /* renamed from: e */
    public static final bdyx f183008e;

    /* renamed from: f */
    public static final bdyx f183009f;

    /* renamed from: g */
    public static final bdyx f183010g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.icing"));
        f183004a = bdyx.m91610a(bdyw, "gms_icing_disable_sms_corpus", false);
        f183005b = bdyx.m91610a(bdyw, "gms_icing_enable_app_indexing_debug", true);
        f183006c = bdyx.m91610a(bdyw, "gms_icing_enable_calendar_indexing", true);
        f183007d = bdyx.m91610a(bdyw, "gms_icing_enable_cld3_model_in_assets", true);
        f183008e = bdyx.m91610a(bdyw, "gms_icing_enable_get_debug_info_api", true);
        f183009f = bdyx.m91610a(bdyw, "gms_icing_enable_icing_dumper", true);
        f183010g = bdyx.m91610a(bdyw, "gms_icing_enable_indexing_services", true);
        bdyx.m91610a(bdyw, "enable_legacy_assist_app_context_uploads", false);
    }

    /* renamed from: a */
    public final boolean mo79359a() {
        return ((Boolean) f183004a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79360b() {
        return ((Boolean) f183005b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79361c() {
        return ((Boolean) f183006c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79362d() {
        return ((Boolean) f183007d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo79363e() {
        return ((Boolean) f183008e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo79364f() {
        return ((Boolean) f183009f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo79365g() {
        return ((Boolean) f183010g.mo58455c()).booleanValue();
    }
}
