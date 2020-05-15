package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: cnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cnz implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ coa f7127a;

    public cnz(coa coa) {
        this.f7127a = coa;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f7127a.mo4028a((cqb) message.obj);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            this.f7127a.f7136c.mo3683a((cqb) message.obj);
            return false;
        }
    }
}
