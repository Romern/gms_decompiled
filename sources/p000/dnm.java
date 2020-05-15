package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: dnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dnm extends Handler {

    /* renamed from: a */
    final /* synthetic */ dns f13636a;

    public dnm(dns dns) {
        this.f13636a = dns;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f13636a.mo9320b();
        }
    }
}
