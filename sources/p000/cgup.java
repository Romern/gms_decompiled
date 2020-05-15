package p000;

/* renamed from: cgup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgup implements cguo {

    /* renamed from: a */
    public static final bdyx f187780a;

    /* renamed from: b */
    public static final bdyx f187781b;

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
        bdyw a = new bdyw("com.google.android.metrics").mo58445a("gms:stats:");
        f187780a = bdyx.m91607a(a, "MediaStats__max_content_length", 1000L);
        f187781b = bdyx.m91610a(a, "MediaStats__upload_unhandled_fields", false);
    }

    /* renamed from: a */
    public final long mo84510a() {
        return ((Long) f187780a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo84511b() {
        return ((Boolean) f187781b.mo58455c()).booleanValue();
    }
}
