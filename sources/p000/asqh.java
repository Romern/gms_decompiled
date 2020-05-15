package p000;

import android.service.quickaccesswallet.GetWalletCardsCallback;
import android.service.quickaccesswallet.GetWalletCardsError;

/* renamed from: asqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asqh {

    /* renamed from: a */
    final GetWalletCardsCallback f89386a;

    public asqh(GetWalletCardsCallback getWalletCardsCallback) {
        this.f89386a = getWalletCardsCallback;
    }

    /* renamed from: a */
    public final void mo49368a(GetWalletCardsError getWalletCardsError) {
        this.f89386a.onFailure(getWalletCardsError);
    }
}
