package p000;

import android.os.RemoteException;
import com.google.android.gms.wallet.p081ib.IbChimeraActivity;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataRequest;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataResponse;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.IbMerchantParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awrz implements awrf {

    /* renamed from: a */
    private final BuyFlowConfig f94986a;

    /* renamed from: b */
    private final awua f94987b;

    /* renamed from: c */
    private final IbBuyFlowInput f94988c;

    /* renamed from: d */
    private final IbMerchantParameters f94989d;

    /* renamed from: e */
    private final byte[] f94990e;

    public awrz(BuyFlowConfig buyFlowConfig, awua awua, IbBuyFlowInput ibBuyFlowInput, IbMerchantParameters ibMerchantParameters, byte[] bArr) {
        this.f94986a = buyFlowConfig;
        this.f94987b = awua;
        this.f94988c = ibBuyFlowInput;
        this.f94989d = ibMerchantParameters;
        this.f94990e = bArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ long mo52496a(Object obj) {
        int i = ((BuyFlowIntegratorDataResponse) obj).f110379e;
        if (i == 49 || i == 50) {
            return ((Long) awie.f94418n.mo58455c()).longValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final String mo52497a() {
        return "FullWalletIntegratorData";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo52499b() {
        awtd a = BuyFlowIntegratorDataRequest.m94146a();
        a.mo52554a("com.google.android.gms.wallet.ib.INSTANT_BUY");
        a.mo52555a(this.f94988c.mo59992d());
        a.f95079a.f110372c = this.f94990e;
        a.mo52553a(IbChimeraActivity.m93948a(this.f94988c, this.f94989d, null));
        try {
            return this.f94987b.mo52569a(this.f94986a, a.mo52552a());
        } catch (RemoteException e) {
            throw new RuntimeException("Error while fetching getBuyFlowIntegratorData!", e);
        }
    }

    /* renamed from: a */
    public final void mo52498a(awgg awgg) {
        awgg.mo52123a(this.f94986a.f110419c);
        awgg.mo52122a(this.f94986a.f110418b.f110406a);
        awgg.mo52123a(this.f94986a.f110418b.f110407b.name);
        awgg.mo52124a(this.f94988c.mo59990c());
        awgg.mo52123a(this.f94989d.f110343b);
        awgg.mo52122a(this.f94989d.f110342a);
        awgg.mo52124a(this.f94990e);
    }
}
