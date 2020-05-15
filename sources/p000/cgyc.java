package p000;

/* renamed from: cgyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgyc implements cgyb {

    /* renamed from: a */
    public static final bdyx f188017a;

    /* renamed from: b */
    public static final bdyx f188018b;

    /* renamed from: c */
    public static final bdyx f188019c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tapandpay"));
        f188017a = bdyx.m91610a(bdyw, "yellow_path_autofill_sms_otp", true);
        f188018b = bdyx.m91609a(bdyw, "yellow_path_autofill_sms_otp_regex", "[0-9]{6,}");
        f188019c = bdyx.m91609a(bdyw, "yellow_path_autofill_sms_otp_substrings", "Android Pay,AndroidPay,ANDROID PAY,Wallet,wallet,Google Pay,GooglePay,GOOGLE PAY,portefeuille digital,portefeuille numérique,registration,provisioning");
    }

    /* renamed from: a */
    public final boolean mo84716a() {
        return ((Boolean) f188017a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo84717b() {
        return (String) f188018b.mo58455c();
    }

    /* renamed from: c */
    public final String mo84718c() {
        return (String) f188019c.mo58455c();
    }
}
