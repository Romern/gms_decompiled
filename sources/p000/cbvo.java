package p000;

/* renamed from: cbvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbvo implements cbvn {

    /* renamed from: a */
    public static final bdyx f178346a;

    /* renamed from: b */
    public static final bdyx f178347b;

    /* renamed from: c */
    public static final bdyx f178348c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178346a = bdyx.m91610a(bdyw, "gads:webview:permission:disabled", false);
        f178347b = bdyx.m91610a(bdyw, "gads:corewebview:adwebview_factory:enable", false);
        f178348c = bdyx.m91610a(bdyw, "gads:corewebview:javascript_engine", false);
    }

    /* renamed from: a */
    public final boolean mo75425a() {
        return ((Boolean) f178346a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75426b() {
        return ((Boolean) f178347b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75427c() {
        return ((Boolean) f178348c.mo58455c()).booleanValue();
    }
}
