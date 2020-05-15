package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: eda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eda {
    /* renamed from: a */
    public static int m10144a(ContextManagerClientInfo contextManagerClientInfo, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ecz ecz = new ecz(countDownLatch);
        Object[] objArr = {countDownLatch, str};
        dwt w = dwq.m9679w();
        doh a = contextManagerClientInfo.mo18066a();
        drv k = dwq.m9667k();
        dqx a2 = dqy.m9123a("NetworkManager#getConfig");
        a2.mo9467f();
        new dxe(w.f14313a, a, ecz, k, str).mo9516a(a2);
        try {
            if (!countDownLatch.await(10, TimeUnit.SECONDS)) {
                return 7;
            }
            Object[] objArr2 = {countDownLatch, Integer.toString(ecz.f14713b)};
            int i = ecz.f14713b;
            if (i == 0) {
                long a3 = dwq.m9665i().mo20505a();
                Object[] objArr3 = {str, Long.valueOf(a3)};
                dwq.m9666j().f14362a.edit().putLong(str, a3).apply();
                return 0;
            } else if (i != 12) {
                return 7;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66);
                sb.append("Invalid API Key for package = ");
                sb.append(str);
                sb.append(". Status code received = ");
                sb.append(i);
                throw new SecurityException(sb.toString());
            }
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eda", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextManager3PCredentialsVerifier] InterruptedException:Could not validate the API Key for package.");
            return 7;
        }
    }
}
