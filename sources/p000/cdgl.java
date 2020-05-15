package p000;

/* renamed from: cdgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdgl implements cdgg {

    /* renamed from: a */
    public static final bdyx f180775a;

    /* renamed from: b */
    public static final bdyx f180776b;

    /* renamed from: c */
    public static final bdyx f180777c;

    /* renamed from: d */
    public static final bdyx f180778d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.contextmanager")).mo58443a();
        bdyx.m91607a(a, "acl_server_retry_timeout_millis", 1800000L);
        try {
            bdyx.m91608a(a, "acl_set_override", (bxga) GeneratedMessageLite.m124014a(bxga.f163216d, new byte[0]), cdgh.f180771a);
            try {
                f180775a = bdyx.m91608a(a, "context_acl_anonymous_acl", (bxga) GeneratedMessageLite.m124014a(bxga.f163216d, new byte[0]), cdgi.f180772a);
                try {
                    f180776b = bdyx.m91608a(a, "context_acl_context_acl", (bxga) GeneratedMessageLite.m124014a(bxga.f163216d, new byte[0]), cdgj.f180773a);
                    try {
                        f180777c = bdyx.m91608a(a, "context_acl_synchronizable_contexts", (bxjr) GeneratedMessageLite.m124014a(bxjr.f163669b, new byte[]{10, 3, 8, -110, 78, 10, 3, 8, -108, 78, 10, 3, 8, -109, 78, 10, 3, 8, -107, 78}), cdgk.f180774a);
                        f180778d = bdyx.m91610a(a, "no_acl_fetching_if_gms", true);
                    } catch (bxwf e) {
                        throw new AssertionError("Could not parse proto flag \"context_acl_synchronizable_contexts\"");
                    }
                } catch (bxwf e2) {
                    throw new AssertionError("Could not parse proto flag \"context_acl_context_acl\"");
                }
            } catch (bxwf e3) {
                throw new AssertionError("Could not parse proto flag \"context_acl_anonymous_acl\"");
            }
        } catch (bxwf e4) {
            throw new AssertionError("Could not parse proto flag \"acl_set_override\"");
        }
    }

    /* renamed from: a */
    public final bxga mo77502a() {
        return (bxga) f180775a.mo58455c();
    }

    /* renamed from: b */
    public final bxga mo77503b() {
        return (bxga) f180776b.mo58455c();
    }

    /* renamed from: c */
    public final bxjr mo77504c() {
        return (bxjr) f180777c.mo58455c();
    }

    /* renamed from: d */
    public final boolean mo77505d() {
        return ((Boolean) f180778d.mo58455c()).booleanValue();
    }
}
