package p000;

import android.content.DialogInterface;

/* renamed from: xdo */
final /* synthetic */ class xdo implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final xwn f52003a;

    /* renamed from: b */
    private final xwj f52004b;

    /* renamed from: c */
    private final xeg f52005c;

    public xdo(xwn xwn, xwj xwj, xeg xeg) {
        this.f52003a = xwn;
        this.f52004b = xwj;
        this.f52005c = xeg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        xwn xwn = this.f52003a;
        xwj xwj = this.f52004b;
        xeg xeg = this.f52005c;
        Logger Logger = xdr.f52012a;
        xwn.mo30186a(xwj, xag.TYPE_FINGERPRINT_NOT_RECOGNIZED);
        xeg.mo29667a(new xma("The flow was cancelled"));
    }
}
