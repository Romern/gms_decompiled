package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: opq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class opq extends nvt {

    /* renamed from: a */
    final /* synthetic */ opu f38184a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public opq(opu opu, Looper looper) {
        super(null, looper);
        this.f38184a = opu;
    }

    /* renamed from: a */
    public final void mo22490a(long j) {
        sendMessageDelayed(obtainMessage(1), j);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            opu opu = this.f38184a;
            bnsn bnsn = opu.f38192a;
            opu.mo22500c();
        } else if (i == 2) {
            opu opu2 = this.f38184a;
            bnsn bnsn2 = opu.f38192a;
            opu2.mo22501d((oos) message.obj);
        }
    }
}
