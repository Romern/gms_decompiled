package p000;

/* renamed from: ccjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccjb implements ccja {

    /* renamed from: a */
    public static final bdyx f179138a;

    /* renamed from: b */
    public static final bdyx f179139b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.autofill"));
        f179138a = bdyx.m91610a(bdyw, "CreditCardNickname__is_nickname_display_enabled", false);
        f179139b = bdyx.m91607a(bdyw, "CreditCardNickname__nickname_max_length", 25L);
    }

    /* renamed from: a */
    public final boolean mo76094a() {
        return ((Boolean) f179138a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo76095b() {
        return ((Long) f179139b.mo58455c()).longValue();
    }
}
