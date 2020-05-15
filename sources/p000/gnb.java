package p000;

/* renamed from: gnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gnb extends gmg {

    /* renamed from: a */
    public static final gna f18655a = new gmf("accountId");

    /* renamed from: b */
    public static final gna f18656b = new gmz();

    /* renamed from: d */
    private static final sek f18657d = ght.m13171a("Account", "ValidateAccountResponse");

    /* renamed from: c */
    public final izj f18658c;

    public gnb(String str) {
        super(str);
        izj izj;
        String str2 = (String) this.f18627r.get("Error");
        String str3 = (String) this.f18627r.get("accountId");
        if (str2 == null) {
            izj = str3 == null ? izj.SERVICE_UNAVAILABLE : izj.SUCCESS;
        } else if ("badauth".equals(str2)) {
            izj = izj.BAD_AUTHENTICATION;
        } else {
            izj c = izj.m16369c(str2);
            if (c == null) {
                f18657d.mo25416d("error status: %s", str2);
                izj = izj.UNKNOWN;
            } else {
                izj = c;
            }
        }
        this.f18658c = izj;
    }
}
