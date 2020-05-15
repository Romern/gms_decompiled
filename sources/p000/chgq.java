package p000;

/* renamed from: chgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chgq implements chgp {

    /* renamed from: a */
    public static final bdyx f188596a;

    /* renamed from: b */
    public static final bdyx f188597b;

    /* renamed from: c */
    public static final bdyx f188598c;

    /* renamed from: d */
    public static final bdyx f188599d;

    /* renamed from: e */
    public static final bdyx f188600e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.wallet"));
        f188596a = bdyx.m91607a(bdyw, "EmoneySettings__debit_card_timeout_millis", 15000L);
        f188597b = bdyx.m91610a(bdyw, "EmoneySettings__enable_fake_payse_client", false);
        f188598c = bdyx.m91610a(bdyw, "EmoneySettings__enable_lazy_process_instrument_selector", false);
        f188599d = bdyx.m91607a(bdyw, "EmoneySettings__payse_cards_cache_expire_time_seconds", 300L);
        f188600e = bdyx.m91607a(bdyw, "EmoneySettings__read_card_timeout_millis", 5000L);
    }

    /* renamed from: a */
    public final long mo85218a() {
        return ((Long) f188596a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo85219b() {
        return ((Boolean) f188597b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo85220c() {
        return ((Boolean) f188598c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo85221d() {
        return ((Long) f188599d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo85222e() {
        return ((Long) f188600e.mo58455c()).longValue();
    }
}
