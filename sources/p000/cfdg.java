package p000;

/* renamed from: cfdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfdg implements cfdf {

    /* renamed from: a */
    public static final bdyx f183651a;

    /* renamed from: b */
    public static final bdyx f183652b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        f183651a = bdyx.m91610a(a, "enable_app_metadata_sync_v2", true);
        f183652b = bdyx.m91609a(a, "ms_initiated_app_ids_list", "");
    }

    /* renamed from: a */
    public final boolean mo80854a() {
        return ((Boolean) f183651a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo80855b() {
        return (String) f183652b.mo58455c();
    }
}
