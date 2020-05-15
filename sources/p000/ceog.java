package p000;

/* renamed from: ceog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceog implements ceof {

    /* renamed from: a */
    public static final bdyx f183144a;

    /* renamed from: b */
    public static final bdyx f183145b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.icing.mdh")).mo58443a();
        f183144a = bdyx.m91610a(a, "FootprintsFeature__enable_filtering_for_latest_footprints_sync", false);
        f183145b = bdyx.m91610a(a, "FootprintsFeature__enable_upload_changes_count_limit", true);
    }

    /* renamed from: a */
    public final boolean mo79485a() {
        return ((Boolean) f183144a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79486b() {
        return ((Boolean) f183145b.mo58455c()).booleanValue();
    }
}
