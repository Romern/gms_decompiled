package p000;

import android.view.View;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azke implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99550a;

    public azke(CardChimeraActivity cardChimeraActivity) {
        this.f99550a = cardChimeraActivity;
    }

    public void onClick(View view) {
        CardChimeraActivity cardChimeraActivity = this.f99550a;
        cardChimeraActivity.f111238v.mo55144a(267, (LocalEntityId) null, cardChimeraActivity.mo60420t(), cardChimeraActivity.f111241y.mo54597j());
        if (cardChimeraActivity.f111221e) {
            cardChimeraActivity.mo60410b(409);
        }
        cardChimeraActivity.mo60422y();
        cardChimeraActivity.finish();
    }
}
