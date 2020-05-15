package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity;
import com.google.android.gms.wallet.p082im.ImRootChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awmz extends awcc {
    public awmz(GenericDelegatorChimeraActivity genericDelegatorChimeraActivity) {
        super(genericDelegatorChimeraActivity);
    }

    /* renamed from: a */
    public static Intent m80254a(Context context, Intent intent, String str, BuyFlowConfig buyFlowConfig) {
        Intent b = awcc.m79594b(context, intent, null);
        b.setAction(str);
        b.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        return b;
    }

    /* renamed from: b */
    public final void mo51849b(Bundle bundle) {
        super.mo51849b(bundle);
        GenericDelegatorChimeraActivity genericDelegatorChimeraActivity = this.f94160a;
        genericDelegatorChimeraActivity.startActivityForResult(ImRootChimeraActivity.m94007a(genericDelegatorChimeraActivity, genericDelegatorChimeraActivity.getIntent()), 0);
        this.f94160a.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo51855g() {
        return false;
    }

    /* renamed from: a */
    public final void mo51845a(Bundle bundle) {
        this.f94160a.setTheme(C0126R.style.Theme_Wallet_No_Display);
        super.mo51845a(bundle);
    }
}
