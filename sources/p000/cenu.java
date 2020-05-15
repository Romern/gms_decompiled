package p000;

/* renamed from: cenu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cenu implements cent {

    /* renamed from: a */
    public static final bdyx f183117a;

    /* renamed from: b */
    public static final bdyx f183118b;

    /* renamed from: c */
    public static final bdyx f183119c;

    /* renamed from: d */
    public static final bdyx f183120d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.icing.mdd"));
        f183117a = bdyx.m91607a(bdyw, "cellular_charging_gcm_task_period", 21600L);
        f183118b = bdyx.m91607a(bdyw, "charging_gcm_task_period", 21600L);
        f183119c = bdyx.m91607a(bdyw, "maintenance_gcm_task_period", 86400L);
        f183120d = bdyx.m91607a(bdyw, "wifi_charging_gcm_task_period", 21600L);
    }

    /* renamed from: a */
    public final long mo79462a() {
        return ((Long) f183117a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo79463b() {
        return ((Long) f183118b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo79464c() {
        return ((Long) f183119c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo79465d() {
        return ((Long) f183120d.mo58455c()).longValue();
    }
}
