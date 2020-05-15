package p000;

import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azkr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99565a;

    public azkr(CardChimeraActivity cardChimeraActivity) {
        this.f99565a = cardChimeraActivity;
    }

    public final void run() {
        aznb aznb = this.f99565a.f111179K;
        if (aznb != null && aznb.getCursor() != null && !this.f99565a.f111179K.getCursor().isClosed()) {
            CardChimeraActivity cardChimeraActivity = this.f99565a;
            cardChimeraActivity.f111223g.setSelection((cardChimeraActivity.f111179K.getCount() - 1) + this.f99565a.f111223g.getHeaderViewsCount() + this.f99565a.f111223g.getFooterViewsCount());
        }
    }
}
