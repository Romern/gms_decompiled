package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: auee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auee extends auej {

    /* renamed from: g */
    public static final bnhe f91483g;

    /* renamed from: a */
    public int f91484a;

    /* renamed from: b */
    public Pattern f91485b;

    /* renamed from: c */
    public Matcher f91486c;

    /* renamed from: d */
    public boolean f91487d;

    /* renamed from: e */
    public String f91488e = "";

    /* renamed from: f */
    public final boolean f91489f;

    static {
        audg.m76790a("SciFi_PcomNameId");
        bnha h = bnhe.m109414h();
        h.mo67695b("verizon landline", "Verizon Wireless");
        h.mo67695b("verizon wireless", "Verizon Wireless");
        h.mo67695b("at&t", "AT&T");
        h.mo67695b("t mobile", "T-Mobile");
        f91483g = h.mo67618b();
    }

    public auee(String str) {
        super(str);
        this.f91489f = str.equals("user available");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo50486a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1616620449:
                if (str.equals("landline")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1000044642:
                if (str.equals("wireless")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1000040967:
                if (str.equals("wireline")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3625376:
                if (str.equals("voip")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.f91484a = 3;
            this.f91487d = true;
        } else if (c == 1 || c == 2) {
            this.f91484a = 4;
            this.f91487d = false;
        } else if (c != 3) {
            this.f91484a = 0;
        } else {
            this.f91484a = 1;
        }
    }
}
