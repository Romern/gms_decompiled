package p000;

import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjy */
final /* synthetic */ class axjy implements Runnable {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96062a;

    /* renamed from: b */
    private final String f96063b;

    /* renamed from: c */
    private final String f96064c;

    /* renamed from: d */
    private final boolean f96065d;

    /* renamed from: e */
    private final axkn f96066e;

    public axjy(TransferMoneyChimeraActivity transferMoneyChimeraActivity, String str, String str2, boolean z, axkn axkn) {
        this.f96062a = transferMoneyChimeraActivity;
        this.f96063b = str;
        this.f96064c = str2;
        this.f96065d = z;
        this.f96066e = axkn;
    }

    public final void run() {
        this.f96062a.mo60188a(this.f96063b, this.f96064c, this.f96065d, this.f96066e);
    }
}
