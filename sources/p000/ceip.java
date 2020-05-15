package p000;

/* renamed from: ceip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceip implements ceio {

    /* renamed from: a */
    public static final bdyx f182723a;

    /* renamed from: b */
    public static final bdyx f182724b;

    /* renamed from: c */
    public static final bdyx f182725c;

    /* renamed from: d */
    public static final bdyx f182726d;

    /* renamed from: e */
    public static final bdyx f182727e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.googlehelp")).mo58443a();
        f182723a = bdyx.m91610a(a, "AndroidGoogleHelp__enable_c2c_activity_a11y_fixes", false);
        f182724b = bdyx.m91610a(a, "AndroidGoogleHelp__enable_chat_error_after_queue", false);
        f182725c = bdyx.m91610a(a, "AndroidGoogleHelp__enable_ignore_chat_queue_status", false);
        f182726d = bdyx.m91607a(a, "AndroidGoogleHelp__ignore_chat_queue_status_timeout_ms", 3000L);
        f182727e = bdyx.m91610a(a, "AndroidGoogleHelp__process_list_conversation_after_join", false);
    }

    /* renamed from: a */
    public final boolean mo79170a() {
        return ((Boolean) f182723a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79171b() {
        return ((Boolean) f182724b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79172c() {
        return ((Boolean) f182725c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo79173d() {
        return ((Long) f182726d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo79174e() {
        return ((Boolean) f182727e.mo58455c()).booleanValue();
    }
}
