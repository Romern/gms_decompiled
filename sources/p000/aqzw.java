package p000;

import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

/* renamed from: aqzw */
final /* synthetic */ class aqzw implements auca {

    /* renamed from: a */
    private final aqzx f87179a;

    /* renamed from: b */
    private final agzp f87180b;

    public aqzw(aqzx aqzx, agzp agzp) {
        this.f87179a = aqzx;
        this.f87180b = agzp;
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        boolean z;
        aqzx aqzx = this.f87179a;
        agzp agzp = this.f87180b;
        CheckAuthStatusResponse checkAuthStatusResponse = (CheckAuthStatusResponse) obj;
        int i = aqzy.f87183b;
        if (checkAuthStatusResponse == null) {
            return aucu.m76777a((Exception) new NullPointerException("Auth status is null"));
        }
        UserKey userKey = checkAuthStatusResponse.f80356e;
        String str = checkAuthStatusResponse.f80352a;
        if (userKey == null) {
            return aucu.m76777a(new Exception("user key is null"));
        }
        if (TextUtils.isEmpty(str)) {
            return aucu.m76777a(new Exception("empty request id"));
        }
        aqzx.f87182b = userKey;
        GetPhoneNumbersRequest getPhoneNumbersRequest = new ahas().f66945a;
        getPhoneNumbersRequest.f80373a = str;
        getPhoneNumbersRequest.f80374b = userKey;
        sdo.m34975b(true, "Need a non-null request for getPhoneNumbers().");
        if (getPhoneNumbersRequest.f80373a != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Need a non-null request_id.");
        roz b = rpa.m34196b();
        b.f43472a = new agzj(getPhoneNumbersRequest);
        b.f43473b = new Feature[]{agzg.f66904a};
        return agzp.mo24732b(b.mo24977a());
    }
}
