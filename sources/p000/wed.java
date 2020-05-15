package p000;

import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: wed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wed implements wea {

    /* renamed from: b */
    private static final sek f50579b = weh.m41831a("Loader");

    /* renamed from: a */
    public final wef f50580a;

    /* renamed from: c */
    private final qws f50581c;

    public wed(wef wef, qws qws) {
        this.f50580a = wef;
        this.f50581c = qws;
    }

    /* renamed from: a */
    public final void mo29054a(wee wee) {
        f50579b.mo25414c("Initiating module download.", new Object[0]);
        if (this.f50580a.mo29058a()) {
            wee.mo18386a();
            return;
        }
        wdz wdz = new wdz(wee, this.f50580a, this.f50581c);
        wef wef = this.f50580a;
        ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
        featureRequest.requestFeatureAtAnyVersion(wdp.f50561a.f30068a);
        featureRequest.setUrgent(wdz);
        if (wef.f50582a.requestFeatures(featureRequest)) {
            f50579b.mo25414c("Module request succeeded.", new Object[0]);
            try {
                snp.m35703a(1, 9).mo25814a(new wec(this, wdz), cdsb.m134799e(), TimeUnit.SECONDS);
            } catch (RejectedExecutionException e) {
                wdz.onRequestComplete(-2);
            }
        } else {
            f50579b.mo25414c("Module request failed.", new Object[0]);
            wee.mo18386a();
        }
    }
}
