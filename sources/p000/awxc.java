package p000;

import android.content.Context;
import com.google.android.gms.wallet.service.p087ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxc extends awwz {

    /* renamed from: a */
    public final awxi f95221a;

    /* renamed from: b */
    public final awra f95222b;

    /* renamed from: c */
    private final Context f95223c;

    /* renamed from: d */
    private final awpg f95224d;

    public awxc(Context context, awxi awxi, awra awra) {
        this.f95223c = context.getApplicationContext();
        this.f95221a = awxi;
        this.f95224d = new awpg(context, "NetworkOwInternalServic");
        this.f95222b = awra;
    }

    /* renamed from: a */
    public final ServerResponse mo52695a(BuyFlowConfig buyFlowConfig, CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest) {
        if (awyf.m81495a(this.f95223c)) {
            return this.f95224d.mo52446a(new awxb(this, buyFlowConfig, createWalletObjectsServiceRequest.f110390a, createWalletObjectsServiceRequest, buyFlowConfig));
        }
        return ServerResponse.f110423a;
    }
}
