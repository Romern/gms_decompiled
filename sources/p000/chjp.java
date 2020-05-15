package p000;

/* renamed from: chjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chjp implements chjo {

    /* renamed from: a */
    public static final bdyx f188687a;

    /* renamed from: b */
    public static final bdyx f188688b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.wallet"));
        f188687a = bdyx.m91610a(bdyw, "UsePaisaSdkForIsReadyToPay__enabled", true);
        f188688b = bdyx.m91607a(bdyw, "UsePaisaSdkForIsReadyToPay__timeout_millis", 5000L);
    }

    /* renamed from: a */
    public final boolean mo85282a() {
        return ((Boolean) f188687a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo85283b() {
        return ((Long) f188688b.mo58455c()).longValue();
    }
}
