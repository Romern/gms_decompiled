package p000;

import android.content.DialogInterface;

/* renamed from: wjj */
final /* synthetic */ class wjj implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wjk f50766a;

    public wjj(wjk wjk) {
        this.f50766a = wjk;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wjk wjk = this.f50766a;
        if (wjk.f50767a.mo18458o()) {
            wjk.f50767a.mo18453j();
            dialogInterface.dismiss();
            return;
        }
        wjk.f50767a.mo18456m();
    }
}
