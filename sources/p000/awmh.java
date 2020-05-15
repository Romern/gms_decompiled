package p000;

import android.util.Log;
import com.google.android.gms.wallet.p081ib.IbChimeraActivity;
import com.google.android.gms.wallet.p084ow.ShowLockScreenChimeraActivity;
import com.google.android.gms.wallet.service.p086ib.IbBuyFlowInput;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;
import com.google.android.gms.wallet.service.p086ib.RefreshUserSpecificDataResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.Locale;

/* renamed from: awmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awmh extends awpc {

    /* renamed from: a */
    final /* synthetic */ IbChimeraActivity f94610a;

    public awmh(IbChimeraActivity ibChimeraActivity) {
        this.f94610a = ibChimeraActivity;
    }

    /* renamed from: a */
    public final void mo51894a() {
        IbChimeraActivity ibChimeraActivity = this.f94610a;
        int i = IbChimeraActivity.f110201y;
        ibChimeraActivity.mo59932f(7);
    }

    /* renamed from: b */
    public final void mo51897b() {
        IbChimeraActivity ibChimeraActivity = this.f94610a;
        int i = IbChimeraActivity.f110201y;
        ibChimeraActivity.mo59931b(8, 1024);
    }

    /* renamed from: a */
    public final void mo52266a(ProcessBuyFlowResultResponse processBuyFlowResultResponse) {
        IbChimeraActivity ibChimeraActivity = this.f94610a;
        int i = IbChimeraActivity.f110201y;
        if (processBuyFlowResultResponse.f110361a != 1) {
            ibChimeraActivity.mo59931b(8, processBuyFlowResultResponse.f110365e);
            return;
        }
        ibChimeraActivity.f110209m = processBuyFlowResultResponse;
        if (processBuyFlowResultResponse.f110364d) {
            ibChimeraActivity.startActivityForResult(ShowLockScreenChimeraActivity.m94076a(ibChimeraActivity.f110205i), 501);
        } else {
            ibChimeraActivity.mo59934z();
        }
    }

    /* renamed from: a */
    public final void mo52267a(RefreshUserSpecificDataResponse refreshUserSpecificDataResponse) {
        IbBuyFlowInput ibBuyFlowInput;
        IbChimeraActivity ibChimeraActivity = this.f94610a;
        int i = IbChimeraActivity.f110201y;
        if (refreshUserSpecificDataResponse.f110367b != 0 || (ibBuyFlowInput = refreshUserSpecificDataResponse.f110366a) == null) {
            Log.e("IbChimeraActivity", String.format(Locale.US, "Failed to update buyFlowInput! code = %s", Integer.valueOf(refreshUserSpecificDataResponse.f110367b)));
            ibChimeraActivity.mo59931b(8, refreshUserSpecificDataResponse.f110368c);
            return;
        }
        ibChimeraActivity.f110206j = ibBuyFlowInput;
        awer awer = (awer) ibChimeraActivity.mo51879e();
        byte[] d = ibChimeraActivity.f110206j.mo59992d();
        BuyFlowConfig buyFlowConfig = ibChimeraActivity.f110205i;
        awer.mo52875ah();
        awer.mo52840Z();
        awer.f95358B = buyFlowConfig;
        awer.f94231d = null;
        if (d == null) {
            d = awer.f94220a;
        }
        awer.f94232e = (blzf) bjvp.m104733a(d, (bxxk) blzf.f128337k.mo74142c(7));
        awer.f95397aj = null;
        awer.f94243p = new awen(awer);
        awer.mo52878ak();
        awer.mo52876ai();
        awer.getActivity().getSupportFragmentManager().executePendingTransactions();
        awer.mo52877aj();
        awer.f95368L = 0;
        awer.f94237j = true;
        awer.mo52039K();
    }
}
