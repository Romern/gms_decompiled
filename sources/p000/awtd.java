package p000;

import android.os.Bundle;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataRequest;

/* renamed from: awtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awtd {

    /* renamed from: a */
    public final /* synthetic */ BuyFlowIntegratorDataRequest f95079a;

    public awtd(BuyFlowIntegratorDataRequest buyFlowIntegratorDataRequest) {
        this.f95079a = buyFlowIntegratorDataRequest;
    }

    /* renamed from: a */
    public final BuyFlowIntegratorDataRequest mo52552a() {
        boolean z;
        BuyFlowIntegratorDataRequest buyFlowIntegratorDataRequest = this.f95079a;
        byte[] bArr = buyFlowIntegratorDataRequest.f110371b;
        boolean z2 = false;
        if (bArr == null || bArr.length == 0) {
            byte[] bArr2 = buyFlowIntegratorDataRequest.f110370a;
            if (bArr2 == null) {
                z = false;
            } else if (bArr2.length == 0) {
                z = false;
            }
            sdo.m34975b(z, "Either encrypted or unencrypted buy flow params are required");
            if ("com.google.android.gms.wallet.ACTION_CHECKOUT".equals(this.f95079a.f110373d) || "com.google.android.gms.wallet.ib.INSTANT_BUY".equals(this.f95079a.f110373d)) {
                z2 = true;
            }
            sdo.m34975b(z2, "Invalid buy flow action");
            return this.f95079a;
        }
        z = true;
        sdo.m34975b(z, "Either encrypted or unencrypted buy flow params are required");
        z2 = true;
        sdo.m34975b(z2, "Invalid buy flow action");
        return this.f95079a;
    }

    /* renamed from: a */
    public final void mo52553a(Bundle bundle) {
        this.f95079a.f110374e = bundle;
    }

    /* renamed from: a */
    public final void mo52554a(String str) {
        this.f95079a.f110373d = str;
    }

    /* renamed from: a */
    public final void mo52555a(byte[] bArr) {
        this.f95079a.f110371b = bArr;
    }
}
