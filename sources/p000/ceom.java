package p000;

/* renamed from: ceom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceom implements ceol {

    /* renamed from: a */
    public static final bdyx f183151a;

    /* renamed from: b */
    public static final bdyx f183152b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.icing.mdh")).mo58443a();
        f183151a = bdyx.m91610a(a, "Storage__enable_upload_changes_request_size_limit", true);
        f183152b = bdyx.m91607a(a, "gms_icing_mdh_upload_changes_request_size_limit_bytes", 10000000L);
    }

    /* renamed from: a */
    public final boolean mo79490a() {
        return ((Boolean) f183151a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo79491b() {
        return ((Long) f183152b.mo58455c()).longValue();
    }
}
