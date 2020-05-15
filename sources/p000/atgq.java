package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.CardDisableEventCallback;
import com.felicanetworks.mfc.mfi.CardEnableEventCallback;
import com.felicanetworks.mfc.mfi.CardInfo;

/* renamed from: atgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atgq implements atgp {

    /* renamed from: a */
    private final Card f90307a;

    private atgq(Card card) {
        this.f90307a = card;
    }

    /* renamed from: a */
    public static atgq m75858a(Card card) {
        if (card != null) {
            return new atgq(card);
        }
        return null;
    }

    /* renamed from: b */
    public final Card mo49967b() {
        return this.f90307a;
    }

    /* renamed from: a */
    public final CardInfo mo49964a() {
        return this.f90307a.getCardInfo();
    }

    /* renamed from: a */
    public final void mo49965a(CardDisableEventCallback cardDisableEventCallback) {
        this.f90307a.disable(cardDisableEventCallback);
    }

    /* renamed from: a */
    public final void mo49966a(CardEnableEventCallback cardEnableEventCallback) {
        this.f90307a.enable(cardEnableEventCallback);
    }
}
