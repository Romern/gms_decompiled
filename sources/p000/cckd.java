package p000;

/* renamed from: cckd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cckd implements cckc {

    /* renamed from: a */
    public static final bdyx f179225a;

    /* renamed from: b */
    public static final bdyx f179226b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.autofill"));
        f179225a = bdyx.m91610a(bdyw, "SinglePassword__fill_enabled", false);
        f179226b = bdyx.m91610a(bdyw, "SinglePassword__save_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo76171a() {
        return ((Boolean) f179225a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76172b() {
        return ((Boolean) f179226b.mo58455c()).booleanValue();
    }
}
