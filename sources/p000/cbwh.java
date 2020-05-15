package p000;

/* renamed from: cbwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbwh implements cbwg {

    /* renamed from: a */
    public static final bdyx f178468a;

    /* renamed from: b */
    public static final bdyx f178469b;

    /* renamed from: c */
    public static final bdyx f178470c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.appstate")).mo58443a();
        f178468a = bdyx.m91610a(a, "Turndown__call_callback_synchronously", false);
        bdyx.m91610a(a, "Turndown__disable_sync", false);
        bdyx.m91610a(a, "Turndown__enable", true);
        f178469b = bdyx.m91610a(a, "Turndown__remove_content_provider", false);
        f178470c = bdyx.m91610a(a, "Turndown__remove_database", false);
    }

    /* renamed from: a */
    public final boolean mo75540a() {
        return ((Boolean) f178468a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75541b() {
        return ((Boolean) f178469b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75542c() {
        return ((Boolean) f178470c.mo58455c()).booleanValue();
    }
}
