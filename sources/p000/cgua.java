package p000;

/* renamed from: cgua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgua implements cgtz {

    /* renamed from: a */
    public static final bdyx f187763a;

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
        bdyx.m91610a(a, "Dropbox__enable_max_error_count", false);
        f187763a = bdyx.m91607a(a, "DropBox__upload_interval_millis", 3600000L);
        bdyx.m91607a(a, "Dropbox__max_error_count_interval", 10L);
    }

    /* renamed from: a */
    public final long mo84498a() {
        return ((Long) f187763a.mo58455c()).longValue();
    }
}
