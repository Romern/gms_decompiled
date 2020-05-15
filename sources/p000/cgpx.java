package p000;

/* renamed from: cgpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgpx implements cgpw {

    /* renamed from: a */
    public static final bdyx f187485a;

    /* renamed from: b */
    public static final bdyx f187486b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187485a = bdyx.m91607a(bdyw, "EsimSupport__persisted_data_window_secs", 172800L);
        f187486b = bdyx.m91610a(bdyw, "source_supports_esim_seamless_transfer", false);
        bdyx.m91610a(bdyw, "target_supports_esim_seamless_transfer", false);
    }

    /* renamed from: a */
    public final long mo84257a() {
        return ((Long) f187485a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo84258b() {
        return ((Boolean) f187486b.mo58455c()).booleanValue();
    }
}
