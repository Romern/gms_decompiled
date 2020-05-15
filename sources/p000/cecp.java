package p000;

/* renamed from: cecp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cecp implements ceco {

    /* renamed from: a */
    public static final bdyx f182263a;

    /* renamed from: b */
    public static final bdyx f182264b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gcm"));
        f182263a = bdyx.m91610a(bdyw, "gcm_enable_doze_queue_clearcut_logging", true);
        f182264b = bdyx.m91607a(bdyw, "gcm_doze_queue_mode", 1L);
    }

    /* renamed from: a */
    public final boolean mo78762a() {
        return ((Boolean) f182263a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo78763b() {
        return ((Long) f182264b.mo58455c()).longValue();
    }
}
