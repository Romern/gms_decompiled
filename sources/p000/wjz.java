package p000;

import android.content.DialogInterface;

/* renamed from: wjz */
final /* synthetic */ class wjz implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wkc f50784a;

    public wjz(wkc wkc) {
        this.f50784a = wkc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wkc wkc = this.f50784a;
        if (wkc.f50788a.mo18458o()) {
            wkc.f50788a.mo18453j();
            dialogInterface.dismiss();
            return;
        }
        wkc.f50788a.mo18456m();
    }
}
