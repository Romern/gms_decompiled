package p000;

import android.os.CancellationSignal;

/* renamed from: lco */
final /* synthetic */ class lco implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    private final bqgg f25794a;

    public lco(bqgg bqgg) {
        this.f25794a = bqgg;
    }

    public final void onCancel() {
        bqgg bqgg = this.f25794a;
        srn srn = lcx.f25813a;
        bqgg.cancel(true);
    }
}
