package p000;

import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azks extends soa {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99566a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azks(CardChimeraActivity cardChimeraActivity) {
        super(9);
        this.f99566a = cardChimeraActivity;
    }

    public final void run() {
        CardChimeraActivity cardChimeraActivity = this.f99566a;
        int i = CardChimeraActivity.f111167L;
        this.f99566a.runOnUiThread(new azkm(this, Boolean.valueOf(cardChimeraActivity.f111220d.mo54770e()).booleanValue()));
    }
}
