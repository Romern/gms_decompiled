package p000;

import android.text.TextUtils;
import java.io.IOException;

/* renamed from: atar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atar {

    /* renamed from: a */
    private static final srn f89970a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public final boolean mo49768a(askf askf, String str) {
        sdo.m34974b(!TextUtils.isEmpty(str));
        synchronized (atar.class) {
            bxvd da = bztw.f171377c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bztw bztw = (bztw) da.f164949b;
            str.getClass();
            bztw.f171379a = str;
            bztw.f171380b = 1;
            try {
                atff.m75759a(askf, "t/notifications/updategcmid", (bztw) da.mo74062i(), bztx.f171381a);
                try {
                    asiv.m74185a(str, askf);
                    atam atam = new atam(askf);
                    atam.mo49741a(atam.mo49734a(5));
                } catch (RuntimeException e) {
                    bnsl bnsl = (bnsl) f89970a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("atar", "a", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Unable to persist new gcm id");
                }
            } catch (IOException e2) {
                bnsl bnsl2 = (bnsl) f89970a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("atar", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Error sending GCM Id");
                return false;
            } catch (atfh e3) {
                bnsl bnsl3 = (bnsl) f89970a.mo68387b();
                bnsl3.mo68437a(e3);
                bnsl3.mo68432a("atar", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("TapAndPayApiError sending GCM id");
                return false;
            }
        }
        return true;
    }
}
