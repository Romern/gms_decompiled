package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awpe extends awpf {

    /* renamed from: a */
    protected final BuyFlowConfig f94799a;

    public awpe(BuyFlowConfig buyFlowConfig, Account account) {
        super(account);
        this.f94799a = buyFlowConfig;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo52307a() {
        return awyd.m81489a(this.f94799a.f110418b);
    }
}
