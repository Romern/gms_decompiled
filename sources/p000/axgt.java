package p000;

import com.google.android.gms.walletp2p.feature.completion.CompleteMoneyTransferChimeraActivity;

/* renamed from: axgt */
final /* synthetic */ class axgt implements Runnable {

    /* renamed from: a */
    private final CompleteMoneyTransferChimeraActivity f95921a;

    /* renamed from: b */
    private final long f95922b;

    /* renamed from: c */
    private final String f95923c;

    /* renamed from: d */
    private final String f95924d;

    public axgt(CompleteMoneyTransferChimeraActivity completeMoneyTransferChimeraActivity, long j, String str, String str2) {
        this.f95921a = completeMoneyTransferChimeraActivity;
        this.f95922b = j;
        this.f95923c = str;
        this.f95924d = str2;
    }

    public final void run() {
        this.f95921a.mo60161a(this.f95922b, this.f95923c, this.f95924d);
    }
}
