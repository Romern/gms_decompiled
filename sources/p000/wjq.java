package p000;

import android.content.DialogInterface;

/* renamed from: wjq */
final /* synthetic */ class wjq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wjr f50773a;

    public wjq(wjr wjr) {
        this.f50773a = wjr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wjr wjr = this.f50773a;
        if (wjr.f50774a.mo18458o()) {
            wjr.f50774a.mo18453j();
            dialogInterface.dismiss();
            return;
        }
        wjr.f50774a.mo18456m();
    }
}
