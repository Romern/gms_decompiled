package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardDisableEventCallback;
import com.felicanetworks.mfc.mfi.CardEnableEventCallback;
import com.felicanetworks.mfc.mfi.CardInfo;

/* renamed from: athc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athc implements atgp {

    /* renamed from: a */
    private final CardInfo f90355a;

    public athc(bepl bepl) {
        this.f90355a = new CardInfo(bepl.f111987b, "", "", 1, 0, 1);
    }

    /* renamed from: a */
    public final CardInfo mo49964a() {
        return this.f90355a;
    }

    /* renamed from: b */
    public final Card mo49967b() {
        return null;
    }

    /* renamed from: a */
    public final void mo49965a(CardDisableEventCallback cardDisableEventCallback) {
        throw new UnsupportedOperationException("Fake felica cards don't support this operation");
    }

    /* renamed from: a */
    public final void mo49966a(CardEnableEventCallback cardEnableEventCallback) {
        throw new UnsupportedOperationException("Fake felica cards don't support this operation");
    }
}
