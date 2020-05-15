package p000;

/* renamed from: chnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chnu implements chnt {

    /* renamed from: a */
    public static final bdyx f188897a;

    /* renamed from: b */
    public static final bdyx f188898b;

    /* renamed from: c */
    public static final bdyx f188899c;

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
        bdyw a = new bdyw("com.google.android.westworld").mo58445a("gms:westworld:");
        bdyx.m91610a(a, "baseline_enabled", false);
        bdyx.m91610a(a, "use_new_checkbox_consent", false);
        f188897a = bdyx.m91610a(a, "force_multi_user_as_opted_out", false);
        f188898b = bdyx.m91610a(a, "metadata_enabled", true);
        f188899c = bdyx.m91610a(a, "metrics_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo85455a() {
        return ((Boolean) f188897a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo85456b() {
        return ((Boolean) f188898b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo85457c() {
        return ((Boolean) f188899c.mo58455c()).booleanValue();
    }
}
