package p000;

/* renamed from: cdvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdvd implements cdvc {

    /* renamed from: a */
    public static final bdyx f181796a;

    /* renamed from: b */
    public static final bdyx f181797b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.fido"));
        f181796a = bdyx.m91607a(bdyw, "BleConnectionParameters__keepalive_timeout_millis", 1000L);
        f181797b = bdyx.m91607a(bdyw, "BleConnectionParameters__transceive_timeout_millis", 2000L);
    }

    /* renamed from: a */
    public final long mo78361a() {
        return ((Long) f181796a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo78362b() {
        return ((Long) f181797b.mo58455c()).longValue();
    }
}
