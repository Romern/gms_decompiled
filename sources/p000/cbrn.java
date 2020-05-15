package p000;

/* renamed from: cbrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbrn implements cbrm {

    /* renamed from: a */
    public static final bdyx f178165a;

    /* renamed from: b */
    public static final bdyx f178166b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.accountsettings")).mo58445a("gms:accountsettings:");
        f178165a = bdyx.m91609a(a, "CronetSupport__quic_url_hint_hostnames", "www.gstatic.com,ssl.gstatic.com,lh1.googleusercontent.com,lh2.googleusercontent.com,lh3.googleusercontent.com,lh4.googleusercontent.com,lh5.googleusercontent.com,lh6.googleusercontent.com");
        f178166b = bdyx.m91610a(a, "CronetSupport__thread_priority_foreground_enabled", true);
    }

    /* renamed from: a */
    public final String mo75278a() {
        return (String) f178165a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo75279b() {
        return ((Boolean) f178166b.mo58455c()).booleanValue();
    }
}
