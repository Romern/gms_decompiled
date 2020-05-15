package p000;

/* renamed from: ceef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceef implements ceee {

    /* renamed from: a */
    public static final bdyx f182445a;

    /* renamed from: b */
    public static final bdyx f182446b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gcm"));
        f182445a = bdyx.m91610a(bdyw, "gcm_drop_restricted_app_messages", false);
        f182446b = bdyx.m91610a(bdyw, "gcm_log_restricted_app_messages", false);
    }

    /* renamed from: a */
    public final boolean mo78930a() {
        return ((Boolean) f182445a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78931b() {
        return ((Boolean) f182446b.mo58455c()).booleanValue();
    }
}
