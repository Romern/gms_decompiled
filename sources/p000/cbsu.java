package p000;

/* renamed from: cbsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbsu implements cbst {

    /* renamed from: a */
    public static final bdyx f178232a;

    /* renamed from: b */
    public static final bdyx f178233b;

    /* renamed from: c */
    public static final bdyx f178234c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178232a = bdyx.m91610a(bdyw, "gad:force_dynamite_loading_enabled", false);
        f178233b = bdyx.m91610a(bdyw, "gads:uri_query_to_map_rewrite:enabled", false);
        f178234c = bdyx.m91610a(bdyw, "gads:sdk_csi_write_to_file", false);
    }

    /* renamed from: a */
    public final boolean mo75334a() {
        return ((Boolean) f178232a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75335b() {
        return ((Boolean) f178233b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75336c() {
        return ((Boolean) f178234c.mo58455c()).booleanValue();
    }
}
