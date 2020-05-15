package p000;

/* renamed from: celt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class celt implements cels {

    /* renamed from: a */
    public static final bdyx f182915a;

    /* renamed from: b */
    public static final bdyx f182916b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.icing"));
        f182915a = bdyx.m91610a(bdyw, "gms_icing_app_param_thing_sync_enabled.", true);
        f182916b = bdyx.m91607a(bdyw, "AppParamsFlags__server_side_contextual_sources_bitfield", 0L);
    }

    /* renamed from: a */
    public final boolean mo79281a() {
        return ((Boolean) f182915a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo79282b() {
        return ((Long) f182916b.mo58455c()).longValue();
    }
}
