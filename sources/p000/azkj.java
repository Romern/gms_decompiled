package p000;

import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azkj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99556a;

    public azkj(CardChimeraActivity cardChimeraActivity) {
        this.f99556a = cardChimeraActivity;
    }

    public final void run() {
        aznb aznb = this.f99556a.f111179K;
        if (aznb != null) {
            aznb.notifyDataSetChanged();
        }
    }
}
