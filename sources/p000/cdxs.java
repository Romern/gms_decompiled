package p000;

/* renamed from: cdxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdxs implements cdxr {

    /* renamed from: a */
    public static final bdyx f181881a;

    /* renamed from: b */
    public static final bdyx f181882b;

    /* renamed from: c */
    public static final bdyx f181883c;

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
        f181881a = bdyx.m91607a(bdyw, "WebauthnRequestParameters__default_timeout_seconds", 300L);
        f181882b = bdyx.m91607a(bdyw, "WebauthnRequestParameters__max_timeout_seconds", 600L);
        f181883c = bdyx.m91607a(bdyw, "WebauthnRequestParameters__min_timeout_seconds", 15L);
    }

    /* renamed from: a */
    public final long mo78423a() {
        return ((Long) f181881a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo78424b() {
        return ((Long) f181882b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo78425c() {
        return ((Long) f181883c.mo58455c()).longValue();
    }
}
