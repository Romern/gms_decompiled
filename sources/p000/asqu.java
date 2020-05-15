package p000;

/* renamed from: asqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asqu {

    /* renamed from: m */
    private static final srn f89404m = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public String f89405a;

    /* renamed from: b */
    public String f89406b;

    /* renamed from: c */
    public short f89407c;

    /* renamed from: d */
    public String f89408d;

    /* renamed from: e */
    public boolean f89409e;

    /* renamed from: f */
    public asqv f89410f;

    /* renamed from: g */
    public boolean f89411g;

    /* renamed from: h */
    public boolean f89412h = false;

    /* renamed from: i */
    public boolean f89413i = false;

    /* renamed from: j */
    public String f89414j;

    /* renamed from: k */
    public int f89415k;

    /* renamed from: l */
    public bozu f89416l = bozu.UNKNOWN_TAP_PATH;

    /* renamed from: a */
    public static final int m74485a(byte[] bArr) {
        try {
            return (int) asuv.m74875a(bArr);
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f89404m.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Terminal sent wrong BCD data");
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m74486a(short s) {
        return s == 4111 || s == 4131 || s == 4784 || s == 7523;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxt.a(java.lang.String, int):void
     arg types: [java.lang.String, short]
     candidates:
      bmxt.a(java.lang.String, double):void
      bmxt.a(java.lang.String, long):void
      bmxt.a(java.lang.String, java.lang.Object):void
      bmxt.a(java.lang.String, boolean):void
      bmxt.a(java.lang.String, int):void */
    public final String toString() {
        bmxt a = bmxu.m108564a("CapturedAppletData");
        a.mo66885a("message", this.f89405a);
        a.mo66885a("applicationVersion", this.f89406b);
        a.mo66883a("transactionType", (int) this.f89407c);
        a.mo66885a("selectedAid", this.f89408d);
        a.mo66886a("isHighValueTransaction", this.f89409e);
        a.mo66885a("cvmMethod", this.f89410f);
        a.mo66886a("isTransit", this.f89411g);
        a.mo66886a("isValid", this.f89412h);
        a.mo66886a("isOda", this.f89413i);
        a.mo66885a("transactionIdentifier", this.f89414j);
        a.mo66883a("paymentKeysLeft", this.f89415k);
        a.mo66885a("tapPath", this.f89416l);
        return a.toString();
    }
}
