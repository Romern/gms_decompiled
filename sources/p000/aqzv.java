package p000;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersResponse;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;

/* renamed from: aqzv */
final /* synthetic */ class aqzv implements auca {

    /* renamed from: a */
    private final aqzx f87175a;

    /* renamed from: b */
    private final EsimActivationInfo f87176b;

    /* renamed from: c */
    private final TelephonyManager f87177c;

    /* renamed from: d */
    private final agzp f87178d;

    public aqzv(aqzx aqzx, EsimActivationInfo esimActivationInfo, TelephonyManager telephonyManager, agzp agzp) {
        this.f87175a = aqzx;
        this.f87176b = esimActivationInfo;
        this.f87177c = telephonyManager;
        this.f87178d = agzp;
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        boolean z;
        aqzx aqzx = this.f87175a;
        EsimActivationInfo esimActivationInfo = this.f87176b;
        TelephonyManager telephonyManager = this.f87177c;
        agzp agzp = this.f87178d;
        GetPhoneNumbersResponse getPhoneNumbersResponse = (GetPhoneNumbersResponse) obj;
        int i = aqzy.f87183b;
        if (getPhoneNumbersResponse == null) {
            return aucu.m76777a((Exception) new NullPointerException("phoneNumbersResponse is null"));
        }
        String str = getPhoneNumbersResponse.f80377b[0];
        String str2 = getPhoneNumbersResponse.f80376a;
        if (TextUtils.isEmpty(str)) {
            return aucu.m76777a(new Exception("empty phone number"));
        }
        if (TextUtils.isEmpty(str2)) {
            return aucu.m76777a(new Exception("empty request id"));
        }
        aqzx.f87181a = str;
        ahao ahao = new ahao();
        GetEsimConfigRequest getEsimConfigRequest = ahao.f66943a;
        getEsimConfigRequest.f80358a = str2;
        getEsimConfigRequest.f80360c = esimActivationInfo.f107887b;
        getEsimConfigRequest.f80361d = esimActivationInfo.f107888c;
        String subscriberId = telephonyManager.getSubscriberId();
        GetEsimConfigRequest getEsimConfigRequest2 = ahao.f66943a;
        getEsimConfigRequest2.f80362e = subscriberId;
        getEsimConfigRequest2.f80359b = aqzx.f87182b;
        getEsimConfigRequest2.f80363f = str;
        sdo.m34975b(true, "Need a non-null request for getEsimConfig().");
        if (getEsimConfigRequest2.f80358a != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Need a non-null request_id.");
        roz b = rpa.m34196b();
        b.f43472a = new agzk(getEsimConfigRequest2);
        b.f43473b = new Feature[]{agzg.f66904a};
        return agzp.mo24732b(b.mo24977a());
    }
}
