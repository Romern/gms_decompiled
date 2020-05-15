package p000;

/* renamed from: cebx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cebx implements cebw {

    /* renamed from: a */
    public static final bdyx f182237a;

    /* renamed from: b */
    public static final bdyx f182238b;

    /* renamed from: c */
    public static final bdyx f182239c;

    /* renamed from: d */
    public static final bdyx f182240d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gcm"));
        f182237a = bdyx.m91610a(bdyw, "gcm_enable_aa_bucketing_clearcut_logging", true);
        f182238b = bdyx.m91610a(bdyw, "gcm_enforce_quota_in_dnd_mode", false);
        f182239c = bdyx.m91609a(bdyw, "gcm_high_priority_quotas", "30,10,40,5");
        f182240d = bdyx.m91609a(bdyw, "gcm_suppressed_notifications_dnd", "511");
    }

    /* renamed from: a */
    public final boolean mo78742a() {
        return ((Boolean) f182237a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78743b() {
        return ((Boolean) f182238b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo78744c() {
        return (String) f182239c.mo58455c();
    }

    /* renamed from: d */
    public final String mo78745d() {
        return (String) f182240d.mo58455c();
    }
}
