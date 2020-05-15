package p000;

import android.content.Intent;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpw implements bjew {

    /* renamed from: a */
    private final awwt f94828a;

    /* renamed from: b */
    private final awta f94829b;

    public awpw(awwt awwt, awta awta) {
        this.f94828a = awwt;
        this.f94829b = awta;
    }

    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        Intent intent = bjfc.f122612a;
        Intent intent2 = new Intent();
        intent2.putExtra("refreshUserSpecificDataResponse", new awsv(this.f94828a, this.f94829b, (BuyFlowConfig) intent.getParcelableExtra("buyFlowConfig"), (IbBuyFlowInput) intent.getParcelableExtra("buyFlowInput")).mo52543a());
        return new bjfd(intent2);
    }
}
