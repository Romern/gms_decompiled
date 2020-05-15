package p000;

import android.accounts.Account;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;

/* renamed from: gmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gmw {
    /* renamed from: a */
    public static final ResolutionData m13468a(jfc jfc) {
        int i = 1;
        if (jfc.f22346d.size() != 0) {
            BrowserResolutionCookie[] browserResolutionCookieArr = new BrowserResolutionCookie[jfc.f22346d.size()];
            for (int i2 = 0; i2 < jfc.f22346d.size(); i2++) {
                jeu jeu = (jeu) jfc.f22346d.get(i2);
                ghv ghv = new ghv();
                String str = jeu.f22307a;
                BrowserResolutionCookie browserResolutionCookie = ghv.f18274a;
                sdo.m34977c(str);
                browserResolutionCookie.f9919a = str;
                String str2 = jeu.f22308b;
                BrowserResolutionCookie browserResolutionCookie2 = ghv.f18274a;
                sdo.m34977c(str2);
                browserResolutionCookie2.f9920b = str2;
                String str3 = jeu.f22310d;
                BrowserResolutionCookie browserResolutionCookie3 = ghv.f18274a;
                sdo.m34977c(str3);
                browserResolutionCookie3.f9922d = str3;
                String str4 = jeu.f22309c;
                BrowserResolutionCookie browserResolutionCookie4 = ghv.f18274a;
                sdo.m34977c(str4);
                browserResolutionCookie4.f9921c = str4;
                boolean z = jeu.f22312f;
                BrowserResolutionCookie browserResolutionCookie5 = ghv.f18274a;
                browserResolutionCookie5.f9924f = z;
                browserResolutionCookie5.f9923e = jeu.f22311e;
                browserResolutionCookie5.f9925g = jeu.f22313g;
                browserResolutionCookieArr[i2] = browserResolutionCookie5;
            }
            String str5 = jfc.f22343a;
            int a = jfb.m16636a(jfc.f22344b);
            if (a != 0) {
                i = a;
            }
            return new ResolutionData(str5, i - 1, jfc.f22345c, browserResolutionCookieArr);
        }
        String str6 = jfc.f22343a;
        int a2 = jfb.m16636a(jfc.f22344b);
        if (a2 != 0) {
            i = a2;
        }
        return new ResolutionData(str6, i - 1, jfc.f22345c, null);
    }

    /* renamed from: a */
    public static final TokenResponse m13469a(Account account, TokenData tokenData) {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.mo7646a(izj.SUCCESS);
        tokenResponse.mo7644a(account);
        tokenResponse.mo7645a(tokenData);
        return tokenResponse;
    }

    /* renamed from: a */
    public static final TokenResponse m13470a(Account account, izj izj) {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.mo7646a(izj);
        tokenResponse.mo7644a(account);
        return tokenResponse;
    }
}
