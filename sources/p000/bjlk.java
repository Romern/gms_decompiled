package p000;

import android.view.View;

/* renamed from: bjlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjlk extends bhfj {

    /* renamed from: a */
    final /* synthetic */ bjll f122932a;

    public bjlk(bjll bjll) {
        this.f122932a = bjll;
    }

    /* renamed from: a */
    public final void mo12434a(int i) {
        bwmu bwmu;
        if (i == 3) {
            bwmu = bwmu.BOTTOM_SHEET_POSITION_STATE_EXPANDED;
        } else if (i == 4) {
            bwmu = bwmu.BOTTOM_SHEET_POSITION_STATE_COLLAPSED;
        } else if (i == 5) {
            bwmu = bwmu.BOTTOM_SHEET_POSITION_STATE_HIDDEN;
        } else if (i != 6) {
            bwmu = null;
        } else {
            bwmu = bwmu.BOTTOM_SHEET_POSITION_STATE_PARTIALLY_EXPANDED;
        }
        if (bwmu == null) {
            return;
        }
        if (((bjlh) ((bjhy) ((bjlg) ((bjjm) this.f122932a).f122830n)).f122754m).f122926e.contains(bwmu)) {
            bjll bjll = this.f122932a;
            ((bjlh) ((bjhy) ((bjlg) ((bjjm) bjll).f122830n)).f122754m).mo65365a(bwmu, bjll);
            return;
        }
        bjll bjll2 = this.f122932a;
        bjll2.f122933p.mo71037c(bjll2.mo65368I());
    }

    /* renamed from: a */
    public final void mo12435a(View view, float f) {
    }
}
