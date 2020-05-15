package p000;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

/* renamed from: alg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alg extends Handler {

    /* renamed from: a */
    final /* synthetic */ alj f827a;

    public alg(alj alj) {
        this.f827a = alj;
    }

    public final void handleMessage(Message message) {
        alj alj;
        int b;
        if (message.what == 1 && (b = (alj = this.f827a).mo968b((Messenger) message.obj)) >= 0) {
            ((alf) alj.f830a.remove(b)).mo960a();
        }
    }
}
