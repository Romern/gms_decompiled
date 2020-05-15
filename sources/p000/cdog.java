package p000;

/* renamed from: cdog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdog implements cdof {

    /* renamed from: a */
    public static final bdyx f181422a;

    /* renamed from: b */
    public static final bdyx f181423b;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58443a();
        f181422a = bdyx.m91610a(a, "ServiceConnection__enable_logging", false);
        f181423b = bdyx.m91605a(a, "ServiceConnection__sampling_rate", 1.0d);
    }

    /* renamed from: a */
    public final boolean mo78060a() {
        return ((Boolean) f181422a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final double mo78061b() {
        return ((Double) f181423b.mo58455c()).doubleValue();
    }
}
