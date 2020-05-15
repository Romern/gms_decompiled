package p000;

import android.content.Intent;
import android.os.Message;

/* renamed from: snn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class snn extends snr {

    /* renamed from: a */
    final /* synthetic */ sno f44801a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public snn(sno sno, sns sns) {
        super(sns);
        this.f44801a = sno;
    }

    public final void handleMessage(Message message) {
        this.f44801a.mo17286a((Intent) message.obj);
        this.f44801a.stopSelf(message.arg1);
    }
}
