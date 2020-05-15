package p000;

/* renamed from: cgug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgug implements cguf {

    /* renamed from: a */
    public static final bdyx f187769a;

    /* renamed from: b */
    public static final bdyx f187770b;

    /* renamed from: c */
    public static final bdyx f187771c;

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
        bdyw a = new bdyw("com.google.android.metrics").mo58445a("gms:stats:");
        f187769a = bdyx.m91610a(a, "LauncherStats__enabled", true);
        f187770b = bdyx.m91607a(a, "LauncherStats__record_interval_secs", 604800L);
        f187771c = bdyx.m91610a(a, "skip_upload_non_existing_dump_file", true);
    }

    /* renamed from: a */
    public final boolean mo84502a() {
        return ((Boolean) f187769a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo84503b() {
        return ((Long) f187770b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo84504c() {
        return ((Boolean) f187771c.mo58455c()).booleanValue();
    }
}
