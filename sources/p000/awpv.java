package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpv implements bjew {

    /* renamed from: a */
    private final Context f94823a;

    /* renamed from: b */
    private final awwt f94824b;

    /* renamed from: c */
    private final awsm f94825c;

    /* renamed from: d */
    private final awsz f94826d;

    /* renamed from: e */
    private final awta f94827e;

    public awpv(Context context, awwt awwt, awsm awsm, awsz awsz, awta awta) {
        this.f94823a = context;
        this.f94824b = awwt;
        this.f94825c = awsm;
        this.f94826d = awsz;
        this.f94827e = awta;
    }

    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        Intent intent = bjfc.f122612a;
        Intent intent2 = new Intent();
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) intent.getParcelableExtra("buyFlowConfig");
        intent2.putExtra("processBuyFlowResultResponse", new awsq(this.f94823a, this.f94824b, this.f94825c, this.f94826d, this.f94827e, buyFlowConfig, (ProcessBuyFlowResultRequest) intent.getParcelableExtra("processBuyFlowResultRequest")).mo52536a());
        return new bjfd(intent2);
    }
}
