package p000;

/* renamed from: cgxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgxb implements cgxa {

    /* renamed from: a */
    public static final bdyx f187951a;

    /* renamed from: b */
    public static final bdyx f187952b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tapandpay"));
        f187951a = bdyx.m91607a(bdyw, "deferred_yellow_path_notification_window_seconds", 600L);
        f187952b = bdyx.m91607a(bdyw, "local_notification_window_seconds", 1L);
    }

    /* renamed from: a */
    public final long mo84659a() {
        return ((Long) f187951a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo84660b() {
        return ((Long) f187952b.mo58455c()).longValue();
    }
}
