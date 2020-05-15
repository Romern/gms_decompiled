package p000;

import android.content.DialogInterface;

/* renamed from: lls */
final /* synthetic */ class lls implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final llz f26329a;

    public lls(llz llz) {
        this.f26329a = llz;
    }

    public final void onShow(DialogInterface dialogInterface) {
        llz llz = this.f26329a;
        if (llz.f26352s && !llz.f26353t) {
            llz.mo15262h();
        }
    }
}
