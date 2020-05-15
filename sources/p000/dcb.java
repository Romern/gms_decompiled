package p000;

import com.google.android.gms.ads.internal.config.C0371o;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* renamed from: dcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dcb {

    /* renamed from: a */
    static bqnk f12782a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dab.a(java.lang.String, boolean):byte[]
     arg types: [java.lang.String, int]
     candidates:
      dab.a(byte[], boolean):java.lang.String
      dab.a(java.lang.String, boolean):byte[] */
    /* renamed from: a */
    static void m8142a(dca dca) {
        Method a;
        if (f12782a == null) {
            String str = (String) C0371o.f8204R.mo6604a();
            if (str == null || str.length() == 0) {
                str = null;
                if (!(dca == null || (a = dca.mo8504a("IPyaXEy+F5at6zi6GEs/jkKHpFTAlYWM90ImI4874hawRCOEgKKUBzsomxFaeDkJ", "UMjKs/aJTfdn6BJRL96Zl/lGRXJtRxPMhZNhmq0gEjI=")) == null)) {
                    str = (String) a.invoke(null, new Object[0]);
                }
                if (str == null) {
                    return;
                }
            }
            try {
                try {
                    bqns a2 = bqnx.m113072a(dab.m8077a(str, true));
                    for (bqsg bqsg : bqpu.f141349a.f141562a) {
                        if (bqsg.f141522b.isEmpty()) {
                            throw new GeneralSecurityException("Missing type_url.");
                        } else if (bqsg.f141521a.isEmpty()) {
                            throw new GeneralSecurityException("Missing primitive_name.");
                        } else if (bqsg.f141524d.isEmpty()) {
                            throw new GeneralSecurityException("Missing catalogue_name.");
                        } else if (!bqsg.f141524d.equals("TinkAead") && !bqsg.f141524d.equals("TinkMac") && !bqsg.f141524d.equals("TinkHybridDecrypt") && !bqsg.f141524d.equals("TinkHybridEncrypt") && !bqsg.f141524d.equals("TinkPublicKeySign") && !bqsg.f141524d.equals("TinkPublicKeyVerify") && !bqsg.f141524d.equals("TinkStreamingAead") && !bqsg.f141524d.equals("TinkDeterministicAead")) {
                            bqnh a3 = bqok.m113099a(bqsg.f141524d);
                            bqok.m113110a(a3.mo69283a());
                            bqok.m113108a(a3.mo69284b(), bqsg.f141523c);
                        }
                    }
                    f12782a = bqpx.m113222a(a2);
                } catch (GeneralSecurityException e) {
                }
            } catch (IllegalArgumentException e2) {
            }
        }
    }
}
