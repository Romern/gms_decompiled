package p000;

import android.os.CancellationSignal;

/* renamed from: xdp */
final /* synthetic */ class xdp implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    private final xwn f52006a;

    /* renamed from: b */
    private final xwj f52007b;

    /* renamed from: c */
    private final xeg f52008c;

    public xdp(xwn xwn, xwj xwj, xeg xeg) {
        this.f52006a = xwn;
        this.f52007b = xwj;
        this.f52008c = xeg;
    }

    public final void onCancel() {
        xwn xwn = this.f52006a;
        xwj xwj = this.f52007b;
        xeg xeg = this.f52008c;
        sek sek = xdr.f52012a;
        xwn.mo30186a(xwj, xag.TYPE_FINGERPRINT_NOT_RECOGNIZED);
        xeg.mo29667a(new xma("The flow was cancelled"));
    }
}
