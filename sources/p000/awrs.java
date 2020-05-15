package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadFullWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceRequest;
import com.google.android.gms.wallet.service.p086ib.LoadMaskedWalletServiceResponse;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultRequest;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.service.p086ib.RefreshUserSpecificDataResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awrs extends awrm {

    /* renamed from: a */
    public final Context f94932a;

    /* renamed from: b */
    public final awra f94933b;

    /* renamed from: c */
    public final awrh f94934c;

    /* renamed from: d */
    public final rfz f94935d;

    /* renamed from: e */
    public final awwt f94936e;

    /* renamed from: f */
    public final awua f94937f;

    /* renamed from: g */
    public final awsz f94938g;

    /* renamed from: h */
    public final awwo f94939h = new awwo(this.f94932a);

    /* renamed from: i */
    public final awta f94940i = new awta(this.f94932a);

    public awrs(Context context, awra awra, rjx rjx, awua awua) {
        awrh a = awrh.m80776a();
        awsz awsz = new awsz(context);
        this.f94932a = context;
        this.f94933b = awra;
        this.f94934c = a;
        rfi rfi = rfi.f42868a;
        this.f94935d = rfz.m33557a(context);
        this.f94936e = new awwt(context, rjx);
        this.f94937f = awua;
        this.f94938g = awsz;
    }

    /* renamed from: a */
    public final LoadFullWalletServiceResponse mo52505a(BuyFlowConfig buyFlowConfig, LoadFullWalletServiceRequest loadFullWalletServiceRequest) {
        return awrr.m80796a(this, loadFullWalletServiceRequest).mo52520a();
    }

    /* renamed from: a */
    public final LoadMaskedWalletServiceResponse mo52506a(LoadMaskedWalletServiceRequest loadMaskedWalletServiceRequest) {
        return awrr.m80797a(this, loadMaskedWalletServiceRequest).mo52525a();
    }

    /* renamed from: a */
    public final ProcessBuyFlowResultResponse mo52507a(BuyFlowConfig buyFlowConfig, ProcessBuyFlowResultRequest processBuyFlowResultRequest) {
        return new awsq(this.f94932a, this.f94936e, new awsm(), this.f94938g, this.f94940i, buyFlowConfig, processBuyFlowResultRequest).mo52536a();
    }

    /* renamed from: a */
    public final RefreshUserSpecificDataResponse mo52508a(BuyFlowConfig buyFlowConfig, IbBuyFlowInput ibBuyFlowInput) {
        return new awsv(this.f94936e, this.f94940i, buyFlowConfig, ibBuyFlowInput).mo52543a();
    }

    /* renamed from: a */
    public final void mo52514a(Bundle bundle) {
        sdo.m34966a(bundle, "parameters is required");
        String string = bundle.getString("androidPackageName");
        sdo.m34975b(!TextUtils.isEmpty(string), "packageName is required");
        spn.m35872c(this.f94932a, string);
    }
}
