package p000;

import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;

/* renamed from: aiei */
final /* synthetic */ class aiei implements aifh {

    /* renamed from: a */
    private final long f68835a;

    public aiei(long j) {
        this.f68835a = j;
    }

    /* renamed from: a */
    public final void mo37458a(aieh aieh, rlf rlf) {
        long j = this.f68835a;
        int i = aifl.f68872b;
        aidi aidi = new aidi();
        aiee aiee = new aiee(rlf);
        CancelPayloadParams cancelPayloadParams = aidi.f68798a;
        cancelPayloadParams.f80563a = aiee;
        cancelPayloadParams.f80564b = j;
        ((aigl) aieh.mo25289B()).mo36591a(cancelPayloadParams);
    }
}
