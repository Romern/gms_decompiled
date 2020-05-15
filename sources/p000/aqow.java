package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aqow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqow extends aaab {

    /* renamed from: a */
    private final aqpg f86438a;

    /* renamed from: b */
    private final String f86439b;

    /* renamed from: c */
    private final RecordConsentByConsentResultRequest f86440c;

    /* renamed from: d */
    private final aqoc f86441d;

    /* renamed from: e */
    private final aqpk f86442e = aqpk.f86504a;

    public aqow(aqpg aqpg, String str, RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, aqoc aqoc) {
        super(44, "RecordConsentByConsentResult");
        this.f86438a = aqpg;
        this.f86439b = str;
        this.f86440c = recordConsentByConsentResultRequest;
        this.f86441d = aqoc;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        ixl a = aczw.m50063a(context);
        Bundle bundle = this.f86440c.f107701a;
        TokenRequest tokenRequest = (TokenRequest) adbw.m50144a(bundle, "token_request", TokenRequest.class);
        ConsentResult consentResult = (ConsentResult) adbw.m50144a(bundle, "consent_result", ConsentResult.class);
        bmxy.m108581a(consentResult);
        TokenRequest tokenRequest2 = new TokenRequest(tokenRequest.mo7637a(), tokenRequest.f10706b);
        tokenRequest2.mo7638a(tokenRequest.mo7640b());
        tokenRequest2.mo7639a(iyb.GRANTED);
        tokenRequest2.f10714j = tokenRequest.f10714j;
        FACLConfig fACLConfig = consentResult.f10619e;
        if (fACLConfig != null) {
            tokenRequest2.f10709e = fACLConfig;
        }
        PACLConfig pACLConfig = tokenRequest2.f10710f;
        String str2 = consentResult.f10618d;
        if (str2 != null) {
            if (pACLConfig != null) {
                str = pACLConfig.f10878b;
            } else {
                str = null;
            }
            tokenRequest2.f10710f = new PACLConfig(str, str2);
        }
        iyb b = consentResult.mo7620b();
        if (b != null) {
            tokenRequest2.mo7639a(b);
        }
        String str3 = consentResult.f10621g;
        if (!TextUtils.isEmpty(str3)) {
            tokenRequest2.f10721q = str3;
        }
        String str4 = consentResult.f10622h;
        if (!TextUtils.isEmpty(str4)) {
            tokenRequest2.f10722r = str4;
        }
        TokenData tokenData = a.mo13425a(tokenRequest2).f10746w;
        if (tokenData != null) {
            Set d = this.f86438a.mo48023d();
            List list = tokenData.f9948f;
            String str5 = tokenData.f9944b;
            if (str5 != null) {
                if (!(list == null || d == null)) {
                    list = bnkn.m109663a((Iterable) list);
                    list.retainAll(bnfi.m109235a(d).mo67501a(aqov.f86437a).mo67505b());
                    aqpk aqpk = this.f86442e;
                    String str6 = this.f86439b;
                    Account a2 = tokenRequest.mo7637a();
                    if (list != null) {
                        aqpk.f86505b.put(new aqpj(str6, a2), new HashSet(list));
                    } else {
                        aqpk.mo48033c(str6, a2);
                    }
                }
                aqoc aqoc = this.f86441d;
                if (list == null) {
                    list = new ArrayList();
                }
                aqoc.mo47992a(new RecordConsentByConsentResultResponse(list, str5));
                return;
            }
        }
        this.f86441d.mo47992a(new RecordConsentByConsentResultResponse(bngx.m109376e(), null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f86441d.mo47992a(new RecordConsentByConsentResultResponse(bngx.m109376e(), null));
    }
}
