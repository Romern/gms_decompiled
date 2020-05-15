package p000;

import android.content.DialogInterface;

/* renamed from: wja */
final /* synthetic */ class wja implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wjb f50757a;

    public wja(wjb wjb) {
        this.f50757a = wjb;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        wjb wjb = this.f50757a;
        if (wjb.f50758a.mo18458o()) {
            wjb.f50758a.mo18453j();
            dialogInterface.dismiss();
            return;
        }
        wjb.f50758a.mo18456m();
    }
}
