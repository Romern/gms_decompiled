package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: aqll */
final /* synthetic */ class aqll implements Callable {

    /* renamed from: a */
    private final ConsentChimeraActivity f86337a;

    public aqll(ConsentChimeraActivity consentChimeraActivity) {
        this.f86337a = consentChimeraActivity;
    }

    public final Object call() {
        ConsentChimeraActivity consentChimeraActivity = this.f86337a;
        TokenRequest tokenRequest = new TokenRequest(consentChimeraActivity.f107665i.mo7637a(), consentChimeraActivity.f107665i.f10706b);
        tokenRequest.mo7638a(consentChimeraActivity.f107665i.mo7640b());
        tokenRequest.mo7639a(iyb.GRANTED);
        tokenRequest.f10714j = consentChimeraActivity.f107665i.f10714j;
        ConsentResult consentResult = consentChimeraActivity.f107668l;
        if (consentResult != null) {
            bmxy.m108581a(consentResult);
            FACLConfig fACLConfig = consentResult.f10619e;
            if (fACLConfig != null) {
                tokenRequest.f10709e = fACLConfig;
            }
            PACLConfig pACLConfig = tokenRequest.f10710f;
            String str = consentResult.f10618d;
            if (str != null) {
                tokenRequest.f10710f = new PACLConfig(pACLConfig != null ? pACLConfig.f10878b : null, str);
            }
            iyb b = consentResult.mo7620b();
            if (b != null) {
                tokenRequest.mo7639a(b);
            }
            String str2 = consentResult.f10621g;
            if (!TextUtils.isEmpty(str2)) {
                tokenRequest.f10721q = str2;
            }
            String str3 = consentResult.f10622h;
            if (!TextUtils.isEmpty(str3)) {
                tokenRequest.f10722r = str3;
            }
        }
        return consentChimeraActivity.f107664h.mo13425a(tokenRequest);
    }
}
