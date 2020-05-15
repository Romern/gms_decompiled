package p000;

import android.content.Context;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: asze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asze {

    /* renamed from: a */
    private static final srn f89913a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static boolean m75246a(Context context, String str) {
        boolean z = true;
        if (rfz.m33557a(context).mo24610b(str)) {
            ((bnsl) f89913a.mo68390d()).mo68405a("verifyPartnerPackage - is Google signed - returning true.");
            return true;
        } else if (((Boolean) askd.f89116h.mo58455c()).booleanValue()) {
            ((bnsl) f89913a.mo68390d()).mo68405a("verifyPartnerPackage - whitelist disabled - returning true.");
            return true;
        } else if (cgxu.m147538b()) {
            try {
                btow a = aszr.m75254a(context, str);
                if (!a.f149812a) {
                    if (!a.f149814c) {
                        z = false;
                    }
                }
                ((bnsl) f89913a.mo68390d()).mo68420a("verifyPartnerPackage - using server whitelist - returning %s", Boolean.valueOf(z));
                return z;
            } catch (asks | atfh | IOException e) {
                bnsl bnsl = (bnsl) f89913a.mo68390d();
                bnsl.mo68437a(e);
                bnsl.mo68405a("verifyPartnerPackage - failed to get verdict when checking server whitelist - returning false.");
                return false;
            }
        } else {
            boolean contains = Arrays.asList(((String) askd.f89117i.mo58455c()).split(",")).contains(str);
            ((bnsl) f89913a.mo68390d()).mo68420a("verifyPartnerPackage - using client whitelist - returning %s", Boolean.valueOf(contains));
            return contains;
        }
    }

    /* renamed from: b */
    public static boolean m75247b(Context context, String str) {
        if (rfz.m33557a(context).mo24610b(str)) {
            ((bnsl) f89913a.mo68390d()).mo68405a("verifyIssuerPackage - is Google signed - returning true.");
            return true;
        } else if (((Boolean) askd.f89116h.mo58455c()).booleanValue()) {
            ((bnsl) f89913a.mo68390d()).mo68405a("verifyIssuerPackage - whitelist disabled - returning true.");
            return true;
        } else if (cgxu.m147538b()) {
            try {
                boolean z = aszr.m75254a(context, str).f149812a;
                ((bnsl) f89913a.mo68390d()).mo68420a("verifyIssuerPackage - using server whitelist - returning %s", Boolean.valueOf(z));
                return z;
            } catch (asks | atfh | IOException e) {
                bnsl bnsl = (bnsl) f89913a.mo68390d();
                bnsl.mo68437a(e);
                bnsl.mo68405a("verifyIssuerPackage - failed to get verdict when checking server whitelist - returning false.");
                return false;
            }
        } else {
            boolean contains = Arrays.asList(((String) askd.f89117i.mo58455c()).split(",")).contains(str);
            ((bnsl) f89913a.mo68390d()).mo68420a("verifyIssuerPackage - using client whitelist - returning %s", Boolean.valueOf(contains));
            return contains;
        }
    }
}
