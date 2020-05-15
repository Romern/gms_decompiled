package p000;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: aoqy */
final /* synthetic */ class aoqy implements bqeh {

    /* renamed from: a */
    private final aorb f78716a;

    public aoqy(aorb aorb) {
        this.f78716a = aorb;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        aorb aorb = this.f78716a;
        aorx aorx = (aorx) obj;
        String str = aorx.f78747a;
        long a = bxzt.m124578a(aorb.f78730h.mo43193a());
        bxwc bxwc = aorx.f78749c;
        Bundle bundle = aorb.f78729g;
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (bxwc.contains(str2)) {
                Object obj2 = bundle.get(str2);
                if (obj2 instanceof String) {
                    hashMap.put(str2, (String) obj2);
                } else {
                    throw new aopl("Only string values are allowed as an additional arg in RecaptchaAction");
                }
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 60);
                sb.append("AdditionalArgs key[ \"");
                sb.append(str2);
                sb.append("\" ] is not accepted by reCATPCHA server");
                throw new aopl(sb.toString());
            }
        }
        vvq a2 = aorb.f78723a.mo46801a();
        bnha bnha = new bnha();
        bnha.mo67695b("token", str);
        bnha.mo67695b("action", aorb.f78727e);
        bnha.mo67695b("timestamp_millis", Long.toString(a));
        bnha.mo67694a(hashMap);
        if (!aorb.f78728f.isEmpty()) {
            bnha.mo67695b("verification_history_token", aorb.f78728f);
        }
        return aorb.f78731i.mo25819b(new aoqz(aorb, str, a, a2.mo28905a(bnha.mo67618b()), hashMap));
    }
}
