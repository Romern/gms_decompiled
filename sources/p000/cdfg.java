package p000;

/* renamed from: cdfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdfg implements cdff {

    /* renamed from: a */
    public static final bdyx f180645a;

    /* renamed from: b */
    public static final bdyx f180646b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.constellation")).mo58445a("gms:constellation:");
        f180645a = bdyx.m91607a(a, "BackendHost__port", 443L);
        f180646b = bdyx.m91609a(a, "BackendHost__url", "phonedeviceverification-pa.googleapis.com");
    }

    /* renamed from: a */
    public final long mo77385a() {
        return ((Long) f180645a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final String mo77386b() {
        return (String) f180646b.mo58455c();
    }
}
