package p000;

/* renamed from: cdlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdlg implements cdlf {

    /* renamed from: a */
    public static final bdyx f181188a;

    /* renamed from: b */
    public static final bdyx f181189b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58443a();
        f181188a = bdyx.m91610a(a, "GmsCoreBackendCounters__enable", false);
        f181189b = bdyx.m91610a(a, "GmsCoreBackendCounters__immediate_logging", false);
    }

    /* renamed from: a */
    public final boolean mo77853a() {
        return ((Boolean) f181188a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77854b() {
        return ((Boolean) f181189b.mo58455c()).booleanValue();
    }
}
