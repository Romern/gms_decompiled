package p000;

/* renamed from: cfek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfek implements cfej {

    /* renamed from: a */
    public static final bdyx f183688a;

    /* renamed from: b */
    public static final bdyx f183689b;

    /* renamed from: c */
    public static final bdyx f183690c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        f183688a = bdyx.m91610a(a, "enable_initiate_business_chat_intent", true);
        f183689b = bdyx.m91610a(a, "enable_initiate_chat_intent", true);
        f183690c = bdyx.m91610a(a, "enable_initiate_new_business_chat_intent", true);
    }

    /* renamed from: a */
    public final boolean mo80881a() {
        return ((Boolean) f183688a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo80882b() {
        return ((Boolean) f183689b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo80883c() {
        return ((Boolean) f183690c.mo58455c()).booleanValue();
    }
}
