package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: hcs */
final /* synthetic */ class hcs implements Callable {

    /* renamed from: a */
    private final hdf f19477a;

    public hcs(hdf hdf) {
        this.f19477a = hdf;
    }

    public final Object call() {
        TokenData tokenData;
        Set set;
        String str;
        hdf hdf = this.f19477a;
        TokenRequest tokenRequest = new TokenRequest(hdf.f19511q.mo7637a(), hdf.f19511q.f10706b);
        tokenRequest.mo7638a(hdf.f19511q.mo7640b());
        tokenRequest.mo7639a(iyb.GRANTED);
        tokenRequest.f10714j = hdf.f19511q.f10714j;
        ConsentResult consentResult = hdf.f19513s;
        if (consentResult != null) {
            FACLConfig fACLConfig = consentResult.f10619e;
            if (fACLConfig != null) {
                tokenRequest.f10709e = fACLConfig;
            }
            PACLConfig pACLConfig = tokenRequest.f10710f;
            String str2 = consentResult.f10618d;
            if (str2 != null) {
                if (pACLConfig != null) {
                    str = pACLConfig.f10878b;
                } else {
                    str = null;
                }
                tokenRequest.f10710f = new PACLConfig(str, str2);
            }
            iyb b = consentResult.mo7620b();
            if (b != null) {
                tokenRequest.mo7639a(b);
            }
            String str3 = consentResult.f10621g;
            if (!TextUtils.isEmpty(str3)) {
                tokenRequest.f10721q = str3;
            }
            String str4 = consentResult.f10622h;
            if (!TextUtils.isEmpty(str4)) {
                tokenRequest.f10722r = str4;
            }
        }
        TokenResponse a = hdf.f19510p.mo13425a(tokenRequest);
        if (a == null || (tokenData = a.f10746w) == null) {
            throw adbe.m50106a(8);
        }
        hdf.mo12404a(hdf.f19514t, tokenData.f9944b);
        List list = tokenData.f9948f;
        if (list != null) {
            set = stc.m36281a(list);
        } else {
            set = bnon.f131923a;
        }
        hdf.f19509o = set;
        return bmxv.m108566b(adcq.AUTH_ACCOUNT);
    }
}
