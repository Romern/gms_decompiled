package p000;

/* renamed from: cglk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cglk implements cglj {

    /* renamed from: a */
    public static final bdyx f187250a;

    /* renamed from: b */
    public static final bdyx f187251b;

    /* renamed from: c */
    public static final bdyx f187252c;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.setupservices")).mo58450b();
        f187250a = bdyx.m91607a(b, "auth_backup_opt_in_state", 0L);
        f187251b = bdyx.m91609a(b, "device_country", "");
        f187252c = bdyx.m91609a(b, "google_setup:play_email_opt_in", "");
    }

    /* renamed from: a */
    public final long mo84061a() {
        return ((Long) f187250a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final String mo84062b() {
        return (String) f187251b.mo58455c();
    }

    /* renamed from: c */
    public final String mo84063c() {
        return (String) f187252c.mo58455c();
    }
}
