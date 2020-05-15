package p000;

import android.util.Base64;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.firstparty.TransactionData;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsb implements awrf {

    /* renamed from: a */
    private final BuyFlowConfig f94992a;

    /* renamed from: b */
    private final TransactionData f94993b;

    /* renamed from: c */
    private final awwt f94994c;

    /* renamed from: d */
    private final String f94995d;

    /* renamed from: e */
    private final String f94996e;

    /* renamed from: f */
    private final int f94997f;

    public awsb(BuyFlowConfig buyFlowConfig, awwt awwt, String str, String str2, int i, TransactionData transactionData) {
        this.f94992a = buyFlowConfig;
        this.f94994c = awwt;
        this.f94995d = str;
        this.f94993b = transactionData;
        this.f94996e = str2;
        this.f94997f = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ long mo52496a(Object obj) {
        if (((asmk) obj).mo7183bo().mo17710c()) {
            return ((Long) awie.f94417m.mo58455c()).longValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final String mo52497a() {
        return "RetrieveInAppPaymentCredential";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo52499b() {
        String str;
        String str2;
        String str3;
        BuyFlowConfig buyFlowConfig = this.f94992a;
        if (buyFlowConfig.f110418b.f110406a != 3) {
            awwt awwt = this.f94994c;
            asom asom = new asom();
            asom.f89311a = this.f94992a.f110418b.f110407b.name;
            asom.f89312b = this.f94995d;
            asom.f89313c = this.f94993b;
            return awwt.mo65545a(buyFlowConfig, asom.mo49293a(), this.f94997f, this.f94996e);
        }
        int i = bjvd.m104685a().get(1) + 5;
        int i2 = this.f94997f;
        String str4 = null;
        if (i2 == 2) {
            str3 = "370295136149943";
            str2 = "JnPYbs6FkC1tiVLREAABoAAAkgA=";
        } else if (i2 != 4) {
            str3 = "5204240250197840";
            str2 = "ALnt+yWSJdXBACMLLWMNGgADFA==";
            str = null;
            return new awsa(new RetrieveInAppPaymentCredentialResponse(str3, Base64.decode(str2, 2), 12, i, str));
        } else {
            str3 = "4895370012003478";
            str2 = "AgAAAAAABk4DWZ4C28yUQAAAAAA=";
            str4 = "07";
        }
        str = str4;
        return new awsa(new RetrieveInAppPaymentCredentialResponse(str3, Base64.decode(str2, 2), 12, i, str));
    }

    /* renamed from: a */
    public final void mo52498a(awgg awgg) {
        awgg.mo52123a(this.f94992a.f110419c);
        awgg.mo52122a(this.f94992a.f110418b.f110406a);
        awgg.mo52123a(this.f94992a.f110418b.f110407b.name);
        awgg.mo52123a(this.f94995d);
    }
}
