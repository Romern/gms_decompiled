package p000;

import com.google.android.gms.mobilesubscription.service.MobileSubscriptionApiChimeraService;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest;

/* renamed from: ahab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahab extends agzv implements aaai {

    /* renamed from: a */
    private final MobileSubscriptionApiChimeraService f66925a;

    /* renamed from: b */
    private final aaag f66926b;

    public ahab(MobileSubscriptionApiChimeraService mobileSubscriptionApiChimeraService, aaag aaag) {
        this.f66925a = mobileSubscriptionApiChimeraService;
        this.f66926b = aaag;
    }

    /* renamed from: a */
    public final void mo36220a(agzt agzt, CheckAuthStatusRequest checkAuthStatusRequest) {
        this.f66926b.mo16659a(this.f66925a, new ahac(agzt, checkAuthStatusRequest));
    }

    /* renamed from: a */
    public final void mo36221a(agzt agzt, GetEsimConfigRequest getEsimConfigRequest) {
        this.f66926b.mo16659a(this.f66925a, new ahad(agzt, getEsimConfigRequest));
    }

    /* renamed from: a */
    public final void mo36222a(agzt agzt, GetPhoneNumbersRequest getPhoneNumbersRequest) {
        this.f66926b.mo16659a(this.f66925a, new ahae(agzt, getPhoneNumbersRequest));
    }
}
