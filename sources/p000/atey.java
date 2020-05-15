package p000;

import java.io.IOException;

/* renamed from: atey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atey {

    /* renamed from: a */
    private static final srn f90214a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static btnf m75751a(askf askf, int i, int i2) {
        if (!m75753a(askf)) {
            return null;
        }
        bnsl bnsl = (bnsl) f90214a.mo68387b();
        bnsl.mo68432a("atey", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Rpc failed with no error message but Crossbar ping succeeded");
        bxvd da = btnf.f149600f.mo74144da();
        String string = askf.f89126d.getString(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        string.getClass();
        ((btnf) da.f164949b).f149603b = string;
        String string2 = askf.f89126d.getString(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        string2.getClass();
        ((btnf) da.f164949b).f149604c = string2;
        return (btnf) da.mo74062i();
    }

    /* renamed from: b */
    public static boolean m75754b(askf askf) {
        int a;
        try {
            btqf btqf = (btqf) atff.m75771c(askf, "r/compliance/getaccountenablementstatus", btqd.f149928a, btqf.f149930b);
            if (btqf == null || (a = btqe.m117032a(btqf.f149932a)) == 0 || a != 4) {
                return false;
            }
            return true;
        } catch (atfh | IOException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m75752a(askf askf, atfd atfd) {
        atff.m75764a(askf, "r/compliance/getaccountenablementstatus", btqd.f149928a, btqf.f149930b, atfd);
    }

    /* renamed from: a */
    public static boolean m75753a(askf askf) {
        try {
            atff.m75759a(askf, "t/ping", btoh.f149759a, btoi.f149761a);
            return true;
        } catch (IOException e) {
            return false;
        } catch (atfh e2) {
            return true;
        }
    }
}
