package p000;

import android.app.Dialog;

/* renamed from: rlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rlh extends rno {

    /* renamed from: a */
    final /* synthetic */ Dialog f43223a;

    /* renamed from: b */
    final /* synthetic */ rli f43224b;

    public rlh(rli rli, Dialog dialog) {
        this.f43224b = rli;
        this.f43223a = dialog;
    }

    /* renamed from: a */
    public final void mo24857a() {
        this.f43224b.f43225a.mo24860d();
        if (this.f43223a.isShowing()) {
            this.f43223a.dismiss();
        }
    }
}
