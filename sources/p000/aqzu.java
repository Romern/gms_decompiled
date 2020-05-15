package p000;

import android.telephony.SubscriptionInfo;
import android.text.TextUtils;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigResponse;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;

/* renamed from: aqzu */
final /* synthetic */ class aqzu implements auca {

    /* renamed from: a */
    private final aqzx f87172a;

    /* renamed from: b */
    private final EsimActivationInfo f87173b;

    /* renamed from: c */
    private final SubscriptionInfo f87174c;

    public aqzu(aqzx aqzx, EsimActivationInfo esimActivationInfo, SubscriptionInfo subscriptionInfo) {
        this.f87172a = aqzx;
        this.f87173b = esimActivationInfo;
        this.f87174c = subscriptionInfo;
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        aqzx aqzx = this.f87172a;
        EsimActivationInfo esimActivationInfo = this.f87173b;
        SubscriptionInfo subscriptionInfo = this.f87174c;
        GetEsimConfigResponse getEsimConfigResponse = (GetEsimConfigResponse) obj;
        int i = aqzy.f87183b;
        if (getEsimConfigResponse == null) {
            return aucu.m76777a((Exception) new NullPointerException("esimConfigResponse is null"));
        }
        String str = getEsimConfigResponse.f80370e;
        if (TextUtils.isEmpty(str)) {
            return aucu.m76777a(new Exception("empty activation code"));
        }
        return aucu.m76778a(new EsimActivationPayload(str, aqzx.f87181a, esimActivationInfo.f107889d, subscriptionInfo.isEmbedded()));
    }
}
