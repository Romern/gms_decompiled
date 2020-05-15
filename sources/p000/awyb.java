package p000;

import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyb {

    /* renamed from: a */
    final /* synthetic */ BuyFlowConfig f95271a;

    public awyb(BuyFlowConfig buyFlowConfig) {
        this.f95271a = buyFlowConfig;
    }

    /* renamed from: a */
    public final BuyFlowConfig mo52748a() {
        BuyFlowConfig buyFlowConfig = this.f95271a;
        if (buyFlowConfig.f110417a == null) {
            buyFlowConfig.f110417a = awnm.m80359a();
        }
        return this.f95271a;
    }

    /* renamed from: a */
    public final void mo52749a(ApplicationParameters applicationParameters) {
        this.f95271a.f110418b = applicationParameters;
    }

    /* renamed from: a */
    public final void mo52750a(String str) {
        this.f95271a.f110421e = str;
    }

    /* renamed from: b */
    public final void mo52751b(String str) {
        this.f95271a.f110419c = str;
    }

    /* renamed from: c */
    public final void mo52752c(String str) {
        this.f95271a.f110420d = str;
    }

    /* renamed from: d */
    public final void mo52753d(String str) {
        this.f95271a.f110417a = str;
    }
}
