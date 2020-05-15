package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azkm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f99559a;

    /* renamed from: b */
    final /* synthetic */ azks f99560b;

    public azkm(azks azks, boolean z) {
        this.f99560b = azks;
        this.f99559a = z;
    }

    public final void run() {
        azks azks = this.f99560b;
        if (!Boolean.valueOf(this.f99559a).booleanValue()) {
            CardChimeraActivity cardChimeraActivity = azks.f99566a;
            azpi.m86068a(cardChimeraActivity, cardChimeraActivity.getString(C0126R.string.message_not_available_text));
            CardChimeraActivity cardChimeraActivity2 = azks.f99566a;
            int i = CardChimeraActivity.f111167L;
            cardChimeraActivity2.mo60402B();
            azks.f99566a.finish();
        }
    }
}
